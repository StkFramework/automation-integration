package com.example.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class DashBoardPageView {

	@ElementMap(how = How.XPATH, using = "")
	public static UIElement mainHeader;

	@ElementMap(using = "")
	public static UIElement openDashBoardLink;

}
