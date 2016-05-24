package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class LoginPageView {

	@ElementMap(how = How.NAME, using = "USERNAME", verify = true)
	public UIElement userNameTxt;

	@ElementMap(how = How.NAME, using = "PASSWORD", verify = true)
	public UIElement passwordTxt;

	@ElementMap(using = ".//*[@id='LOGON_SUBMIT_BUTTON_CAPTION.TXT']", verify = true)
	public UIElement submitBtn;

	@ElementMap(
			how = How.XPATH,
				using = "html/body/table/tbody/tr[3]/td/form/table/tbody/tr[2]/td[3]")
	public UIElement accessDeniedMssge;

}
