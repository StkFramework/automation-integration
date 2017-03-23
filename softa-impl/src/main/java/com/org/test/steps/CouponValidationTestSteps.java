package com.org.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.automation.actions.UIActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.And;

public class CouponValidationTestSteps extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions Actions;
	@Autowired(required=true)
	private UIActions UIActions;
	
	@And("^Enter the value from cache context using the key '(.+)' and enter Coupon Code$")
	public void enter_the_value_from_cache_context_using_the_key_and_enter_coupon_code(String key) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		String code = UIActions.GetStringTextInCacheContext(key).toString();
		driver.getDriverInstance().findElement(By.xpath(".//*[contains(@class,'couponCodeInput')]")).sendKeys(code);
	}

}
