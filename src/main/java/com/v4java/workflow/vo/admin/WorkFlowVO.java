package com.v4java.workflow.vo.admin;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class WorkFlowVO extends VO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2945085820891751669L;
	private Integer id;
	private Integer busyTypeId;
	private String name;
	private Integer modelId;
	private String description;
	private Timestamp createTime;
	private Timestamp updateTime;
	private String jobsName;
	private String jobsDescription;
	private String busyTypeName ;// '业务类型',
	private BigDecimal money;
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
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "WorkFlowVO [id=" + id + ", busyTypeId=" + busyTypeId
				+ ", name=" + name + ", modelId=" + modelId + ", description="
				+ description + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", jobsName=" + jobsName + ", jobsDescription="
				+ jobsDescription + ", busyTypeName=" + busyTypeName
				+ ", money=" + money + "]";
	}
	
	
}
