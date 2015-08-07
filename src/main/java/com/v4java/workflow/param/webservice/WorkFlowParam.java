package com.v4java.workflow.param.webservice;

import com.v4java.workflow.param.Param;

public class WorkFlowParam extends Param{

	/**
	 * 
	 */
	private static final long serialVersionUID = 23293846494935291L;

	private Integer nowJobsId;// '待审批岗位id',
	
	private Integer oldWorkflowNode ;// '审批节点',

	private Integer oldJobsId;// '待审批岗位id',
	
	private Integer nowWorkflowNode ;// '审批节点',

	private Integer count;
	
	private Integer isDelete;

	public Integer getNowJobsId() {
		return nowJobsId;
	}

	public void setNowJobsId(Integer nowJobsId) {
		this.nowJobsId = nowJobsId;
	}

	public Integer getOldWorkflowNode() {
		return oldWorkflowNode;
	}

	public void setOldWorkflowNode(Integer oldWorkflowNode) {
		this.oldWorkflowNode = oldWorkflowNode;
	}

	public Integer getOldJobsId() {
		return oldJobsId;
	}

	public void setOldJobsId(Integer oldJobsId) {
		this.oldJobsId = oldJobsId;
	}

	public Integer getNowWorkflowNode() {
		return nowWorkflowNode;
	}

	public void setNowWorkflowNode(Integer nowWorkflowNode) {
		this.nowWorkflowNode = nowWorkflowNode;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	
	
	
}
