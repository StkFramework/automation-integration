package com.org.test.operations;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.softtek.automation.actions.UIActions;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElement;
import com.softtek.automation.functions.ExcelFunctions;
import org.openqa.selenium.interactions.Actions;

@Component
public class ButtonElements{
	
	@Autowired(required=true)
	private UIActions Actions;
	@Autowired(required=true)
	private ExcelFunctions excel;
	@Autowired(required=true)
	private UIActions UIActions;
	
	

	/**
	 * Method to click on "Browse" button and upload the file.
	 * @param browseFile 
	 * @param fileName 
	 * @param folderPath 
	 * @return 
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void uploadFile(final String fileName) throws IOException, InterruptedException {
		Thread.sleep(1000);
		final File currDir = new File(".");
		Thread.sleep(1000);
		String pathProject = currDir.getAbsolutePath();
		Thread.sleep(1000);
		pathProject = pathProject.substring(0, pathProject.length() - 1);
		Thread.sleep(1000);
		String pathExecutable = pathProject + "src\\main\\resources\\executable\\UploadFile.exe";
		pathProject = pathProject + "src\\test\\resources\\com\\brinker\\sa\\automation\\input\\"+ fileName;
		Thread.sleep(1000);
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		driver.getDriverInstance().findElement(By.xpath(".//*[text()='Browse...']")).click();
		// String[] cmd = {pathProject};
		Thread.sleep(1000);
		String newPath = pathExecutable + " " + pathProject;
		 String command= newPath;
		 Runtime.getRuntime().exec(command);
		 int rowNum = excel.getRow(pathProject, "Sheet1");
		// System.out.println(UIActions.GetTextInCacheContext("Restaurant").getObjectResult().toString());
		 int restaurantNum = Integer.parseInt(UIActions.GetTextInCacheContext("Restaurant").getObjectResult().toString());
		 int sumRestaurant = (rowNum + restaurantNum) - 1;
		 UIActions.PutTextInVolatileContext(Integer.toString(sumRestaurant), "Restaurant");
	}



	public void uploadImage(String imageName) throws InterruptedException, IOException {
		Thread.sleep(1000);
		final File currDir = new File(".");
		Thread.sleep(1000);
		String pathProject = currDir.getAbsolutePath();
		Thread.sleep(1000);
		pathProject = pathProject.substring(0, pathProject.length() - 1);
		Thread.sleep(1000);
		String pathExecutable = pathProject + "src\\main\\resources\\executable\\UploadFile.exe";
		pathProject = pathProject + "src\\test\\resources\\com\\brinker\\sa\\automation\\input\\"+ imageName;
		Thread.sleep(1000);
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		UIActions.ExecuteJS("arguments[0].click();", ".//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[4]/div/div[6]/input[1]");
		Thread.sleep(1000);
		WebElement input = driver.getDriverInstance().findElement(By.xpath(".//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[4]/div/div[6]/input[2]"));
		new Actions(driver.getDriverInstance()).moveToElement(input).click().perform();
		Thread.sleep(1000);
		
//		
//		UIActions.ExecuteJS("arguments[0].click();", ".//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[4]/div/div[6]/input[2]");
	//	driver.getDriverInstance().findElement(By.xpath(".//*[@value='Browse']")).click();
		// String[] cmd = {pathProject};
		Thread.sleep(1000);
		String newPath = pathExecutable + " " + pathProject;
		System.out.println(pathExecutable);
		System.out.println(pathProject);
		System.out.println(newPath);
		 String command= newPath;
		 System.out.println(command);
		 Thread.sleep(1000);
		 Runtime.getRuntime().exec(command);
		 Thread.sleep(1000);
	}

	public void uploadImage(UIElement element, String imageName) throws InterruptedException, IOException {
		Thread.sleep(1000);
		final File currDir = new File(".");
		Thread.sleep(1000);
		String pathProject = currDir.getAbsolutePath();
		Thread.sleep(1000);
		pathProject = pathProject.substring(0, pathProject.length() - 1);
		Thread.sleep(1000);
		String pathExecutable = pathProject + "src\\main\\resources\\executable\\UploadFile.exe";
		pathProject = pathProject + "src\\test\\resources\\com\\brinker\\sa\\automation\\input\\"+ imageName;
		Thread.sleep(1000);
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		UIActions.ClickOnElementWithJS(element);
		Thread.sleep(1000);
		WebElement input = driver.getDriverInstance().findElement(By.xpath(".//*[@id='categoriesGrid']/div[4]/table/tbody/tr/td[4]/div/div"));
		new Actions(driver.getDriverInstance()).moveToElement(input).click().perform();
		
	
		
	//	UIActions.ClickOnElement(element);
		Thread.sleep(1000);
		String newPath = pathExecutable + " " + pathProject;
		System.out.println(pathExecutable);
		System.out.println(pathProject);
		System.out.println(newPath);
		String command= newPath;
	    System.out.println(command);
		Thread.sleep(1000);
		Runtime.getRuntime().exec(command);
		Thread.sleep(1000);
	}
	
	public void uploadImageItem(UIElement element, String imageName) throws InterruptedException, IOException {
		Thread.sleep(1000);
		final File currDir = new File(".");
		Thread.sleep(1000);
		String pathProject = currDir.getAbsolutePath();
		Thread.sleep(1000);
		pathProject = pathProject.substring(0, pathProject.length() - 1);
		Thread.sleep(1000);
		String pathExecutable = pathProject + "src\\main\\resources\\executable\\UploadFile.exe";
		pathProject = pathProject + "src\\test\\resources\\com\\brinker\\sa\\automation\\input\\"+ imageName;
		Thread.sleep(1000);
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		UIActions.ClickOnElementWithJS(element);
		Thread.sleep(1000);
		WebElement input = driver.getDriverInstance().findElement(By.xpath(".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[7]/div/div"));
		new Actions(driver.getDriverInstance()).moveToElement(input).click().perform();
		
	
		
	//	UIActions.ClickOnElement(element);
		Thread.sleep(1000);
		String newPath = pathExecutable + " " + pathProject;
		System.out.println(pathExecutable);
		System.out.println(pathProject);
		System.out.println(newPath);
		String command= newPath;
	    System.out.println(command);
		Thread.sleep(1000);
		Runtime.getRuntime().exec(command);
		Thread.sleep(1000);
	}
	
	
}
