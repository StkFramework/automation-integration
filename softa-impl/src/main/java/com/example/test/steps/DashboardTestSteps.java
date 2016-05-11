package com.example.test.steps;

import com.softtek.automation.steps.AbstractSteps;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.test.business.DashBoardBusinessCase;
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
		
		
		assertTrue(new DashBoardBusinessCase().run(null));
		
		
		/*
		When I type text 'jose.san' on element 'LoginPageView.userNameTxt'
		Then I type text 'TePa181115' on element 'LoginPageView.passwordTxt'
		And I click on 'LoginPageView.submitBtn'
		And I wait '10' seconds
		And Element 'DashBoardPageView.mainHeader' has text 'Dashboard - Default'
		And I validate dashboard
		And I wait '2' seconds
		And I close current application
		*/
		
		
		//TestLogger.INFO(this, "i_validate_dashboard ...");
		
		/*
		TestLogger.getInstance(this).info("i_validate_dashboard ...");
		
		assertTrue(AppActions.OpenApplication("application1"));
		assertTrue(AppActions.WaitForSeconds("5"));
		assertTrue(UIActions.TypeTextOnElement(UIElementFactory.createElement("LoginPageView.userNameTxt"), "jose.san"));
		assertTrue(UIActions.TypeTextOnElement(UIElementFactory.createElement("LoginPageView.passwordTxt"), "XXXXX"));
		
		//assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("LoginPageView.submitBtn")));
		assertTrue(UIActions.ClickOnElement(".//*[@id='LOGON_SUBMIT_BUTTON_CAPTION.TXT']", null));
		
		assertTrue(AppActions.WaitForSeconds("10"));		
		assertTrue(UIActions.ElementContainsText(UIElementFactory.createElement("DashBoardPageView.mainHeader"), "Dashboard - Default"));		
		assertTrue(AppActions.WaitForSeconds("2"));
		assertTrue(AppActions.CloseCurrentApp());
		
		*/
		
		
		//assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("DashBoardPageView.openDashBoardLink")));			
		
		//assertTrue(UIActions.ElementContainsText(UIElementFactory.createElement("DashBoardPageView.mainHeader"), 
		//		"Welcome:" + getFromVolatileContext("USER_NAME")));
		
		//assertTrue(new DashBoardDataValidation().run());	
		
		
		
		//String text1 = (String) assertTrue(UIActions.GetText(UIElementFactory.createElement("DashBoardPageView.mainHeader")));
		
		//String text2 = (String) UIActions.GetText(UIElementFactory.createElement("DashBoardPageView.mainHeader")).getObjectResult();		
		
		//TestLogger.INFO(this, "text1 -> " + text1);
		//TestLogger.INFO(this, "text2 -> " + text2);
	}
}
