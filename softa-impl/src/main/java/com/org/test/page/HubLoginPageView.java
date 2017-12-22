package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class HubLoginPageView {
	
	@ElementMap(how = How.XPATH, using = ".//*[@name='user']")
	public UIElement usernameTextBox;
	
	@ElementMap(how = How.XPATH, using = ".//*[@name='Password']")
	public UIElement passwordTextBox;
	
	@ElementMap(how = How.XPATH, using = ".//*[@value='Log In']")
	public UIElement loginBtn;

}
