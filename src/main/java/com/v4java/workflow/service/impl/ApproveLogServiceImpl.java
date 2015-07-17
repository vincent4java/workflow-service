package com.v4java.workflow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.v4java.workflow.dao.ApproveLogDao;
import com.v4java.workflow.pojo.ApproveLog;
import com.v4java.workflow.service.IApproveLogService;

public class ApproveLogServiceImpl implements IApproveLogService{

	@Autowired
	private ApproveLogDao approveLogDao;
	@Override
	public void insertApproveLog(ApproveLog approveLog) throws Exception {
		approveLogDao.insertApproveLog(approveLog);
	}

	
}
