/*package com.v4java.workflow.admin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.service.IWorkFlowModelService;

public class WorkFlowModelServiceTest extends TestCase{

	
	private IWorkFlowModelService workFlowModelService;
	private ApplicationContext context;
	
	public WorkFlowModelServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		workFlowModelService =(IWorkFlowModelService) context.getBean("workFlowModelService");
	}

	
	public static Test suite(){
		TestSuite test = new TestSuite("WorkFlowModelService接口测试");
		test.addTest(new WorkFlowModelServiceTest("insertWorkFlowModel"));
		return test;
	}
	
	public void insertWorkFlowModel() throws Exception{
		WorkFlowModel flowModel = new WorkFlowModel();
		flowModel.setBusyTypeId(2);
		flowModel.setDescription("提现审批");
		flowModel.setName("提现审批");
		flowModel.setModelText("");
		flowModel.setStatus(0);
		workFlowModelService.insertWorkFlowModel(flowModel);
	}
}
*/