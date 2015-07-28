package com.v4java.workflow.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.admin.JobsDao;
import com.v4java.workflow.pojo.Jobs;
import com.v4java.workflow.query.admin.JobsQuery;
import com.v4java.workflow.service.admin.IJobsService;
import com.v4java.workflow.vo.admin.JobsVO;

@Service("jobsService")
public class JobsServieImpl implements IJobsService{

	@Autowired
	private JobsDao jobsDao;
	
	@Override
	public int insertJobs(Jobs jobs) throws Exception {
		return jobsDao.insertJobs(jobs);
	}

	@Override
	public List<JobsVO> findJobsBySystemId(JobsQuery jobsQuery) throws Exception {
		return jobsDao.findJobsVO(jobsQuery);
	}

	@Override
	public int findJobsCountBySystemId(JobsQuery jobsQuery) throws Exception {
		return jobsDao.findJobsVOCount(jobsQuery);
	}
}
