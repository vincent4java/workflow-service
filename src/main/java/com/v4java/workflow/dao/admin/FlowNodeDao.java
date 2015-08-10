package com.v4java.workflow.dao.admin;

import java.util.List;

import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.query.admin.FlowNodeQuery;
import com.v4java.workflow.vo.admin.FlowNodeVO;

public interface FlowNodeDao {

	
	List<FlowNodeVO> findFlowNodeVO(FlowNodeQuery flowNodeQuery) throws Exception;
	
	int findFlowNodeVOCount(FlowNodeQuery flowNodeQuery) throws Exception;
	
	
	FlowNode findFlowNodeById(Integer Id) throws Exception;
	
	int insertFlowNode(FlowNode flowNode) throws Exception;
	
	FlowNode findFirstFlowNodeById(Integer modelId) throws Exception;
	
	int updateFlowNode(FlowNode flowNode) throws Exception;
	
	
	int updateFlowNodeStatus(FlowNode flowNode) throws Exception;
	
	int findNextSortCountBySort(FlowNode flowNode) throws Exception;
	
}
