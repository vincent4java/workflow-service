package com.v4java.workflow.vo.webservice;

import java.sql.Timestamp;

public class WorkFlowVO implements VO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2949264855421392596L;
	
	private Integer id;
	private Integer busyTypeId;
	private String name;
	private Integer modelId;
	private Integer systemId;
	
	private String description;
	private Timestamp createTime;
	private Timestamp updateTime;
	private String jobsName;
	private String jobsDescription;
	
	private String busyTypeName ;// '业务类型',
	private String json;
	private String nodeName;
	private String nodeDescription;
	private Integer workflowNode;
	
	
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
	public String getJobsName() {
		return jobsName;
	}
	public void setJobsName(String jobsName) {
		this.jobsName = jobsName;
	}
	public String getJobsDescription() {
		return jobsDescription;
	}
	public void setJobsDescription(String jobsDescription) {
		this.jobsDescription = jobsDescription;
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
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getNodeDescription() {
		return nodeDescription;
	}
	public void setNodeDescription(String nodeDescription) {
		this.nodeDescription = nodeDescription;
	}
	public Integer getWorkflowNode() {
		return workflowNode;
	}
	public void setWorkflowNode(Integer workflowNode) {
		this.workflowNode = workflowNode;
	}
	
	
}
