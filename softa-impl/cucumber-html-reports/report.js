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
  "line": 5,
  "name": "TC001 - Import Customer",
  "description": "",
  "id": "campaign-test;tc001---import-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open application \u0027applicationCampaign\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I logged in successfully to Brinker using user \u0027User1\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on \u0027BrinkerLandingPageView.customerDBImg\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I wait \u002710\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Get the value \u0027Plaza Patio\u0027 from Restaurant and put with key \u0027Restaurant\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \u0027CustomerPageView.importContactsLink\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on Browse button and Upload File:",
  "rows": [
    {
      "cells": [
        "Name File"
      ],
      "line": 14
    },
    {
      "cells": [
        "example_contacts-DOB.xlsx"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Select value \u0027Plaza Patio\u0027 from dropdown \u0027CustomerPageView.favoriteRestaurantDropdownList\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on \u0027CustomerPageView.importBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Element \u0027CustomerPageView.textModal\u0027 has text \u0027Import process is taking place and will take some minutes to finish. Once it is over, you will receive an E-mail notification with the summary.\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on Ok Modal Window",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on \u0027CustomerPageView.contactsDBLink\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Validate the Total of Customer on the \u0027Plaza Patio\u0027 Franchise is updated",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
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
  "duration": 6750844069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User1",
      "offset": 48
    }
  ],
  "location": "BrinkerLoginTestSteps.i_logged_and_navigate_to_maggie_using_user(String)"
});
formatter.result({
  "duration": 15039883027,
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
  "duration": 3001010236,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerLandingPageView.customerDBImg",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 14434652365,
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
  "duration": 10000041576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Plaza Patio",
      "offset": 15
    },
    {
      "val": "Restaurant",
      "offset": 62
    }
  ],
  "location": "CustomerTestSteps.get_the_value_from_restaurant_and_put_with_key(String,String)"
});
formatter.result({
  "duration": 193950350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CustomerPageView.importContactsLink",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 297830880,
  "status": "passed"
});
formatter.match({
  "location": "CustomerTestSteps.click_on_browse_button_and_upload_bid_item_file(String\u003e)"
});
formatter.result({
  "duration": 10124509663,
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
  "duration": 5000292110,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Plaza Patio",
      "offset": 14
    },
    {
      "val": "CustomerPageView.favoriteRestaurantDropdownList",
      "offset": 42
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.select_value_from_dropdown_element(String,String)"
});
formatter.result({
  "duration": 454825784,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CustomerPageView.importBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 331049366,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CustomerPageView.textModal",
      "offset": 9
    },
    {
      "val": "Import process is taking place and will take some minutes to finish. Once it is over, you will receive an E-mail notification with the summary.",
      "offset": 47
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.element_has_text(String,String)"
});
formatter.result({
  "duration": 1287229602,
  "status": "passed"
});
formatter.match({
  "location": "CustomerTestSteps.click_on_modal_window()"
});
formatter.result({
  "duration": 79851904,
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
  "duration": 5003469146,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CustomerPageView.contactsDBLink",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 287616203,
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
  "duration": 4999800221,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Plaza Patio",
      "offset": 39
    }
  ],
  "location": "CustomerTestSteps.validate_the_total_of_customer_on_the_franchise_is_updated(String)"
});
formatter.result({
  "duration": 73181425,
  "status": "passed"
});
formatter.match({
  "location": "CucumberCommonAppStepsAdapter.i_close_current_application()"
});
formatter.result({
  "duration": 1254699545,
  "status": "passed"
});
});