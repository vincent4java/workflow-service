/*package com.v4java.workflow.admin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.enumerate.MD5Utils;
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
		test.addTest(new Xf9SystemServiceTest("insertXf9System"));
		return test;
	}
	
	public void insertXf9System(){
		Xf9System xf9System = new Xf9System();
		xf9System.setDescription("系统管理员");
		xf9System.setId(1);
		xf9System.setStatus(0);
		xf9System.setName("系统");
		xf9System.setUserCode("vz238");
		xf9System.setUserName("槑槑的呆瓜");
		xf9System.setUserPwd(MD5Utils.md5SaltMd5("admin123", xf9System.getUserCode()));
		try {
			xf9SystemService.insertXf9System(xf9System);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
*/