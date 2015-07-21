package com.v4java.workflow.view.admin;

import java.sql.Timestamp;

import com.v4java.workflow.view.VO;

/**
 * 
 * @author vincent
 * 岗位VO
 */
public class JobsVO implements VO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7794577129226515744L;
	
	
	private Integer id;
	
	private String name;
	
	private String description;
	
	private Integer status;
	
	private String statusName;
	
	private Integer systemId;
	
	private String systemName;
	
	private Timestamp createTime;
	
	private Timestamp updateTime;
	
	private String createTimeName;

	private String operation;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

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
	
	
	
	
}
