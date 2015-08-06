package com.v4java.workflow.query.webservice;

import com.v4java.workflow.query.Query;

public class WorkFlowQuery extends Query{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6428338251796894312L;
	private Integer systemId;
	private String userCode;
	private Integer busyTypeId;
	private String systemCode;
	private String userName;
	private String json;
	private String workFlowCode;
	private Integer workFlowId;
	private Integer agree;
	private String name;
	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public Integer getBusyTypeId() {
		return busyTypeId;
	}

	public void setBusyTypeId(Integer busyTypeId) {
		this.busyTypeId = busyTypeId;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getWorkFlowCode() {
		return workFlowCode;
	}

	public void setWorkFlowCode(String workFlowCode) {
		this.workFlowCode = workFlowCode;
	}

	public Integer getWorkFlowId() {
		return workFlowId;
	}

	public void setWorkFlowId(Integer workFlowId) {
		this.workFlowId = workFlowId;
	}

	public Integer getAgree() {
		return agree;
	}

	public void setAgree(Integer agree) {
		this.agree = agree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
