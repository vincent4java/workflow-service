package com.v4java.workflow.query.admin;

import com.v4java.workflow.query.Query;

public class JobsUserQuery extends Query {

	private static final long serialVersionUID = 1281334695988398487L;
	
	private Integer jobsId;
	
	private Integer systemId;
	
	private String userName;
	
	private String userCode;

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Integer getJobsId() {
		return jobsId;
	}

	public void setJobsId(Integer jobsId) {
		this.jobsId = jobsId;
	}
	
}
