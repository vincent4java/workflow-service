package com.v4java.workflow.dao.admin;

import java.util.List;

import com.v4java.workflow.pojo.JobsUser;
import com.v4java.workflow.query.admin.JobsUserQuery;
import com.v4java.workflow.vo.admin.JobsUserVO;

public interface JobsUserDao {
	
	int batchInsertJobsUser(List<JobsUser> jobsUsers) throws Exception;
	
	List<JobsUserVO> findJobsUserVO(JobsUserQuery jobsUserQuery) throws Exception;
	
	int findJobsUserVOCount(JobsUserQuery jobsUserQuery) throws Exception;
	
	List<JobsUser> findJobsUser(JobsUserQuery jobsUserQuery) throws Exception;
}
