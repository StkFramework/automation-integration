package com.org.test.steps;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.automation.ExecutionResult;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElement;
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
	private Users users; 
	@Autowired(required=true)
	private ExcelFunctions exFunctions;
	
	@When("^(?i:I Get the People Managed)$")
	public void i_get_the_people_managed() throws Exception {	
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		if(driver.getDriverInstance().findElements(By.xpath(".//*[@id='report-chain-sub-peopleManaged']/a")).size() > 0){
			assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("HubProfilePageView.peopleManagedLink")));
			int totalUsers = getPagination();
			getPersonalInformation(totalUsers);
			int rows = exFunctions.getLastRow("C://TestGetUsers.xlsx", "Sheet1");
			System.out.println("Rows: "+rows);
	//		String x = exFunctions.obtainCellValue(exFunctions.getSheetFromFile("C://TestGetUsers.xlsx"),"D3");
			for(int i = 2; i <= rows; i++){
				String name = exFunctions.obtainCellValue("C://TestGetUsers.xlsx","Sheet1", "B"+i);
				String email = exFunctions.obtainCellValue("C://TestGetUsers.xlsx","Sheet1", "H"+i);
				UIActions.ClickOnElement(UIElementFactory.createElement("HubProfilePageView.directoryLink"));
				assertTrue(AppActions.WaitForSeconds("5"));
				UIActions.TypeTextOn(UIElementFactory.createElement("HubProfilePageView.directorySearchTextBox"), name);
				assertTrue(AppActions.WaitForSeconds("5"));
				UIActions.ClickOnElement(UIElementFactory.createElement("HubProfilePageView.directorySearchTextBox"));
				assertTrue(AppActions.WaitForSeconds("5"));
			//	UIActions.ClickOnElementWithJS(UIElementFactory.createElement("HubProfilePageView.nameProfileLink"));
				if(email != ""){
					UIActions.ClickOnElement(".//span[contains(text(), '"+email+"')]/preceding-sibling::a", null);
				}else{
					UIActions.ClickOnElementWithJS(UIElementFactory.createElement("HubProfilePageView.nameProfileLink"));
				}
			//	UIActions.ClickOnElement(UIElementFactory.createElement("HubProfilePageView.nameProfile2Link"));
				assertTrue(AppActions.WaitForSeconds("6"));
				if(driver.getDriverInstance().findElements(By.xpath(".//*[@id='cardHeader']/td/table/tbody/tr[1]/td[1]/a")).size() > 0){
					driver.getDriverInstance().findElement(By.xpath(".//*[@id='cardHeader']/td/table/tbody/tr[1]/td[1]/a")).click();
					assertTrue(AppActions.WaitForSeconds("10"));
				}
				if(driver.getDriverInstance().findElements(By.xpath(".//*[@id='report-chain-sub-peopleManaged']/a")).size() > 0){
					assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("HubProfilePageView.peopleManagedLink")));
					totalUsers = getPagination();
					getPersonalInformation(totalUsers);
					rows = exFunctions.getLastRow("C://TestGetUsers.xlsx", "Sheet1");
					System.out.println("Rows: "+rows);
				}
			}
		}
	}
	
	@When("^(?i:I click on the email)$")
	public void i_click_on_the_email() throws Exception {	
		
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
	
		int j = 1;
		while(totalUsers >= j){
			assertTrue(AppActions.WaitForSeconds("5"));
			int i = 1;
			int rowUsers = driver.getDriverInstance().findElements(By.xpath(".//*[@id='rptStructTable']/tbody/tr")).size();
			System.out.println("TotalUsers: "+rowUsers);
		for(i = 1; i < rowUsers; i++){
			String email = "";
			j=j++;
			assertTrue(AppActions.WaitForSeconds("5"));
			UIActions.MoveMouseOverElement(".//*[@id='rptStructTable']/tbody/tr["+(i+1)+"]/td[2]/div[1]/div/span/a", null);
			assertTrue(AppActions.WaitForSeconds("1"));
			ExecutionResult exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.firtsNameProfileLink"));
			String name1stLevel = exResult.getObjectResult().toString();
			exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.nameLabel"));
			String name2ndLevel = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.roleLabel"));
			String role = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.locationLabel"));
			String location = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			if(driver.getDriverInstance().findElements(By.xpath(".//*[@class='lotusPersonInfo']/p/a")).size() > 0){
			exResult =  UIActions.GetText(UIElementFactory.createElement("HubProfilePageView.emailLabel"));
			email = exResult.getObjectResult().toString();
			System.out.println(exResult.getObjectResult());
			}
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
			if(extList.length > 1){
				ext = extList[1];
			}else{
				ext = "";
			}
			assertTrue(AppActions.WaitForSeconds("5"));
			users = new Users(name1stLevel, name2ndLevel, role, location, area, phone, ext, email);
			List<Users> listUser = Arrays.asList(users);
			exFunctions.writeExcel(listUser, "C://TestGetUsers.xlsx", "Sheet1");
		}
		 if(driver.getDriverInstance().findElements(By.xpath(".//*[@id='reportStructureArea']/div[2]/ul/li[2]/a")).size() > 0){
			 driver.getDriverInstance().findElement(By.xpath(".//*[@id='reportStructureArea']/div[2]/ul/li[2]/a")).click();
			 assertTrue(AppActions.WaitForSeconds("5"));
		 }else{
			 j = totalUsers + 1;
		 }
		}
	}

}
