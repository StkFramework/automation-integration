$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Console.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: edy.espinoza@softtek.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : E2E Scenarios for Smoke testing"
    },
    {
      "line": 4,
      "value": "#Prerequisites: 2 Orders must be completed on mobile app, and order ID must be added to Cache Context"
    }
  ],
  "line": 7,
  "name": "Process an Order on Console",
  "description": "",
  "id": "process-an-order-on-console",
  "keyword": "Feature",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Search for an Order, Process it and Send it to Ready",
  "description": "",
  "id": "process-an-order-on-console;search-for-an-order,-process-it-and-send-it-to-ready",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I open application \u0027application2\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I initialize cache",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#Login as Restaurant Manager"
    }
  ],
  "line": 13,
  "name": "I wait \u00271\u0027 seconds",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I type text \u0027#{cacheContext[\u0027RESTMGR\u0027]}\u0027 on element \u0027BrinkerLoginPageView.usernameTextBox\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I type text \u0027#{cacheContext[\u0027PASS\u0027]}\u0027 on element \u0027BrinkerLoginPageView.passwordTextBox\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click on \u0027BrinkerLoginPageView.loginBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#Open Console app"
    }
  ],
  "line": 19,
  "name": "I click on \u0027BrinkerConsolePageView.consoleBtn\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I wait \u00275\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#Search Order"
    }
  ],
  "line": 23,
  "name": "I click on \u0027BrinkerConsolePageView.searchBtn\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I type text \u0027#{volatileContext[\u0027PROCESSORDERID\u0027]}\u0027 on element \u0027BrinkerConsolePageView.orderIDTxtBox\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Sent to In Process"
    }
  ],
  "line": 28,
  "name": "I click on \u0027BrinkerConsolePageView.enteredInPOSBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I type text \u002712345\u0027 on element \u0027BrinkerConsolePageView.posIDTxtBox\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click on \u0027BrinkerConsolePageView.okPopupBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I wait \u00278\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#Go to In Process"
    }
  ],
  "line": 34,
  "name": "I click on \u0027BrinkerConsolePageView.inProcessHdr\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on \u0027BrinkerConsolePageView.readyBtn\u0027",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 37,
      "value": "#Send to Ready"
    }
  ],
  "line": 38,
  "name": "I click on \u0027BrinkerConsolePageView.okPopupBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I wait \u00278\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 41,
      "value": "#Go to Ready"
    }
  ],
  "line": 42,
  "name": "I click on \u0027BrinkerConsolePageView.readyHdr\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "I click on \u0027BrinkerConsolePageView.orderIDLbl\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I wait \u00273\u0027 seconds",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "application2",
      "offset": 20
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_open_application(String)"
});
formatter.result({
  "duration": 4505140103,
  "status": "passed"
});
formatter.match({
  "location": "BrinkerCommonPageSteps.I_initialize_cache()"
});
formatter.result({
  "duration": 22845616,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "duration": 1000386638,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#{cacheContext[\u0027RESTMGR\u0027]}",
      "offset": 13
    },
    {
      "val": "BrinkerLoginPageView.usernameTextBox",
      "offset": 53
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 734575362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#{cacheContext[\u0027PASS\u0027]}",
      "offset": 13
    },
    {
      "val": "BrinkerLoginPageView.passwordTextBox",
      "offset": 50
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 341713478,
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
  "duration": 1999926263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerLoginPageView.loginBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 10943053951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.consoleBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 1820369211,
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
  "duration": 5000677739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.searchBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 401468583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#{volatileContext[\u0027PROCESSORDERID\u0027]}",
      "offset": 13
    },
    {
      "val": "BrinkerConsolePageView.orderIDTxtBox",
      "offset": 63
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 481010824,
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
  "duration": 1999541548,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.enteredInPOSBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 612837659,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 13
    },
    {
      "val": "BrinkerConsolePageView.posIDTxtBox",
      "offset": 32
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 680219082,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.okPopupBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 463180600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "duration": 8000130803,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.inProcessHdr",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 472178425,
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
  "duration": 2000200051,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.readyBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 553754523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.okPopupBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 479714337,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "duration": 8000199410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.readyHdr",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 542775419,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.orderIDLbl",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 1111801174,
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
  "duration": 2999941652,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Search for an Order, Process it and Cancel lit",
  "description": "",
  "id": "process-an-order-on-console;search-for-an-order,-process-it-and-cancel-lit",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@test"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#Commented to run all Scenarios in a single run."
    },
    {
      "line": 50,
      "value": "#Uncomment to run sepparately"
    },
    {
      "line": 51,
      "value": "#Given I open application \u0027application2\u0027"
    },
    {
      "line": 52,
      "value": "#\t#And I validate element content"
    },
    {
      "line": 53,
      "value": "#\t\tAnd I initialize cache"
    },
    {
      "line": 54,
      "value": "##Login as Restaurant Manager"
    },
    {
      "line": 55,
      "value": "#    Then I wait \u00271\u0027 seconds"
    },
    {
      "line": 56,
      "value": "#    Then I type text \u0027#{cacheContext[\u0027USER\u0027]}\u0027 on element \u0027BrinkerLoginPageView.usernameTextBox\u0027"
    },
    {
      "line": 57,
      "value": "#    Then I type text \u0027#{cacheContext[\u0027PASS\u0027]}\u0027 on element \u0027BrinkerLoginPageView.passwordTextBox\u0027"
    },
    {
      "line": 58,
      "value": "#    Then I wait \u00272\u0027 seconds"
    },
    {
      "line": 59,
      "value": "#    And I click on \u0027BrinkerLoginPageView.loginBtn\u0027"
    },
    {
      "line": 61,
      "value": "#Search Order"
    }
  ],
  "line": 62,
  "name": "I click on \u0027BrinkerConsolePageView.receivedHdr\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "I click on \u0027BrinkerConsolePageView.closeSearchBtn\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "I click on \u0027BrinkerConsolePageView.searchBtn\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "I wait \u00271\u0027 seconds",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "I type text \u0027#{cacheContext[\u0027CANCELORDERID\u0027]}\u0027 on element \u0027BrinkerConsolePageView.orderIDTxtBox\u0027",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 67,
      "value": "#Adding this additional step because a bug exists"
    }
  ],
  "line": 68,
  "name": "I click on \u0027BrinkerConsolePageView.receivedHdr\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 71,
      "value": "#Sent to In Process"
    }
  ],
  "line": 72,
  "name": "I click on \u0027BrinkerConsolePageView.enteredInPOSBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "I type text \u002712345\u0027 on element \u0027BrinkerConsolePageView.posIDTxtBox\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "I click on \u0027BrinkerConsolePageView.okPopupBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "I wait \u00278\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 77,
      "value": "#Go to In Process"
    }
  ],
  "line": 78,
  "name": "I click on \u0027BrinkerConsolePageView.inProcessHdr\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "I click on \u0027BrinkerConsolePageView.firstOrderLink\u0027",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 82,
      "value": "#Cancel it"
    }
  ],
  "line": 83,
  "name": "I click on \u0027BrinkerConsolePageView.cancelLink\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "I wait \u00272\u0027 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "I click on \u0027BrinkerConsolePageView.otherCancelOptn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "I type text \u0027Automation Testing Order\u0027 on element \u0027BrinkerConsolePageView.otherCancelTextOptn\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "I click on \u0027BrinkerConsolePageView.okCancelPopupBtn\u0027",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 89,
      "value": "#Go to Cancel"
    }
  ],
  "line": 90,
  "name": "I click on \u0027BrinkerConsolePageView.cancelHdr\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "I click on \u0027BrinkerConsolePageView.orderIDLbl\u0027",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.receivedHdr",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 822409478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.closeSearchBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 943646412,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.searchBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 835684685,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "duration": 1012919347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "#{cacheContext[\u0027CANCELORDERID\u0027]}",
      "offset": 13
    },
    {
      "val": "BrinkerConsolePageView.orderIDTxtBox",
      "offset": 59
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 1283958248,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.receivedHdr",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 383085011,
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
  "duration": 1999766607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.enteredInPOSBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 562351604,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 13
    },
    {
      "val": "BrinkerConsolePageView.posIDTxtBox",
      "offset": 32
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 539121915,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.okPopupBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 226505019,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 8
    }
  ],
  "location": "CucumberCommonAppStepsAdapter.i_wait_seconds(String)"
});
formatter.result({
  "duration": 7999957040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.inProcessHdr",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 393521027,
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
  "duration": 1999354963,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.firstOrderLink",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 720613440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.cancelLink",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 670010689,
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
  "duration": 2000078867,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.otherCancelOptn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 449090439,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation Testing Order",
      "offset": 13
    },
    {
      "val": "BrinkerConsolePageView.otherCancelTextOptn",
      "offset": 51
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_type_text_on(String,String)"
});
formatter.result({
  "duration": 861275238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.okCancelPopupBtn",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 803676458,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.cancelHdr",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 7235169425,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BrinkerConsolePageView.orderIDLbl",
      "offset": 12
    }
  ],
  "location": "CucumberCommonUIStepsAdapter.i_click_on_element(String)"
});
formatter.result({
  "duration": 1145396349,
  "status": "passed"
});
});