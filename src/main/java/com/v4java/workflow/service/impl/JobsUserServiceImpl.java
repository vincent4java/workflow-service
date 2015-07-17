package com.v4java.workflow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.JobsUserDao;
import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.service.IJobsUserService;


@Service("jobsUserService")
public class JobsUserServiceImpl implements IJobsUserService{

	@Autowired
	private JobsUserDao jobsUserDao;
	

	@Override
	public void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception {
		jobsUserDao.batchInsertJobsUser(jobsUsers);
	}

}
