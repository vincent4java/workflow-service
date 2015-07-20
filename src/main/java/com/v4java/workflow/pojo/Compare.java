package com.v4java.workflow.pojo;

import java.io.Serializable;

/**
 * 判断
 * @author vincent
 *
 */
public class Compare implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7730295987867272L;

	private int sort ;
	
	private CompareArray[] compareArrays;

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public CompareArray[] getCompareArrays() {
		return compareArrays;
	}

	public void setCompareArrays(CompareArray[] compareArrays) {
		this.compareArrays = compareArrays;
	}
	
	
}
