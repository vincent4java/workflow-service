package com.v4java.workflow.service;

import java.util.List;

import com.v4java.workflow.pojo.Jobs;
import com.v4java.workflow.query.admin.JobsQuery;
import com.v4java.workflow.view.admin.JobsVO;

public interface IJobsService {

	int insertJobs (Jobs jobs) throws Exception;
	
	List<JobsVO> selectJobs(JobsQuery jobsQuery) throws Exception;
	
	int selectJobsCount(JobsQuery jobsQuery) throws Exception;
}
