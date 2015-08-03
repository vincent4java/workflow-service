package com.v4java.workflow.pojo;

import java.sql.Timestamp;

public class FlowNode implements Pojo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 245497925642822440L;
	private Integer id ;//int primary key  ,
	private Integer jobsId;//  '岗位id',
	private Integer modelId;
	private Integer nodeType ;//   '节点类型类型 0开始节点 1.任务节点 2.判断节点 3.结束 ',
	private Integer nodeTypeId ;//   '节点类型类型 0开始节点 1.任务节点 2.判断节点 3.结束 ',
	private String flowTest ;//'判断json 正则判断'
	private Integer sort ;// '下一个节点'
	private Integer nextSort = 0 ;// '下一个节点'
	private String name;//  '审批流节点名称'
	private Integer status;
	private String description;// '审批流节点描述'
	private Timestamp createTime ;//
	private Timestamp updateTime ;//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getJobsId() {
		return jobsId;
	}
	public void setJobsId(Integer jobsId) {
		this.jobsId = jobsId;
	}
	public Integer getNodeType() {
		return nodeType;
	}
	public void setNodeType(Integer nodeType) {
		this.nodeType = nodeType;
	}
	public String getFlowTest() {
		return flowTest;
	}
	public void setFlowTest(String flowTest) {
		this.flowTest = flowTest;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Integer getModelId() {
		return modelId;
	}
	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getNextSort() {
		return nextSort;
	}
	public void setNextSort(Integer nextSort) {
		this.nextSort = nextSort;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getNodeTypeId() {
		return nodeTypeId;
	}
	public void setNodeTypeId(Integer nodeTypeId) {
		this.nodeTypeId = nodeTypeId;
	}
	
}
