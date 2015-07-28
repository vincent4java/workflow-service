/*package com.v4java.workflow.webservice;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.query.webservice.JobsUserQuery;
import com.v4java.workflow.service.webservice.IJobsUserService;


public class JobsUserServiceTest extends TestCase{

	private IJobsUserService jobsUserService;
	
	private ApplicationContext context;

	public JobsUserServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("workflow-service-webservice.xml");
		jobsUserService =(IJobsUserService) context.getBean("jobsUserService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("JobsService接口测试");
		test.addTest(new JobsUserServiceTest("findjobsUserByUserCode"));
		return test;
	}
	
	
	public void findjobsUserByUserCode() throws Exception{
		JobsUserQuery jobsUserQuery = new JobsUserQuery();
		jobsUserQuery.setUserCode("vzxt9999");
		jobsUserQuery.setSystemId(7);
		List<JobsUser> jobsUsers = jobsUserService.findjobsUserByUserCodeAndSystemId(jobsUserQuery);
		for (JobsUser jobsUser : jobsUsers) {
			System.err.println(jobsUser.toString());
		}
	}
	
}
*/