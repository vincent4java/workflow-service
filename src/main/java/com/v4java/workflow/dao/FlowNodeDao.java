package com.v4java.workflow.dao;

import java.util.List;

import com.v4java.workflow.pojo.FlowNode;

public interface FlowNodeDao {

	
	List<FlowNode> findFlowNodeByModelId(Integer workFlowId) throws Exception;
	
	FlowNode findFlowNodeById(Integer Id) throws Exception;
	
	int insertFlowNode(FlowNode flowNode) throws Exception;
	
	FlowNode findFirstFlowNodeById(Integer modelId) throws Exception;
	
	int updateFlowNode(FlowNode flowNode) throws Exception;
	
}
