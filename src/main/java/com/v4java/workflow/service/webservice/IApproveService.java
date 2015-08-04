package com.v4java.workflow.service.webservice;

import java.util.List;

import com.v4java.workflow.pojo.ApproveLog;

public interface IApproveService {

	List<ApproveLog> findApproveLogsBySystemId(Integer systemId);
	
	
	List<ApproveLog> findApproveLogsByWorkfLowId(Integer workFlowId);
}
