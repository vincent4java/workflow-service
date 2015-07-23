package com.v4java.workflow.query.webservice;

import com.v4java.workflow.query.Query;

public class WorkFlowQuery extends Query{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6428338251796894312L;
	private Integer systemId;
	private String userCode;

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

}
