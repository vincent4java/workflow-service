package com.v4java.workflow.dao.system;

import com.v4java.workflow.pojo.Xf9System;

public interface Xf9SystemDao {

	 Xf9System selectXf9SystemByUserCode(String userCode) throws Exception;	
}
