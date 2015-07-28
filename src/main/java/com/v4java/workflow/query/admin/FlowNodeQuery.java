package com.v4java.workflow.query.admin;

import com.v4java.workflow.query.Query;

public class FlowNodeQuery extends Query{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4779114172117656784L;

	
	private Integer status;
	
	private Integer modelId;
	
	private Integer nodeType ;//   '节点类型类型 0开始节点 1.任务节点 2.判断节点 3.结束 ',

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public Integer getNodeType() {
		return nodeType;
	}

	public void setNodeType(Integer nodeType) {
		this.nodeType = nodeType;
	}

	
	
}
