package com.v4java.workflow.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.admin.JobsUserDao;
import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.query.admin.JobsUserQuery;
import com.v4java.workflow.service.admin.IJobsUserService;
import com.v4java.workflow.vo.admin.JobsUserVO;


@Service("jobsUserService")
public class JobsUserServiceImpl implements IJobsUserService{

	@Autowired
	private JobsUserDao jobsUserDao;
	

	@Override
	public int batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception {
		return jobsUserDao.batchInsertJobsUser(jobsUsers);
	}


	@Override
	public List<JobsUserVO> findJobsUserVO(JobsUserQuery jobsUserQuery)throws Exception {
		return jobsUserDao.findJobsUserVO(jobsUserQuery);
	}


	@Override
	public int findJobsUserVOCount(JobsUserQuery jobsUserQuery) throws Exception {
		return jobsUserDao.findJobsUserVOCount(jobsUserQuery);
	}

	
	
}
