package com.v4java.workflow.vo.admin;

import java.io.Serializable;

public class VO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4404886470574530173L;

	private String statusName;
	
	private String createTimeName;
	
	private String updateTimeName;

	private String operation;
	
	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getCreateTimeName() {
		return createTimeName;
	}

	public void setCreateTimeName(String createTimeName) {
		this.createTimeName = createTimeName;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getUpdateTimeName() {
		return updateTimeName;
	}

	public void setUpdateTimeName(String updateTimeName) {
		this.updateTimeName = updateTimeName;
	}
	
	
}
