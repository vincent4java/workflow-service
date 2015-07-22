package com.v4java.workflow.webservice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.webservice.WorkFlowModelQuery;
import com.v4java.workflow.service.webservice.IWorkFlowModelService;

public class WorkFlowModelServiceTest extends TestCase{

	
	private IWorkFlowModelService workFlowModelService;
	private ApplicationContext context;
	
	public WorkFlowModelServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("workflow-service-webservice.xml");
		workFlowModelService =(IWorkFlowModelService) context.getBean("workFlowModelService");
	}

	
	public static Test suite(){
		TestSuite test = new TestSuite("WorkFlowModelService接口测试");
		test.addTest(new WorkFlowModelServiceTest("findWorkFlowModelSystemIdAndType"));
		return test;
	}
	
	public void findWorkFlowModelSystemIdAndType() throws Exception{
		WorkFlowModelQuery workFlowModelQuery  =new WorkFlowModelQuery();
		workFlowModelQuery.setBusyTypeId(2);
		workFlowModelQuery.setSystemId(7);
		WorkFlowModel workFlowModel = workFlowModelService.findWorkFlowModelSystemIdAndType(workFlowModelQuery);
		System.out.println(workFlowModel.toString());
	}
}
