package com.v4java.workflow.service.admin.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v4java.workflow.constant.AdminConst;
import com.v4java.workflow.dao.admin.FlowNodeDao;
import com.v4java.workflow.dao.admin.WorkFlowModelDao;
import com.v4java.workflow.pojo.FlowNode;
import com.v4java.workflow.pojo.WorkFlowModel;
import com.v4java.workflow.query.admin.FlowNodeQuery;
import com.v4java.workflow.service.admin.IFlowNodeService;
import com.v4java.workflow.vo.admin.FlowNodeVO;

@Service("flowNodeService")
public class FlowNodeServiceImpl implements IFlowNodeService{

	@Autowired
	private FlowNodeDao flowNodeDao;
	@Autowired
	private WorkFlowModelDao workFlowModelDao;
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
	public List<FlowNodeVO> findFlowNodeVO(FlowNodeQuery flowNodeQuery)throws Exception {
		return flowNodeDao.findFlowNodeVO(flowNodeQuery);
	}

	@Override
	public int findFlowNodeVOCount(FlowNodeQuery flowNodeQuery) throws Exception {
		return flowNodeDao.findFlowNodeVOCount(flowNodeQuery);
	}

	@Override
	public int updateFlowNodeStatus(FlowNode flowNode) throws Exception {
		WorkFlowModel workFlowModel = workFlowModelDao.findWorkFlowModelByFlowNodeId(flowNode.getId());
		if (workFlowModel!=null&&workFlowModel.getStatus()==AdminConst.STATUS_FLASE) {
			return  flowNodeDao.updateFlowNodeStatus(flowNode);
		}
		return -1;
	}


}
