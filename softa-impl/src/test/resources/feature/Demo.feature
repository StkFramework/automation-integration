@Demo
Feature: Demo
  As I user I want to present a demo for Brinker Project

  Background: 
    Given I open application 'applicationCampaign'
    And I close current application

  
  Scenario: CAM001 - Import Customer
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.customerDBImg'
    And I wait '10' seconds
    And Get the value 'Softtek Ensenada' from Restaurant and put with key 'Restaurant'
    And I click on 'CustomerPageView.importContactsLink'
    And Click on Browse button and Upload File:
      | Name File                 |
      | example_contacts-DOB.xlsx |
    And I wait '5' seconds
    And Select value 'Softtek Ensenada' from dropdown 'CustomerPageView.favoriteRestaurantDrpdwn'
    And I click on 'CustomerPageView.importBtn'
    And Element 'CustomerPageView.textModal' has text 'Import process is taking place and will take some minutes to finish. Once it is over, you will receive an E-mail notification with the summary.'
    And Click on Ok Modal Window
    And I wait '5' seconds
    When I click on 'CustomerPageView.contactsDBLink'
    And I wait '10' seconds
    Then Validate the Total of Customer on the 'Softtek Ensenada' Franchise is updated
    And I close current application
 
  Scenario: CAM002 - Create a Campaign Launch Now, with Generic Coupons
    Given I open application 'applicationCampaign'
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.campaignsImg'
    And I wait '10' seconds
    And I click on 'CampaignsListPageView.createNewCampaignSection'
    And Select value 'English' from dropdown 'CampaignPageView.languageDrpdwn'
    And I type text 'AutomationTestCampaign2' on element 'CampaignPageView.campaignNameTxt'
    And Put text 'AutomationTestCampaign2' with key 'CampaignName' in volatile context
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
    And Drag the button scissors icon and Drop it anywhere over the template
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
    And I type text with key 'CampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And Press Enter by Filter
    And I wait '10' seconds
    Then Validate the Status 'Launched' from key 'CampaignName' Campaign Name
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
    And I type text with key 'CampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And Press Enter by Filter
    And I wait '6' seconds
    And Analytics the 'AutomationTestCampaign2' Campaign Name
    And I wait '5' seconds
    Then Element 'AnalyticsPageView.couponTypeText' has text 'Generic'
    Then Element 'AnalyticsPageView.redeemedText' has text '1'
    Then Element 'AnalyticsPageView.generatedText' has text '10'
    Then Element 'AnalyticsPageView.availableText' has text '9'
    And I close current application

  Scenario: CAM008 - Extend a Campaign
    Given I open application 'applicationCampaign'
    And Put text 'AutomationTestCampaign2' with key 'CampaignName' in volatile context
    Given I logged in successfully to Brinker using user 'User2'
    And I wait '3' seconds
    And I click on 'BrinkerLandingPageView.campaignsImg'
    And I wait '5' seconds
    And I click on 'CampaignsListPageView.filterButton' with JS
    And I wait '5' seconds
    And Select the filber by 'Name'
    And I type text with key 'CampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And I wait '2' seconds
    And Press Enter by Filter
    And I wait '5' seconds
    And Edit the 'CampaignName' Campaign Name from key
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
    And I type text with key 'CampaignName' on element 'CampaignsListPageView.filterTextbox' using cache context
    And I wait '2' seconds
    And Press Enter by Filter
    And I wait '5' seconds
    Then Validate the Status 'Extended' from key 'CampaignName' Campaign Name
    And I close current application
