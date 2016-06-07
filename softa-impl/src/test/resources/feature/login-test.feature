@test
Feature: login-test	
	
	@test
	Scenario: TC001 - Validate login page elements 
		Given I open application 'application1'
		#When I wait '5' seconds		
		When I verify UI view 'LoginPageView'
		
		#When I wait '5' seconds	
		
		
	@test
	Scenario: TC002 - Login wiht a valid user
		Given I type text 'jose.san' on element 'LoginPageView.userNameTxt'
		When I type text 'TePa181115' on element 'LoginPageView.passwordTxt'
		Then I click on 'LoginPageView.submitBtn'
		#And I wait '10' seconds
		And Element 'DashBoardPageView.mainHeader' has text 'Dashboard - Default'		
		#And I wait '2' seconds
		And I click on 'DashBoardPageView.logoutLink'
		
	
	@test
	Scenario: TC003 - Login wiht a no valid user
		#Given I wait '5' seconds			
		When I type text 'no.valid' on element 'LoginPageView.userNameTxt'
		Then I type text 'nopassword' on element 'LoginPageView.passwordTxt'
		And I click on 'LoginPageView.submitBtn'
		#And I wait '5' seconds
		And Element 'LoginPageView.accessDeniedMssge' contains text 'Invalid username/password.'
		And I close current application
	
	@ignore
	Scenario: TC004 - Validate login and dashboard acces in one step
	#Given I open application 'application1' 	
	When I validate dashboard	
	#Then I close current application