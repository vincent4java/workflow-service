package com.v4java.workflow.vo.admin;

import java.util.List;

import com.v4java.workflow.vo.VO;

public class UserVO implements VO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3834667209208341612L;

	private String userCode;
	
	private String userName;
	
	private List<Integer> jobsIds;
	
	

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public List<Integer> getJobsIds() {
		return jobsIds;
	}

	public void setJobsIds(List<Integer> jobsIds) {
		this.jobsIds = jobsIds;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
