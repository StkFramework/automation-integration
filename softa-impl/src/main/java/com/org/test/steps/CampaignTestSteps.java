package com.org.test.steps;

import com.softtek.automation.steps.AbstractSteps;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.beans.factory.annotation.Autowired;

import com.softtek.automation.actions.AppActions;
import com.softtek.automation.actions.UIActions;
import com.softtek.automation.actions.UIActionsLocal;
import com.softtek.automation.element.UIElementFactory;

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
	
	@When("^(?i:I select the first Email from list)$")
	public void select_first_email() throws Exception{
		String emailDropdownXPath = "//*[@id='campaignDetailsContainer']//div/select[@ng-model='EmailChannel.Id']"; 
		UIActions.ClickOnElement(emailDropdownXPath, null);
		UIActions.ClickOnElement(emailDropdownXPath + "/option[2]", null);
	}
	
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
		
		assertTrue(UIActions.PutTextInCacheContext(newCampaignName, "newCampaignName"));
	}
	
	@When("^(?i:I validate the coupon)$")
	public void validate_coupon() throws Exception
	{
		String couponCode = UIActionsLocal.GetTextFromCacheContext("couponCode").getObjectResult().toString();
		
		assertTrue(UIActions.TypeTextOn(UIElementFactory.createElement("CampaignPageView.couponCodeInput"), couponCode));
		
		assertTrue(AppActions.WaitForSeconds("2"));
		
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.validateBtn")));
		
		assertTrue(AppActions.WaitForSeconds("10"));
		
		assertTrue(UIActions.ElementContainsText(UIElementFactory.createElement("DashBoardPageView.expiredCampaignlbl"), "Campaign expired"));
	}
	
	@When("^(?i:I Search for launched Campaign)$")
	public void search_launched_campaign() throws Exception{
		String newCampaignName = UIActionsLocal.GetTextFromCacheContext("newCampaignName").getObjectResult().toString();
		
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.filterByBtn")));
		assertTrue(UIActions.ClickOnElement(UIElementFactory.createElement("CampaignPageView.filterByNameBtn")));
		assertTrue(UIActionsLocal.TypeTextAndIntro(UIElementFactory.createElement("CampaignPageView.searchCampaignTxt"), newCampaignName));
		
		assertTrue(AppActions.WaitForSeconds("10"));
	}
	
	@When("^(?i:I drag) '(.+)' (?i:and drop it on) '(.+)'$")
	public void drag_and_drop(String ElementToDrag, String DropDestination) throws Exception{
		assertTrue(UIActionsLocal.DragAndDrop(UIElementFactory.createElement(ElementToDrag), UIElementFactory.createElement(DropDestination)));
	}
	
	@When("^(?i:I upload the image) '(.+)'$")
	public void upload_image(String imageName) throws Exception{
		String imagePath = Paths.get(System.getProperty("user.home")).toAbsolutePath().toString() + "\\Documents\\Brinker\\" + imageName ;
		assertTrue(UIActionsLocal.UploadFile(UIElementFactory.createElement("CampaignPageView.uploadImageInputFile"), imagePath));
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
	
	@When("^(?i:I validate Status is) '(.+)'$")
	public void validate_status_for_campaign(String status) throws Exception
	{
		String campaignName = UIActionsLocal.GetTextFromCacheContext("newCampaignName").getObjectResult().toString();
		String campaignXPath = "//div[@class='br-content']/section[h4[text()='" + campaignName + "']]//span[3]";
		assertTrue(UIActions.ElementHasText(campaignXPath, null, status));
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
}
