package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class MenuCategoriesPageView {
	
	
	@ElementMap(how = How.XPATH, using = ".//a[contains(text(),'Add Category')]", verify = true)
	public UIElement  addCategoryButton;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='categoriesGrid']/div[4]/table/tbody/tr/td[2]/input", verify = true)
	public UIElement  categoryNameTextbox;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='categoriesGrid']/div[4]/table/tbody/tr/td[4]/div/div", verify = true)
	public UIElement  categoryImagesFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//a[contains(text(),'Apply Changes')]", verify = true)
	public UIElement  applyChangesButton;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='categoriesGrid']/div[4]/table/tbody/tr/td[5]/span", verify = true)
	public UIElement  categoryStatusFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='categoriesGrid']/div[4]/table/tbody/tr/td[5]/span/span/span[2]/span", verify = true)
	public UIElement  downArrowStatusFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//li[text()='Active']", verify = true)
	public UIElement  activeLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='categoriesGrid']/div[4]/table/tbody/tr/td[6]", verify = true)
	public UIElement  orderingEnabledFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='categoriesGrid']/div[4]/table/tbody/tr/td[6]/span[1]/span/span[2]/span", verify = true)
	public UIElement  downArrowOrderingEnabledFirstRow;
	
	@ElementMap(how = How.XPATH, using = ".//li[text()='Enabled']", verify = true)
	public UIElement  enabledLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='views-column']/a", verify = true)
	public UIElement  itemsFirtRowButton;
	
}

