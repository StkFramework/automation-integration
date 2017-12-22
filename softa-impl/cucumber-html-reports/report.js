$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/TheHub.feature");
formatter.feature({
  "line": 2,
  "name": "login-test",
  "description": "",
  "id": "login-test",
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
  "name": "TC001 - Validate login page elements",
  "description": "",
  "id": "login-test;tc001---validate-login-page-elements",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open application \u0027the_hub\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I logged in successfully to hub using user \u0027User1\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I Reopen the application \u0027http://connections.staples.com/profiles/html/searchProfiles.do#simpleSearch\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I wait \u002710\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I type text \u0027John Lederer\u0027 on element \u0027HubProfilePageView.directorySearchTextBox\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on \u0027HubProfilePageView.nameProfileLink\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I wait \u002720\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Get the People Managed",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "the_hub",
      "offset": 20
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_open_application(String)"
});
formatter.result({
  "duration": 3625984180,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "User1",
      "offset": 44
    }
  ],
  "location": "HubLoginTestSteps.i_logged_and_navigate_to_maggie_using_user(String)"
});
formatter.result({
  "duration": 6754369482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://connections.staples.com/profiles/html/searchProfiles.do#simpleSearch",
      "offset": 26
    }
  ],
  "location": "HubLoginTestSteps.i_reopen_the_app(String)"
});
formatter.result({
  "duration": 8878331038,
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
  "duration": 10001259686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "John Lederer",
      "offset": 13
    },
    {
      "val": "HubProfilePageView.directorySearchTextBox",
      "offset": 39
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 845111633,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HubProfilePageView.nameProfileLink",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 2581118760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "duration": 20003172701,
  "status": "passed"
});
formatter.match({
  "location": "HubProfileTestSteps.i_get_the_people_managed()"
});
formatter.result({
  "duration": 91557894225,
  "status": "passed"
});
});