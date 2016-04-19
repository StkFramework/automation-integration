package com.example.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class LoginPageLocator {

	@ElementMap(how = How.XPATH, using = ".//*[@id='email']")
	public UIElement login_username_txt;

	@ElementMap(how = How.XPATH, using = ".//*[@id='pass']")
	public UIElement login_password_txt;

	@ElementMap(
			how = How.XPATH,
			using = ".//*[@id='loginbutton']/input")
	public UIElement login_submit_btn;

	@ElementMap(
			how = How.XPATH,
			using = ".//*[@id='globalContainer']//div[contains(text(),'La contraseña que ingresaste es incorrecta.' )]")
	public UIElement login_access_denied_mssge;

}
