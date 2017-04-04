package com.org.test.steps;

import com.softtek.automation.steps.AbstractSteps;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;

import com.org.test.operations.ButtonElements;
import com.org.test.utils.ColorUtils;
import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.actions.UIActionsLocal;
import com.softtek.automation.driver.TestDriver;
import com.softtek.automation.element.UIElementFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CampaignTestSteps extends AbstractSteps{
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
	
	@When("^(?i:I validate Select Audience page)$")
	public void validate_audience_page() throws Exception{
		String selectAudienceXPathPrefix ="//section/article//";
		assertTrue(UIActions.
				ElementContainsText(selectAudienceXPathPrefix + "div[1]/h3", null, "Restaurants"));
		assertTrue(UIActions.
				ElementContainsText(selectAudienceXPathPrefix + "div[2]/h3", null, "Campaign Filters"));
	}
	
	@When("^(?i:I validate Select Template page)$")
	public void validate_template_page() throws Exception{
		String selectTemplateXPathPrefix ="//main/section/article/div[1]/div[1]/";
		assertTrue(UIActions.
				ElementContainsText(selectTemplateXPathPrefix + "div[2]/p", null, "Brinker Templates"));
		assertTrue(UIActions.
				ElementContainsText(selectTemplateXPathPrefix + "/div[5]/p", null, "Franchise Templates"));
	}

	@When("^(?i:I Enter a Campaign Name on element) '(.+)'$")
	public void enter_a_campaign_name_on_element(String element) throws Exception{
		String newCampaignName = "AutomatedTest"  + System.currentTimeMillis();
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement(element), newCampaignName));
		
		assertTrue(UIActions.PutTextInVolatileContext(newCampaignName, "newCampaignName"));
	}
	
	@When("^(?i:I validate the coupon)$")
	public void validate_coupon() throws Exception
	{
		String couponCode = UIActionsLocal.GetTextFromCacheContext("couponCode").getObjectResult().toString();
		
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("CampaignPageView.couponCodeInput"), couponCode));
		
		assertTrue(AppActions.WaitForSeconds("2"));
		
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.validateBtn")));
		
		assertTrue(AppActions.WaitForSeconds("10"));
		
	//	assertTrue(UIActions.ElementContainsText(UIElementFactory.createElement("DashBoardPageView.expiredCampaignlbl"), "Campaign expired"));
	}
	
	@When("^(?i:I Search for launched Campaign)$")
	public void search_launched_campaign() throws Exception{
		String newCampaignName = UIActions.GetStringTextInCacheContext("newCampaignName").toString();
		
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.filterByBtn")));
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.filterByNameBtn")));
		assertTrue(UIActionsLocal.TypeTextAndIntro(UIElementFactory.createElement("CampaignPageView.searchCampaignTxt"), newCampaignName));
		
		assertTrue(AppActions.WaitForSeconds("10"));
	}
	
	@When("^(?i:I drag) '(.+)' (?i:and drop it on) '(.+)'$")
	public void drag_and_drop(String ElementToDrag, String DropDestination) throws Exception{
		assertTrue(UIActionsLocal.DragAndDrop(UIElementFactory.createElement(ElementToDrag), UIElementFactory.createElement(DropDestination)));
	}
	
	@When("^(?i:I verify all sections are marked green)$")
	public void verify_all_sections_are_marked_green() throws Exception{
		String section = "//div[@class='summarySectionContainer']//div[contains(@class, 'validationSectionPassed')]";
		for (int i = 1; i <= 3; i++) {
			assertTrue(UIActions.ElementIsEnabled(section+ "[" + i + "]", null));
		}
	}
	
	@When("^(?i:I save the Coupon code)$")
	public void save_coupon_code() throws Exception{
		String couponCode = UIActions.GetText(UIElementFactory.createElement("CampaignPageView.suggestedCodelbl")).getObjectResult().toString();
		
		assertTrue(UIActions.PutTextInCacheContext(couponCode, "couponCode"));
	}
	
	@When("^(?i:I use the Coupon code on element) '(.+)'$")
	public void use_coupon_code_on_element(String element) throws Exception{
		String code = UIActionsLocal.GetTextFromCacheContext("couponCode").getObjectResult().toString();
		UIActions.TypeTextOn(UIElementFactory.createElement(element), code);
		
	}
	
	@When("^(?i:I type text) '(.+)' (?i:and hit Enter on element) '(.+)'$")
	public void i_type_text_on(String text,String element) throws Exception {		
		assertTrue(UIActionsLocal.TypeTextAndIntro(UIElementFactory.createElement(element), text));		
	}
	
	@When("^(?i:I set the End Date as today \\+) (\\d+) (?i:day, and End Time as) '(.+)'$")
	public void set_end_date_and_end_time(Integer numberOfDays, String endTime) throws Exception
	{
		String[] futureDate = getFutureDate(numberOfDays);
		assertTrue(UIActions.ClickOnElementWithJS(UIElementFactory.createElement("CampaignPageView.calendarBtn")));
		selectYear(futureDate[2]);
		selectMonth(futureDate[0]);
		selectDay(futureDate[1]);
		setTime(endTime);
	}
	
	@When("^(?i:I validate Welcome Labels are in Spanish)$")
	public void validate_welcome_labels_in_spanish() throws Exception
	{
		assertTrue(UIActions.ElementContainsText(UIElementFactory.
				createElement("CampaignPageView.welcomeLbl"), "Bienvenido(a)"));
		
		assertTrue(UIActions.ElementContainsText(UIElementFactory.
				createElement("CampaignPageView.welcomeSubtitleLbl"), "Esta es tu página principal de Hub"));
		
	}
	
	@When("^(?i:I validate email labels are in Spanish)$")
	public void validate_email_labels_in_spanish() throws Exception
	{
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[2]/div/div/div[1]/span[1]", null, "De (Nombre)"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[2]/div/div/div[2]/h4", null, "Asunto"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[2]/div/div/div[4]/h4", null, "Encabezado"));
		
	}
	
	@When("^(?i:I validate Select Template labels are in Spanish)$")
	public void validate_select_template_labels_in_spanish() throws Exception
	{
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[1]/div[2]/p", null, "Plantillas de Brinker"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[1]/div[4]/div[3]/span", null, "Etiquetas"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[1]/div[5]/p", null, "Plantillas de Franquicia"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[1]/div[5]/div[1]/div/div[1]/div[2]/div", null, "Crear Nueva Plantilla"));
	}
	
	@When("^(?i:I validate Edit Template labels are in Spanish)$")
	public void validate_edit_template_labels_in_spanish() throws Exception
	{
		assertTrue(UIActions.
				ElementContainsText("//div[div[contains(@id,'accordiongroup')]][1]//h4/a/span/span", null, "Contenido"));
		
		assertTrue(UIActions.
				ElementContainsText("//div[div[contains(@id,'accordiongroup')]][2]//h4/a/span/span", null, "Guardar como"));
	}
	
	@When("^(?i:I validate Summary labels are in Spanish)$")
	public void validate_summary_labels_in_spanish() throws Exception
	{
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div/div/div[1]/span", null, "Resumen"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div/div/div[2]/span/span", null, "Detalles"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div/div/div[4]/span/span", null, "Audiencia"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div/div/div[8]/span/span", null, "Plantilla"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[3]/div/div[3]/div/button[1]", null, "LANZAR"));
	}
	
	@When("^(?i:I validate Audience labels are in Spanish)$")
	public void validate_audience_labels_in_spanish() throws Exception
	{
		//** Restaurants Section
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[1]/h3", null, "Restaurantes"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='selectAll']", null, "Seleccionar Todos"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='deselectAll']", null, "Limpiar Todo"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[1]/div/div/ul/li[6]/a/div/label/span/span", null, "Sin restaurante asignado"));
		
		//** Filters Section
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/h3", null, "Filtros de Campaña"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div[3]/div/div[1]/span", null, "Campo"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div[3]/div/div[2]/span", null, "Condición"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div[3]/div/div[3]/span", null, "Valor"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div[5]/button/div/span", null, "Calcular Audiencia"));
		
		assertTrue(UIActions.
				ElementContainsText("/html/body/main/section/article/div[1]/div[2]/div[2]/div[6]/span", null, "Guardar mi Filtro Como"));
		
	}
	
	@When("^(?i:I validate Details labels are in Spanish)$")
	public void validate_details_labels_in_spanish() throws Exception
	{
		//** Breadcrumb Section
		assertTrue(UIActions.
				ElementContainsText("/html/body/header/div[1]/div/section[2]/h1", null, "Campañas"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignNavigation']/ul/li[1]", null, "Ingresar Detalles"));

		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignNavigation']/ul/li[3]", null, "Seleccionar Audiencia"));

		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignNavigation']/ul/li[5]", null, "Seleccionar Plantilla"));

		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignNavigation']/ul/li[7]", null, "Editar Plantilla"));

		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignNavigation']/ul/li[9]", null, "Vista Previa"));
				
		//** General Section
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[1]/h3/span", null, "General"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[1]/div[2]/span[1]", null, "Idioma de la campaña"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[1]/div[2]/span[2]", null, "El lenguaje se aplica solamente a las pantallas de Cupón y Desuscribir"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[1]/div[3]/span", null, "Nombre de la Campaña"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[1]/div[4]/span", null, "Descripción de la Campaña"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[1]/div[5]/label/span", null, "Seleccione si esta campaña tendrá cupones"));
		
		//** Channel Section
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[2]/h3/span", null, "Seleccionar Canal"));

		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[1]/span", null, "Seleccione el Canal para configurarlo"));
		
		// Recurrence Section
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/h3/span", null, "Establecer Recurrencia"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[1]/label/span", null, "Lanzar ahora"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[2]/label/span", null, "Una Vez (Empieza el Día de la Campaña)"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[3]/label/span", null, "Diario"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[4]/label/span", null, "Semanal"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[5]/div[1]/span[1]", null, "Cada"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[5]/div[1]/span[2]", null, "Semana(s)"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[5]/div[2]/span", null, "En el Día"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[6]/label/span", null, "Mensual"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[7]/div[1]/span[1]", null, "Cada"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[7]/div[1]/span[2]", null, "Mes(es)"));
		
		assertTrue(UIActions.
				ElementContainsText("//*[@id='campaignDetailsContainer']/div[2]/div[1]/div[7]/div[2]/span", null, "En el Día"));
	}

	private void setTime(String endTime) throws Exception {
		String[] endTimeSplitted = endTime.split(" ");
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("CampaignPageView.hoursEndTimeInput"), endTimeSplitted[0].split(":")[0]));
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("CampaignPageView.minutesEndTimeInput"), endTimeSplitted[0].split(":")[1]));
		
		Boolean isValueSet = UIActions.ElementHasText(UIElementFactory.createElement("CampaignPageView.ampmEndTimeToggleBtn"), endTimeSplitted[1]).isValidResult();
		if (!isValueSet) {
			assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.ampmEndTimeToggleBtn")));
		}
	}

	private String[] getFutureDate(Integer numberOfDays){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		SimpleDateFormat formatter = new SimpleDateFormat("MMMM-dd-yy");
		String[] splittedDate = formatter.format(calendar.getTime()).split("-");
		return splittedDate; 
	}
	
	private void selectYear(String year) throws Exception{
		String yearXPath = "//*[@class='uib-yearpicker']//tbody//button[span[text()='" + year + "']]";
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.datePickerTitleBtn")));
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.datePickerTitleBtn")));
		//Extend to look for years in next pages
		assertTrue(UIActions.ClickOnElement(yearXPath, null));
	}

	private void selectDay(String day) {
		String dayXPath = "//*[@class='uib-daypicker']//tbody//button[span[text()='" + day + "']]";
		assertTrue(UIActions.ClickOnElement(dayXPath, null));
	}

	private void selectMonth(String month) {
		String monthXPath = "//*[@class='uib-monthpicker']//tbody//button/span[text()='" + month + "']";
		assertTrue(UIActions.ClickOnElement(monthXPath, null));
	} 
	//Code by Luis
	@Given("^Set the End Date as today plus '(.+)' day and End Time as Zero hours$")
	public void Set_the_End_Date_as_today_plus_one_day_and_End_Time_as_Zero_hours(int day) throws Throwable {
		SimpleDateFormat formattedDate = new SimpleDateFormat("MM/dd/yyyy");            
	    Calendar c = Calendar.getInstance();        
	    c.add(Calendar.DATE, day);  // number of days to add      
	    String tomorrow = (String)(formattedDate.format(c.getTime()));
	    System.out.println("Tomorrows date is " + tomorrow);
	    String[] dateList = tomorrow.split("/");
	    
	    
	    UIActions.ExecuteJS("arguments[0].click();", ".//*[text()='End Date']/parent::div/div/button");
	    
	    TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
	    String monthGetText = driver.getDriverInstance().findElement(By.xpath(".//*[@class='uib-daypicker']/thead/tr[1]/th[2]/button/strong")).getText().trim();
	    String month = theMonth(Integer.parseInt(dateList[0])-1);
	    month = month +" " + dateList[2];
	    if(!monthGetText.equals(month)){
	    	UIActions.ExecuteJS("arguments[0].click();", ".//*[@class='uib-daypicker']/thead/tr[1]/th[3]/button");	
	    }
	    UIActions.ExecuteJS("arguments[0].click();", ".//*[@class='uib-daypicker']/tbody/tr/td/button[not(contains(@disabled,'disabled'))]/span[text()='"+dateList[1]+"']/parent::button");
	    UIActions.ExecuteJS("arguments[0].click();", " .//*[@id='campaignDetailsContainer']/div[2]/div[2]/div[3]/div[2]/table/tbody/tr[3]/td[1]/a/span");	
	   
	//	UIActions.ExecuteJS("arguments[0].setAttribute('value', '" + tomorrow +"');", ".//*[text()='End Date']/parent::div/div/input");
	//	Thread.sleep(1000);
		UIActions.ExecuteJS("arguments[0].setAttribute('value', '12');", ".//*[text()='End Time']/parent::div/table/tbody/tr[2]/td[@class='form-group uib-time hours']/input");
		UIActions.ExecuteJS("arguments[0].setAttribute('value', '00');", ".//*[text()='End Time']/parent::div/table/tbody/tr[2]/td[@class='form-group uib-time minutes']/input");
		
	}
	
	public static String theMonth(int month){
	    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	    return monthNames[month];
	}
	
	@And("^Select Template with the name '(.+)'$")
	public void select_template_with_the_name(String templateName) {
		UIActions.ExecuteJS("arguments[0].click();", ".//*[text()='"+templateName+"']");
	}
	
	
	@Then("^Once all the sections in the Summary Screen are marked GREEN$")
	public void once_all_the_section_in_the_summary_screen_are_marked_green() {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		
		List<WebElement> elements = driver.getDriverInstance().findElements(By.xpath(".//*[text()='Summary']/parent::div/following-sibling::div[contains(@class,'verticalAlign')]"));
		for(int i = 0; i < elements.size(); i++){
			String color = elements.get(i).getCssValue("background-color");
			String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
			int r = Integer.parseInt(numbers[0].trim());
			int g = Integer.parseInt(numbers[1].trim());
			int b = Integer.parseInt(numbers[2].trim());
			
			String colorName = colorUtils.getColorNameFromRgb(r, g, b);
			assertTrue(colorName.equals("YellowGreen"), "The screen are not marked as GREEN");
		}
		
	}
	
	@And("^Select the filber by '(.+)'$")
	public void select_the_filter_by(String filterBy) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		driver.getDriverInstance().findElement(By.xpath(".//*[@class='dropdown-menu']/li/a[text()='"+filterBy+"']")).click();
	}
	
	
	@And("^Press Enter by Filter$")
	public void select_filter_textbox_and_press_enter() {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
	//	driver.getDriverInstance().findElement(By.xpath(".//strong[text()='"+filterBy+"']/parent::a")).click();
		driver.getDriverInstance().findElement(By.xpath(".//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[2]/input")).sendKeys(Keys.ENTER);
	}
	
	@Then("^Validate the Status '(.+)' from '(.+)' Campaign Name$")
	public void validate_the_status_from_campaign_name(String status, String name) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		String getTextProperty = driver.getDriverInstance().findElement(By.xpath(".//*[text()='"+name+"']/following-sibling::span[contains(@class,'br-status') and not(contains(text(),'Canceled'))]")).getText();
		assertTrue(getTextProperty.equals(status), "The Status "+ status +" does not match with the actual " + getTextProperty);
	}
	
	@Then("^Validate the Status '(.+)' from key '(.+)' Campaign Name$")
	public void validate_the_status_from_key_campaign_name(String status, String key) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		String campaignName = UIActions.GetStringTextInCacheContext(key).toString();
		String getTextProperty;
		if(status.equalsIgnoreCase("Canceled")){
			getTextProperty = driver.getDriverInstance().findElement(By.xpath(".//*[text()='"+campaignName+"']/following-sibling::span[contains(@class,'br-status') and (contains(text(),'Canceled'))]")).getText();
		}else{
			getTextProperty = driver.getDriverInstance().findElement(By.xpath(".//*[text()='"+campaignName+"']/following-sibling::span[contains(@class,'br-status') and not(contains(text(),'Canceled'))]")).getText();
		}
		assertTrue(getTextProperty.equals(status), "The Status "+ status +" does not match with the actual " + getTextProperty);
	}
	
	@And("^Cancel the '(.+)' Campaign Name$")
	public void cancel_the_campaign_name(String name) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		driver.getDriverInstance().findElement(By.xpath(".//*[text()='"+name+"']/parent::section/following-sibling::section/button[contains(@class,'Cancel')]")).click();
	}
	
	@And("^Cancel the '(.+)' Campaign Name from key$")
	public void cancel_the_campaign_name_from_key(String key) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		String campaignName = UIActions.GetStringTextInCacheContext(key).toString();
		driver.getDriverInstance().findElement(By.xpath(".//*[text()='"+campaignName+"']/parent::section/following-sibling::section/button[contains(@class,'Cancel')]")).click();
	}
	
	@And("^Analytics the '(.+)' Campaign Name$")
	public void analytics_the_campaign_name(String name) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		driver.getDriverInstance().findElement(By.xpath(".//*[text()='"+name+"']/parent::section/following-sibling::section/button[contains(@class,'campaignActionAnalytics')]")).click();
	}
	
	@And("^Edit the '(.+)' Campaign Name from key$")
	public void edit_the_campaign_name(String key) {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		String campaignName = UIActions.GetStringTextInCacheContext(key).toString();
		driver.getDriverInstance().findElement(By.xpath(".//*[text()='"+campaignName+"']/parent::section/following-sibling::section/button[contains(@class,'campaignActionEdit')]")).click();
	}

	
	@And("^Click on Browse button and Upload Image:$")
    public void click_on_browse_button_and_upload_bid_item_file(final List<String> imageName) throws Throwable {
	//	ExecutionContext executionContext = new ExecutionContext();
		UIActions.PutTextInVolatileContext(imageName.get(1), "ImageName");
		buttonElements.uploadImage(imageName.get(1));
		Thread.sleep(2000);
		System.out.println(UIActions.GetTextInCacheContext("ImageName").getObjectResult().toString());
	}
	
	@And("^Select '(.+)' checkbox from Restaurant list$")
    public void select_checkbox_from_restaurant_list(String restaurantName) throws Throwable {
		TestDriver<WebDriver> driver = (TestDriver<WebDriver>) Actions.getTestDriver();
		driver.getDriverInstance().findElement(By.xpath(".//*[text()='"+restaurantName+"']/parent::span/preceding-sibling::input")).click();
	}
	
	@Given("^Set the Start Date as today and Start Time as Current time '(.+)' hours more$")
	public void Set_the_start_Date_as_today_and_start_time_as_current_time(int hours) throws Throwable {
		SimpleDateFormat formattedDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss.SSS");            
	    Calendar c = Calendar.getInstance();        
	  //  c.add(Calendar.DATE, 1);  // number of days to add      
	    String getDate = (String)(formattedDate.format(c.getTime()));
	    System.out.println("Tomorrows date is " + getDate);
	    String[] dateList = getDate.split("/");
	    UIActions.ClickOnElement(UIElementFactory.createElement("CampaignsEnterDetailsBrinkerPage.startDateButton"));
	    Thread.sleep(1000);
	    UIActions.ClickOnElement(UIElementFactory.createElement("CampaignsEnterDetailsBrinkerPage.todayButton"));
	    for(int i = 0; i < hours; i++){
	    	UIActions.ClickOnElement(UIElementFactory.createElement("CampaignsEnterDetailsBrinkerPage.incrementHourButton"));
	    }
	    
	    		
	}
}
