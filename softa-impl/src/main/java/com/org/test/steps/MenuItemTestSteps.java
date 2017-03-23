package com.org.test.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;

import com.org.test.operations.ButtonElements;
import com.org.test.utils.ColorUtils;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.And;

public class MenuItemTestSteps extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIActions Actions;
	@Autowired(required=true)
	private ButtonElements buttonElements;
	@Autowired(required=true)
	private ColorUtils colorUtils;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	
	
	
	@And("^Select the Category from the key '(.+)'$")
    public void click_on_browse_button_and_upload_bid_item_file(String keyCategory) throws Throwable {
	//	ExecutionContext executionContext = new ExecutionContext();
		String categoryFromKey = UIActions.GetStringTextInCacheContext(keyCategory);
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		driver.getDriverInstance().findElement(By.xpath(".//li[text()='"+categoryFromKey+"']")).click();
	}
	
	@And("^I type text '(.+)' Price with JS and Perform$")
    public void i_type_text_price_with_js_and_perform(String price) throws Throwable {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		Thread.sleep(1000);
		WebElement input = driver.getDriverInstance().findElement(By.xpath(".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[4]/span[1]/span/input[2]"));
		new Actions(driver.getDriverInstance()).moveToElement(input).sendKeys(price).perform();
	}
	
	@And("^Click on Browse button Item Image and Upload Image:$")
    public void click_on_browse_button_item_image_and_upload_image(final List<String> imageName) throws Throwable {
	//	ExecutionContext executionContext = new ExecutionContext();
		UIActions.PutTextInVolatileContext(imageName.get(1), "ImageName");
		buttonElements.uploadImageItem(UIElementFactory.createElement(imageName.get(3)), imageName.get(2));
		Thread.sleep(2000);
		System.out.println(UIActions.GetTextInCacheContext("ImageName").getObjectResult().toString());
	}


}
