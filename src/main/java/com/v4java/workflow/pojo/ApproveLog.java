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
	
	private Integer busyTypeId ;// '业务类型id',
	private String busyTypeName ;// '业务类型',
	
	private Integer jobsId;
	private String jobsName;
	
	private String nodeName;//  '审批流节点名称'
	
	private Integer modelId;//  '审批流名称
	private String modelName;//  '审批名称'
	private String name;
	private Integer systemId;
	
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
	public Integer getBusyTypeId() {
		return busyTypeId;
	}
	public void setBusyTypeId(Integer busyTypeId) {
		this.busyTypeId = busyTypeId;
	}
	public String getBusyTypeName() {
		return busyTypeName;
	}
	public void setBusyTypeName(String busyTypeName) {
		this.busyTypeName = busyTypeName;
	}
	public Integer getJobsId() {
		return jobsId;
	}
	public void setJobsId(Integer jobsId) {
		this.jobsId = jobsId;
	}
	public String getJobsName() {
		return jobsName;
	}
	public void setJobsName(String jobsName) {
		this.jobsName = jobsName;
	}
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public Integer getSystemId() {
		return systemId;
	}
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	
	
	
}
