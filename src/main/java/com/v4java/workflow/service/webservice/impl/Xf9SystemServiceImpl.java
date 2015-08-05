package com.v4java.workflow.service.webservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.webservice.Xf9SystemDao;
import com.v4java.workflow.pojo.Xf9System;
import com.v4java.workflow.service.webservice.IXf9SystemService;

@Service("xf9SystemService")
public class Xf9SystemServiceImpl implements IXf9SystemService{

	@Autowired
	private Xf9SystemDao xf9SystemDao; 
	@Override
	public Xf9System findXf9SystemBySystemCode(String systemCode)throws Exception {
		return xf9SystemDao.findXf9SystemBySystemCode(systemCode);
	}

}
