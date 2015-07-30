package com.v4java.workflow.service.admin;

import com.v4java.workflow.pojo.Xf9System;

public interface IXf9SystemService {

		
	 int updateXf9System(Xf9System xf9System) throws Exception;

	 Xf9System findXf9SystemByUserCode(String userCode) throws Exception;	
}
