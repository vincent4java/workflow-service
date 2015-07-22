package com.v4java.workflow.dao.admin;

import com.v4java.workflow.pojo.Xf9System;

public interface Xf9SystemDao {

	
	 int insertXf9System(Xf9System xf9System) throws Exception;
	
	 int updateXf9System(Xf9System xf9System) throws Exception;

	 Xf9System selectXf9SystemByUserCode(String userCode) throws Exception;	
}
