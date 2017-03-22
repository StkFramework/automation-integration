@test
Feature: Campaign-test
	
	@test
	Scenario: TC001 - Copy Menu
		Given I open application 'applicationCMS'
		When I Login as Franchise Manager
		Then I click on 'CMSPageView.cmsBtn' with JS
			And I wait '5' seconds
		Then I click on 'CMSPageView.copyBtn'
			And I wait '2' seconds
		Then I Enter a new Menu name
		Then I close current application
		
	@test
	Scenario: TC002 - Edit Restaurant Settings 
		Given I open application 'applicationCMS'
		When I Login as Franchise Manager
		Then I click on 'CMSPageView.cmsBtn' with JS
			And I wait '5' seconds
		Then I click on 'CMSPageView.expandMenuBtn'
		Then I click on 'CMSPageView.franchiseRestaurantsBtn'
		Then I click on 'CMSPageView.firstRestaurantSettingsBtn'
		Then I Enter a Restaurant Schedule Monday - Sunday '10:00-22:00'
		Then I click on 'CMSPageView.serviceAccordionBtn'
			And I wait '2' seconds
			And I click on 'CMSPageView.kidsAreaBtn'
			And I click on 'CMSPageView.terraceBtn'
		Then I click on 'CMSPageView.deliveryMethodsAccordionBtn'
			And I wait '2' seconds
		Then I select To Go
			And I type text '30' on element 'CMSPageView.estimatedTimeTxt'
		Then I click on 'CMSPageView.applyChangesBtn' with JS
		Then I close current application
		
	@test
	Scenario: TC003 - Copy Global Menu
		Given I open application 'applicationCMS'
		When I Login as Franchise Manager
		Then I click on 'CMSPageView.cmsBtn' with JS
			And I wait '5' seconds
		Then I click on 'CMSPageView.expandMenuBtn'
		Then I click on 'CMSPageView.globalMenuBtn'
			And I wait '2' seconds
		When I click on 'CMSPageView.firstMenuToCopyBtn'
			And I wait '2' seconds
		Then I Enter a new Menu name
			And I wait '10' seconds
		Then I Select Restaurant for the saved menu
			And I wait '5' seconds
		When I type text 'Softtek Guadalajara' on element 'CMSPageView.unassignedRestaurantInput'
		Then I Select unassigned Restaurant 'Softtek Guadalajara'
			And I click on 'CMSPageView.assignBtn'
		Then I click on 'CMSPageView.yesAssignBtn'
		Then I click on 'CMSPageView.saveBtn'
		Then I close current application
		