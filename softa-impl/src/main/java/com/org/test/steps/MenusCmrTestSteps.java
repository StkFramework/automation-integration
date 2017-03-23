package com.org.test.steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import com.org.test.operations.ButtonElements;
import com.org.test.utils.ColorUtils;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.steps.AbstractSteps;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MenusCmrTestSteps extends AbstractSteps {
	
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
	
	
	@Given("^I click on Categories for the Menu just created Menu Name '(.+)' and Description '(.+)' key$")
	public void i_click_on_categories_for_the_menu_just_created_menu_name_and_description_key(String menuNameKey, String descriptionKey) throws Throwable {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		String menuName = UIActions.GetStringTextInCacheContext(menuNameKey).toString();	
		String description = UIActions.GetStringTextInCacheContext(descriptionKey).toString();
		boolean flag = true;
		while(flag)
		if(driver.getDriverInstance().findElement(By.xpath(".//tbody[@role='rowgroup']/tr/td[@class='name-column']/span[text()='"+menuName+"']/parent::td/following-sibling::td[1]/span[text()='"+description+"']/parent::td")).isDisplayed()){
			driver.getDriverInstance().findElement(By.xpath(".//tbody[@role='rowgroup']/tr/td[@class='name-column']/span[text()='"+menuName+"']/parent::td/following-sibling::td[1]/span[text()='"+description+"']/parent::td/following-sibling::td//a[text()='Categories']")).click();
			flag = false;
		}else{
			String getClassAttr = driver.getDriverInstance().findElement(By.xpath(".//*[@title='Go to the next page']")).getAttribute("class");
			if(getClassAttr.contains("disabled")){
				flag = false;
				assertFalse(false, "The Menu Name and Description does not exist, Please created first!!");
			}else{
				driver.getDriverInstance().findElement(By.xpath(".//*[@title='Go to the next page']")).click();
				Thread.sleep(2000);
			}
		}
	}
	
	

}
