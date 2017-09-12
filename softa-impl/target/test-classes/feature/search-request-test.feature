@test
Feature: login-test	   
	
	#Background: Logon to app
	#Given I open application 'application1'
	#When I wait '5' seconds	
	
	
	@ignore
	Scenario: TC001 - Validate request searching
		Given I open application 'application1'
		When I wait '5' seconds	
			
		When I type text 'test' on element 'LoginPageView.userNameTxt'
		Then I type text 'XXXXX' on element 'LoginPageView.passwordTxt'
		And I click on 'LoginPageView.submitBtn'
		And I wait '10' seconds
		
		When I validate request search		
		
		And I wait '2' seconds
		And I close current application
	
	
	@test
	Scenario: TC002 - Validate request searching
		Given I open application 'application1'
		When I wait '5' seconds	