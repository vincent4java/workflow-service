package com.v4java.workflow.service.webservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.webservice.JobsUserDao;
import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.query.webservice.JobsUserQuery;
import com.v4java.workflow.service.webservice.IJobsUserService;

@Service("jobsUserService")
public class JobsUserServiceImpl implements IJobsUserService{

	@Autowired
	private JobsUserDao jobsUserDao;

	@Override
	public List<JobsUser> findjobsUserByUserCodeAndSystemId(JobsUserQuery jobsUserQuery)throws Exception {
		return jobsUserDao.findjobsUserByUserCodeAndSystemId(jobsUserQuery);
	}


}
