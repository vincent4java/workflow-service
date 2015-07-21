package com.v4java.workflow.service;

import java.util.List;

import com.v4java.workflow.pojo.FlowNode;

public interface IFlowNodeService {

	
	List<FlowNode> findFlowNodeByModelId(Integer workFlowId) throws Exception;
	
	FlowNode findFlowNodeById(Integer Id) throws Exception;
	
	int insertFlowNode(FlowNode flowNode) throws Exception;
	
	int updateFlowNode(FlowNode flowNode) throws Exception;
}
