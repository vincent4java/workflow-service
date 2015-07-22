package com.v4java.workflow.query.admin;


import com.v4java.workflow.query.Query;

public class WorkFlowModelQuery extends Query{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5184518334828330356L;
	/**
	 * 
	 */

	private Integer id   ;//primary key  AUTO_INCREMENT,
	private Integer busyTypeId ;//'业务类型id',
	private Integer systemId;
	private Integer status; //tinyint not null default 0 comment '0 可用 1不可用',
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBusyTypeId() {
		return busyTypeId;
	}
	public void setBusyTypeId(Integer busyTypeId) {
		this.busyTypeId = busyTypeId;
	}
	public Integer getSystemId() {
		return systemId;
	}
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
