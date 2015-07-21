package com.v4java.workflow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.JobsDao;
import com.v4java.workflow.pojo.Jobs;
import com.v4java.workflow.query.admin.JobsQuery;
import com.v4java.workflow.service.IJobsService;
import com.v4java.workflow.view.admin.JobsVO;

@Service("jobsService")
public class JobsServieImpl implements IJobsService{

	@Autowired
	private JobsDao jobsDao;
	
	@Override
	public int insertJobs(Jobs jobs) throws Exception {
		return jobsDao.insertJobs(jobs);
	}

	@Override
	public List<JobsVO> selectJobs(JobsQuery jobsQuery) throws Exception {
		return jobsDao.selectJobs(jobsQuery);
	}

	@Override
	public int selectJobsCount(JobsQuery jobsQuery) throws Exception {
		return jobsDao.selectJobsCount(jobsQuery);
	}
}
