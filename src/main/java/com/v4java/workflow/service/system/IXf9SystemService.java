package com.v4java.workflow.service.system;

import com.v4java.workflow.pojo.Xf9System;

public interface IXf9SystemService {


	 Xf9System findXf9SystemByUserCode(String userCode) throws Exception;	
	 
	 int insertXf9System(Xf9System xf9System) throws Exception;
}
