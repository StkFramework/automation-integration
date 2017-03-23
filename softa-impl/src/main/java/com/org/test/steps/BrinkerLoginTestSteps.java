package com.org.test.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.org.test.page.LoginPageView;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.Given;

public class BrinkerLoginTestSteps extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	@Autowired(required=true)
	private AppActions AppActions;	
	
	@Value("${properties.brinkerUser1}")
	private String user1;

	@Value("${properties.brinkerPassword1}")
	private String password1;

	@Value("${properties.brinkerUser2}")
	private String user2;

	@Value("${properties.brinkerPassword2}")
	private String password2;
	
	@Value("${properties.brinkerUser3}")
	private String user3;

	@Value("${properties.brinkerPassword3}")
	private String password3;
	
	@Value("${properties.brinkerUser4}")
	private String user4;

	@Value("${properties.brinkerPassword4}")
	private String password4;
	
	
	
	@Given("^I logged in successfully to Brinker using user '(.+)'$")
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

		if (user.equalsIgnoreCase("user2")) {
			thisUser = user2;
			thisPassword = password2;
		}
		
		if (user.equalsIgnoreCase("user3")) {
			thisUser = user3;
			thisPassword = password3;
		}
		
		if (user.equalsIgnoreCase("user4")) {
			thisUser = user4;
			thisPassword = password4;
		}


		UIActions.PutTextInVolatileContext(thisUser, "UserName");
		UIActions.PutTextInVolatileContext(thisPassword, "Password");
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("BrinkerLoginPageView.userBrinker"), thisUser));
		Thread.sleep(2000);
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("BrinkerLoginPageView.passwdBrinker"), thisPassword));
		Thread.sleep(2000);
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("BrinkerLoginPageView.signInBrinker")));

	}


}
