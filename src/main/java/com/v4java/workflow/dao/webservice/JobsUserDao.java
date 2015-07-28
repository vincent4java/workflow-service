package com.v4java.workflow.dao.webservice;

import java.util.List;

import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.query.webservice.JobsUserQuery;

public interface JobsUserDao {
	
	List<JobsUser> findjobsUserByUserCodeAndSystemId(JobsUserQuery jobsUserQuery) throws Exception;
}
