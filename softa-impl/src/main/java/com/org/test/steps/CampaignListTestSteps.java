package com.org.test.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import com.org.test.operations.ButtonElements;
import com.org.test.utils.ColorUtils;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.actions.UIActionsLocal;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElement;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.When;

public class CampaignListTestSteps extends AbstractSteps{

	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIActionsLocal UIActionsLocal;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	@Autowired(required=true)
	private AppActions AppActions;	
	@Autowired(required=true)
	private UIActions Actions;
	@Autowired(required=true)
	private ColorUtils colorUtils;
	@Autowired(required=true)
	private ButtonElements buttonElements;
	
	
	@When("^(?i:Create new Campaign)$")
	public void create_new_campaing() throws Exception {
		Thread.sleep(5000);
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
	//	WebElement element =  driver.getDriverInstance().findElement(By.xpath(".//*[@class='modal-content']/div[contains(@class,'modal-body')]/div"));
		List<WebElement> list = driver.getDriverInstance().findElements(By.xpath(".//*[@class='modal-content']/div[contains(@class,'modal-body')]/div"));
		if(list.size() > 0){
			UIActions.ClickOnElement(UIElementFactory.createElement("CampaignsListPageView.okButtonModalWindow"));
		}
		Thread.sleep(1000);
		UIActions.ClickOnElement(UIElementFactory.createElement("CampaignsListPageView.createNewCampaignSection"));
	
	}
}
