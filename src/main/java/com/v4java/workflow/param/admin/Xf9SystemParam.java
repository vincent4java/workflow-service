package com.v4java.workflow.param.admin;

import com.v4java.workflow.param.Param;

public class Xf9SystemParam extends Param{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1874843469716891477L;

	private String oldPwd;

	private String nowPwd;

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNowPwd() {
		return nowPwd;
	}

	public void setNowPwd(String nowPwd) {
		this.nowPwd = nowPwd;
	}

	
}
