package com.example.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class LoginPageLocator {

	@ElementMap(how = How.NAME, using = "USERNAME")
	public UIElement userNameTxt;

	@ElementMap(how = How.NAME, using = "PASSWORD")
	public UIElement passwordTxt;

	@ElementMap(
			how = How.XPATH,
			using = ".//*[@id='LOGON_SUBMIT_BUTTON_CAPTION.TXT']")
	public UIElement submitBtn;

	@ElementMap(
			how = How.XPATH,
				using = "html/body/table/tbody/tr[3]/td/form/table/tbody/tr[2]/td[3]")
	public UIElement accessDeniedMssge;

}
