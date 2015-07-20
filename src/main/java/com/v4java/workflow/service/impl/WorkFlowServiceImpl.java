package com.v4java.workflow.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.v4java.workflow.common.FlowConst;
import com.v4java.workflow.dao.ApproveLogDao;
import com.v4java.workflow.dao.FlowNodeDao;
import com.v4java.workflow.dao.WorkFlowDao;
import com.v4java.workflow.pojo.ApproveLog;
import com.v4java.workflow.pojo.Compare;
import com.v4java.workflow.pojo.CompareArray;
import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.pojo.WorkFlow;
import com.v4java.workflow.service.IWorkFlowService;
import com.v4java.workflow.tools.TestJson;
import com.v4java.workflow.view.admin.UserVO;
import com.v4java.workflow.view.admin.WorkFlowVO;

@Service("workFlowService")
public class WorkFlowServiceImpl implements IWorkFlowService{

	@Autowired
	private WorkFlowDao workFlowDao;
	@Autowired
	private FlowNodeDao  flowNodeDao;
	@Autowired
	private ApproveLogDao approveLogDao; 
	
	@Override
	public WorkFlow findWorkFlowById(Integer id) throws Exception {
		return workFlowDao.findWorkFlowById(id);
	}

	@Override
	public void insertWorkFlow(WorkFlow workFlow,UserVO userVO) throws Exception {
		if (userVO.getJobsIds()==null) {
			FlowNode firstNode = flowNodeDao.findFirstFlowNodeById(workFlow.getModelId());
			workFlow.setJobsId(firstNode.getJobsId());
			workFlow.setWorkflowNode(firstNode.getId());
			workFlow.setStatus(0);
		}else {
			List<FlowNode> flowNodes = flowNodeDao.findFlowNodeByModelId(workFlow.getModelId()); 
			//得到当前节点
			FlowNode nowFlowNode = findWorkFlowById(flowNodes, workFlow.getWorkflowNode());
			FlowNode nextFlowNode = findWorkFlowBySort(flowNodes, nowFlowNode.getNextSort());
			changeworkFlow(nextFlowNode, workFlow, flowNodes);
			
		}
		workFlowDao.insertWorkFlow(workFlow);
	}

	@Override
	public List<WorkFlowVO> findUserWorkFlowVOByUserCode(String userCode)throws Exception {
		return workFlowDao.findUserWorkFlowVOByUserCode(userCode);
	}

	@Override
	public int findUserWorkFlowVOCountByUserCode(String userCode)throws Exception {
		return workFlowDao.findUserWorkFlowVOCountByUserCode(userCode);
	}

	@Override
	@Transactional
	public int doWorkFlow(Integer workFlowId, UserVO userVO,ApproveLog approveLog) throws Exception {
		WorkFlow workFlow = workFlowDao.findWorkFlowById(workFlowId);
		List<FlowNode> flowNodes = flowNodeDao.findFlowNodeByModelId(workFlow.getModelId()); 
		//得到当前节点
		FlowNode nowFlowNode = findWorkFlowById(flowNodes, workFlow.getWorkflowNode());
		//判断有无权限
		if (!userVO.getJobsIds().contains(nowFlowNode.getJobsId())) {
			System.err.println("没有该权限");
			return -1;
		}
		//拒绝
		if (approveLog.getStatus() == FlowConst.AGREE_FALSE) {
			//标记工作流为开始状态
			FlowNode firstFlowNode = flowNodes.get(FlowConst.node_type_start);
			workFlow.setJobsId(firstFlowNode.getJobsId());
			workFlow.setStatus(FlowConst.START);
			workFlow.setWorkflowNode(firstFlowNode.getId());
			
		}else if (approveLog.getStatus() == FlowConst.AGREE_TRUE) {
			//寻找下一个节点
			FlowNode nextFlowNode = findWorkFlowBySort(flowNodes, nowFlowNode.getNextSort());
			changeworkFlow(nextFlowNode, workFlow, flowNodes);

		}
		int n=workFlowDao.updateWorkFlow(workFlow);
		if (n==1) {
			approveLog.setUserCode(userVO.getUserCode());
			approveLog.setUserName(userVO.getUserName());
			approveLog.setFlowNode(nowFlowNode.getId());
			approveLog.setWorkFlowId(workFlowId);
			approveLogDao.insertApproveLog(approveLog);
		}
		return n;
	}
	
