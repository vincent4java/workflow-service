package com.v4java.workflow.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.dao.admin.FlowNodeDao;
import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.query.admin.FlowNodeQuery;
import com.v4java.workflow.service.admin.IFlowNodeService;

@Service("flowNodeService")
public class FlowNodeServiceImpl implements IFlowNodeService{

	@Autowired
	private FlowNodeDao flowNodeDao;

	@Override
	public FlowNode findFlowNodeById(Integer Id) throws Exception {
		return flowNodeDao.findFlowNodeById(Id);
	}

	@Override
	public int insertFlowNode(FlowNode flowNode) throws Exception {
		return flowNodeDao.insertFlowNode(flowNode);
	}

	@Override
	public int updateFlowNode(FlowNode flowNode) throws Exception {
		return flowNodeDao.updateFlowNode(flowNode);
	}

	@Override
	public List<FlowNode> findFlowNode(FlowNodeQuery flowNodeQuery)throws Exception {
		return flowNodeDao.findFlowNode(flowNodeQuery);
	}

	@Override
	public int findFlowNodeCount(FlowNodeQuery flowNodeQuery) throws Exception {
		return flowNodeDao.findFlowNodeCount(flowNodeQuery);
	}

	
}
