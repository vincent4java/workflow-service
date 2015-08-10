package com.v4java.workflow.vo.webservice;



import java.util.List;

import com.v4java.workflow.vo.VO;

public class UserVO extends VO{


	/**
	 * 
	 */
	private static final long serialVersionUID = -8126804076229297861L;

	private String userCode;
	
	private String userName;
	
	private Integer systemId;
	
	private String systemName;
	
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

	public Integer getSystemId() {
		return systemId;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	
	
	
}
