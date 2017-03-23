package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class CustomerPageView {
	
	@ElementMap(how = How.XPATH, using = ".//*[contains(text(),'Import Contacts')]", verify = true)
	public UIElement  importContactsLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[contains(text(),'Contacts DB')]", verify = true)
	public UIElement  contactsDBLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[text()='Select a File']/parent::div//input[1]", verify = true)
	public UIElement  fileNameTextBox;
	
	@ElementMap(how = How.XPATH, using = ".//*[text()='Favorite Restaurant']/parent::div/select", verify = true)
	public UIElement  favoriteRestaurantDropdownList;
	
	@ElementMap(how = How.XPATH, using = ".//button[contains(text(),'Import')]", verify = true)
	public UIElement  importBtn;
	
	@ElementMap(how = How.XPATH, using = ".//*[text()='Browse...']", verify = true)
	public UIElement  browseBtn;
	
	@ElementMap(how = How.XPATH, using = ".//*[@class='modal-content']/div[contains(@class,'modal-body')]/div", verify = true)
	public UIElement  textModal;
	
	@ElementMap(how = How.XPATH, using = ".//*[@class='modal-content']/div[contains(@class,'modal-footer')]//button[@class='btn ng-binding btn-primary'][1]", verify = true)
	public UIElement  okModal;
}
