package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class DashBoardPageView {

	@ElementMap(using = ".//*[@id='Dashboard - Default']", verify = true )
	public static UIElement mainHeader;

	@ElementMap(using = "html/body/table/tbody/tr/td[3]/span/p/a")
	public static UIElement logoutLink;
	
}
