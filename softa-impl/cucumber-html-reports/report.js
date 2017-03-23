$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Demo.feature");
formatter.feature({
  "line": 2,
  "name": "Demo",
  "description": "As I user I want to present a demo for Brinker Project",
  "id": "demo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Demo"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open application \u0027applicationCampaign\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
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
  "duration": 9385094607,
  "status": "passed"
});
formatter.match({
  "location": "CucumberCommonAppStepsAdapter.i_close_current_application()"
});
formatter.result({
  "duration": 1143415292,
  "status": "passed"
});
formatter.scenario({
  "line": 132,
  "name": "CAM008 - Extend a Campaign",
  "description": "",
  "id": "demo;cam008---extend-a-campaign",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 133,
  "name": "I open application \u0027applicationCampaign\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 134,
  "name": "Put text \u0027AutomationTestCampaign2\u0027 with key \u0027CampaignName\u0027 in volatile context",
  "keyword": "And "
});
formatter.step({
  "line": 135,
  "name": "I logged in successfully to Brinker using user \u0027User2\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 136,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "I click on \u0027BrinkerLandingPageView.campaignsImg\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 138,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 139,
  "name": "I click on \u0027CampaignsListPageView.filterButton\u0027 with JS",
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 141,
  "name": "Select the filber by \u0027Name\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 142,
  "name": "I type text with key \u0027CampaignName\u0027 on element \u0027CampaignsListPageView.filterTextbox\u0027 using cache context",
  "keyword": "And "
});
formatter.step({
  "line": 143,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 144,
  "name": "Press Enter by Filter",
  "keyword": "And "
});
formatter.step({
  "line": 145,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 146,
  "name": "Edit the \u0027CampaignName\u0027 Campaign Name from key",
  "keyword": "And "
});
formatter.step({
  "line": 147,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 148,
  "name": "Set the End Date as today plus \u00273\u0027 day and End Time as Zero hours",
  "keyword": "And "
});
formatter.step({
  "line": 149,
  "name": "I click on \u0027CampaignPageView.saveContinueBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 150,
  "name": "Element \u0027CampaignPageView.textModal\u0027 has text \u0027Campaign updated successfully.\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 151,
  "name": "I click on \u0027CampaignPageView.okButtonModalWindow\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 152,
  "name": "I wait \u002710\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 153,
  "name": "I click on \u0027CampaignPageView.skipBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 154,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 155,
  "name": "I click on \u0027CampaignPageView.continueBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 156,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 157,
  "name": "I click on \u0027CampaignPageView.skipBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 158,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 159,
  "name": "Once all the sections in the Summary Screen are marked GREEN",
  "keyword": "Then "
});
formatter.step({
  "line": 160,
  "name": "I click on \u0027CampaignPageView.saveAndContinueSummaryBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 161,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 162,
  "name": "I click on \u0027CampaignsListPageView.filterButton\u0027 with JS",
  "keyword": "And "
});
formatter.step({
  "line": 163,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 164,
  "name": "Select the filber by \u0027Name\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 165,
  "name": "I type text with key \u0027CampaignName\u0027 on element \u0027CampaignsListPageView.filterTextbox\u0027 using cache context",
  "keyword": "And "
});
formatter.step({
  "line": 166,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 167,
  "name": "Press Enter by Filter",
  "keyword": "And "
});
formatter.step({
  "line": 168,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 169,
  "name": "Validate the Status \u0027Extended\u0027 from key \u0027CampaignName\u0027 Campaign Name",
  "keyword": "Then "
});
formatter.step({
  "line": 170,
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
  "duration": 11147969187,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AutomationTestCampaign2",
      "offset": 10
    },
    {
      "val": "CampaignName",
      "offset": 45
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.put_text_in_volatile_context(String,String)"
});
formatter.result({
  "duration": 8936087,
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
  "duration": 5238198291,
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
  "duration": 3000411978,
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
  "duration": 11992202656,
  "status": "passed"
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
  "duration": 5000257553,
  "status": "passed"
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
  "duration": 107314039,
  "status": "passed"
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
  "duration": 5000009719,
  "status": "passed"
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
  "duration": 239816505,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignName",
      "offset": 22
    },
    {
      "val": "CampaignsListPageView.filterTextbox",
      "offset": 48
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_with_key_on_element_using_cache_context(String,String)"
});
formatter.result({
  "duration": 506474208,
  "status": "passed"
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
  "duration": 2000054535,
  "status": "passed"
});
formatter.match({
  "location": "CampaignTestSteps.select_filter_textbox_and_press_enter()"
});
formatter.result({
  "duration": 65192941,
  "status": "passed"
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
  "duration": 4999804000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignName",
      "offset": 10
    }
  ],
  "location": "CampaignTestSteps.edit_the_campaign_name(String)"
});
formatter.result({
  "duration": 7964881987,
  "status": "passed"
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
  "duration": 5000204639,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 32
    }
  ],
  "location": "CampaignTestSteps.Set_the_End_Date_as_today_plus_one_day_and_End_Time_as_Zero_hours(int)"
});
formatter.result({
  "duration": 674506125,
  "status": "passed"
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
  "duration": 259523952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.textModal",
      "offset": 9
    },
    {
      "val": "Campaign updated successfully.",
      "offset": 47
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.element_has_text(String,String)"
});
formatter.result({
  "duration": 708116073,
  "status": "passed"
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
  "duration": 5414171717,
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
  "duration": 10000252694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.skipBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 3638318482,
  "status": "passed"
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
  "duration": 5000218678,
  "status": "passed"
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
  "duration": 4863332939,
  "status": "passed"
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
  "duration": 5000246215,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.skipBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 4100384387,
  "status": "passed"
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
  "duration": 5000376341,
  "status": "passed"
});
formatter.match({
  "location": "CampaignTestSteps.once_all_the_section_in_the_summary_screen_are_marked_green()"
});
formatter.result({
  "duration": 176289834,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignPageView.saveAndContinueSummaryBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 2813014938,
  "status": "passed"
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
  "duration": 5000404419,
  "status": "passed"
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
  "duration": 84537006,
  "status": "passed"
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
  "duration": 4999864474,
  "status": "passed"
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
  "duration": 248378411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CampaignName",
      "offset": 22
    },
    {
      "val": "CampaignsListPageView.filterTextbox",
      "offset": 48
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_with_key_on_element_using_cache_context(String,String)"
});
formatter.result({
  "duration": 556839185,
  "status": "passed"
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
  "duration": 2000210038,
  "status": "passed"
});
formatter.match({
  "location": "CampaignTestSteps.select_filter_textbox_and_press_enter()"
});
formatter.result({
  "duration": 68186395,
  "status": "passed"
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
  "duration": 4999809939,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Extended",
      "offset": 21
    },
    {
      "val": "CampaignName",
      "offset": 41
    }
  ],
  "location": "CampaignTestSteps.validate_the_status_from_key_campaign_name(String,String)"
});
formatter.result({
  "duration": 89926195,
  "status": "passed"
});
formatter.match({
  "location": "CucumberCommonAppStepsAdapter.i_close_current_application()"
});
formatter.result({
  "duration": 1210710778,
  "status": "passed"
});
});