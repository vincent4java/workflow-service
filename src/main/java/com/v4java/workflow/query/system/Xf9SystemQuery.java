package com.v4java.workflow.query.system;

import com.v4java.workflow.query.Query;

public class Xf9SystemQuery extends Query{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2749095434547492147L;
	
	
	private String name;
	
	private String userName;
	
	private String userCode;
	
	private String userPwd;
	
	private String description;
	
	private String systemCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	
}
