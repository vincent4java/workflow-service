package com.v4java.workflow.service.admin.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.admin.Xf9SystemDao;
import com.v4java.workflow.pojo.Xf9System;
import com.v4java.workflow.service.admin.IXf9SystemService;

@Service("xf9SystemService")
public class Xf9SystemServiceImpl implements IXf9SystemService{

	@Autowired
	private Xf9SystemDao xf9SystemDao; 
	@Override
	public int insertXf9System(Xf9System xf9System) throws Exception {
		return xf9SystemDao.insertXf9System(xf9System);
	}

	@Override
	public int updateXf9System(Xf9System xf9System) throws Exception {
		return xf9SystemDao.updateXf9System(xf9System);
	}

	@Override
	public Xf9System selectXf9SystemByUserCode(String userCode)throws Exception {
		return xf9SystemDao.selectXf9SystemByUserCode(userCode);
	}

}
