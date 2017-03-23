package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class AnalyticsPageView {
	
	@ElementMap(how = How.XPATH, using = ".//*[text()='Coupon Type']/following-sibling::span", verify = true)
	public UIElement  couponTypeText;
	
	@ElementMap(how = How.XPATH, using = ".//*[text()='Redeemed']/following-sibling::span", verify = true)
	public UIElement  redeemedText;
	
	@ElementMap(how = How.XPATH, using = ".//*[text()='Generated']/following-sibling::span", verify = true)
	public UIElement  generatedText;
	
	@ElementMap(how = How.XPATH, using = ".//*[text()='Available']/following-sibling::span", verify = true)
	public UIElement  availableText;

}
