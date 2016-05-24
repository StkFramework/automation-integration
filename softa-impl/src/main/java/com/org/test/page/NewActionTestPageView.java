package com.org.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.UIElement;

public class NewActionTestPageView {
	
	@ElementMap(using = "//*[@placeholder='Ingresa una ciudad u hotel']", verify = true )
	public static UIElement cityTxt;
	
	@ElementMap(using = "//*[@class='sbox-ui-button secondary sbox-search large']", verify = true )
	public static UIElement searchCitybtn;	
	
	@ElementMap(using = "//*[@class='sbox-ui-select sbox-rooms sbox-hotels-rooms']", verify = true )
	public static UIElement roomsDropdown;	
	
	@ElementMap(using = "//*[@class='sbox-ui-select sbox-single-room-adults sbox-hotels-single-room-adults']", verify = true )
	public static UIElement adultNumber;		
	
	@ElementMap(using = "//*[@class='sbox-no-date-specified sbox-hotels-no-specified-date']", verify = true )
	public static UIElement notDecideDateChkbox;		

}
