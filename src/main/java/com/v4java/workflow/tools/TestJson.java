package com.v4java.workflow.tools;

import java.io.Serializable;

public class TestJson implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Double[] test;
	
	private Integer target;



	public Double[] getTest() {
		return test;
	}

	public void setTest(Double[] test) {
		this.test = test;
	}

	public Integer getTarget() {
		return target;
	}

	public void setTarget(Integer target) {
		this.target = target;
	}
	
	
	
	
}
