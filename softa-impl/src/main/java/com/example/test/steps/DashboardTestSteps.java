package com.example.test.steps;

import com.softtek.automation.steps.AbstractSteps;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.element.UIElementFactory;

import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation 
public class DashboardTestSteps extends AbstractSteps{

	private UIActions UIActions;
	private UIElementFactory UIElementFactory;
	
	@When("^(?i:I validate dashboard)$")
	public void i_validate_dashboard() throws Exception {
		
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("DashBoardPageView.openDashBoardLink")));			
		
		assertTrue(UIActions.ElementContainsText(UIElementFactory.createElement("DashBoardPageView.mainHeader"), 
				"Welcome:" + getFromVolatileContext("USER_NAME")));
		
		//assertTrue(new DashBoardDataValidation().run());	
	}
}
