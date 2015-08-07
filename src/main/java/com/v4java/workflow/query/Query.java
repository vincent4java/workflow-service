package com.v4java.workflow.query;

import java.io.Serializable;

public class Query implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3394180983677381799L;

	
	private Integer limit;
	
	private Integer offset;
    //状态
    private Integer status;
    //是否删除
    private Integer isDelete;
    //创建开始时间
    private String createTimeStart;
    //创建结束时间
    private String createTimeEnd;

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(String createTimeStart) {
		if (createTimeStart!=null&&createTimeStart.length()==10) {
			createTimeStart =  createTimeStart +" 00:00:00";
		}
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		if (createTimeEnd!=null&&createTimeEnd.length()==10) {
			createTimeEnd =  createTimeEnd +" 23:59:59";
		}
		this.createTimeEnd = createTimeEnd;
	}

	
}
