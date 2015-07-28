package com.v4java.workflow.service.admin;

import java.util.List;

import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.query.admin.FlowNodeQuery;
import com.v4java.workflow.vo.admin.FlowNodeVO;

public interface IFlowNodeService {

	
	
	List<FlowNodeVO> findFlowNodeVO(FlowNodeQuery flowNodeQuery) throws Exception;
	
	int findFlowNodeVOCount(FlowNodeQuery flowNodeQuery) throws Exception;
	
	FlowNode findFlowNodeById(Integer Id) throws Exception;
	
	int insertFlowNode(FlowNode flowNode) throws Exception;
	
	int updateFlowNode(FlowNode flowNode) throws Exception;
}
