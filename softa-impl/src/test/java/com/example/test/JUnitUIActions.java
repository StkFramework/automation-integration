package com.example.test;

import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring/mainConfigCtx.xml")
public class JUnitUIActions extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private AppActions AppActions;	
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;	
	
	@Before
	public void setup()throws Exception{
		assertTrue(AppActions.OpenApplication("application3"));
		assertTrue(AppActions.WaitForSeconds("5"));		
	}
	
	@After 
	public void teardown()throws Exception{
		assertTrue(AppActions.CloseCurrentApp());
	}	
	
	@Test
	public void testUiActions() throws Exception{
		//Testing actions: Overloading
		assertTrue(UIActions.ElementNotExist("//input[@name='firstName']", null));
		Assert.assertTrue(UIActions.GetValue("//input[@name='login']", null).getObjectResult().toString().equalsIgnoreCase("login"));
		Assert.assertTrue(UIActions.GetText("//a[contains(text(), 'REGISTER')]", null).getObjectResult().toString().equalsIgnoreCase("register"));
		assertTrue(UIActions.ElementIsEnabled("//a[contains(text(), 'REGISTER')]", null));
		assertTrue(UIActions.ElementIsTypeOf("//a[contains(text(), 'REGISTER')]", null, "a"));
		assertTrue(UIActions.ClickOnElement("//a[contains(text(), 'REGISTER')]", null));
		assertTrue(UIActions.TypeTextOn("//input[@name='firstName']", null, "test"));
		assertTrue(UIActions.TypeTextOn("//input[@name='address1']", null, "test"));
		assertTrue(UIActions.MoveFocusTo("//input[@name='address1']", null));
		assertTrue(UIActions.ElementHasFocus("//input[@name='address1']", null));
		assertTrue(UIActions.VerifyMaxLengthText("//input[@name='address1']", null, 60));
		assertTrue(UIActions.MoveMouseOverElement("//a[contains(text(), 'Flights')]", null));
		assertTrue(UIActions.SelectValueFromDropdownElement("//select[@name='country']", null, "47"));
		Assert.assertTrue(UIActions.GetSelectedValue("//select[@name='country']", null).getObjectResult().toString().equalsIgnoreCase("CROATIA"));
		assertTrue(UIActions.TypeTextOn("//input[@name='email']", null, "test123"));
		assertTrue(UIActions.TypeTextOn("//input[@name='password']", null, "test123"));
		assertTrue(UIActions.TypeTextOn("//input[@name='confirmPassword']", null, "test123"));
		assertTrue(UIActions.ElementHasText("//div[contains(@class, 'footer')]", null, "© 2005, Mercury Interactive (v. 011003-1.01-058)"));
		assertTrue(UIActions.ElementContainsText("//div[contains(@class, 'footer')]", null, "Mercury Interactive"));
	}
}
