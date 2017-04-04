@test
Feature: Campaign-test

  @test
  Scenario: TC001 - Import Customer
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User1'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.customerDBImg'
    And I wait '10' seconds
    And Get the value 'Plaza Patio' from Restaurant and put with key 'Restaurant'
    And I click on 'CustomerPageView.importContactsLink'
    And Click on Browse button and Upload File:
      | Name File                 |
      | example_contacts-DOB.xlsx |
    And I wait '5' seconds
    And Select value 'Plaza Patio' from dropdown 'CustomerPageView.favoriteRestaurantDropdownList'
    And I click on 'CustomerPageView.importBtn'
    And Element 'CustomerPageView.textModal' has text 'Import process is taking place and will take some minutes to finish. Once it is over, you will receive an E-mail notification with the summary.'
    And Click on Ok Modal Window
    And I wait '5' seconds
    When I click on 'CustomerPageView.contactsDBLink'
    And I wait '5' seconds
    Then Validate the Total of Customer on the 'Plaza Patio' Franchise is updated
    And I close current application

  @test1
  Scenario: CAM002 - Create a Campaign Launch Now, with Generic Coupons
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.campaignsImg'
    And I wait '10' seconds
    And Create new Campaign
  #  And I click on 'CampaignsListPageView.createNewCampaignSection'
    And Select value 'English' from dropdown 'CampaignPageView.languageDrpdwn'
    And I type text 'AutomationTestCampaign2' on element 'CampaignPageView.campaignNameTxt'
    And Put text 'AutomationTestCampaign2' with key 'newCampaignName' in volatile context
    And I click on 'CampaignPageView.clickHereIfThisCampaignWillHaveCouponsChecktbox'
    And I click on 'CampaignPageView.emailChannelBtn'
    And Select the '1' option from dropdown 'CampaignPageView.fromNameDrpdwn'
    And I type text 'Test' on element 'CampaignPageView.emailSubjectTxt'
    And Set the End Date as today plus '1' day and End Time as Zero hours
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '15' seconds
    Then I click on 'CampaignPageView.selectAllRestaurantsBtn'
    And I wait '2' seconds
    And I click on 'CampaignPageView.addFilterBtn'
    And Select value 'Name' from dropdown 'CampaignPageView.FieldsDrpdwn'
    And I type text 'Edy' on element 'CampaignPageView.filterValueTxt'
    And I click on 'CampaignPageView.calculateAudienceBtn'
    And I wait '5' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '5' seconds
    And I click on 'CampaignPageView.couponGenericBtn'
    And I type text '10' on element 'CampaignPageView.maxAmountInput'
    And Put element 'SuggestedCode' value with key 'CampaignPageView.suggestedCodeInput' in volatile context
    And I type text '10 dll discount' on element 'CampaignPageView.offerNameInput'
    And I type text 'When the amount greater than 100 dll' on element 'CampaignPageView.conditionsInput'
    And I wait '10' seconds
    And I click on 'CampaignPageView.offerNameInput'
    And I move the mouse over the element 'CampaignPageView.generateCouponsBtn'
    And I wait '3' seconds
    And I click on 'CampaignPageView.generateCouponsBtn' with JS
    Then Element 'CampaignPageView.textModal' has text 'Your generic code was generated successfully.'
    And I click on 'CampaignPageView.okButtonModalWindow'
    And I wait '3' seconds
    And I click on 'CampaignPageView.continueBtn'
    And Select Template with the name 'Free Dessert'
    And I wait '3' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '10' seconds
    And I click on 'CampaignPageView.contentBtn' with JS
    And I wait '3' seconds
    When I drag 'CampaignPageView.imageBlockBtn' and drop it on 'CampaignPageView.editorBody'
    And I wait '3' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    Then Element 'CampaignPageView.textModal' has text 'Your template was successfully saved.'
    And I click on 'CampaignPageView.okButtonModalWindow'
    And I wait '10' seconds
    Then Once all the sections in the Summary Screen are marked GREEN
    And I click on 'CampaignPageView.couponsBtn'
    And Put element 'CampaignPageView.suggestedCodeSummaryLabel' text with key 'SuggestedCode' in volatile context
    And I click on 'CampaignPageView.launchNowBtn'
    Then Element 'CampaignPageView.textModal' has text 'Your campaign will be launched now'
    And I click on 'CampaignPageView.yesModalWindow'
    And I wait '5' seconds
    And I click on 'CampaignsListPageView.filterButton' with JS
    And I wait '5' seconds
    And Select the filber by 'Name'
    And I type text with key 'newCampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And Press Enter by Filter
    And I wait '10' seconds
    Then Validate the Status 'Launched' from key 'newCampaignName' Campaign Name
    And I close current application

  Scenario: CAM004 - Validate  a Coupon (as restaurant manager)
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User4'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.couponValidateImg'
    And I wait '10' seconds
    And Enter the value from cache context using the key 'SuggestedCode' and enter Coupon Code
    And I wait '5' seconds
    And I click on 'CouponValidatePageView.validateCouponButton' with JS
    Then Element 'CouponValidatePageView.redeemedText' has text 'Your Coupon Was Successfully Redeemed!'
    And I close current application

  Scenario: CAM006 - Validate Analytics (Coupons section)
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.campaignsImg'
    And I wait '5' seconds
    And I click on 'CampaignsListPageView.filterButton' with JS
    And I wait '5' seconds
    And Select the filber by 'Name'
    And I type text with key 'newCampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And Press Enter by Filter
    And I wait '6' seconds
    And Analytics the 'AutomationTestCampaign2' Campaign Name
    And I wait '5' seconds
    Then Element 'AnalyticsPageView.couponTypeText' has text 'Generic'
    Then Element 'AnalyticsPageView.redeemedText' has text '1'
    Then Element 'AnalyticsPageView.generatedText' has text '10'
    Then Element 'AnalyticsPageView.availableText' has text '9'
    And I close current application

  @test
  Scenario: CAM005 - Edit a Template
    Given I open application 'applicationCampaign'
    When I Login as Franchise Manager
    And I click on 'CampaignPageView.campaignsBtn' with JS
    And I wait '15' seconds
    Then I click on 'CampaignPageView.createNewCampaignBtn'
    And I wait '10' seconds
    Then Select value 'English' from dropdown 'CampaignPageView.languageDrpdwn'
    And I Enter a Campaign Name on element 'CampaignPageView.campaignNameTxt'
    When I click on 'CampaignPageView.emailChannelBtn'
    And Select the '1' option from dropdown 'CampaignPageView.fromNameDrpdwn'
    #	Then I select the first Email from list
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
    And I wait '3' seconds
    Then I move the mouse over the element 'CampaignPageView.editorBodyItem'
    And I wait '3' seconds
    When I click on 'CampaignPageView.removeImagefromTemplateBody'
    Then I click on 'CampaignPageView.okButtonModalWindow'
    And I wait '5' seconds
    When I drag 'CampaignPageView.imageBlockBtn' and drop it on 'CampaignPageView.editorBody'
    Then I click on 'CampaignPageView.imagePlaceholder'
    And I wait '5' seconds
    #	Then I upload the image 'NewTemplateBody.jpg'
    And Click on Browse button Category Image and Upload Image:
      | Name File | Oject Name                 |
      | Soup.jpg  | CampaignPageView.browseBtn |
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
    Then Validate the Status 'Launched' from key 'newCampaignName' Campaign Name
    #	Then I validate Status is 'Launched'
    Then I close current application

  @test
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
    And Select the '1' option from dropdown 'CampaignPageView.fromNameDrpdwn'
    #	Then I select the first Email from list
    And I type text 'Automated_smoke_test_TC04' on element 'CampaignPageView.emailSubjectTxt'
    And Set the End Date as today plus '1' day and End Time as Zero hours
    #  Then I set the End Date as today + 1 day, and End Time as '02:00 AM'
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
    Then Validate the Status 'Launched' from key 'newCampaignName' Campaign Name
    #  Then I validate Status is 'Launched'
    And Cancel the 'newCampaignName' Campaign Name from key
    # Then I click on 'CampaignPageView.cancelCampaignBtn'
    And I click on 'CampaignPageView.yesModalWindow'
    And I wait '5' seconds
    When I Search for launched Campaign
    Then Validate the Status 'Canceled' from key 'newCampaignName' Campaign Name
    #  Then I validate Status is 'Canceled'
    When I click on 'CampaignPageView.profileBtn'
    Then I click on 'CampaignPageView.logOutBtn'
    When I click on 'CampaignPageView.anotherAccountBtn'
    And I wait '240' seconds
    When I Login as Restaurant Manager
    Then I click on 'CampaignPageView.validateCouponsBtn'
    Then I validate the coupon
    Then I close current application

  @test
  Scenario: CAM010 - Validate Spanish Languaje
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
    And Select the '1' option from dropdown 'CampaignPageView.fromNameDrpdwn'
    #	Then I select the first Email from list
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
    Then Validate the Status 'Lanzada' from key 'newCampaignName' Campaign Name
    # Then I validate Status is 'Lanzada'
    Then I close current application

  Scenario: CAM007 - Create a Mobile Campaign
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.campaignsImg'
    And I wait '10' seconds
    And I click on 'CampaignsListPageView.createNewCampaignSection'
    And Select value 'English' from dropdown 'CampaignPageView.languageDrpdwn'
    And I type text 'AutomationMobileCampaign' on element 'CampaignPageView.campaignNameTxt'
    And Put text 'AutomationMobileCampaign' with key 'newCampaignName' in volatile context
    And I click on 'CampaignPageView.clickHereIfThisCampaignWillHaveCouponsChecktbox'
    And I click on 'CampaignPageView.clickOnMobileIconToSelectAndSetupBtn'
    And I type text 'AutomationPromotion' on element 'CampaignPageView.promotionNameInput'
    And I type text 'This is a test' on element 'CampaignPageView.promotionDescriptionTextarea'
    And I move the mouse over the element 'CampaignPageView.timeZoneDrpdwn'
    And Click on Browse button and Upload Image:
      | Name File           |
      | SpotLight_Image.jpg |
    And Set the End Date as today plus '1' day and End Time as Zero hours
    And I wait '5' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '10' seconds
    And I click on 'CampaignPageView.clearAllLink'
    And Select 'Paseo Chapultepec' checkbox from Restaurant list
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '5' seconds
    And I click on 'CampaignPageView.couponGenericBtn'
    And I type text '1000' on element 'CampaignPageView.maxAmountInput'
    And Put element 'SuggestedCode' value with key 'CampaignPageView.suggestedCodeInput' in volatile context
    And I type text '10 dll discount' on element 'CampaignPageView.offerNameInput'
    And I type text 'When the amount graether than 100 dll' on element 'CampaignPageView.conditionsInput'
    And I wait '10' seconds
    And I click on 'CampaignPageView.offerNameInput'
    And I move the mouse over the element 'CampaignPageView.generateCouponsBtn'
    And I wait '3' seconds
    And I click on 'CampaignPageView.generateCouponsBtn' with JS
    Then Element 'CampaignPageView.textModal' has text 'Your generic code was generated successfully.'
    And I click on 'CampaignPageView.okButtonModalWindow'
    And I wait '3' seconds
    And I click on 'CampaignPageView.continueBtn'
    And Select Template with the name 'Free Dessert'
    And I wait '3' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '10' seconds
    And I click on 'CampaignPageView.contentBtn' with JS
    And I wait '3' seconds
    When I drag 'CampaignPageView.imageBlockBtn' and drop it on 'CampaignPageView.editorBody'
    And I wait '3' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    Then Element 'CampaignPageView.textModal' has text 'Your template was successfully saved.'
    And I click on 'CampaignPageView.okButtonModalWindow'
    And I wait '10' seconds
    Then Once all the sections in the Summary Screen are marked GREEN
    And I click on 'CampaignPageView.couponsBtn'
    And Put element 'CampaignPageView.suggestedCodeSummaryLabel' text with key 'SuggestedCode' in volatile context
    And I click on 'CampaignPageView.launchNowBtn'
    Then Element 'CampaignPageView.textModal' has text 'Your campaign will be launched now'
    And I click on 'CampaignPageView.yesModalWindow'
    And I wait '5' seconds
    And I click on 'CampaignsListPageView.filterButton' with JS
    And I wait '5' seconds
    And Select the filber by 'Name'
    And I type text with key 'newCampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And Press Enter by Filter
    And I wait '10' seconds
    Then Validate the Status 'Launched' from key 'newCampaignName' Campaign Name
    And I close current application

  Scenario: CAM003 - Create a Campaign, Scheduled, with Generic Coupons
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.campaignsImg'
    And I wait '10' seconds
    And I click on 'CampaignsListPageView.createNewCampaignSection'
    And Select value 'English' from dropdown 'CampaignPageView.languageDrpdwn'
    And I type text 'AutomationTestCampaign2' on element 'CampaignPageView.campaignNameTxt'
    And Put text 'AutomationTestCampaign2' with key 'newCampaignName' in volatile context
    And I click on 'CampaignPageView.clickHereIfThisCampaignWillHaveCouponsChecktbox'
    And I click on 'CampaignPageView.emailChannelBtn'
    And Select the '1' option from dropdown 'CampaignPageView.fromNameDrpdwn'
    And I type text 'Test' on element 'CampaignPageView.emailSubjectTxt'
    And I move the mouse over the element 'CampaignPageView.monthlyRadioBtn'
    And I click on 'CampaignPageView.everydayRadioBtn'
    And Set the Start Date as today and Start Time as Current time '2' hours more
    And Set the End Date as today plus '1' day and End Time as Zero hours
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '15' seconds
    Then I click on 'CampaignPageView.selectAllRestaurantsBtn'
    And I wait '2' seconds
    And I click on 'CampaignPageView.addFilterBtn'
    And Select value 'Name' from dropdown 'CampaignPageView.FieldsDrpdwn'
    And I type text 'Edy' on element 'CampaignPageView.filterValueTxt'
    And I click on 'CampaignPageView.calculateAudienceBtn'
    And I wait '5' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '5' seconds
    And I click on 'CampaignPageView.couponGenericBtn'
    And I type text '10' on element 'CampaignPageView.maxAmountInput'
    And Put element 'SuggestedCode' value with key 'CampaignPageView.suggestedCodeInput' in volatile context
    And I type text '10 dll discount' on element 'CampaignPageView.offerNameInput'
    And I type text 'When the amount greater than 100 dll' on element 'CampaignPageView.conditionsInput'
    And I wait '10' seconds
    And I click on 'CampaignPageView.offerNameInput'
    And I move the mouse over the element 'CampaignPageView.generateCouponsBtn'
    And I wait '3' seconds
    And I click on 'CampaignPageView.generateCouponsBtn' with JS
    Then Element 'CampaignPageView.textModal' has text 'Your generic code was generated successfully.'
    And I click on 'CampaignPageView.okButtonModalWindow'
    And I wait '3' seconds
    And I click on 'CampaignPageView.continueBtn'
    And Select Template with the name 'Free Dessert'
    And I wait '3' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    And I wait '10' seconds
    And I click on 'CampaignPageView.contentBtn' with JS
    And I wait '3' seconds
    When I drag 'CampaignPageView.imageBlockBtn' and drop it on 'CampaignPageView.editorBody'
    And I wait '3' seconds
    And I click on 'CampaignPageView.saveContinueBtn'
    Then Element 'CampaignPageView.textModal' has text 'Your template was successfully saved.'
    And I click on 'CampaignPageView.okButtonModalWindow'
    And I wait '10' seconds
    Then Once all the sections in the Summary Screen are marked GREEN
    And I click on 'CampaignPageView.couponsBtn'
    And Put element 'CampaignPageView.suggestedCodeSummaryLabel' text with key 'SuggestedCode' in volatile context
    And I click on 'CampaignPageView.launchNowBtn'
    Then Element 'CampaignPageView.textModal' has text 'Your campaign will be launched now'
    And I click on 'CampaignPageView.yesModalWindow'
    And I wait '5' seconds
    And I click on 'CampaignsListPageView.filterButton' with JS
    And I wait '5' seconds
    And Select the filber by 'Name'
    And I type text with key 'newCampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And Press Enter by Filter
    And I wait '10' seconds
    Then Validate the Status 'Launched' from key 'newCampaignName' Campaign Name
    And I close current application

  Scenario: CAM008 - Extend a Campaign
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.campaignsImg'
    And I wait '5' seconds
    And I click on 'CampaignsListPageView.filterButton' with JS
    And I wait '5' seconds
    And Select the filber by 'Name'
    And I type text with key 'newCampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And I wait '2' seconds
    And Press Enter by Filter
    And I wait '5' seconds
    And Edit the 'newCampaignName' Campaign Name from key
    And I wait '5' seconds
    And Set the End Date as today plus '3' day and End Time as Zero hours
    And I click on 'CampaignPageView.saveContinueBtn'
    Then Element 'CampaignPageView.textModal' has text 'Campaign updated successfully.'
    And I click on 'CampaignPageView.okButtonModalWindow'
    And I wait '10' seconds
    And I click on 'CampaignPageView.skipBtn'
    And I wait '5' seconds
    And I click on 'CampaignPageView.continueBtn'
    And I wait '5' seconds
    And I click on 'CampaignPageView.skipBtn'
    And I wait '5' seconds
    Then Once all the sections in the Summary Screen are marked GREEN
    And I click on 'CampaignPageView.saveAndContinueSummaryBtn'
    And I wait '5' seconds
    And I click on 'CampaignsListPageView.filterButton' with JS
    And I wait '5' seconds
    And Select the filber by 'Name'
    And I type text with key 'newCampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And I wait '2' seconds
    And Press Enter by Filter
    And I wait '5' seconds
    Then Validate the Status 'Extended' from key 'newCampaignName' Campaign Name
    And I close current application

    
    Scenario: CMS004 - Create a Global Menu
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.cmsImg'
    And I wait '10' seconds
    And I click on 'MenusCmrPageView.addMenuButton'
    And I type text 'MenuAutomation' on element 'MenusCmrPageView.menuNameTextbox'
    And Put text 'MenuAutomation' with key 'MENUNAME' in volatile context
    And I click on 'MenusCmrPageView.menuDescriptionFirstRow'
    And I type text 'Menu Automation Description' on element 'MenusCmrPageView.descriptionTextarea'
    And Put text 'Menu Automation Description' with key 'DESCRIPTION' in volatile context
    And I click on 'MenusCmrPageView.menuStatusFirstRow'
    And I click on 'MenusCmrPageView.downArrowStatusFirstRow'
    And I click on 'MenusCmrPageView.activeLink'
    And I click on 'MenusCmrPageView.applyChangesButton'

  Scenario: CMS005 - Create a Category
    And I wait '10' seconds
    And I click on Categories for the Menu just created Menu Name 'MENUNAME' and Description 'DESCRIPTION' key
    And I wait '10' seconds
    And I click on 'MenuCategoriesPageView.addCategoryButton'
    And I wait '3' seconds
    And I type text 'CategoryAutomation' on element 'MenuCategoriesPageView.categoryNameTextbox'
    And I click on 'MenuCategoriesPageView.applyChangesButton'
    And I wait '10' seconds
    And Put text 'CategoryAutomation' with key 'CATEGORY' in volatile context
 #   And I move the mouse over the element 'MenuCategoriesPageView.categoryImagesFirstRow'
    And Click on Browse button Category Image and Upload Image:
      | Name File | Oject Name                                       |
      | Soup.jpg  | MenuCategoriesPageView.categoryImagesFirstRow |
    And I click on 'MenuCategoriesPageView.categoryStatusFirstRow'
    And I click on 'MenuCategoriesPageView.downArrowStatusFirstRow'
    And I wait '3' seconds
    And I click on 'MenuCategoriesPageView.activeLink'
    And I click on 'MenuCategoriesPageView.orderingEnabledFirstRow'
    And I click on 'MenuCategoriesPageView.downArrowOrderingEnabledFirstRow'
    And I click on 'MenuCategoriesPageView.enabledLink'
    And I click on 'MenuCategoriesPageView.applyChangesButton'
    And I wait '10' seconds

  Scenario: CMS006 - Create an Item
    And I wait '10' seconds
    And I click on 'MenuCategoriesPageView.itemsFirtRowButton'
    And I wait '10' seconds
    And I click on 'MenuItemsPageView.addItemButton'
    And I type text 'ItemAutomation' on element 'MenuItemsPageView.itemNameTextbox'
    And I click on 'MenuItemsPageView.descriptionFirstRow'
    And I type text 'Item Description Automation' on element 'MenuItemsPageView.descriptionTextarea'
    And I click on 'MenuItemsPageView.priceFirstRow'
    And I wait '2' seconds
  #  And I type text '15.50' Price with JS and Perform
    And I type text '15.50' on element 'MenuItemsPageView.priceTextbox'
    And I click on 'MenuItemsPageView.categoryItemFirstRow'
    And I click on 'MenuItemsPageView.downArrowCategoryFirstRow'
    And I wait '2' seconds
    And Select the Category from the key 'CATEGORY'
 #   And I move the mouse over the element 'MenuItemsPageView.itemImagesFirstRow'
    And Click on Browse button Item Image and Upload Image:
      | Name File | Oject Name                              |
      | Soup.jpg  | MenuItemsPageView.itemImagesFirstRow |
    And I click on 'MenuItemsPageView.itemStatusFirstRow'
    And I click on 'MenuItemsPageView.downArrowStatusFirstRow'
    And I wait '2' seconds
    And I click on 'MenuItemsPageView.activeLink'
    And I click on 'MenuItemsPageView.orderingEnabledFirstRow'
    And I click on 'MenuItemsPageView.downArrowOrderingEnabledFirstRow'
    And I wait '2' seconds
    And I click on 'MenuItemsPageView.enabledLink'
    And I click on '..applyChangesButton'
    
    
    