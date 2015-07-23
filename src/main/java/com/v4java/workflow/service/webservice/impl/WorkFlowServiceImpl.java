package com.v4java.workflow.service.webservice.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.v4java.workflow.common.FlowConst;
import com.v4java.workflow.dao.webservice.ApproveLogDao;
import com.v4java.workflow.dao.webservice.FlowNodeDao;
import com.v4java.workflow.dao.webservice.WorkFlowDao;
import com.v4java.workflow.dao.webservice.WorkFlowModelDao;
import com.v4java.workflow.pojo.ApproveLog;
import com.v4java.workflow.pojo.Compare;
import com.v4java.workflow.pojo.CompareArray;
import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.pojo.WorkFlow;
import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.webservice.WorkFlowModelQuery;
import com.v4java.workflow.service.webservice.IWorkFlowService;
import com.v4java.workflow.vo.webservice.UserVO;

@Service("workFlowService")
public class WorkFlowServiceImpl implements IWorkFlowService{

	@Autowired
	private ApproveLogDao approveLogDao;
	@Autowired
	private WorkFlowDao workFlowDao;
	@Autowired
	private FlowNodeDao  flowNodeDao;
	@Autowired
	private WorkFlowModelDao workFlowModelDao ;
	
	@Override
	public WorkFlow findWorkFlowById(Integer id) throws Exception {
		return workFlowDao.findWorkFlowById(id);
	}

	@Override
	public void insertWorkFlow(WorkFlow workFlow,UserVO userVO) throws Exception {
		WorkFlowModelQuery workFlowModelQuery = new WorkFlowModelQuery();
		workFlowModelQuery.setBusyTypeId(workFlow.getBusyTypeId());
		workFlowModelQuery.setSystemId(userVO.getSystemId());
		WorkFlowModel workFlowModel = workFlowModelDao.findWorkFlowModelSystemIdAndType(workFlowModelQuery);
		if (userVO.getJobsIds()==null||userVO.getJobsIds().size()<=0) {
			FlowNode firstNode = flowNodeDao.findFirstFlowNodeById(workFlowModel.getId());
			workFlow.setJobsId(firstNode.getJobsId());
			workFlow.setWorkflowNode(firstNode.getId());
			workFlow.setStatus(FlowConst.START);
			workFlow.setSystemId(userVO.getSystemId());
			
		}else {
			List<FlowNode> flowNodes = flowNodeDao.findFlowNodeByModelId(workFlowModel.getId());
			FlowNode nowFlowNode = null;
			for (int i = flowNodes.size()-1; i >=0; i--) {
				if (i!=0&&userVO.getJobsIds().contains(flowNodes.get(i).getJobsId())){
					nowFlowNode = flowNodes.get(i);
					break;
				}
			}
			//得到当前节点
			FlowNode nextFlowNode = findWorkFlowBySort(flowNodes, nowFlowNode.getNextSort());
			changeWorkFlow(nextFlowNode, workFlow, flowNodes);
			
		}
		workFlow.setWorkflowNode(userVO.getSystemId());
		workFlowDao.insertWorkFlow(workFlow);
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
			setFirstWorkFlow(workFlow, flowNodes);		
		}else if (approveLog.getStatus() == FlowConst.AGREE_TRUE) {
			//寻找下一个节点
			FlowNode nextFlowNode = findWorkFlowBySort(flowNodes, nowFlowNode.getNextSort());
			changeWorkFlow(nextFlowNode, workFlow, flowNodes);

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
			if (flowNode.getSort()==sort&&flowNode.getStatus()==FlowConst.TRUE) {
				return flowNode;
			}
		}
		return null;
		
	}
	
	/**
	 * 
	 * @param flowNodes 从传入的模板所用工作流节点
	 * @param sort		某个节点标记
	 * @return
	 */
	private FlowNode findFirstWorkFlowBySort(List<FlowNode> flowNodes){
		for (FlowNode flowNode : flowNodes) {
			if (flowNode.getStatus()==FlowConst.TRUE) {
				return flowNode;
			}
		}
		return null;
		
	}
	
	/**
	 * 设置该审批业务为第一个节点
	 * 没有则赋workFlow为null
	 * @param workFlow
	 * @param flowNodes
	 */
	private void setFirstWorkFlow(WorkFlow workFlow,List<FlowNode> flowNodes){
		FlowNode first =  findFirstWorkFlowBySort(flowNodes);
		if (first == null) {
			workFlow = null;
		}else {
			workFlow.setJobsId(first.getJobsId());
			workFlow.setWorkflowNode(first.getId());
			//此时可以更改
			workFlow.setStatus(FlowConst.START);
		}		
	}
	/**
	 * 改变正在审批流程的状态
	 * @param nextFlowNode 下一个节点
	 * @param workFlow	正在审批的流程
	 * @param flowNodes	所用几点
	 */
	private void changeWorkFlow(FlowNode nextFlowNode ,WorkFlow workFlow ,List<FlowNode> flowNodes){
		if (nextFlowNode==null||nextFlowNode.getStatus()==FlowConst.FALSE) {
			setFirstWorkFlow(workFlow, flowNodes);
			 return;
		}
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
				int sort = -1;
				//得到所有判断条件
				List<Compare> compares = JSON.parseArray(nextFlowNode.getFlowTest(),Compare.class);
				//sort不等于-1说明已找到合适的节点sort
				int i = 0;
				Map<String, String> j = json2Map(workFlow.getJson());
				String name = null;
				BigDecimal val = null;
				while (sort==-1) {
					//得到判断条件
					Compare compare = compares.get(i);
					boolean flag = true;
					CompareArray[] compareArrays = compare.getCompareArrays();
					for (CompareArray compareArray : compareArrays) {
						//如果name为null 则是第一次，需要赋值 ，
						//如果和上一个于
						if (name == null||!name.equals(compareArray.getName())) {
							name = compareArray.getName();
							val = getValByname(j, name);
						}
						int  n = val.compareTo(compareArray.getValue());
						int type = compareArray.getType();
						if (type!= n) {
							switch (type) {
							case 2:
								if (n==-1) {
									flag = false;
								}
								break;
							case -2:
								if (n==1) {
									flag = false;
								}
								break;

							default:
								flag = false;
								break;
							}
						}
						if (flag) {
							break;
						}
					}
					if (flag) {
						sort = compare.getSort();
					}
					i ++;	
				}
				nextFlowNode = findWorkFlowBySort(flowNodes, sort);
				changeWorkFlow(nextFlowNode, workFlow, flowNodes);
/*				workFlow.setJobsId(nextFlowNode.getJobsId());
				workFlow.setWorkflowNode(nextFlowNode.getId());
				workFlow.setStatus(FlowConst.ING);
				if (nextFlowNode.getNodeType()==FlowConst.NODE_TYPE_END) {
					workFlow.setStatus(FlowConst.END);
				}*/
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
	
	
	public Map<String, String> json2Map(String json){
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) JSON.parse(json);
		return map;
	}
	
	private BigDecimal getValByname(Map<String, String> map,String name){
		String o = map.get(name);
		BigDecimal b = new BigDecimal(o);
		return b;
		
	}

	
	@Override
	public int updateWorkFlow(WorkFlow workFlow) throws Exception {
		return workFlowDao.updateWorkFlow(workFlow);
	}
}
