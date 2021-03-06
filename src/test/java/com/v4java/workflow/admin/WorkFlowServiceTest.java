/*package com.v4java.workflow.admin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.v4java.workflow.pojo.ApproveLog;
import com.v4java.workflow.pojo.WorkFlow;
import com.v4java.workflow.service.IWorkFlowService;
import com.v4java.workflow.view.admin.UserVO;
import com.v4java.workflow.view.admin.WorkFlowVO;

public class WorkFlowServiceTest  extends TestCase{

	private IWorkFlowService workFlowService;
	private ApplicationContext context;
	
	public WorkFlowServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("workflow-service-admin.xml");
		workFlowService =(IWorkFlowService) context.getBean("workFlowService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("WorkFlowServiceTest接口测试");
		test.addTest(new WorkFlowServiceTest("doWorkFlow3"));
		return test;
	}
	public void findUserWorkFlowVOByUserId() throws Exception{
		List<WorkFlowVO> workFlowVOs = workFlowService.findUserWorkFlowVOByUserCode("vz110");
		System.out.println(workFlowVOs.size());
		for (WorkFlowVO workFlowVO : workFlowVOs) {
			System.err.println(workFlowVO.toString());
		}
	}
	
	public void updateWorkFlow() throws Exception{
		WorkFlow workFlow = new WorkFlow();
		workFlow.setId(6);
		Map<String, String> map = new HashMap<String, String>();
		map.put("money","200001.00");
		String json = JSON.toJSONString(map);
		workFlow.setJson(json);
		workFlowService.updateWorkFlow(workFlow);
	}
	
	public void doWorkFlow()throws Exception{
		UserVO userVO = new UserVO();
		List<Integer> jobsIds = new ArrayList<Integer>();
		jobsIds.add(1);
		jobsIds.add(7);
		userVO.setJobsIds(jobsIds);
		userVO.setUserCode("vz110");
		userVO.setUserName("陈海龙");
		ApproveLog approveLog = new ApproveLog();
		approveLog.setStatus(0);
		workFlowService.doWorkFlow(6, userVO, approveLog);
	}
	
	public void doWorkFlow3()throws Exception{
		UserVO userVO = new UserVO();
		List<Integer> jobsIds = new ArrayList<Integer>();
		jobsIds.add(3);
		userVO.setJobsIds(jobsIds);
		userVO.setUserCode("v9");
		userVO.setUserName("37740048@qq.com");
		ApproveLog approveLog = new ApproveLog();
		approveLog.setStatus(0);
		workFlowService.doWorkFlow(6, userVO, approveLog);
	}
	
	
	public void doWorkFlow2()throws Exception{
		UserVO userVO = new UserVO();
		List<Integer> jobsIds = new ArrayList<Integer>();
		jobsIds.add(2);
		userVO.setJobsIds(jobsIds);
		userVO.setUserCode("12345");
		userVO.setUserName("12345");
		ApproveLog approveLog = new ApproveLog();
		approveLog.setStatus(0);
		workFlowService.doWorkFlow(6, userVO, approveLog);
	}
	
	public void insertWorkFlow() throws Exception{
		WorkFlow flow = new WorkFlow();
		flow.setBusyTypeName("提现申请");
		flow.setBusyTypeId(1);
		flow.setDescription("提现申请");
		flow.setMoney(new BigDecimal(999999999.11));
		flow.setName("提现申请");
		flow.setWorkflowNode(6);
		flow.setModelId(6);
		UserVO userVO = new UserVO();
		List<Integer> jobsIds = new ArrayList<Integer>();
		jobsIds.add(3);
		userVO.setJobsIds(jobsIds);
		userVO.setUserCode("37740048@qq.com");
		userVO.setUserName("37740048@qq.com");
		workFlowService.insertWorkFlow(flow,userVO);
	}
	
}
*/