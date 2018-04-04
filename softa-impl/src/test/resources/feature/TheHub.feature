@test
Feature: login-test	
	
	@test
	Scenario: TC001 - Validate login page elements 
		Given I open application 'the_hub'
		And I logged in successfully to hub using user 'User1'
		And I Reopen the application 'http://connections.staples.com/profiles/html/searchProfiles.do#simpleSearch'
		And I wait '10' seconds
		And I type text 'Devon Cox' on element 'HubProfilePageView.directorySearchTextBox'
	#	And I click on the email 'Pragati.Mathur@Staples.com'
		And I click on 'HubProfilePageView.nameProfileLink'
		And I wait '30' seconds
		When I Get the People Managed
		
		
		
		