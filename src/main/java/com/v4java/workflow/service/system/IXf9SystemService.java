package com.v4java.workflow.service.system;

import java.util.List;

import com.v4java.workflow.pojo.Xf9System;
import com.v4java.workflow.query.system.Xf9SystemQuery;
import com.v4java.workflow.vo.system.Xf9SystemVO;

public interface IXf9SystemService {


	 Xf9System findXf9SystemByUserCode(String userCode) throws Exception;	
	 
	 int insertXf9System(Xf9System xf9System) throws Exception;

	 List<Xf9SystemVO> findXf9Systems(Xf9SystemQuery xf9SystemQuery)throws Exception;
	 
	 int findXf9SystemCount(Xf9SystemQuery xf9SystemQuery)throws Exception;
}
