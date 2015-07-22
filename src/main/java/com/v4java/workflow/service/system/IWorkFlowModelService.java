package com.v4java.workflow.service.system;

import java.util.List;

import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.system.WorkFlowModelQuery;
import com.v4java.workflow.vo.system.WorkFlowModelVO;

public interface IWorkFlowModelService {

	WorkFlowModel findWorkFlowModelById(Integer id) throws Exception;
	
	void insertWorkFlowModel(WorkFlowModel workFlowModel) throws Exception;
	
	int updateWorkFlowModel(WorkFlowModel workFlowModel) throws Exception;
	
	
	/**
	 * 查找某个系统的所有模板
	 * @param workFlowModelQuery
	 * @return
	 * @throws Exception
	 */
	List<WorkFlowModelVO> findWorkFlowModelBySystemId(WorkFlowModelQuery workFlowModelQuery) throws Exception;
	/**
	 * 查找某个系统的所有模板总数
	 * @param workFlowModelQuery
	 * @return
	 * @throws Exception
	 */
	int findWorkFlowModelCountBySystemId(WorkFlowModelQuery workFlowModelQuery) throws Exception;
	
}
