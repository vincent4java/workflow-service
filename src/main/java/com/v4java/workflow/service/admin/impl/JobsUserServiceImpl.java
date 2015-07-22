package com.v4java.workflow.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.admin.JobsUserDao;
import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.service.admin.IJobsUserService;


@Service("jobsUserService")
public class JobsUserServiceImpl implements IJobsUserService{

	@Autowired
	private JobsUserDao jobsUserDao;
	

	@Override
	public void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception {
		jobsUserDao.batchInsertJobsUser(jobsUsers);
	}

}
