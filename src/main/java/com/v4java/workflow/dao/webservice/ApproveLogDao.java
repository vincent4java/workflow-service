package com.v4java.workflow.dao.webservice;

import java.util.List;

import com.v4java.workflow.pojo.ApproveLog;

public interface ApproveLogDao {

	void insertApproveLog (ApproveLog approveLog) throws Exception;
	
	List<ApproveLog> findApproveLogsBySystemId(Integer systemId);
	
	
	List<ApproveLog> findApproveLogsByWorkfLowId(Integer workfLowId);
}
