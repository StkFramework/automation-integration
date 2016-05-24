package com.org.test.steps;

import com.softtek.automation.steps.AbstractSteps;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.test.business.SearchRequestBusinessCase;
import com.softtek.automation.TestLogger;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.element.UIElementFactory;

import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation 
public class DashboardTestSteps extends AbstractSteps{

	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	@Autowired(required=true)
	private AppActions AppActions;	
	
	@When("^(?i:I validate dashboard)$")
	public void i_validate_dashboard() throws Exception {		
		
		TestLogger.getInstance(this).info("i_validate_dashboard ...");
		
		assertTrue(AppActions.OpenApplication("application1"));
		assertTrue(AppActions.WaitForSeconds("5"));
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("LoginPageView.userNameTxt"), "jose.san"));
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("LoginPageView.passwordTxt"), "XXXXXXXX"));
		
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("LoginPageView.submitBtn")));
		
		assertTrue(UIActions.ClickOnElement(".//*[@id='LOGON_SUBMIT_BUTTON_CAPTION.TXT']", null));
		
		assertTrue(AppActions.WaitForSeconds("10"));		
		assertTrue(UIActions.ElementContainsText(UIElementFactory.createElement("DashBoardPageView.mainHeader"), "Dashboard - Default"));		
		assertTrue(AppActions.WaitForSeconds("2"));
		
		assertTrue(AppActions.CloseCurrentApp());		
		
	}
}
