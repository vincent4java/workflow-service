package com.v4java.workflow.dao.webservice;

import java.util.List;

import com.v4java.workflow.pojo.FlowNode;

public interface FlowNodeDao {

	
	List<FlowNode> findFlowNodeByModelId(Integer modelId) throws Exception;
	
	FlowNode findFirstFlowNodeById(Integer modelId) throws Exception;
	
}
