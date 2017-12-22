package com.org.test.steps;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.softtek.automation.actions.UIActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HubLoginTestSteps extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	@Autowired(required=true)
	private UIActions Actions;
	
	@Value("${properties.hubUser1}")
	private String user1;

	@Value("${properties.hubPassword1}")
	private String password1;
	
	
	@Given("^I logged in successfully to hub using user '(.+)'$")
	public void i_logged_and_navigate_to_maggie_using_user(String user) throws Exception {
		loginToSfdc(user);
	}
	
	private void loginToSfdc(final String user) throws Exception {

		String thisUser = null;
		String thisPassword = null;

		if (user.equalsIgnoreCase("user1")) {
			thisUser = user1;
			thisPassword = password1;
		}

		UIActions.PutTextInVolatileContext(thisUser, "UserName");
		UIActions.PutTextInVolatileContext(thisPassword, "Password");
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("HubLoginPageView.usernameTextBox"), thisUser));
		Thread.sleep(2000);
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("HubLoginPageView.passwordTextBox"), thisPassword));
		Thread.sleep(2000);
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("HubLoginPageView.loginBtn")));

	}

	@And("^I Reopen the application '(.+)'$")
	public void i_reopen_the_app(String application) throws Exception {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		driver.getDriverInstance().navigate().to(application);
	}

}
