/*package com.v4java.workflow.webservice;


import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.service.webservice.IFlowNodeService;

public class FlowNodeServiceTest extends TestCase{

	private IFlowNodeService flowNodeService;
	private ApplicationContext context;
	
	public FlowNodeServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("workflow-service-webservice.xml");
		flowNodeService =(IFlowNodeService) context.getBean("flowNodeService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("FlowNodeService接口测试");
		test.addTest(new FlowNodeServiceTest("findFlowNodeByWorkFlowId"));
		return test;
	}

	public void findFlowNodeByWorkFlowId() throws Exception{
		List<FlowNode> flowNodes = flowNodeService.findFlowNodeByModelId(6);
		for (FlowNode flowNode : flowNodes) {
			System.out.println(flowNode.toString());
		}
	}
}
*/