package com.v4java.workflow.pojo;

import java.sql.Timestamp;

/**
 * 
 * @author vincent
 *
 */
public class WorkFlowModel implements Pojo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2551847498307677435L;
	private Integer id   ;//primary key  AUTO_INCREMENT,
	private Integer busyTypeId ;//'业务类型id',
	private String modelText ;//'工作流模板',	
	private String name;//  '审批流节点名称'
	private Integer systemId;
	private String description;// '审批流节点描述'
	private Integer status; //tinyint not null default 0 comment '0 可用 1不可用',
	private Timestamp createTime;// 
	private Timestamp updateTime; //
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
	public String getModelText() {
		return modelText;
	}
	public void setModelText(String modelText) {
		this.modelText = modelText;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
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
	public Integer getSystemId() {
		return systemId;
	}
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	@Override
	public String toString() {
		return "WorkFlowModel [id=" + id + ", busyTypeId=" + busyTypeId
				+ ", modelText=" + modelText + ", name=" + name + ", systemId="
				+ systemId + ", description=" + description + ", status="
				+ status + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
	
	
}
