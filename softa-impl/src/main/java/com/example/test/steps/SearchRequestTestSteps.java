package com.example.test.steps;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.test.business.SearchRequestBusinessCase;
import com.softtek.automation.TestLogger;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation
public class SearchRequestTestSteps extends AbstractSteps{
	
	@Autowired(required=true)
	private SearchRequestBusinessCase searchRequestBusinessCase;	
	
	@When("^I validate request search$")
	public void i_validate_request_search() throws Exception {		
		
		TestLogger.getInstance(this).info("i_validate_request_search ...");
		
		searchRequestBusinessCase.run(this.ExecutionContext);				
		
	}
}
