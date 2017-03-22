package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class CMSPageView {
	
	@ElementMap(how = How.XPATH, using = "//*[@id='cred_userid_inputtext']")
	public UIElement userNameTxt;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='cred_password_inputtext']")
	public UIElement passwordTxt;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='cred_sign_in_button']")
	public UIElement loginBtn;
	
	@ElementMap(how = How.XPATH, using = "//footer//div/a[span[text()='CMS']]")
	public UIElement cmsBtn;
	
	@ElementMap(how = How.XPATH, using = "//*/table//tr[1]/td[@id='actions-column']/a[text()='Copy']")
	public UIElement copyBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='menuRestaurants-body']/form//input[@name='newMenuName']")
	public UIElement menuNametxt;
	
	@ElementMap(how = How.XPATH, using = "//div[contains(@class, 'modal-footer')]//button[@class='btn btn-success']")
	public UIElement createBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[@class='side-navbar']//i[contains(@class, 'arrow-right')]")
	public UIElement expandMenuBtn;
	
	@ElementMap(how = How.XPATH, using = "//div[@class='side-navbar']//span[text()='Franchise Restaurants']")
	public UIElement franchiseRestaurantsBtn;
	
	@ElementMap(how = How.XPATH, using = "//table//tr[1]/td[@id='views-column']/a[text()='Settings']")
	public UIElement firstRestaurantSettingsBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='accordion']/div[3]/div[1]/h4/a")
	public UIElement serviceAccordionBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='collapseThree']//div/label[text()='Kids Area']")
	public UIElement kidsAreaBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='collapseThree']//div/label[text()='Terrace']")
	public UIElement terraceBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='accordion']/div[6]/div[1]/h4/a")
	public UIElement deliveryMethodsAccordionBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='collapseSix']/div/div/div[2]/form/div[1]/div/div/label[2]")
	public UIElement toGoDeliveryBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='collapseSix']/div/div/div[1]/form/div[1]/div/div/label[2]")
	public UIElement deliveryDeliveryBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='collapseSix']/div/div/div[2]/form/div[2]/div/div[2]/div[1]/input")
	public UIElement estimatedTimeTxt;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='collapseSix']/div/div/div[2]/form/div[2]/div/div[2]/div[1]/input")
	public UIElement emailDeliveryTxt;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='page-content-wrapper']//div[@class='btns-bar']/button[1]")
	public UIElement applyChangesBtn;
	
	@ElementMap(how = How.XPATH, using = "//*[@id='page-content-wrapper']//div/a[text()='Hide all']")
	public UIElement hideAllAccordionBtn;
}
