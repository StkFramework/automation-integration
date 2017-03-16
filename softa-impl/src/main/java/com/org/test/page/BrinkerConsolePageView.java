package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class BrinkerConsolePageView {
	
	//HUB - Console Button
	@ElementMap(using = "/html/body/footer/div[1]/div[1]/a/div/img")
	public UIElement consoleBtn;
	
	
	//RECEIVED
	//Received Header
						 
	@ElementMap(using = "/html/body/div/div/div/div/div/div[1]/div/ul/li[1]/span[1]")
	public UIElement receivedHdr;
	
	//Search icon - Reusable
	
	
	@ElementMap(using = "// *[@id='list-heading']/div[3]/i")
	public UIElement searchBtn;
	
	//Close Search OrderId
	@ElementMap(using = "//*[@id='list-heading']/div[3]/div/div/div/button[2]/i")
	public UIElement closeSearchBtn;
	
	//Erase Order ID
	@ElementMap(using = "//*[@id='list-heading']/div[3]/div/div/div/button[1]/i")
	public UIElement eraseOrderBtn;
	
	//Enter Order ID TextBox - Reusable
						 //*[@id="mainContent"]/div/div[1]/div/div[1]/div[3]/div/div/input
	@ElementMap(using = "//*[@id='mainContent']/div/div[1]/div/div[1]/div[3]/div/div/input")
	public UIElement orderIDTxtBox;
	
	//1st order showed on results - Reusable
	@ElementMap(using = "//*[@id='mainContent']/div/div[1]/div/div[2]/div/div/div[1]")
	public UIElement firstOrderLink;
	
	
	//Entered in POS button from 1st Order
	@ElementMap(using = "//*[@id='mainContent']/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/a")
	public UIElement enteredInPOSBtn;

	//Send Order to In Process Link
	@ElementMap(using = "//*[@id='mainContent']/div/div[2]/div/div[3]/div/div[2]/button")
	public UIElement inProcessLink;

	//Send to In Process Popup
	//Estimated Time of Delivery
	@ElementMap(how = How.ID, using = "estimatedTimeVal")
	public UIElement deliveryTimeTxtBox;
	
	//POS Check#
	@ElementMap(how = How.ID, using = "posId")
	public UIElement posIDTxtBox;
	
	//OK - confirm In Process
	@ElementMap(using = "/html/body/div[2]/div/button[1]")
	public UIElement okPopupBtn;
	
	//Cancel - confirm In Process
	@ElementMap(using = "/html/body/div[2]/div/button[2]")
	public UIElement cancelPopupBtn;
	
	
	//IN PROCESS
	
	//In Process Header  
	@ElementMap(using = "/html/body/div/div/div/div/div/div[1]/div/ul/li[2]/span[1]")
	public UIElement inProcessHdr;
	
	//Ready button from 1st order
	@ElementMap(using = "//*[@id='mainContent']/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/a")
	public UIElement readyBtn;
	
	//Send order to Ready link
	@ElementMap(using = "//*[@id='mainContent']/div/div[2]/div/div[3]/div/div[3]/button")
	public UIElement readyLink;
	
	//READY
	
	//Ready Header
	@ElementMap(using = "/html/body/div/div/div/div/div/div[1]/div/ul/li[3]/span[1]")
	public UIElement readyHdr;
	
	//Order ID in READY section
	//*[@id="mainContent"]/div/div[1]/div/div[2]/div/div/div[1]/div/div[3]/p[1]/text()
	@ElementMap(using = "//*[@id='mainContent']/div/div[1]/div/div[2]/div/div/div[1]/div/div[3]/p[1]/text()")
	public UIElement orderIDTxt;
	//*[@id="mainContent"]/div/div[1]/div/div[2]/div/div/div[1]/div/div[3]/p[1]/span
	@ElementMap(how = How.XPATH, using = "//*[@id='mainContent']/div/div[1]/div/div[2]/div/div/div[1]/div/div[3]/p[1]/span")
	public UIElement orderIDLbl;
			
	
	//CANCELLED
	
	//Cancel Header
	@ElementMap(using = "/html/body/div[1]/div/div/div/div/div[1]/div/ul/li[4]/span[1]")
	public UIElement cancelHdr;
	
	//Send to Cancel Link (Footer)
	//*[@id="mainContent"]/div/div[2]/div/div[3]/div/div[4]/button
	@ElementMap(using = "//*[@id='mainContent']/div/div[2]/div/div[3]/div/div[4]/button")
	public UIElement cancelLink;
	
	//Other option - Cancelation Popup
	@ElementMap(using = "//*[@id='modal-body']/div[7]/div/span")
	public UIElement otherCancelOptn;
	
	//Other Textbox - Cancelation Popup
	@ElementMap(using = "//*[@id='OtherReasonText']/div/input")
	public UIElement otherCancelTextOptn;
	
	//OK - Cancelation popup
	@ElementMap(using = "/html/body/div[1]/div/div/div/div[2]/button[1]")
	public UIElement okCancelPopupBtn;
	
	//Cancel - Cancelation popup
	@ElementMap(using = "/html/body/div[1]/div/div/div/div[2]/button[2]")
	public UIElement cancelCancelPopBtn;
	
	
}
