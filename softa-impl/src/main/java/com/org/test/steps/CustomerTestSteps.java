package com.org.test.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.org.test.operations.ButtonElements;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation 
public class CustomerTestSteps extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions Actions;
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private ButtonElements buttonElements;
	
	
	
//	ExecutionContext executionContext = new ExecutionContext();;

	@And("^Click on Browse button and Upload File:$")
    public void click_on_browse_button_and_upload_bid_item_file(final List<String> fileName) throws Throwable {
	//	ExecutionContext executionContext = new ExecutionContext();
		UIActions.PutTextInVolatileContext(fileName.get(1), "FileName");
		buttonElements.uploadFile(fileName.get(1));
		Thread.sleep(2000);
	//	System.out.println(UIActions.GetStringTextInCacheContext("FileName").toString());
		
	//	System.out.println("Context"+executionContext);
	//	executionContext.init();
	//	System.out.println("Context"+executionContext);
	//	executionContext.putElement("FileName", fileName.get(1));
	//	System.out.println(executionContext.getElement("FileName"));
	}
	
	@And("^Click on Ok Modal Window$")
    public void click_on_modal_window() {
		UIActions.ExecuteJS("arguments[0].click();", ".//*[@class='modal-content']/div[contains(@class,'modal-footer')]//button[@class='btn ng-binding btn-primary']");
	}
	
	@And("^Get the value '(.+)' from Restaurant and put with key '(.+)'$")
    public void get_the_value_from_restaurant_and_put_with_key(String text, String key) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		boolean elementExist = driver.getDriverInstance().findElement(By.xpath(".//div[@ng-repeat='r in restaurants']/div/div/p[text()=' "+text+"']")).isDisplayed();
		assertTrue(elementExist, "The Restaurant does not exist, please enter a restaurant that exist in the grid");
		String elementGetText = driver.getDriverInstance().findElement(By.xpath(".//div[@ng-repeat='r in restaurants']/div/div/p[text()=' "+text+"']/preceding-sibling::p")).getText().trim();
		UIActions.PutTextInVolatileContext(elementGetText, key);
	//	UIActions.PutTextInCacheContext(elementGetText, key);
	}
	
	@Then("^Validate the Total of Customer on the '(.+)' Franchise is updated$")
    public void validate_the_total_of_customer_on_the_franchise_is_updated(String text) throws InterruptedException {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
	//	UIActions.wait(5000);
		String elementGetText = driver.getDriverInstance().findElement(By.xpath(".//div[@ng-repeat='r in restaurants']/div/div/p[text()=' "+text+"']/preceding-sibling::p")).getText().trim();
		String sessionVariable = UIActions.GetStringTextInCacheContext("Restaurant").toString();
		assertTrue(sessionVariable.equals(elementGetText),"The Total Customer is not updated: The actual value is: "+ elementGetText + " And the Expected is: "+ sessionVariable);		
	}


}

