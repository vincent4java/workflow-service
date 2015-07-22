/*package com.v4java.workflow.system;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.workflow.pojo.Xf9System;
import com.v4java.workflow.service.IXf9SystemService;

public class Xf9SystemServiceTest extends TestCase{

	

	private IXf9SystemService xf9SystemService;
	private ApplicationContext context;
	
	public Xf9SystemServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		xf9SystemService =(IXf9SystemService) context.getBean("xf9SystemService");
	}
	
	
	public static Test suite(){
		TestSuite test = new TestSuite("Xf9SystemServiceTest接口测试");
		test.addTest(new Xf9SystemServiceTest("selectXf9SystemByUserCode"));
		return test;
	}
	
	
	public void selectXf9SystemByUserCode() throws Exception{
		Xf9System system = xf9SystemService.selectXf9SystemByUserCode("vz238");
		System.out.println(system.toString());
	}
	
}
*/