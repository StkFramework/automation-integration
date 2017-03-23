package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class CouponValidatePageView {

	@ElementMap(how = How.XPATH, using = ".//*[contains(@class,'couponCodeInput')]", verify = true)
	public UIElement  couponCodeTextbox;
	
	@ElementMap(how = How.XPATH, using = ".//*[text()=' Validate Coupon']", verify = true)
	public UIElement  validateCouponButton;
	
	@ElementMap(how = How.XPATH, using = ".//*[text()=' Your Coupon Was Successfully Redeemed!']", verify = true)
	public UIElement  redeemedText;
	
}
