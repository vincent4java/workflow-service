package com.v4java.workflow.dao.webservice;

import java.util.List;

import com.v4java.workflow.pojo.WorkFlow;
import com.v4java.workflow.vo.admin.WorkFlowVO;

public interface WorkFlowDao {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	int insertWorkFlow(WorkFlow workFlow) throws Exception;

	
	int updateWorkFlow(WorkFlow workFlow) throws Exception;
}
