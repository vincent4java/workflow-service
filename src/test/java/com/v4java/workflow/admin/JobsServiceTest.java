/*package com.v4java.workflow.admin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.workflow.pojo.Jobs;
import com.v4java.workflow.service.IJobsService;


public class JobsServiceTest extends TestCase{

	private IJobsService jobsService;
	private ApplicationContext context;

	public JobsServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("workflow-service-admin.xml");
		jobsService =(IJobsService) context.getBean("jobsService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("JobsServiceTest接口测试");
		//test.addTest(new AdminUserTest("insertfindive"));
		test.addTest(new JobsServiceTest("insertJobs"));
		
		return test;
	}
		
	public void insertJobs() throws Exception{
		Jobs jobs = new Jobs();
		jobs.setName("总裁");
		jobs.setDescription("总裁");
		jobs.setStatus(0);
		int n = jobsService.insertJobs(jobs);
		System.err.println(n);
	}
}
*/