package com.v4java.workflow.dao.admin;

import java.util.List;

import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.admin.WorkFlowModelQuery;
import com.v4java.workflow.vo.admin.WorkFlowModelVO;

public interface WorkFlowModelDao {

	
	WorkFlowModel findWorkFlowModelById(Integer id) throws Exception;
	
	int insertWorkFlowModel(WorkFlowModel workFlowModel) throws Exception;

	int updateWorkFlowModel(WorkFlowModel workFlowModel) throws Exception;
	
	int updateWorkFlowModelStatus(WorkFlowModel workFlowModel) throws Exception;
	
	/**
	 * 查找某个系统的所有模板
	 * @param workFlowModelQuery
	 * @return
	 * @throws Exception
	 */
	List<WorkFlowModelVO> findWorkFlowModel(WorkFlowModelQuery workFlowModelQuery) throws Exception;
	
	
	/**
	 * 查找某个系统的所有模板总数
	 * @param workFlowModelQuery
	 * @return
	 * @throws Exception
	 */
	int findWorkFlowModelCount(WorkFlowModelQuery workFlowModelQuery) throws Exception;
	
	
/*	*//**
	 * 查找某个系统的所有模板
	 * @param workFlowModelQuery
	 * @return
	 * @throws Exception
	 *//*
	List<WorkFlowModelVO> findWorkFlowModelBySystemId(WorkFlowModelQuery workFlowModelQuery) throws Exception;
	
	*//**
	 * 查找某个系统的所有模板总数
	 * @param workFlowModelQuery
	 * @return
	 * @throws Exception
	 *//*
	int findWorkFlowModelCountBySystemId(WorkFlowModelQuery workFlowModelQuery) throws Exception;
	
	*//**
	 * 查找义个系统为sysemId且类型为typeid的模板
	 * @param workFlowModelQuery
	 * @return
	 * @throws Exception
	 *//*
	WorkFlowModel findWorkFlowModelSystemIdAndType(WorkFlowModelQuery workFlowModelQuery) throws Exception;*/
}
