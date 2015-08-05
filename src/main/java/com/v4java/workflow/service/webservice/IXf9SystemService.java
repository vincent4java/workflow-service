package com.v4java.workflow.service.webservice;

import com.v4java.workflow.pojo.Xf9System;

public interface IXf9SystemService {

	
	Xf9System findXf9SystemBySystemCode(String systemCode) throws Exception;	
}
