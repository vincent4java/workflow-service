package com.v4java.workflow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.WorkFlowModelDao;
import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.service.IWorkFlowModelService;


@Service("workFlowModelService")
public class WorkFlowModelServiceImpl implements IWorkFlowModelService{

	@Autowired
	private WorkFlowModelDao workFlowModelDao ;
	@Override
	public WorkFlowModel findWorkFlowModelById(Integer id) throws Exception {
		return workFlowModelDao.findWorkFlowModelById(id);
	}

	@Override
	public void insertWorkFlowModel(WorkFlowModel workFlowModel)throws Exception {
		workFlowModelDao.insertWorkFlowModel(workFlowModel);
	}

}
