package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class HubProfilePageView {
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='widget_dijit_form_TextBox_0']/div/input")
	public UIElement directorySearchTextBox;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='inLineBusinessCard']/tbody/tr/td/h1/span/a")
	public UIElement firtsNameProfileLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='com_ibm_social_personcard_widget_PersonWidget_0']/div[2]/div[1]/a")
	public UIElement nameProfileLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='com_ibm_social_personcard_widget_PersonWidget_0']")
	public UIElement nameProfile2Link;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='report-chain-sub-peopleManaged']/a", verify = true )
	public UIElement peopleManagedLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='reportStructureArea']/div[1]/div[1]", verify = true )
	public UIElement paginationLink;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='rptStructTable']/tbody/tr/td[2]", verify = true )
	public UIElement userInformationTable1;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='rptStructTable']/tbody/tr/td[3]", verify = true )
	public UIElement userInformationTable2;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='cardBody']/td/div[3]/div/p", verify = true )
	public UIElement userInformationTable3;
	
	@ElementMap(how = How.XPATH, using = ".//*[@class='lotusPersonInfo']/h2/span", verify = true )
	public UIElement nameLabel;
	
	@ElementMap(how = How.XPATH, using = ".//*[@class='lotusPersonInfo']/p[1]", verify = true )
	public UIElement roleLabel;
	
	@ElementMap(how = How.XPATH, using = ".//*[@class='lotusPersonInfo']/div/p", verify = true )
	public UIElement locationLabel;
	
	@ElementMap(how = How.XPATH, using = ".//*[@class='lotusPersonInfo']/p/a", verify = true )
	public UIElement emailLabel;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='cardBody']/td/div[3]/p[2]", verify = true )
	public UIElement areaLabel;
	
	@ElementMap(how = How.XPATH, using = ".//*[@id='aProfileHeader_Directory']/span", verify = true )
	public UIElement directoryLink;
}
