package com.v4java.workflow.dao.webservice;

import com.v4java.workflow.pojo.WorkFlow;

public interface WorkFlowDao {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	int insertWorkFlow(WorkFlow workFlow) throws Exception;

	
	int updateWorkFlow(WorkFlow workFlow) throws Exception;
}
