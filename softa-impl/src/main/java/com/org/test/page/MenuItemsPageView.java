package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class MenuItemsPageView {
	
	
	@ElementMap(how = How.XPATH, using = ".//a[contains(text(),'Add Item')]", verify = true)
	public UIElement  addItemButton;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[2]/input", verify = true)
	public UIElement  itemNameTextbox;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[5]", verify = true)
	public UIElement  categoryItemFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[5]/span[1]/span/span[2]/span", verify = true)
	public UIElement  downArrowCategoryFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[7]/div/div/a", verify = true)
	public UIElement  itemImagesFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[8]/span", verify = true)
	public UIElement  itemStatusFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[8]/span/span/span[2]/span", verify = true)
	public UIElement  downArrowStatusFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//li[text()='Active']", verify = true)
	public UIElement  activeLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[9]", verify = true)
	public UIElement  orderingEnabledFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[9]/span[1]/span/span[2]/span", verify = true)
	public UIElement  downArrowOrderingEnabledFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//li[text()='Enabled']", verify = true)
	public UIElement  enabledLink;
	
	@ElementMap(how = How.XPATH, using = ".//a[contains(text(),'Apply Changes')]", verify = true)
	public UIElement  applyChangesButton;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[3]", verify = true)
	public UIElement  descriptionFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[3]/textarea", verify = true)
	public UIElement  descriptionTextarea;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[4]/p", verify = true)
	public UIElement  priceFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='itemsGrid']/div[4]/table/tbody/tr/td[4]/span[1]/span/input[2]", verify = true)
	public UIElement  priceTextbox;
	
}

