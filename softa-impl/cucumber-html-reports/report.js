$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Campaign-test.feature");
formatter.feature({
  "line": 2,
  "name": "Campaign-test",
  "description": "",
  "id": "campaign-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 28,
  "name": "CAM002 - Create a Campaign Launch Now, with Generic Coupons",
  "description": "",
  "id": "campaign-test;cam002---create-a-campaign-launch-now,-with-generic-coupons",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I open application \u0027applicationCampaign\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I logged in successfully to Brinker using user \u0027User2\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on \u0027BrinkerLandingPageView.campaignsImg\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I wait \u002710\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Create new Campaign",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 35,
      "value": "#  And I click on \u0027CampaignsListPageView.createNewCampaignSection\u0027"
    }
  ],
  "line": 36,
  "name": "Select value \u0027English\u0027 from dropdown \u0027CampaignPageView.languageDrpdwn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I type text \u0027AutomationTestCampaign2\u0027 on element \u0027CampaignPageView.newCampaignNameTxt\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Put text \u0027AutomationTestCampaign2\u0027 with key \u0027newCampaignName\u0027 in volatile context",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on \u0027CampaignPageView.clickHereIfThisCampaignWillHaveCouponsChecktbox\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on \u0027CampaignPageView.emailChannelBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Select the \u00271\u0027 option from dropdown \u0027CampaignPageView.fromNameDrpdwn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I type text \u0027Test\u0027 on element \u0027CampaignPageView.emailSubjectTxt\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Set the End Date as today plus \u00271\u0027 day and End Time as Zero hours",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I click on \u0027CampaignPageView.saveContinueBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I wait \u002715\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click on \u0027CampaignPageView.selectAllRestaurantsBtn\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I click on \u0027CampaignPageView.addFilterBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Select value \u0027Name\u0027 from dropdown \u0027CampaignPageView.FieldsDrpdwn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "I type text \u0027Edy\u0027 on element \u0027CampaignPageView.filterValueTxt\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I click on \u0027CampaignPageView.calculateAudienceBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click on \u0027CampaignPageView.saveContinueBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click on \u0027CampaignPageView.couponGenericBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I type text \u002710\u0027 on element \u0027CampaignPageView.maxAmountInput\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Put element \u0027SuggestedCode\u0027 value with key \u0027CampaignPageView.suggestedCodeInput\u0027 in volatile context",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I type text \u002710 dll discount\u0027 on element \u0027CampaignPageView.offerNameInput\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I type text \u0027When the amount greater than 100 dll\u0027 on element \u0027CampaignPageView.conditionsInput\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "I wait \u002710\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I click on \u0027CampaignPageView.offerNameInput\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I move the mouse over the element \u0027CampaignPageView.generateCouponsBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "I click on \u0027CampaignPageView.generateCouponsBtn\u0027 with JS",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Element \u0027CampaignPageView.textModal\u0027 has text \u0027Your generic code was generated successfully.\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "I click on \u0027CampaignPageView.okButtonModalWindow\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "I click on \u0027CampaignPageView.continueBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Select Template with the name \u0027Free Dessert\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "I click on \u0027CampaignPageView.saveContinueBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "I wait \u002710\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "I click on \u0027CampaignPageView.contentBtn\u0027 with JS",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "I drag \u0027CampaignPageView.imageBlockBtn\u0027 and drop it on \u0027CampaignPageView.editorBody\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 76,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "I click on \u0027CampaignPageView.saveContinueBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "Element \u0027CampaignPageView.textModal\u0027 has text \u0027Your template was successfully saved.\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "I click on \u0027CampaignPageView.okButtonModalWindow\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "I wait \u002710\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "Once all the sections in the Summary Screen are marked GREEN",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "I click on \u0027CampaignPageView.couponsBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "Put element \u0027CampaignPageView.suggestedCodeSummaryLabel\u0027 text with key \u0027SuggestedCode\u0027 in volatile context",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "I click on \u0027CampaignPageView.launchNowBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Element \u0027CampaignPageView.textModal\u0027 has text \u0027Your campaign will be launched now\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "I click on \u0027CampaignPageView.yesModalWindow\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "I click on \u0027CampaignsListPageView.filterButton\u0027 with JS",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "Select the filber by \u0027Name\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "I type text with key \u0027newCampaignName\u0027 on element \u0027CampaignsListPageView.filterTextbox\u0027 using cache context",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "Press Enter by Filter",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I wait \u002710\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "Validate the Status \u0027Launched\u0027 from key \u0027newCampaignName\u0027 Campaign Name",
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "I close current application",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "applicationCampaign",
      "offset": 20
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_open_application(String)"
});
formatter.result({
  "duration": 5250111904,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User2",
      "offset": 48
    }
  ],
  "location": "BrinkerLoginTestSteps.i_logged_and_navigate_to_maggie_using_user(String)"
});
formatter.result({
  "duration": 14167813606,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "duration": 3000152265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerLandingPageView.campaignsImg",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 6780344930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "duration": 10000066954,
  "status": "passed"
});
formatter.match({
  "location": "CampaignListTestSteps.create_new_campaing()"
});
formatter.result({
  "duration": 22173996547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 14
    },
    {
      "val": "CampaignPageView.languageDrpdwn",
      "offset": 38
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.select_value_from_dropdown_element(String,String)"
});
formatter.result({
  "duration": 373871172,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutomationTestCampaign2",
      "offset": 13
    },
    {
      "val": "CampaignPageView.newCampaignNameTxt",
      "offset": 50
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 1266178,
  "error_message": "java.lang.Exception: Field \"newCampaignNameTxt\" doesn\u0027t exists in class \"com.org.test.page.CampaignPageView\"\r\n\tat com.softtek.automation.element.BasicUIElementFactory.getUIElementFromViewFields(BasicUIElementFactory.java:125)\r\n\tat com.softtek.automation.element.BasicUIElementFactory.createUIElementInstance(BasicUIElementFactory.java:81)\r\n\tat com.softtek.automation.element.BasicUIElementFactory.createElement(BasicUIElementFactory.java:35)\r\n\tat com.softtek.automation.steps.cucumber.CucumberCommonUIStepsAdapter.i_type_text_on(CucumberCommonUIStepsAdapter.java:45)\r\n\tat ✽.And I type text \u0027AutomationTestCampaign2\u0027 on element \u0027CampaignPageView.newCampaignNameTxt\u0027(src/test/resources/feature/Campaign-test.feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutomationTestCampaign2",
      "offset": 10
    },
    {
      "val": "newCampaignName",
      "offset": 45
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.put_text_in_volatile_context(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.clickHereIfThisCampaignWillHaveCouponsChecktbox",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.emailChannelBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 12
    },
    {
      "val": "CampaignPageView.fromNameDrpdwn",
      "offset": 37
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.select_value_option_from_dropdown_element(int,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 13
    },
    {
      "val": "CampaignPageView.emailSubjectTxt",
      "offset": 31
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 32
    }
  ],
  "location": "CampaignTestSteps.Set_the_End_Date_as_today_plus_one_day_and_End_Time_as_Zero_hours(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.saveContinueBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "15",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.selectAllRestaurantsBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.addFilterBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 14
    },
    {
      "val": "CampaignPageView.FieldsDrpdwn",
      "offset": 35
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.select_value_from_dropdown_element(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Edy",
      "offset": 13
    },
    {
      "val": "CampaignPageView.filterValueTxt",
      "offset": 30
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.calculateAudienceBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.saveContinueBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.couponGenericBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 13
    },
    {
      "val": "CampaignPageView.maxAmountInput",
      "offset": 29
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SuggestedCode",
      "offset": 13
    },
    {
      "val": "CampaignPageView.suggestedCodeInput",
      "offset": 44
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.put_element_value_in_volatile_context(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10 dll discount",
      "offset": 13
    },
    {
      "val": "CampaignPageView.offerNameInput",
      "offset": 42
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "When the amount greater than 100 dll",
      "offset": 13
    },
    {
      "val": "CampaignPageView.conditionsInput",
      "offset": 63
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.offerNameInput",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.generateCouponsBtn",
      "offset": 35
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.move_mouse_over_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.generateCouponsBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element_with_JS(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.textModal",
      "offset": 9
    },
    {
      "val": "Your generic code was generated successfully.",
      "offset": 47
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.element_has_text(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.okButtonModalWindow",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.continueBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Free Dessert",
      "offset": 31
    }
  ],
  "location": "CampaignTestSteps.select_template_with_the_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.saveContinueBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.contentBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element_with_JS(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.imageBlockBtn",
      "offset": 8
    },
    {
      "val": "CampaignPageView.editorBody",
      "offset": 56
    }
  ],
  "location": "CampaignTestSteps.drag_and_drop(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.saveContinueBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.textModal",
      "offset": 9
    },
    {
      "val": "Your template was successfully saved.",
      "offset": 47
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.element_has_text(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.okButtonModalWindow",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CampaignTestSteps.once_all_the_section_in_the_summary_screen_are_marked_green()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.couponsBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.suggestedCodeSummaryLabel",
      "offset": 13
    },
    {
      "val": "SuggestedCode",
      "offset": 72
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.put_element_text_in_volatile_context(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.launchNowBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.textModal",
      "offset": 9
    },
    {
      "val": "Your campaign will be launched now",
      "offset": 47
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.element_has_text(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.yesModalWindow",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignsListPageView.filterButton",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element_with_JS(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 22
    }
  ],
  "location": "CampaignTestSteps.select_the_filter_by(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "newCampaignName",
      "offset": 22
    },
    {
      "val": "CampaignsListPageView.filterTextbox",
      "offset": 51
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_with_key_on_element_using_cache_context(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CampaignTestSteps.select_filter_textbox_and_press_enter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Launched",
      "offset": 21
    },
    {
      "val": "newCampaignName",
      "offset": 41
    }
  ],
  "location": "CampaignTestSteps.validate_the_status_from_key_campaign_name(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CucumberCommonAppStepsAdapter.i_close_current_application()"
});
formatter.result({
  "status": "skipped"
});
});