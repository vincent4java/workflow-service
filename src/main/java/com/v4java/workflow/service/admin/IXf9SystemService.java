package com.v4java.workflow.service.admin;

import com.v4java.workflow.param.admin.Xf9SystemParam;
import com.v4java.workflow.pojo.Xf9System;

public interface IXf9SystemService {

		

	 int updateXf9System(Xf9SystemParam xf9SystemParam) throws Exception;

	 Xf9System findXf9SystemByUserCode(String userCode) throws Exception;	
}
