@test
Feature: main-page-test
	
	
	Background: Logon to app
	Given I open app main page
	When I wait '10' seconds
	Then Login page is shown 
	And I try to login with user "user1"
	And I wait '10' seconds
	And I verify main page is shown
	
	
	@test
	Scenario: TC001 - Verify nickname
	When I verify user nickname  
	Then I wait '5' seconds
	
	
	@test
	Scenario: TC001 - Do logout
	When I do logout  
	And I wait '5' seconds
	Then 'logout_message' is displayed
	