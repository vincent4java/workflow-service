package com.v4java.workflow.service.webservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.webservice.ApproveLogDao;
import com.v4java.workflow.pojo.ApproveLog;
import com.v4java.workflow.service.webservice.IApproveService;

@Service("approveService")
public class ApproveServiceImpl implements  IApproveService{

	
	@Autowired
	private ApproveLogDao approveLogDao;
	@Override
	public List<ApproveLog> findApproveLogsBySystemId(Integer systemId) {
		return approveLogDao.findApproveLogsBySystemId(systemId);
	}

	@Override
	public List<ApproveLog> findApproveLogsByWorkfLowId(Integer workFlowId) {
		// TODO Auto-generated method stub
		return approveLogDao.findApproveLogsByWorkfLowId(workFlowId);
	}

}
