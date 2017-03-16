package com.org.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;


import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.element.UIElement;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;
import com.softtek.automation.actions.selenium.SeleniumAppActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.driver.selenium.SeleniumDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.StepDefAnnotation;

@StepDefAnnotation
public class BrinkerCommonPageSteps extends AbstractSteps {
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	@Autowired(required=true)
	private AppActions AppActions;
	@Autowired(required=true)
	private TestDriver TestDriver;
	
	
	
	@Given("^I initialize cache$")
	public void I_initialize_cache() throws Throwable {
		
		UIActions.PutTextInCacheContext("mngr-tijuanario@brinkerglobaldgestk.onmicrosoft.com", "RESTMGR");
		UIActions.PutTextInCacheContext("kdelapena@brinkerglobaldgestk.onmicrosoft.com", "FRANMGR");
		UIActions.PutTextInCacheContext("$abc!123", "PASS");
		UIActions.PutTextInVolatileContext("2lDbmB0", "PROCESSORDERID");
		UIActions.PutTextInCacheContext("95R3Rwl", "CANCELORDERID");
		UIActions.PutTextInCacheContext("Gmail", "GMAIL");
	    
	}
	
	@Then("^I upload a contact file$")
	public void I_upload_a_contact_file() throws Throwable {
		
		SeleniumAppActions driver = new SeleniumAppActions();
		WebElement file_input = ((WebDriver) driver).findElement(By.xpath("/html/body/main/section/article/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/button"));
		file_input.sendKeys("C:\\Users\\edy.espinoza\\Documents\\OTHER\\Brinker\\example_contacts-DOB.xlsx");
	}
		//throw new PendingException();
		
	@And("^I validate element '(.+)' has text '(.+)'$")
	public void I_validate_element_has_text(String element, String key) throws Throwable {
	
		String text = UIActions.GetTextInCacheContext(key).getClass().toString();
		System.out.println(text);
		assertTrue(UIActions.ElementHasText(UIElementFactory.createElement(element), text));
		//assertTrue(UIActions.ElementHasText(element, text));
	
	//	String text = (String) this.getFromCacheContext(key);
	//	assertTrue(UIActions.ElementHasText(element, text));
		
		//this.elementHasText(element, keyvalue);
		
		
		//ExecutionContext executionContext = new ExecutionContext(); 
		//System.out.println(UIActions.getElement("ORDERID").toString());
		//executionContext.getElementfromCache
		//this.elementHasText(UIElementFactory.createElement("BrinkerConsolePageView.orderIDLbl"), executionContext.getElement("ORDERID").toString());	
    
	}
	
	@Then("^I validate order is displayed$")
	public void I_validate_order_is_displayed() throws Throwable {
		boolean present;
		
		try{
		 ((By) TestDriver).findElement((SearchContext) By.xpath("//*[@id='mainContent']/div/div[1]/div/div[2]/div/div/div[1]/div/div[3]/p[1]/text()"));
		present = true;
	}catch(NoSuchElementException e){
	present = false;	
	}
	}
		
	

	@Then("^I scroll to element '(.+)'$")
	public void I_scroll_to_element_BrinkerLoginPageView_usernameTextBox(UIElement element) throws Throwable {
	    
		assertTrue(UIActions.MoveFocusTo(element));
		
	}
	
	/*@Then("^I wait for frame$")
	public void I_wait_for_frame() throws Throwable {
		SeleniumAppActions driver = new SeleniumAppActions();
		((TestDriver<WebDriver>) driver).getDriverInstance().switchTo().frame("DittoDemoPageSSView.recordingFrame");
		
	}*/
	
	/*
    @Then("^I wait for element '(.+)'$")
    public void I_Click_on_the_last_account_Name() throws Throwable {
                    webPageFunctions.getCommonFunctions().waitTimeOrElementPresent(accountPageLocator.recentAccounts_table, 30);
                   tableElements.selectTableElement(accountPageLocator.recentAccounts_table,
                                                  (String) seleniumSessionBean.getObject(ConstantUtil.ACCOUNT_NAME), "th");

    }
    
                    public boolean waitTimeOrElementPresent(final WebElement webElement, final int seconds) {
                               boolean elementPresent = false;
                               final long max_millis_to_wait = seconds * ConstantUtil.TIME_SLEEP_1x;
                               final long futureDate = System.currentTimeMillis() + max_millis_to_wait;
                               CommonElementFunctions.LOGGER.info("Waiting for element...");
                               // Wait 'n' minutes max...
                               while (System.currentTimeMillis() < futureDate && !elementPresent) {
                                               try {
                                                               elementPresent = isExistingElement(webElement);
                                                               Thread.sleep(ConstantUtil.TIME_SLEEP_HALF_SEC);
                                               }
                                               catch (final InterruptedException e) {
                                                               CommonElementFunctions.LOGGER.info("Wait error: " + e.getMessage());
                                               }
                               }
                               return elementPresent;
                } 
*/

}
