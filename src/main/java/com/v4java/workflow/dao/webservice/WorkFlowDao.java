package com.v4java.workflow.dao.webservice;

import java.util.List;

import com.v4java.workflow.param.webservice.WorkFlowParam;
import com.v4java.workflow.pojo.WorkFlow;
import com.v4java.workflow.query.webservice.WorkFlowQuery;
import com.v4java.workflow.vo.webservice.WorkFlowVO;

public interface WorkFlowDao {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	int insertWorkFlow(WorkFlow workFlow) throws Exception;

	
	int updateWorkFlow(WorkFlow workFlow) throws Exception;
	
	int updateWorkFlowStatusUseWorkFlowParam(WorkFlowParam workFlowParam) throws Exception;
	
	/**
	 * 查找用户代办审批 WorkFlowVO
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	List<WorkFlowVO> findUserWorkFlowVOByUserCodeAndSystemId(WorkFlowQuery workFlowQuery) throws Exception;
	/**
	 * 查找用户代办审批 count
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	int findUserWorkFlowVOCountByUserCodeAndSystemId(WorkFlowQuery workFlowQuery) throws Exception;
}
