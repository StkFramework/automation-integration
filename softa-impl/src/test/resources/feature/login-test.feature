@test
Feature: login-test	   
	
	Background: Logon to app
	Given I open application 'application1'
	When I wait '5' seconds	
	
	@ignore
	Scenario: TC001 - Check close app	
	Then I close current application
	
		
	@ignore
	Scenario: TC002 - Login wiht a valid user		
		When I type text 'jose.san' on element 'LoginPageLocator.userNameTxt'
		Then I type text 'XXXXXXX' on element 'LoginPageLocator.passwordTxt'
		And I click on 'LoginPageLocator.submitBtn'
		And I wait '10' seconds
		And Element 'DashBoardPageView.mainHeader' has text 'Dashboard222 - Default'
		And I wait '2' seconds
		And I close current application
		
	 
	@test
	Scenario: TC003 - Login wiht a valid user		
		When I type text 'no.valid' on element 'LoginPageLocator.userNameTxt'
		Then I type text 'nopassword' on element 'LoginPageLocator.passwordTxt'
		And I click on 'LoginPageLocator.submitBtn'
		And I wait '5' seconds
		And Element 'LoginPageLocator.accessDeniedMssge' contains text 'Invalid username/password.'
		And I close current application
	
	