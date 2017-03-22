package com.org.test.steps;

import com.softtek.automation.steps.AbstractSteps;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.test.business.SearchRequestBusinessCase;
import com.softtek.automation.ExecutionResult;
import com.softtek.automation.TestLogger;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.actions.UIActionsLocal;
import com.softtek.automation.element.UIElement;
import com.softtek.automation.element.UIElementFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;

public class CMSTestSteps extends AbstractSteps{
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIActionsLocal UIActionsLocal;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	@Autowired(required=true)
	private AppActions AppActions;	
	
	@When("^(?i:I Login as Franchise Manager)$")
	public void i_login_as_franchise_manager() throws Exception {
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("CMSPageView.userNameTxt"), "fr.softtek@brinkerglobaldgestk.onmicrosoft.com"));
		completeLogin();
	}
	
	@When("^(?i:I Login as Restaurant Manager)$")
	public void i_login_as_restaurant_manager() throws Exception {
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("CMSPageView.userNameTxt"), "rm.softtek@brinkerglobaldgestk.onmicrosoft.com"));
		completeLogin();
	}
	
	private void completeLogin() throws Exception{
		assertTrue(AppActions.WaitForSeconds("1"));
		
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("CMSPageView.passwordTxt"), "$abc!123"));
//		if (!UIActions.ElementNotExist("//*[@id='aad_account_tile']", null).isValidResult())
//		{
//			UIActions.ClickOnElement("//*[@id='aad_account_tile']//tr", null);
//			assertTrue(AppActions.WaitForSeconds("2"));
//		}
		assertTrue(AppActions.WaitForSeconds("1"));
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CMSPageView.loginBtn")));
		assertTrue(AppActions.WaitForSeconds("5"));
	}
	
	@When("^(?i:I Enter a new Menu name)$")
	public void i_enter_a_new_menu_name() throws Exception {
		String newMenuName = "AutomatedTest"  + System.currentTimeMillis();
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("CMSPageView.menuNametxt"), newMenuName));
		
		assertTrue(UIActions.PutTextInCacheContext(newMenuName, "newMenuName"));
		
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CMSPageView.createBtn")));
	}
	
	@When("^(?i:I Enter a Restaurant Schedule Monday - Sunday) '(.+)'$")
	public void i_enter_a_restaurant_schedule(String schedule) throws Exception {
		String[] scheduleHours = schedule.split("-");
		String scheduleStartXpathPrefix = "//*[@id='collapseOne']//div/select[@name=";
		for (int index = 0; index < 7; index++) {
			String scheduleStartXpath = scheduleStartXpathPrefix + "'start_" + index +"']";
			String scheduleEndsXpath = scheduleStartXpathPrefix + "'ends_" + index +"']";
			assertTrue(UIActions.SelectValueFromDropdownElement(scheduleStartXpath, null, scheduleHours[0].trim()));
			assertTrue(UIActions.SelectValueFromDropdownElement(scheduleEndsXpath, null, scheduleHours[1].trim()));
		}
	}
	
	@When("^(?i:I select To Go)$")
	public void i_select_to_go() throws Exception{
		UIElement estimatedTimeTxt = UIElementFactory.createElement("CMSPageView.estimatedTimeTxt"); 
		UIElement emailDeliveryTxt = UIElementFactory.createElement("CMSPageView.emailDeliveryTxt"); 
		
		if(!UIActions.ElementIsEnabled(estimatedTimeTxt).isValidResult()){
			assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CMSPageView.toGoDeliveryBtn")));
		}
		
		if(UIActions.ElementIsEnabled(emailDeliveryTxt).isValidResult()){
			assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CMSPageView.deliveryDeliveryBtn")));
		}
		
	}
	
	@When("^(?i:I Select Restaurant for the saved menu)$")
	public void I_select_restaurant() throws Exception{
		
		String newMenuName = UIActionsLocal.GetTextFromCacheContext("newMenuName").getObjectResult().toString();
		String restaurantMenuXPath = "//table//tr[td[@class='name-column']/span[text()='" + newMenuName + "']]/td[@id='actions-column']/a[text()='Restaurants']"; 
		assertTrue(UIActions.ClickOnElement(restaurantMenuXPath, null));
	}
	
	@When("^(?i:I Select unassigned Restaurant) '(.+)'$")
	public void I_select_unassigned_restaurant(String restaurant) throws Exception{
		
		String restaurantMenuXPath = "//div[h2[text()='Unassigned Restaurants']]/ul//a[span[text()='" + restaurant + "']]"; 
		assertTrue(UIActions.ClickOnElement(restaurantMenuXPath, null));
	}
}
