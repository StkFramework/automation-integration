@test
Feature: Campaign-test
	
	@test
	Scenario: TC003 - Edit a Template
		Given I open application 'applicationCampaign'
		When I Login as Franchise Manager
			And I click on 'CampaignPageView.campaignsBtn' with JS
			And I wait '15' seconds
		Then I click on 'CampaignPageView.createNewCampaignBtn'
			And I wait '10' seconds
		Then Select value 'English' from dropdown 'CampaignPageView.languageDrpdwn'
			And I Enter a Campaign Name on element 'CampaignPageView.campaignNameTxt'
		When I click on 'CampaignPageView.emailChannelBtn'
		Then I select the first Email from list
			And I type text 'Automated_smoke_test03' on element 'CampaignPageView.emailSubjectTxt'
		When I click on 'CampaignPageView.saveContinueBtn'
			And I wait '20' seconds
		Then I click on 'CampaignPageView.selectAllRestaurantsBtn'
			And I wait '2' seconds
			And I click on 'CampaignPageView.addFilterBtn'
			And Select value 'Name' from dropdown 'CampaignPageView.FieldsDrpdwn'
			And I type text 'Edy' on element 'CampaignPageView.filterValueTxt'
		Then I click on 'CampaignPageView.calculateAudienceBtn'
			And I wait '10' seconds
		When I click on 'CampaignPageView.saveContinueBtn'
			And I wait '10' seconds
		Then I click on 'CampaignPageView.brinkerTemplateBtn'
		When I click on 'CampaignPageView.saveContinueBtn'
			And I wait '10' seconds
		Then I click on 'CampaignPageView.contentBtn'
			And I wait '1' seconds
		Then I drag 'CampaignPageView.textBlockBtn' and drop it on 'CampaignPageView.editorHeader'
		Then I click on 'CampaignPageView.textElementToChange'
		Then I type text 'This is an automation Smoke Test' on element 'CampaignPageView.textElementToChange'
			And I wait '2' seconds
		Then I click on 'CampaignPageView.contentBtn'
			And I wait '2' seconds
		Then I move the mouse over the element 'CampaignPageView.editorBodyItem'
			And I wait '2' seconds
		When I click on 'CampaignPageView.removeImagefromTemplateBody'
		Then I click on 'CampaignPageView.okButtonModalWindow'
			And I wait '5' seconds
		When I drag 'CampaignPageView.imageBlockBtn' and drop it on 'CampaignPageView.editorBody'
		Then I click on 'CampaignPageView.imagePlaceholder'
		Then I upload the image 'NewTemplateBody.jpg'
			And I wait '15' seconds
		Then I click on 'CampaignPageView.saveContinueBtn'
			And I wait '15' seconds
			And I click on 'CampaignPageView.okButtonModalWindow'
			And I wait '15' seconds
		When I verify all sections are marked green
		Then I click on 'CampaignPageView.launchNowBtn'
			And I click on 'CampaignPageView.yesModalWindow'
			And I wait '10' seconds
		When I Search for launched Campaign
			And I wait '10' seconds
		Then I validate Status is 'Launched'
		Then I close current application
		
	@ignore
	Scenario: TC004 - Redeem Coupons after campaign has been cancelled
		Given I open application 'applicationCampaign'
		When I Login as Franchise Manager
			And I click on 'CampaignPageView.campaignsBtn'
			And I wait '15' seconds
		Then I click on 'CampaignPageView.createNewCampaignBtn'
			And I wait '5' seconds
		Then Select value 'English' from dropdown 'CampaignPageView.languageDrpdwn'
			And I Enter a Campaign Name on element 'CampaignPageView.campaignNameTxt'
		Then I click on 'CampaignPageView.campaignCouponsChk'
		When I click on 'CampaignPageView.emailChannelBtn'
		Then I select the first Email from list
			And I type text 'Automated_smoke_test_TC04' on element 'CampaignPageView.emailSubjectTxt'
		Then I set the End Date as today + 1 day, and End Time as '02:00 AM'
		When I click on 'CampaignPageView.saveContinueBtn'
			And I wait '20' seconds
		Then I click on 'CampaignPageView.selectAllRestaurantsBtn'
			And I wait '2' seconds
			And I click on 'CampaignPageView.addFilterBtn'
			And Select value 'Name' from dropdown 'CampaignPageView.FieldsDrpdwn'
			And I type text 'Edy' on element 'CampaignPageView.filterValueTxt'
		Then I click on 'CampaignPageView.calculateAudienceBtn'
			And I wait '10' seconds
		When I click on 'CampaignPageView.saveContinueBtn'
			And I wait '10' seconds
		Then I click on 'CampaignPageView.genericCouponsBtn'
			And I type text '4' on element 'CampaignPageView.maxAmountInput'
		Then I type text 'AutomationItem' on element 'CampaignPageView.offerNameInput'
			And I type text 'Automation Conditions' on element 'CampaignPageView.conditionsInput'
		Then I click on 'CampaignPageView.generateCouponsBtn' with JS
			And I wait '5' seconds
		Then I click on 'CampaignPageView.okButtonModalWindow'
			And I wait '2' seconds
		Then I click on 'CampaignPageView.continueBtn'
			And I wait '10' seconds
		Then I click on 'CampaignPageView.brinkerTemplateBtn'
		When I click on 'CampaignPageView.saveContinueBtn'
			And I wait '10' seconds
		Then I click on 'CampaignPageView.contentBtn'
			And I wait '1' seconds
		Then I drag 'CampaignPageView.scissorsBlockBtn' and drop it on 'CampaignPageView.editorBody'
			And I wait '5' seconds
			And I save the Coupon code
		Then I click on 'CampaignPageView.saveContinueBtn'
			And I wait '15' seconds
			And I click on 'CampaignPageView.okButtonModalWindow'
			And I wait '15' seconds
		When I verify all sections are marked green
		Then I click on 'CampaignPageView.launchNowBtn'
			And I click on 'CampaignPageView.yesModalWindow'
			And I wait '10' seconds
		When I Search for launched Campaign
		Then I validate Status is 'Launched'
		Then I click on 'CampaignPageView.cancelCampaignBtn'
			And I click on 'CampaignPageView.yesModalWindow'
			And I wait '5' seconds
		When I Search for launched Campaign
		Then I validate Status is 'Canceled'
		When I click on 'CampaignPageView.profileBtn'
		Then I click on 'CampaignPageView.logOutBtn'
		When I click on 'CampaignPageView.anotherAccountBtn'
			And I wait '240' seconds
		When I Login as Restaurant Manager
		Then I click on 'CampaignPageView.validateCouponsBtn'
		Then I validate the coupon
		Then I close current application
	
	@test
	Scenario: TC005 - Validate Spanish Languaje
		Given I open application 'applicationCampaign'
		When I Login as Franchise Manager
		Then I click on 'CampaignPageView.languageBtn'
			And I click on 'CampaignPageView.espaniolBtn'
			And I wait '10' seconds
		Then I validate Welcome Labels are in Spanish
		When I click on 'CampaignPageView.campaniasBtn'
			And I wait '15' seconds
		Then I click on 'CampaignPageView.crearNuevaCampaniaBtn'
			And I wait '5' seconds
		Then Select value 'Spanish' from dropdown 'CampaignPageView.languageDrpdwn'
			And I Enter a Campaign Name on element 'CampaignPageView.campaignNameTxt'
			And I validate Details labels are in Spanish
		When I click on 'CampaignPageView.emailChannelBtn'
		Then I select the first Email from list
			And I type text 'Automated_smoke_test_TC05' on element 'CampaignPageView.emailSubjectTxt'
			And I validate email labels are in Spanish
		When I click on 'CampaignPageView.guardarContinuarBtn'
			And I wait '20' seconds
		Then I click on 'CampaignPageView.addFilterBtn'
			And Select value 'Nombre' from dropdown 'CampaignPageView.FieldsDrpdwn'
			And I type text 'Edy' on element 'CampaignPageView.filterValueTxt'
			And I validate Audience labels are in Spanish
		When I click on 'CampaignPageView.guardarContinuarBtn'
			And I wait '10' seconds
		Then I click on 'CampaignPageView.plantillaBrinkerBtn'
			And I validate Select Template labels are in Spanish
		When I click on 'CampaignPageView.guardarContinuarBtn'
			And I wait '10' seconds
		Then I validate Edit Template labels are in Spanish
		When I click on 'CampaignPageView.guardarContinuarBtn'
			And I wait '15' seconds
			And I click on 'CampaignPageView.aceptarButtonModalWindow'
			And I wait '15' seconds
		When I verify all sections are marked green
			And I validate Summary labels are in Spanish
		Then I click on 'CampaignPageView.lanzarBtn'
			And I click on 'CampaignPageView.siModalWindow'
			And I wait '10' seconds
		When I Search for launched Campaign
		Then I validate Status is 'Lanzada'
		Then I close current application
		