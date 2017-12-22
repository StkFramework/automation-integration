package com.org.test.steps;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.automation.ExecutionResult;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElementFactory;
import com.softtek.automation.functions.ExcelFunctions;
import com.softtek.automation.functions.Users;
import com.softtek.automation.steps.AbstractSteps;

import cucumber.api.java.en.When;

public class HubProfileTestSteps extends AbstractSteps{
	
	@Autowired(required=true)
	private UIActions UIActions;
	@Autowired(required=true)
	private UIElementFactory UIElementFactory;
	@Autowired(required=true)
	private UIActions Actions;
	@Autowired(required=true)
	private AppActions AppActions;	
	@Autowired(required=true)
	private ExcelFunctions exFunctions; 
	@Autowired(required=true)
	private Users users; 
	
	
	
	@When("^(?i:I Get the People Managed)$")
	public void i_get_the_people_managed() throws Exception {	
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		if(driver.getDriverInstance().findElement(By.xpath(".//*[@id='report-chain-sub-peopleManaged']/a")).isDisplayed()){
			assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("HubProfilePageView.peopleManagedLink")));
			int totalUsers = getPagination();
			getPersonalInformation(totalUsers);
		}
	}
	
	public int getPagination() throws Exception{
		ExecutionResult exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.paginationLink"));
		System.out.println(exResult.getMessage());
		System.out.println(exResult.getObjectResult());
		String exResultPagination = exResult.getObjectResult().toString();
		String[] exResultSplit = exResultPagination.split(" of ");
		return Integer.parseInt(exResultSplit[1]);
	}
	
	public void getPersonalInformation(int totalUsers) throws Exception{
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();

		for(int i = 1; i <= totalUsers; i++){
			assertTrue(AppActions.WaitForSeconds("5"));
			UIActions.MoveMouseOverElement(".//*[@id='rptStructTable']/tbody/tr["+(i+1)+"]/td[2]/div[1]/div/span/a", null);
			assertTrue(AppActions.WaitForSeconds("1"));
			ExecutionResult exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.nameLabel"));
			String name1stLevel = exResult.getObjectResult().toString();
			String name2ndLevel = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.roleLabel"));
			String role = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.locationLabel"));
			String location = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.emailLabel"));
			String email = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.areaLabel"));
			String area = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			assertTrue(AppActions.WaitForSeconds("5"));
			UIActions.MoveMouseOverElement(".//*[@id='inLineBusinessCard']/tbody/tr/td/h1/span/a", null);
			exResult = UIActions.GetText(".//*[@id='rptStructTable']/tbody/tr["+(i+1)+"]/td[3]/div[contains(text(), 'Phone:')]/strong", null);
			String phone = exResult.getObjectResult().toString();
			exResult = UIActions.GetText(".//*[@id='rptStructTable']/tbody/tr["+(i+1)+"]/td[3]", null);
			String ext = exResult.getObjectResult().toString();
			String[] extList = ext.split("Office email:");
			extList = extList[0].split("Extn:");
			ext = extList[1];
			assertTrue(AppActions.WaitForSeconds("5"));
			users = new Users(name1stLevel, name2ndLevel, role, location, area, phone, ext, email);
			List<Users> listUser = Arrays.asList(users);
			exFunctions.writeExcel(listUser, "C://TestGetUsers.xlsx", "Sheet1");
		}
	}

}
