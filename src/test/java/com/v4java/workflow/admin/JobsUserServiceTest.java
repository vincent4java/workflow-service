/*package com.v4java.workflow.admin;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.service.IJobsUserService;


public class JobsUserServiceTest extends TestCase{

	private IJobsUserService jobsUserService;
	private ApplicationContext context;

	public JobsUserServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext("admin-service-applicationContext.xml");
		jobsUserService =(IJobsUserService) context.getBean("jobsUserService");
	}
	
	public static Test suite(){
		TestSuite test = new TestSuite("JobsService接口测试");
		test.addTest(new JobsUserServiceTest("findUserWorkFlowVOByUserId"));
		return test;
	}
	

	
	public void batchInsertJobsUser() throws Exception{
		List<JobsUser> jobsUsers = new ArrayList<JobsUser>();
		JobsUser jobsUser1 = new JobsUser();
		jobsUser1.setJobsId(1);
		jobsUser1.setStatus(0);
		jobsUser1.setUserCode("vz110");
		jobsUser1.setUserName("陈海龙");
		JobsUser jobsUser2= new JobsUser();
		jobsUser2.setJobsId(1);
		jobsUser2.setStatus(0);
		jobsUser2.setUserCode("vzxt9999");
		jobsUser2.setUserName("系统");
		
		JobsUser jobsUser3= new JobsUser();
		jobsUser3.setJobsId(5);
		jobsUser3.setStatus(0);
		jobsUser3.setUserCode("vzxt9999");
		jobsUser3.setUserName("系统");
		
		JobsUser jobsUser4= new JobsUser();
		jobsUser4.setJobsId(6);
		jobsUser4.setStatus(0);
		jobsUser4.setUserCode("vzxt9999");
		jobsUser4.setUserName("系统");
		
		JobsUser jobsUser5= new JobsUser();
		jobsUser5.setJobsId(4);
		jobsUser5.setStatus(0);
		jobsUser5.setUserCode("vz236");
		jobsUser5.setUserName("杨书华");
		
		JobsUser jobsUser6= new JobsUser();
		jobsUser6.setJobsId(3);
		jobsUser6.setStatus(0);
		jobsUser6.setUserCode("v9");
		jobsUser6.setUserName("37740048@qq.com");
		
		JobsUser jobsUser7= new JobsUser();
		jobsUser7.setJobsId(2);
		jobsUser7.setStatus(0);
		jobsUser7.setUserCode("12345");
		jobsUser7.setUserName("12345");
	
		jobsUsers.add(jobsUser1);
		jobsUsers.add(jobsUser2);
		jobsUsers.add(jobsUser3);
		jobsUsers.add(jobsUser4);
		jobsUsers.add(jobsUser5);
		jobsUsers.add(jobsUser6);
		jobsUsers.add(jobsUser7);
		
		jobsUserService.batchInsertJobsUser(jobsUsers);
	}
	
}
*/