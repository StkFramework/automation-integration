package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class CampaignPageView {
	
	@ElementMap(how = How.XPATH, using = "//*[@id='cred_userid_inputtext']")
	public UIElement userNameTxt;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='cred_password_inputtext']")
	public UIElement passwordTxt;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='cred_sign_in_button']")
	public UIElement LoginBtn;
	
	@ElementMap(how = How.XPATH, using = "//footer//div/a/span[text()='Campaigns']")
	public UIElement campaignsBtn;
	
	@ElementMap(how = How.XPATH, using = "//footer//div/a/span[text()='Campañas']")
	public UIElement campaniasBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='campaignDetailsContainer']/div//span[text()='Create New Campaign']")
	public UIElement createNewCampaignBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='campaignDetailsContainer']/div//span[text()='Crear Nueva Campaña']")
	public UIElement crearNuevaCampaniaBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='campaignDetailsContainer']//div/input[@ng-model='Campaign.Name']")
	public UIElement campaignNameTxt;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='campaignDetailsContainer']//div/button[@ng-click='onChangeEmail()']")
	public UIElement emailChannelBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='campaignDetailsContainer']//div/select[@ng-model='Campaign.CampaignLanguageModel']")
	public UIElement languageDrpdwn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='Subject']")
	public UIElement emailSubjectTxt;
	
	@ElementMap(how = How.XPATH, using = "//div/button[contains(text(), 'Save & Continue')]")
	public UIElement saveContinueBtn;
	
	@ElementMap(how = How.XPATH, using = "//div/button[contains(text(), 'Guardar & Continuar')]")
	public UIElement guardarContinuarBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='loadingMessage']")
	public UIElement loadingSpinner;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='selectAll']")
	public UIElement selectAllRestaurantsBtn;
	
	@ElementMap(how = How.XPATH, using = "//*/div/button[contains(@class,'button-add')]")
	public UIElement addFilterBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='fields1']")
	public UIElement FieldsDrpdwn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='filter1']//div/input")
	public UIElement filterValueTxt;
	
	@ElementMap(how = How.XPATH, using = "//*/button[@class='circle-button-green']")
	public UIElement calculateAudienceBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[p[text()='Brinker Templates']]//div[@class='temp-name-container']")
	public UIElement brinkerTemplateBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[p[text()='Plantillas de Brinker']]//div[@class='temp-name-container']")
	public UIElement plantillaBrinkerBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editOptionTemplateContainer']//div//a[span//*[contains(text(),'Content')]]")
	public UIElement contentBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editTemplateText']")
	public UIElement textBlockBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editorHeader']")
	public UIElement editorHeader;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editorHeader']//*[contains(@id,'editoritem')]//div/span")
	public UIElement textElementToChange;
	
	@ElementMap(how = How.XPATH, using = "//ul[@id='editorBody']//li[1]//div/img[@class='btnRemoveItem']")
	public UIElement removeImagefromTemplateBody;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class,'modal-dialog')]//div[contains(@class, 'modal-footer')]//button[text()='OK']")
	public UIElement okButtonModalWindow;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class,'modal-dialog')]//div[contains(@class, 'modal-footer')]//button[text()='Aceptar']")
	public UIElement aceptarButtonModalWindow;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editTemplateImage']")
	public UIElement imageBlockBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editorBody']")
	public UIElement editorBody;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editorBody']//li[1]/div[contains(@id, 'editoritem_')]")
	public UIElement editorBodyItem;
	
	@ElementMap(how = How.XPATH, using = "//ul[@id='editorBody']//div/img[@style='display:block;']")
	public UIElement imagePlaceholder;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='btnSelectedCustomImage']")
	public UIElement uploadImageInputFile;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='btnSelectedCustomImage']")
	public UIElement confirmSaveTemplateModalBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'br-footer')]//div//button[contains(text(), 'Launch')]")
	public UIElement launchNowBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'br-footer')]//div//button[contains(text(), 'Lanzar')]")
	public UIElement lanzarBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class,'modal-dialog')]//div[contains(@class, 'modal-footer')]//button[text()='Yes']")
	public UIElement yesModalWindow;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class,'modal-dialog')]//div[contains(@class, 'modal-footer')]//button[text()='Si']")
	public UIElement siModalWindow;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='single-button']")
	public UIElement filterByBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='single-button']/following-sibling::ul//a[1]")
	public UIElement filterByNameBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='campaignDetailsContainer']//div/input[contains(@ng-model,'name')]")
	public UIElement searchCampaignTxt;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='chkCampaignDetails']")
	public UIElement campaignCouponsChk;
	
	@ElementMap(how = How.XPATH, using = "//div[span[text()='End Date']]/div[@class='br-datepicker']/button")
	public UIElement calendarBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[contains(@id,'datepicker') and contains(@id,'title')]")
	public UIElement datePickerTitleBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[span[text()='End Time']]//td[contains(@class, 'hours')]/input")
	public UIElement hoursEndTimeInput;
	
	@ElementMap(how = How.XPATH, using = "//div[span[text()='End Time']]//td[contains(@class, 'minutes')]/input")
	public UIElement minutesEndTimeInput;
	
	@ElementMap(how = How.XPATH, using = "//div[span[text()='End Time']]//td[contains(@class, 'am-pm')]/button")
	public UIElement ampmEndTimeToggleBtn;
	
	@ElementMap(how = How.XPATH, using = "//button[span[text()='Generic']]")
	public UIElement genericCouponsBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[span[text()='Max Amount of Validations']]/input")
	public UIElement maxAmountInput;
	
	@ElementMap(how = How.XPATH, using = "//div[span[text()='Suggested Code']]/input")
	public UIElement suggestedCodeInput;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editorBody']/li[@ng-show='coupon.HasCoupons']//label")
	public UIElement suggestedCodelbl;
	
	@ElementMap(how = How.XPATH, using = "//div[h3[text()='Generic Coupons Information']]//div[span[contains(text(),'Offer')]]/input")
	public UIElement offerNameInput;
	
	@ElementMap(how = How.XPATH, using = "//div[h3[text()='Generic Coupons Information']]//div[span[contains(text(),'Conditions')]]/textarea")
	public UIElement conditionsInput;
	
	@ElementMap(how = How.XPATH, using = "//button[span[text()='Generate Coupons']]")
	public UIElement generateCouponsBtn;
	
	@ElementMap(how = How.XPATH, using = "//div/button[contains(text(), 'Continue')]")
	public UIElement continueBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='editTemplateCouponButton']")
	public UIElement scissorsBlockBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='campaignDetailsContainer']//button[contains(@class, 'Cancel')]")
	public UIElement cancelCampaignBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'br-profile')]/Button")
	public UIElement profileBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'br-profile')]//a[text()='Logout']")
	public UIElement logOutBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='use_another_account']")
	public UIElement anotherAccountBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[@class='footerOptions']//a[h6[text()='Validate Coupons']]")
	public UIElement validateCouponsBtn;
	
	@ElementMap(how = How.XPATH, using = "//button[contains(text(),'Validate Coupon')]")
	public UIElement validateBtn;
	
	@ElementMap(how = How.XPATH, using = "//input[contains(@class, 'couponCodeInput')]")
	public UIElement couponCodeInput;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'modal-dialog')]//div[contains(@class, 'modal-body')]//li")
	public UIElement expiredCampaignlbl;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'br-language')]/Button")
	public UIElement languageBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'br-language')]//a[text()='Español']")
	public UIElement espaniolBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'text-center')]/span[contains(@class, 'welcome')][1]")
	public UIElement welcomeLbl;
	
	@ElementMap(how = How.XPATH, using = "//h3[contains(@class, 'welcomeSubtitle')]")
	public UIElement welcomeSubtitleLbl;
	
}




