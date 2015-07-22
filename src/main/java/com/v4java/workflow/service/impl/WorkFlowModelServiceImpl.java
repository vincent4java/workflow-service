package com.v4java.workflow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.WorkFlowModelDao;
import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.admin.WorkFlowModelQuery;
import com.v4java.workflow.service.IWorkFlowModelService;
import com.v4java.workflow.view.admin.WorkFlowModelVO;


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

	@Override
	public int updateWorkFlowModel(WorkFlowModel workFlowModel)throws Exception {
		return workFlowModelDao.updateWorkFlowModel(workFlowModel);
	}

	@Override
	public List<WorkFlowModelVO> findWorkFlowModelBySystemId(WorkFlowModelQuery workFlowModelQuery) throws Exception {
		return workFlowModelDao.findWorkFlowModelBySystemId(workFlowModelQuery);
	}

	@Override
	public int findWorkFlowModelCountBySystemId(WorkFlowModelQuery workFlowModelQuery) throws Exception {
		return workFlowModelDao.findWorkFlowModelCountBySystemId(workFlowModelQuery);
	}

	@Override
	public WorkFlowModel findWorkFlowModelSystemIdAndType(WorkFlowModelQuery workFlowModelQuery) throws Exception {
		return workFlowModelDao.findWorkFlowModelSystemIdAndType(workFlowModelQuery);
	}

}
