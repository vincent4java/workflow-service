package com.v4java.workflow.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class WorkFlow implements Pojo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5418867925197378044L;

	
	private Integer id ;//int primary key  AUTO_INCREMENT,
	private Integer busyTypeId ;// '业务类型id',
	private String busyTypeName ;// '业务类型',
	private BigDecimal money;
	private String name ;// '审批工作名',
	private String description ;// '审批工作描述',
	private Integer systemId;
	private Integer modelId ;// ,
	private Integer jobsId;// '待审批岗位id',
	private Integer workflowNode ;// '审批节点',
	private Integer status ;// '0 未开始审批，可以编辑更改 1 正在审批，不可以编辑更改 2 审批结束，不可以编辑更改',
	private String json;
	private Timestamp createTime ;//
	private Timestamp updateTime ;//
	private String workFlowCode ;//
	private String userCode;//发起人code
	private String userName;//发起人name
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBusyTypeId() {
		return busyTypeId;
	}
	public void setBusyTypeId(Integer busyTypeId) {
		this.busyTypeId = busyTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getJobsId() {
		return jobsId;
	}
	public void setJobsId(Integer jobsId) {
		this.jobsId = jobsId;
	}
	public Integer getWorkflowNode() {
		return workflowNode;
	}
	public void setWorkflowNode(Integer workflowNode) {
		this.workflowNode = workflowNode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public String getBusyTypeName() {
		return busyTypeName;
	}
	public void setBusyTypeName(String busyTypeName) {
		this.busyTypeName = busyTypeName;
	}
	public Integer getSystemId() {
		return systemId;
	}
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
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
	public String getWorkFlowCode() {
		return workFlowCode;
	}
	public void setWorkFlowCode(String workFlowCode) {
		this.workFlowCode = workFlowCode;
	}
	
}
