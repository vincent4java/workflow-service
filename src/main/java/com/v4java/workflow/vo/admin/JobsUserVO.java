package com.v4java.workflow.vo.admin;

import java.sql.Timestamp;


public class JobsUserVO extends VO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7759053970452869267L;
	
	
	private Integer id;
	
	private Integer jobsId;
	
	private String userCode;	
	
	private String userName ;
	
	private Integer status;
	
	private Integer systemId;
	
	private Timestamp createTime;
	private Timestamp updateTime;
	
	private String jobsName ;

	public String getJobsName() {
		return jobsName;
	}

	public void setJobsName(String jobsName) {
		this.jobsName = jobsName;
	}

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

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
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

	
}
