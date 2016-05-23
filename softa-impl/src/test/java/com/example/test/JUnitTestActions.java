package com.example.test;

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
public class JUnitTestActions extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private AppActions AppActions;	
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;	
	
	@Before
	public void setup()throws Exception{
		assertTrue(AppActions.OpenApplication("application5"));
		assertTrue(AppActions.WaitForSeconds("5"));		
	}
	
	@After 
	public void teardown()throws Exception{
		assertTrue(AppActions.CloseCurrentApp());
	}	
	
	@Test
	public void testUiActions() throws Exception{
		//Proof of Concept
		//assertTrue(UIActions.ExecuteJS("alert('hello world');", "//input[@placeholder='ISG Employee Id']"));
		assertTrue(UIActions.TypeTextOn("//input[@placeholder='ISG Employee Id']", null, "softtekISG"));
		assertTrue(UIActions.TypeTextOn("//input[@placeholder='Password']", null, "Aerohive2008"));
		if(UIActions.ElementIsEnabled("//button[@type='submit']", null).isValidResult())
			//assertTrue(UIActions.ClickOnElement("//button[@type='submit']", null));
			UIActions.ExecuteJS("arguments[0].click()", "//button[@type='submit']");
		//assertTrue(UIActions.IsDisabled("//button[contains(text(), 'My Button')]", null));
		
		Thread.sleep(1000);
	}
}
