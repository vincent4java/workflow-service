package com.v4java.workflow.dao.webservice;

import java.util.List;

import com.v4java.workflow.pojo.WorkFlow;
import com.v4java.workflow.vo.admin.WorkFlowVO;

public interface WorkFlowDao {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	int insertWorkFlow(WorkFlow workFlow) throws Exception;

	/**
	 * 查找用户代办审批 WorkFlowVO
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	List<WorkFlowVO> findUserWorkFlowVOByUserCode(String userCode) throws Exception;
	/**
	 * 查找用户代办审批 count
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	int findUserWorkFlowVOCountByUserCode(String userCode) throws Exception;
	
	int updateWorkFlow(WorkFlow workFlow) throws Exception;
}
