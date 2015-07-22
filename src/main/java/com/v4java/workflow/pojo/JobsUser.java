package com.v4java.workflow.pojo;

import java.sql.Timestamp;

/*
 */
public class JobsUser implements Pojo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6023235028033738156L;

	private Integer id;
	
	private Integer jobsId;
	
	private String userCode;	
	
	private String userName ;
	
	private Integer status;
	
	private Integer systemId;
	
	private Timestamp createTime;
	private Timestamp updateTime;
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
	public Integer getSystemId() {
		return systemId;
	}
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	@Override
	public String toString() {
		return "JobsUser [id=" + id + ", jobsId=" + jobsId + ", userCode="
				+ userCode + ", userName=" + userName + ", status=" + status
				+ ", systemId=" + systemId + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

	
}
