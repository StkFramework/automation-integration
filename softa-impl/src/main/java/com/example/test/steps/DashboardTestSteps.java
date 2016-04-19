package com.example.test.steps;

import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation
public class DashboardTestSteps {

	@When("^(?i:I validate dashboard)$")
	public void i_validate_dashboard() {
		// assertTrue(UIActions.ClickOnElement(DashBoardPageView.openDashBoardLink));
		// assertTrue(new DashBoardDataValidation().run());
		// assertTrue(UIActions.ElementContainsText(DashBoardPageView.mainHeader, "Welcome:"
		// + ExecutionContext.getElement("USER_NAME")));

	}
}
