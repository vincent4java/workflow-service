package com.v4java.workflow.service.webservice;

import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.webservice.WorkFlowModelQuery;

public interface IWorkFlowModelService {

	
	/**
	 * 查找义个系统为sysemId且类型为typeid的模板
	 * @param workFlowModelQuery
	 * @return
	 * @throws Exception
	 */
	WorkFlowModel findWorkFlowModelSystemIdAndType(WorkFlowModelQuery workFlowModelQuery) throws Exception;
}
