package com.v4java.workflow.dao.webservice;

import com.v4java.workflow.pojo.Xf9System;

public interface Xf9SystemDao {

	
	Xf9System findXf9SystemBySystemCode(String systemCode) throws Exception;
	
	int updateXf9SystemPwd(Xf9System xf9System) throws Exception;
	
}
