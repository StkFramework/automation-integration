package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class BrinkerLoginPageView {
	
	@ElementMap(using = "/html/body/header/div/nav/div[5]/div[1]/div", verify = true)
	public UIElement useAnotherAccountLink;
	
	@ElementMap(how = How.ID, using = "cred_userid_inputtext")
	public UIElement usernameTextBox;
	
	@ElementMap(how = How.ID, using = "cred_password_inputtext")
	public UIElement passwordTextBox;
	
	@ElementMap(how = How.ID, using = "cred_sign_in_button")
	public UIElement loginBtn;
	                    
	
	//Campaigns
	@ElementMap(using = "/html/body/footer/div[1]/div[1]/a/span")
	public UIElement campaignBtn;
	
	
	//Create New Campaigns
	
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div/article[1]/section")
	public UIElement createNewCampaignBtn;

	//Language
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[1]/div[2]/select")
	public UIElement languageDrpDwn;
	
	//English
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[1]/div[2]/select/option[2]")
	public UIElement englishOption;
	
	//Campaign Name
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[1]/div[3]/input")
	public UIElement cNameTxtBx;
	
	//Campaign Desc
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[1]/div[4]/textarea")
	public UIElement cDescTxtBx;
	
	
	//Email Channel
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[2]/div[2]/div/button")
	public UIElement emailChannelBtn;
	
	//From field
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/select")
	public UIElement emailFromDrpDwn;
	
	//From 1st option
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/select/option[2]")
	public UIElement emailFromOptn;
	
	//Email Subject
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/input")
	public UIElement emailSubjectTxtBx;	
	
	//Save & Continue
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[3]/div/div/button")
	public UIElement saveContinue1Btn;
	
	
	
	//Add Filter	     
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div[2]/div[1]/button[1]")
	public UIElement addFilterBtn;
	
	//Field
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div[2]/div[3]/div/div[1]/select")
	public UIElement fieldDrpDwn;
	
	//value filter        
    
	//@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input-no-special-char/input")
	//@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input-no-special-char")
	//@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div[2]/div[3]/div/div[3]/div")
	//@ElementMap(how = How.ID, using = "inputId")
	//@ElementMap(using = "*[@id='filter1']/div[3]/div/input")
	//@ElementMap(how = How.CSS, using = " html.ng-scope body.ng-scope main.br-main.container-fluid section.row article.col-md-10.col-md-offset-1.col-sm-12.hub-page-wizard div.br-view-campaign.br-audience.br-panel.ng-scope div.br-form.audience-container div.br-form-column.br-large.container-fluid.filter-container div#filterContainer.row div#filter1.row.filter-margin.ng-scope div.col-lg-4.col-md-4.col-sm-4.col-xs-4.ng-scope div.ng-scope input-no-special-char.ng-isolate-scope input#inputId.filter-value-text.ng-pristine.ng-valid.ng-empty.ng-touched")
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/input")
	public UIElement fieldValueTxtBx;
	
	//Calculate Audience
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div[2]/div[4]/button")
	public UIElement calcAudienceBtn;
		
	//Save and Continue  
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[3]/div/div[3]/button[2]")
	public UIElement saveContinue2Btn;
	
	
	
	//1st Template       /html/body/main/section/article/div[1]/div[1]/div[5]/div[1]/div/div[2]/div/div[1]/img
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[1]/div[5]/div[1]/div/div[2]/div/div[1]")
	public UIElement templateLnk;
	
	//Save and Continue
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[2]/div/div[3]/button[2]")
	public UIElement saveContinue3Btn;
	
	//OK Button on "popup"
	@ElementMap(using = "/html/body/div[1]/div/div/div[3]/span/button")
	public UIElement okPopupBtn;
	
	
	//Launch Now
	@ElementMap(using = "/html/body/main/section/article/div[1]/div[3]/div/div[3]/div/button[1]")
	public UIElement launchNowBtn;
	
	//Yes Launch Now	
	@ElementMap(using = "/html/body/div[1]/div/div/div[3]/span[2]/button")
	public UIElement yesLaunchNowBtn;	

	@ElementMap(how = How.XPATH, using = ".//*[contains(text(),'Use another account') or contains(text(),'Usar otra cuenta')]", verify = true)
	public UIElement  useAnotherAccount;
	
	@ElementMap(how = How.NAME, using = "login", verify = true)
	public UIElement  userBrinker;
	
	@ElementMap(how = How.NAME, using = "passwd", verify = true)
	public UIElement  passwdBrinker;
	
	@ElementMap(how = How.XPATH, using = ".//button[contains(text(),'Sign in') or contains(text(),'Iniciar sesión')]", verify = true)
	public UIElement  signInBrinker;

}
