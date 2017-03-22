package com.softtek.automation.actions.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.softtek.automation.ExecutionContext;
import com.softtek.automation.ExecutionResult;
import com.softtek.automation.ExpressionParserAdapter;
import com.softtek.automation.TestLogger;
import com.softtek.automation.actions.UIActionsLocal;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElement;
import com.softtek.automation.uiverifications.UIElementsVerification;

public class SeleniumUIActionsLocal implements UIActionsLocal {

	private TestDriver<WebDriver> testDriver;

	private UIElementsVerification UIElementsVerification;	
	
	private ExecutionContext executionContext;
	
	private ExpressionParserAdapter expressionParserAdapter;
	
	
	public void setExpressionParserAdapter(ExpressionParserAdapter expressionParserAdapter) {
		this.expressionParserAdapter = expressionParserAdapter;
	}

	public void setUIElementsVerification(UIElementsVerification uIElementsVerification) {
		UIElementsVerification = uIElementsVerification;
	}
		
	@Override
	public void setTestDriver(TestDriver testDriver) {
		this.testDriver = testDriver;
	}

	@Override
	public TestDriver getTestDriver() {
		return this.testDriver;
	}
	
	public void setExecutionContext(ExecutionContext executionContext) {
		this.executionContext = executionContext;
	}

	@Override
	public ExecutionResult TypeTextAndIntro(UIElement element, String text) {
		ExecutionResult executionResult = new ExecutionResult();

		WebElement webElement = findWebElement(element);

		isElementDisplayed(element, webElement, executionResult);

		if (executionResult.isValidResult()) {

			executionResult.setResult(webElement.isEnabled());

			if (executionResult.isValidResult()) {
				webElement.clear();								
				
				String textValue = this.expressionParserAdapter.parseExpression(text, executionContext);
							
				if(textValue == null){					 
					webElement.sendKeys(text);
				}else{					
					webElement.sendKeys(textValue);
				}
				webElement.sendKeys(Keys.ENTER);
			} else {
				executionResult.setMessage(new StringBuilder("Element \"")
						.append(element.getId())
						.append("\" is not enabled for type text.").toString());

			}

		}else{
			
			executionResult.setMessage(new StringBuilder("Element \"")
					.append(element.getId())
					.append("\" is not displayed for type text.").toString());
			
		}

		return executionResult;
	}
	
	@Override
	public ExecutionResult DragAndDrop(UIElement fromElement, UIElement toElement) {
		ExecutionResult executionResult = new ExecutionResult();

		WebElement webFromElement = findWebElement(fromElement);
		WebElement webToElement = findWebElement(toElement);

		if (executionResult.isValidResult()) {
			Actions builder = new Actions(testDriver.getDriverInstance());
			Action dragAndDrop = builder.clickAndHold(webFromElement)
					 
					.moveToElement(webToElement)
					 
					.release(webToElement)
					 
					.build();
					 
					dragAndDrop.perform();
		} else {
			executionResult
					.setMessage(new StringBuilder("Elements \"")
							.append(fromElement.getId())
							.append(" and ")
							.append(toElement.getId())
							.append("\" are not Displayed in order to perform the action.")
							.toString());
		}
		return executionResult;
	}
	
	@Override
	public ExecutionResult UploadFile(UIElement element, String fullPath) {
		ExecutionResult executionResult = new ExecutionResult();

		WebElement webElement = findWebElement(element);

			executionResult.setResult(webElement.isEnabled());

		if (executionResult.isValidResult()) {
			//webElement.clear();
			webElement.sendKeys(fullPath);
		} else {
			executionResult.setMessage(new StringBuilder("Element \"")
					.append(element.getId())
					.append("\" is not enabled for upload a file.").toString());

		}

		return executionResult;
	}
	
	@Override
	public ExecutionResult GetTextFromCacheContext(String key) {
		ExecutionResult executionResult = new ExecutionResult();
		
		Object cachedElement = executionContext.getElementFromChache(key.trim());
		
		executionResult.setResult(cachedElement != null);
		
		if (cachedElement != null)
		{
			executionResult.setObjectResult(cachedElement);
		}else{
			executionResult.setMessage(new StringBuilder("Key not found \"")
					.append(key).toString());
			TestLogger.ERROR(this, executionResult.getMessage());
		}
		return executionResult;
	}
	
	
	/**
	 *Helper methods 
	 *
	 */
	
	private WebElement findWebElement(UIElement element) {
		By by = processBY(element);
		
		WebElement webElement = (new WebDriverWait(testDriver.getDriverInstance(),30))
				.until(ExpectedConditions.presenceOfElementLocated(by));
		
		
		return webElement;

	}
	
	private By processBY(UIElement element){
		By by = null;

		switch (element.getHow()) {
		case XPATH:
			by = By.xpath(element.getUsing());
			break;

		case CLASS:
			by = By.className(element.getUsing());
			break;

		case ID:
			by = By.id(element.getUsing());
			break;

		case TAG:
			by = By.tagName(element.getUsing());
			break;

		case NAME:
			by = By.name(element.getUsing());
			break;

		default:
			by = By.xpath(element.getUsing());
			break;
		}

		return by;
	}
	
	private void isElementDisplayed(UIElement uiElement, WebElement webElement,
			ExecutionResult result) {

		try {

			result.setResult(webElement.isDisplayed());
		} catch (final StaleElementReferenceException | NoSuchElementException e) {
			result.setResult(false);
			result.setMessage(new StringBuilder("Element \"").append("\"")
					.append(uiElement).append("\" is not attached at DOM.")
					.toString());
			result.setError(e);

		}

	}
	
}
