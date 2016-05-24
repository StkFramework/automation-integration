package com.org.test;

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
public class JUnitUIActionsComplex extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private AppActions AppActions;	
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;	
	
	@Before
	public void setup()throws Exception{
		assertTrue(AppActions.OpenApplication("application4"));
		assertTrue(AppActions.WaitForSeconds("5"));		
	}
	
	@After 
	public void teardown()throws Exception{
		assertTrue(AppActions.CloseCurrentApp());
	}	
	
	@Test
	public void testUiActions() throws Exception{
		//Testing actions: Overloading
		assertTrue(UIActions.IsDisabled("//button[contains(text(), 'My Button')]", null));
		assertTrue(AppActions.MoveToUrl("http://www.echoecho.com/htmlforms09.htm"));
		assertTrue(UIActions.IsSelected("(//input[@type='checkbox'])[2]", null));
		assertTrue(AppActions.MoveToUrl("http://www.tutorialspoint.com/html/html_lists.htm"));
		assertTrue(UIActions.ElementIsOrdered("(//ol)[1]", null, "asc"));
	}
}
