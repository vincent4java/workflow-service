package com.v4java.workflow.dao;

import java.util.List;

import com.v4java.workflow.pojo.JobsUser;

public interface JobsUserDao {
	
	void batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception;
	
}
