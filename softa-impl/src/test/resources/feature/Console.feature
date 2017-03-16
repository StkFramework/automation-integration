#Author: edy.espinoza@softtek.com
#Keywords Summary : E2E Scenarios for Smoke testing

#Prerequisites: 2 Orders must be completed on mobile app, and order ID must be added to Cache Context 

@test
Feature: Process an Order on Console
@test
Scenario: Search for an Order, Process it and Send it to Ready
Given I open application 'application2'
		And I initialize cache
#Login as Restaurant Manager
    Then I wait '1' seconds 
    Then I type text '#{cacheContext['RESTMGR']}' on element 'BrinkerLoginPageView.usernameTextBox'
    Then I type text '#{cacheContext['PASS']}' on element 'BrinkerLoginPageView.passwordTextBox'
    Then I wait '2' seconds 
    And I click on 'BrinkerLoginPageView.loginBtn'
#Open Console app
	Then I click on 'BrinkerConsolePageView.consoleBtn'
	And I wait '5' seconds
	
#Search Order
		Then I click on 'BrinkerConsolePageView.searchBtn'
		Then I type text '#{volatileContext['PROCESSORDERID']}' on element 'BrinkerConsolePageView.orderIDTxtBox'
		Then I wait '2' seconds 
    
 #Sent to In Process
    And I click on 'BrinkerConsolePageView.enteredInPOSBtn'
    Then I type text '12345' on element 'BrinkerConsolePageView.posIDTxtBox'
    And I click on 'BrinkerConsolePageView.okPopupBtn'
    And I wait '8' seconds 
     
 #Go to In Process   
		Then I click on 'BrinkerConsolePageView.inProcessHdr'
		And I wait '2' seconds
		Then I click on 'BrinkerConsolePageView.readyBtn'
#Send to Ready
		And I click on 'BrinkerConsolePageView.okPopupBtn'
		And I wait '8' seconds

#Go to Ready
		Then I click on 'BrinkerConsolePageView.readyHdr'
		And I click on 'BrinkerConsolePageView.orderIDLbl'
		And I wait '3' seconds


@test
Scenario: Search for an Order, Process it and Cancel lit
#Commented to run all Scenarios in a single run.
#Uncomment to run sepparately
#Given I open application 'application2'
#	#And I validate element content
#		And I initialize cache
##Login as Restaurant Manager
#    Then I wait '1' seconds 
#    Then I type text '#{cacheContext['USER']}' on element 'BrinkerLoginPageView.usernameTextBox'
#    Then I type text '#{cacheContext['PASS']}' on element 'BrinkerLoginPageView.passwordTextBox'
#    Then I wait '2' seconds 
#    And I click on 'BrinkerLoginPageView.loginBtn'

#Search Order
		Then I click on 'BrinkerConsolePageView.receivedHdr' 
		Then I click on 'BrinkerConsolePageView.closeSearchBtn'
		Then I click on 'BrinkerConsolePageView.searchBtn'
		Then I wait '1' seconds 
		Then I type text '#{cacheContext['CANCELORDERID']}' on element 'BrinkerConsolePageView.orderIDTxtBox'
	#Adding this additional step because a bug exists
		Then I click on 'BrinkerConsolePageView.receivedHdr' 
		Then I wait '2' seconds 
		
#Sent to In Process
    And I click on 'BrinkerConsolePageView.enteredInPOSBtn'
    Then I type text '12345' on element 'BrinkerConsolePageView.posIDTxtBox'
    And I click on 'BrinkerConsolePageView.okPopupBtn'
    And I wait '8' seconds 

 #Go to In Process 
 		Then I click on 'BrinkerConsolePageView.inProcessHdr'
		And I wait '2' seconds
		And I click on 'BrinkerConsolePageView.firstOrderLink'
		
#Cancel it
		Then I click on 'BrinkerConsolePageView.cancelLink'
		And I wait '2' seconds
		And I click on 'BrinkerConsolePageView.otherCancelOptn'
		And I type text 'Automation Testing Order' on element 'BrinkerConsolePageView.otherCancelTextOptn'
		And I click on 'BrinkerConsolePageView.okCancelPopupBtn'
		
#Go to Cancel
		Then I click on 'BrinkerConsolePageView.cancelHdr'
		And I click on 'BrinkerConsolePageView.orderIDLbl'
		
		And I close current application
		
		