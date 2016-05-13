package com.example.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class DashBoardPageView {

	@ElementMap(using = ".//*[@id='Dashboard - Default']", verify = true )
	public static UIElement mainHeader;

	@ElementMap(using = ".//*[@id='Dashboard - Default']")
	public static UIElement logoutLink;
	
}
