/*package com.v4java.workflow.system;

import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v4java.workflow.query.system.WorkFlowModelQuery;
import com.v4java.workflow.service.system.IWorkFlowModelService;
import com.v4java.workflow.vo.system.WorkFlowModelVO;

public class WorkFlowModelServiceTest extends TestCase{

	
	private IWorkFlowModelService workFlowModelService;
	private ApplicationContext context;
	
	public WorkFlowModelServiceTest(String name) {
		super(name);
		context = new ClassPathXmlApplicationContext(workflow-service-system.xml");
		workFlowModelService =(IWorkFlowModelService) context.getBean("workFlowModelService");
	}

	
	public static Test suite(){
		TestSuite test = new TestSuite("WorkFlowModelService接口测试");
		test.addTest(new WorkFlowModelServiceTest("findWorkFlowModelBySystemId"));
		return test;
	}
	
	public void findWorkFlowModelBySystemId() throws Exception{
		WorkFlowModelQuery workFlowModelQuery = new WorkFlowModelQuery();
		workFlowModelQuery.setSystemId(7);
		List<WorkFlowModelVO> flowModelVOs = workFlowModelService.findWorkFlowModelBySystemId(workFlowModelQuery);
		for (WorkFlowModelVO workFlowModelVO : flowModelVOs) {
			System.out.println(workFlowModelVO.toString());
		}
	}

	
}
*/