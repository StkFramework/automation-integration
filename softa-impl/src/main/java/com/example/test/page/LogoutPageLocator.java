package com.example.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class LogoutPageLocator {

	@ElementMap(
			how = How.XPATH,
			using = ".//*[@id='content']//div[contains(text(),'Registrarte')] | .//*[@id='content']//div[contains(text(),'Es gratis')]")
	public UIElement logout_message;
}
