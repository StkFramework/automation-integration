package com.example.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.test.business.SearchRequestBusinessCase;
import com.softtek.automation.TestLogger;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en_au.ButattheendofthedayIreckon;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath*:resources/spring/mainConfigCtx.xml")
@ContextConfiguration("file:src/main/resources/spring/mainConfigCtx.xml")
public class JUnitTest extends AbstractSteps{

	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	@Autowired(required=true)
	private AppActions AppActions;	
	@Autowired(required=true)
	private SearchRequestBusinessCase searchRequestBusinessCase;

	@Before
	public void setup()throws Exception{
		assertTrue(AppActions.OpenApplication("application1"));
		assertTrue(AppActions.WaitForSeconds("5"));		
	}
	
	@After 
	public void teardown()throws Exception{
		assertTrue(AppActions.CloseCurrentApp());
	}
	
	@Test
	public void testDashboard() throws Exception{
		
		TestLogger.INFO(this, "Running testDashboard() in JUnit framework");
		
		assertTrue(UIActions.TypeTextOnElement(UIElementFactory.createElement("LoginPageView.userNameTxt"), "jose.san"));
		assertTrue(UIActions.TypeTextOnElement(UIElementFactory.createElement("LoginPageView.passwordTxt"), "TePa181115"));
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("LoginPageView.submitBtn")));
		assertTrue(AppActions.WaitForSeconds("10"));
		assertTrue(UIActions.ElementContainsText(UIElementFactory.createElement("DashBoardPageView.mainHeader"), "Dashboard - Default"));
		assertTrue(AppActions.WaitForSeconds("2"));
		
		assertTrue(searchRequestBusinessCase.run(this.ExecutionContext));
		
		
		assertTrue(AppActions.CloseCurrentApp());

		
	}

}
