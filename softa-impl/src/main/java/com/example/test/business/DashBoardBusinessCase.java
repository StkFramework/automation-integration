package com.example.test.business;

import com.softtek.automation.ExecutionContext;
import com.softtek.automation.ExecutionResult;
import com.softtek.automation.TestLogger;
import com.softtek.automation.logic.AbstractBusinessCase;

public class DashBoardBusinessCase extends AbstractBusinessCase {

	
	/*
	 * Uncommetn this to provide personalized execution in run() method
	@Override
	public ExecutionResult run(ExecutionContext context) {
		
		ExecutionResult result = new ExecutionResult();
		
		init(null,result);		
		readDataSources(null,result);
		
		
		return result;
	}
	*/
	
	
	
	@Override
	protected void init(ExecutionContext context, ExecutionResult result) {
		// TODO Auto-generated method stub
		
		result.setResult(true);

		TestLogger.getInstance(this).info("init()");
	}

	@Override
	protected void fillFormWithData(ExecutionContext context, ExecutionResult result) {
		// TODO Auto-generated method stub
		TestLogger.getInstance(this).info("fillFormWithData()");
	}

	@Override
	protected void readDataSources(ExecutionContext context, ExecutionResult result) {
		// TODO Auto-generated method stub
		TestLogger.getInstance(this).info("readDataSources()");
	}

	@Override
	protected void fillWithData(ExecutionContext context, ExecutionResult result) {
		// TODO Auto-generated method stub
		TestLogger.getInstance(this).info("fillWithData()");
	}

	@Override
	protected void checkCase(ExecutionContext context, ExecutionResult result) {
		// TODO Auto-generated method stub
		TestLogger.getInstance(this).info("checkCase()");

	}

}