	/**
	 * 从传入的模板所用工作流节点或id为？节点
	 * @param flowNodes 从传入的模板所用工作流节点
	 * @param id		待查的id
	 * @return
	 */
	private FlowNode findWorkFlowById(List<FlowNode> flowNodes,int id){
		FlowNode nowFlowNode = null;
		for (FlowNode flowNodetmp : flowNodes) {
			if (flowNodetmp.getId()==id) {
				nowFlowNode = flowNodetmp;
				break;
			}
		}
		return nowFlowNode;
		
	}
	
	/**
	 * 
	 * @param flowNodes 从传入的模板所用工作流节点
	 * @param sort		某个节点标记
	 * @return
	 */
	private FlowNode findWorkFlowBySort(List<FlowNode> flowNodes,int sort){
		for (FlowNode flowNode : flowNodes) {
			if (flowNode.getSort()==sort) {
				return flowNode;
			}
		}
		return null;
		
	}
	
	/**
	 * 改变正在审批流程的状态
	 * @param nextFlowNode 下一个节点
	 * @param workFlow	正在审批的流程
	 * @param flowNodes	所用几点
	 */
	private void changeworkFlow(FlowNode nextFlowNode ,WorkFlow workFlow ,List<FlowNode> flowNodes){
		//获得下一个节点类型
		if(nextFlowNode.getNodeType()!=null){
			switch (nextFlowNode.getNodeType()) {
			//开始节点
			case FlowConst.node_type_start:
				//系统错误
				break;
			//任务节点
			case FlowConst.NODE_TYPE_TASK:
				workFlow.setJobsId(nextFlowNode.getJobsId());
				workFlow.setWorkflowNode(nextFlowNode.getId());
				workFlow.setStatus(FlowConst.ING);
				break;
			//判断节点
			case FlowConst.NODE_TYPE_IF:
				//获得该节点的判断方法
				//下一个节点排序号
				int sort = 0;
				//一个判断条件
				if(sort==0){
					List<TestJson> testJsons = JSON.parseArray(nextFlowNode.getFlowTest(),TestJson.class);
					BigDecimal money = workFlow.getMoney();
					for (TestJson testJson : testJsons) {
						Double[] test = testJson.getTest();
						if (test[1]==-1) {
							if (money.compareTo(new BigDecimal(test[0]))==1) {
								sort = testJson.getTarget();
								break;
							}
						}else {
							if (money.compareTo(new BigDecimal(test[0]))==1&&money.compareTo(new BigDecimal(test[1]))==-1) {
								sort = testJson.getTarget();
								break;
							}
						}
					}
				//多个判断条件
				}else {
					//得到所有判断条件
					List<Compare> compares = JSON.parseArray(nextFlowNode.getFlowTest(),Compare.class);
					//sort等于0 说明已找到合适的节点
					int i = 0;
					while (sort!=0) {
						//得到判断条件
						Compare compare = compares.get(i);
						boolean flag = true;
						CompareArray[] compareArrays = compare.getCompareArrays();
						String name = null;
						BigDecimal val = null;
						for (CompareArray compareArray : compareArrays) {
							//如果name为null 则是第一次，需要赋值 ，
							//如果和上一个于
							if (name == null||!name.equals(compareArray.getName())) {
								name = compareArray.getName();
								val = getValByname("", name);
							}
							int  n = compareArray.getValue().compareTo(val);
							
							
						}
					}
				}
				workFlow.setStatus(FlowConst.ING);
				nextFlowNode = findWorkFlowBySort(flowNodes, sort);
				workFlow.setJobsId(nextFlowNode.getJobsId());
				workFlow.setWorkflowNode(nextFlowNode.getId());
				workFlow.setStatus(FlowConst.ING);
				
				break;
			//结束节点,哈哈 
			case FlowConst.NODE_TYPE_END:
				workFlow.setJobsId(0);
				workFlow.setWorkflowNode(0);
				workFlow.setStatus(FlowConst.END);
				break;		
			//暂不能为其他节点
			default:
				workFlow = null;
				break;
			}
		}
	}
	
	private BigDecimal getValByname(String json,String name){
		BigDecimal bigDecimal = null;
		return bigDecimal;
		
	}
}
