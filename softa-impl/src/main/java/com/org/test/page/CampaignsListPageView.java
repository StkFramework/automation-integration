package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class CampaignsListPageView {
	
	@ElementMap(how = How.XPATH, using = ".//*[text()='Create New Campaign']/parent::section", verify = true)
	public UIElement  createNewCampaignSection;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='single-button']", verify = true)
	public UIElement  filterButton;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='campaignDetailsContainer']/div[1]/div[2]/div[2]/input", verify = true)
	public UIElement  filterTextbox;
	
	@ElementMap(how = How.XPATH, using = ".//*[@class='modal-content']/div[contains(@class,'modal-body')]/div", verify = true)
	public UIElement  textModal;
	
	@ElementMap(how = How.XPATH, using = ".//*[@class='modal-content']/div[contains(@class,'modal-footer')]//button[@class='btn ng-binding btn-primary']", verify = true)
	public UIElement okButtonModalWindow;

}
