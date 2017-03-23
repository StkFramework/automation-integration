package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class BrinkerLandingPageView {
	
	
	@ElementMap(how = How.XPATH, using = ".//img[contains(@src,'guest_submenu.png')]", verify = true)
	public UIElement  customerDBImg;
	
	@ElementMap(how = How.XPATH, using = ".//img[contains(@src,'campaigns_header_button.png')]", verify = true)
	public UIElement  campaignsImg;
	
	@ElementMap(how = How.XPATH, using = ".//img[contains(@src,'coupon_validate')]", verify = true)
	public UIElement  couponValidateImg;
	
	@ElementMap(how = How.XPATH, using = ".//img[contains(@src,'CMS')]", verify = true)
	public UIElement  cmsImg;

	
}

