package com.v4java.workflow.constant;

/**
 * 
 * @author vincent
 *
 */
public class FlowConst {
	//同意
	public static final int AGREE_TRUE = 0;
	//拒绝
	public static final int AGREE_FALSE = 1;
	//未开始审批，可以编辑更改
	public static final int START = 0;
	//正在审批，不可以编辑更改
	public static final int ING = 1;
	//审批结束，不可以编辑更改
	public static final int END = 2;
	//开始节点
	public static final int NODE_TYPE_START = 0;
	//任务节点
	public static final int NODE_TYPE_TASK = 1;
	//判断节点
	public static final int NODE_TYPE_IF = 2;
	//结束节点
	public static final int NODE_TYPE_END = 3;
	
	public static final Double NODE_FLOW_IF_VALUE_MAX = -1.0;
	
	public static final int COMPARE_GT = 1;
	
	public static final int COMPARE_GTE = 2;	

	public static final int COMPARE_LT = -1;
	
	public static final int COMPARE_LTE = -2;
	
	public static final int COMPARE_EQ = 0;
	
	//可用
	public static final int STATUS_TRUE = 0;
	//不可用
	public static final int STATUS_FALSE = 1;
	
	public static final String[] NODE_TYPE_NAME ={"开始","任务","判断","结束"};
}


