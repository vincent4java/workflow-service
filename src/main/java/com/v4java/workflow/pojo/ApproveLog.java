package com.v4java.workflow.pojo;

import java.sql.Timestamp;

/**
 * 审批工作流日志
 * @author vincent
 *
 */
public class ApproveLog  implements Pojo{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5541651400440240082L;

	private Integer id ;//int primary key  ,
	private Integer workFlowId ;//
	private Integer status ;//
	private String description;// varchar(100)  comment '拒绝理由',
	private String  userCode ;
	private String  userName ;
	private Integer flowNode ;//
	private Timestamp createTime ;//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getWorkFlowId() {
		return workFlowId;
	}
	public void setWorkFlowId(Integer workFlowId) {
		this.workFlowId = workFlowId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getFlowNode() {
		return flowNode;
	}
	public void setFlowNode(Integer flowNode) {
		this.flowNode = flowNode;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	
	
}
