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
public class NewActionTest extends AbstractSteps{
	
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
		
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("NewActionTestPageView.cityTxt")));
		assertTrue(UIActions.ElementIsEnabled(UIElementFactory.createElement("NewActionTestPageView.searchCitybtn")));
		assertTrue(UIActions.VerifyMaxLengthText(UIElementFactory.createElement("NewActionTestPageView.cityTxt"), 75));
		assertTrue(UIActions.ElementIsTypeOf(UIElementFactory.createElement("NewActionTestPageView.searchCitybtn"), "a"));
		assertTrue(UIActions.MoveMouseOverElement(UIElementFactory.createElement("NewActionTestPageView.adultNumber")));
		assertTrue(UIActions.SelectValueFromDropdownElement(UIElementFactory.createElement("NewActionTestPageView.roomsDropdown"), "2"));
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("NewActionTestPageView.notDecideDateChkbox")));
		assertTrue(UIActions.IsSelected(UIElementFactory.createElement("NewActionTestPageView.notDecideDateChkbox")));		
		
	}
}
