package com.v4java.workflow.service.admin;

import java.util.List;

import com.v4java.workflow.pojo.JobsUser;

public interface IJobsUserService {
	
	void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception;
	
}