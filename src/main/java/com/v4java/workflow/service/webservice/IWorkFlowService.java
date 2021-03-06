package com.v4java.workflow.service.webservice;


import java.util.List;

import com.v4java.workflow.param.webservice.WorkFlowParam;
import com.v4java.workflow.pojo.WorkFlow;
import com.v4java.workflow.query.webservice.WorkFlowQuery;
import com.v4java.workflow.vo.webservice.UserVO;
import com.v4java.workflow.vo.webservice.WorkFlowVO;



public interface IWorkFlowService {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	int insertWorkFlow(WorkFlow workFlow,UserVO userVO) throws Exception;

	/**
	 * 进行工作流审批
	 * @param workFlowId 待审批工作id
	 * @param UserVO	 用户码
	 * @param ApproveLog		 
	 * @return
	 * @throws Exception
	 */
	WorkFlowParam doWorkFlow(WorkFlow workFlow, UserVO userVO,int agree)throws Exception;
	

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
	
	/**
	 * 更工作流json
	 * @param workFlow
	 * @return
	 * @throws Exception
	 */
	int updateWorkFlowJson(WorkFlow workFlow) throws Exception;
	
	
	WorkFlowParam deleteWorkflow(WorkFlow workFlow, UserVO userVO)throws Exception;
}
