package com.v4java.workflow.service.webservice;

import java.util.List;

import com.v4java.workflow.pojo.FlowNode;

public interface IFlowNodeService {

	
	/**
	 * 
	 * @param workFlowId
	 * @return
	 * @throws Exception
	 */
	List<FlowNode> findFlowNodeByModelId(Integer modelId) throws Exception;
	
	int updateFlowNodeStatus(FlowNode flowNode)throws Exception;
}
