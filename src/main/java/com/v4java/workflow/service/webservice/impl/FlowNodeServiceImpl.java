package com.v4java.workflow.service.webservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.webservice.FlowNodeDao;
import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.service.webservice.IFlowNodeService;

@Service("flowNodeService")
public class FlowNodeServiceImpl implements IFlowNodeService{

	@Autowired
	private FlowNodeDao flowNodeDao;
	
	@Override
	public List<FlowNode> findFlowNodeByModelId(Integer modelId)throws Exception {
		return flowNodeDao.findFlowNodeByModelId(modelId);
	}
	
}
