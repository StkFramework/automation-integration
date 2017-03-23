package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class MenusCmrPageView {
	
	
	@ElementMap(how = How.XPATH, using = ".//a[contains(text(),'Add Menu')]", verify = true)
	public UIElement  addMenuButton;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='menusGrid']/div[4]/table/tbody/tr[1]/td[1]/input", verify = true)
	public UIElement  menuNameTextbox;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='menusGrid']/div[4]/table/tbody/tr[1]/td[2]", verify = true)
	public UIElement  menuDescriptionFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='menusGrid']/div[4]/table/tbody/tr[1]/td[2]/textarea", verify = true)
	public UIElement  descriptionTextarea;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='menusGrid']/div[4]/table/tbody/tr[1]/td[4]", verify = true)
	public UIElement  menuStatusFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='menusGrid']/div[4]/table/tbody/tr[1]/td[4]/span/span/span[2]/span", verify = true)
	public UIElement  downArrowStatusFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//li[text()='Active']", verify = true)
	public UIElement  activeLink;
	
	@ElementMap(how = How.XPATH, using = ".//li[text()='Inactive']", verify = true)
	public UIElement  inactiveLink;
	
	@ElementMap(how = How.XPATH, using = ".//a[contains(text(),'Apply Changes')]", verify = true)
	public UIElement  applyChangesButton;
	
}

