package com.v4java.workflow.admin;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONArray;
import com.v4java.workflow.common.FlowConst;
import com.v4java.workflow.pojo.Compare;
import com.v4java.workflow.pojo.CompareArray;
import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.service.IFlowNodeService;
import com.v4java.workflow.tools.TestJson;

public class FlowNodeServiceTest extends TestCase{

	private IFlowNodeService flowNodeService;
	private ApplicationContext context;
	
	public FlowNodeServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		flowNodeService =(IFlowNodeService) context.getBean("flowNodeService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("FlowNodeService接口测试");
		test.addTest(new FlowNodeServiceTest("updageFlowNode"));
		return test;
	}

	public void updageFlowNode() throws Exception{
		FlowNode flowNode = new FlowNode();
		
		///sort == 4
		Compare c1 = new Compare();
		c1.setSort(4);
		CompareArray array1 = new  CompareArray();
		array1.setName("money");
		array1.setType(FlowConst.COMPARE_LT);
		array1.setValue(new BigDecimal(200000));
		CompareArray[] arrays1 = {array1};
		c1.setCompareArrays(arrays1);
		
		///sort == 4
		Compare c2 = new Compare();
		c2.setSort(5);
		CompareArray array2 = new  CompareArray();
		array2.setName("money");
		array2.setType(FlowConst.COMPARE_GTE);
		array2.setValue(new BigDecimal(200000));
		CompareArray[] arrays2 = {array2};
		c2.setCompareArrays(arrays2);
	
		List<Compare> compares = new ArrayList<Compare>();
		compares.add(c1);
		compares.add(c2);
		String test = JSONArray.toJSONString(compares);
		flowNode.setFlowTest(test);
		flowNode.setId(15);
		flowNodeService.updateFlowNode(flowNode);
	}
	
	public void insertFlowNodeif() throws Exception{
		FlowNode flowNode =new FlowNode();
		flowNode.setJobsId(0);
		flowNode.setModelId(6);
		flowNode.setName("判断");
		TestJson json1 =new TestJson();
		Double[] a1 ={(double) 0,(double) 200000};
		json1.setTarget(4);
		json1.setTest(a1);
		TestJson json2 =new TestJson();
		Double[] a2={(double) 200000,FlowConst.NODE_FLOW_IF_VALUE_MAX};
		json2.setTarget(5);
		json2.setTest(a2);
		flowNode.setDescription("大于200000需要财务主管审批");
		flowNode.setNodeType(2);
		TestJson[] flowTests = {json1,json2};
		String test = JSONArray.toJSONString(flowTests);
		flowNode.setFlowTest(test);
		flowNode.setSort(3);
		flowNode.setNextSort(0);
		flowNodeService.insertFlowNode(flowNode);
	}
	
	
	public void insertFlowNodeend() throws Exception{
		FlowNode flowNode =new FlowNode();
		flowNode.setJobsId(0);
		flowNode.setModelId(6);
		flowNode.setName("结束");
		flowNode.setDescription("");
		flowNode.setNodeType(3);
		flowNode.setSort(4);
		flowNode.setNextSort(0);
		flowNodeService.insertFlowNode(flowNode);
	}
	
	public void insertFlowzhuguan() throws Exception{
		FlowNode flowNode =new FlowNode();
		flowNode.setJobsId(3);
		flowNode.setModelId(6);
		flowNode.setName("财务主管审批");
		flowNode.setDescription("财务主管，三级");
		flowNode.setNodeType(1);
		flowNode.setSort(5);
		flowNode.setNextSort(4);
		flowNodeService.insertFlowNode(flowNode);
	}
	
	public void findFlowNodeById() throws Exception{
		FlowNode flowNode = flowNodeService.findFlowNodeById(8);
		System.err.println(flowNode.getJobsId());
	}
	
	public void findFlowNodeByWorkFlowId() throws Exception{
	}
}
