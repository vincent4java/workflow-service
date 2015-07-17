package com.v4java.workflow.service;

import com.v4java.workflow.pojo.WorkFlowModel;

public interface IWorkFlowModelService {

	WorkFlowModel findWorkFlowModelById(Integer id) throws Exception;
	
	void insertWorkFlowModel(WorkFlowModel workFlowModel) throws Exception;
}
