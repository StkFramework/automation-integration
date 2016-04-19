package com.example.test.page;

import com.softtek.automation.anotations.ElementMap;
import com.softtek.automation.element.How;
import com.softtek.automation.element.UIElement;

public class MainPageLocator {

	@ElementMap(using = ".//*[@id='pagelet_welcome_box']/ul/li[1]/div/div/a")
	public UIElement main_page_nickname_link;

	@ElementMap(using = ".//*[@id='userNavigationLabel']")
	public UIElement main_page_user_nav_menu;

	@ElementMap(how = How.XPATH, using = ".//span[contains(text(),'Salir')]")
	public UIElement main_page_logout_menu_option;

}
