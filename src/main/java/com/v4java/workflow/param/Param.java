package com.v4java.workflow.param;

import java.io.Serializable;

public class Param implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9175778433785516118L;

	private Integer id;
	//现在状态
	private Integer nowStatus;
	//原来状态
	private Integer oldStatus;
	
	public Integer getNowStatus() {
		return nowStatus;
	}
	public void setNowStatus(Integer nowStatus) {
		this.nowStatus = nowStatus;
	}
	public Integer getOldStatus() {
		return oldStatus;
	}
	public void setOldStatus(Integer oldStatus) {
		this.oldStatus = oldStatus;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
		
}
