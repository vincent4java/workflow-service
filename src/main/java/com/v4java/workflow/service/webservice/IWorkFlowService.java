package com.v4java.workflow.service.webservice;


import com.v4java.workflow.pojo.ApproveLog;
import com.v4java.workflow.pojo.WorkFlow;
import com.v4java.workflow.vo.webservice.UserVO;



public interface IWorkFlowService {

	
	WorkFlow findWorkFlowById(Integer id) throws Exception;
	
	void insertWorkFlow(WorkFlow workFlow,UserVO userVO) throws Exception;

	/**
	 * 进行工作流审批
	 * @param workFlowId 待审批工作id
	 * @param UserVO	 用户码
	 * @param ApproveLog		 
	 * @return
	 * @throws Exception
	 */
	int doWorkFlow(Integer workFlowId, UserVO userVO,ApproveLog approveLog)throws Exception;
	
	int updateWorkFlow(WorkFlow workFlow) throws Exception;
}
