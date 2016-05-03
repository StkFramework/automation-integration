@test
Feature: login-test	   
	
	#Background: Logon to app
	#Given I open application 'application1'
	#When I wait '5' seconds	
	
	
	@test
	Scenario: TC000 - Validate login in a step 
	Given I open application 'application1'
	When I wait '5' seconds		
	When I verify UI view 'LoginPageView'
	When I wait '5' seconds
	
	Then I close current application
	
	@ignore
	Scenario: TC001 - Check close app
	Given I open application 'application1'
	When I wait '5' seconds	
		
	Then I close current application
	
		
	@ignore
	Scenario: TC002 - Login wiht a valid user
		Given I open application 'application1'
		When I wait '5' seconds	
			
		When I type text 'xxxxxx' on element 'LoginPageView.userNameTxt'
		Then I type text 'xxxxxx' on element 'LoginPageView.passwordTxt'
		And I click on 'LoginPageView.submitBtn'
		And I wait '10' seconds
		And Element 'DashBoardPageView.mainHeader' has text 'Dashboard - Default'		
		And I wait '2' seconds
		And I close current application
	
	@ignore
	Scenario: TC003 - Validate login in a step 	
	When I validate dashboard
	 
	@ignore
	Scenario: TC004 - Login wiht a valid user
		Given I open application 'application1'
		When I wait '5' seconds	
			
		When I type text 'no.valid' on element 'LoginPageView.userNameTxt'
		Then I type text 'nopassword' on element 'LoginPageView.passwordTxt'
		And I click on 'LoginPageView.submitBtn'
		And I wait '5' seconds
		And Element 'LoginPageView.accessDeniedMssge' contains text 'Invalid username/password.'
		And I close current application
	
	