package com.v4java.workflow.service.admin;

import java.util.List;

import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.query.admin.JobsUserQuery;
import com.v4java.workflow.vo.admin.JobsUserVO;

public interface IJobsUserService {
	
	int batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception;
	
	
	List<JobsUserVO> findJobsUserVO(JobsUserQuery jobsUserQuery) throws Exception;
	
	int findJobsUserVOCount(JobsUserQuery jobsUserQuery) throws Exception;
}
