package com.v4java.workflow.service.system.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.system.Xf9SystemDao;
import com.v4java.workflow.pojo.Xf9System;
import com.v4java.workflow.query.system.Xf9SystemQuery;
import com.v4java.workflow.service.system.IXf9SystemService;
import com.v4java.workflow.vo.system.Xf9SystemVO;


@Service("xf9SystemService")
public class Xf9SystemServiceImpl implements IXf9SystemService{

	@Autowired
	private Xf9SystemDao xf9SystemDao; 

	@Override
	public Xf9System findXf9SystemByUserCode(String userCode)throws Exception {
		return xf9SystemDao.findXf9SystemByUserCode(userCode);
	}

	@Override
	public int insertXf9System(Xf9System xf9System) throws Exception {
		return xf9SystemDao.insertXf9System(xf9System);
	}


	@Override
	public int findXf9SystemCount(Xf9SystemQuery xf9SystemQuery)throws Exception {
		return xf9SystemDao.findXf9SystemCount(xf9SystemQuery);
	}

	@Override
	public List<Xf9SystemVO> findXf9Systems(Xf9SystemQuery xf9SystemQuery)throws Exception {
		return xf9SystemDao.findXf9Systems(xf9SystemQuery);
	}

}
