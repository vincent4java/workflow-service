package com.v4java.workflow.service.webservice.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.webservice.WorkFlowModelDao;
import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.webservice.WorkFlowModelQuery;
import com.v4java.workflow.service.webservice.IWorkFlowModelService;



@Service("workFlowModelService")
public class WorkFlowModelServiceImpl implements IWorkFlowModelService{

	@Autowired
	private WorkFlowModelDao workFlowModelDao;
	
	@Override
	public WorkFlowModel findWorkFlowModelSystemIdAndType(WorkFlowModelQuery workFlowModelQuery) throws Exception {
		return workFlowModelDao.findWorkFlowModelSystemIdAndType(workFlowModelQuery);
	}

}
