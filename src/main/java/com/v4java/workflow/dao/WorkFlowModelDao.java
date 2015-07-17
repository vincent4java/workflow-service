package com.v4java.workflow.dao;

import com.v4java.workflow.pojo.WorkFlowModel;

public interface WorkFlowModelDao {

	
	WorkFlowModel findWorkFlowModelById(Integer id) throws Exception;
	
	void insertWorkFlowModel(WorkFlowModel workFlowModel) throws Exception;
}
