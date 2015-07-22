package com.v4java.workflow.service.system.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.system.Xf9SystemDao;
import com.v4java.workflow.pojo.Xf9System;
import com.v4java.workflow.service.system.IXf9SystemService;


@Service("xf9SystemService")
public class Xf9SystemServiceImpl implements IXf9SystemService{

	@Autowired
	private Xf9SystemDao xf9SystemDao; 

	@Override
	public Xf9System selectXf9SystemByUserCode(String userCode)throws Exception {
		return xf9SystemDao.selectXf9SystemByUserCode(userCode);
	}

}
