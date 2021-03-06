package com.v4java.workflow.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.admin.FlowNodeDao;
import com.v4java.workflow.dao.admin.WorkFlowModelDao;
import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.admin.WorkFlowModelQuery;
import com.v4java.workflow.service.admin.IWorkFlowModelService;
import com.v4java.workflow.vo.admin.WorkFlowModelVO;


@Service("workFlowModelService")
public class WorkFlowModelServiceImpl implements IWorkFlowModelService{

	@Autowired
	private WorkFlowModelDao workFlowModelDao ;
	@Autowired
	private FlowNodeDao flowNodeDao;
	@Override
	public WorkFlowModel findWorkFlowModelById(Integer id) throws Exception {
		return workFlowModelDao.findWorkFlowModelById(id);
	}

	@Override
	public int insertWorkFlowModel(WorkFlowModel workFlowModel)throws Exception {
		return workFlowModelDao.insertWorkFlowModel(workFlowModel);
	}

	@Override
	public int updateWorkFlowModel(WorkFlowModel workFlowModel)throws Exception {
		return workFlowModelDao.updateWorkFlowModel(workFlowModel);
	}

	@Override
	public List<WorkFlowModelVO> findWorkFlowModel(WorkFlowModelQuery workFlowModelQuery) throws Exception {
		return workFlowModelDao.findWorkFlowModel(workFlowModelQuery);
	}

	@Override
	public int findWorkFlowModelCount(WorkFlowModelQuery workFlowModelQuery)throws Exception {
		return workFlowModelDao.findWorkFlowModelCount(workFlowModelQuery);
	}

	@Override
	public int updateWorkFlowModelStatus(WorkFlowModel workFlowModel)throws Exception {
		return workFlowModelDao.updateWorkFlowModelStatus(workFlowModel);
	}


}
