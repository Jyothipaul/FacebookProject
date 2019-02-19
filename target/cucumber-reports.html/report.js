$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook Login Page.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Page",
  "description": "",
  "id": "facebook-login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 41,
      "value": "#    And I quit browser"
    }
  ],
  "line": 44,
  "name": "Reading from spreadsheet",
  "description": "",
  "id": "facebook-login-page;reading-from-spreadsheet",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "As a chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I launch Facebook page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I see the Facebook Home page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I enter \"\u003cemail\u003e\" from spreadsheet",
  "keyword": "Then "
});
formatter.examples({
  "line": 50,
  "name": "",
  "description": "",
  "id": "facebook-login-page;reading-from-spreadsheet;",
  "rows": [
    {
      "cells": [
        "email"
      ],
      "line": 51,
      "id": "facebook-login-page;reading-from-spreadsheet;;1"
    },
    {
      "cells": [
        "Email1"
      ],
      "line": 52,
      "id": "facebook-login-page;reading-from-spreadsheet;;2"
    },
    {
      "cells": [
        "Email2"
      ],
      "line": 53,
      "id": "facebook-login-page;reading-from-spreadsheet;;3"
    },
    {
      "cells": [
        "Email3"
      ],
      "line": 54,
      "id": "facebook-login-page;reading-from-spreadsheet;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4428465512,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "Reading from spreadsheet",
  "description": "",
  "id": "facebook-login-page;reading-from-spreadsheet;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "As a chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I launch Facebook page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I see the Facebook Home page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I enter \"Email1\" from spreadsheet",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStepDef.as_a_chrome_user()"
});
formatter.result({
  "duration": 144089961,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_launch_Facebook_page()"
});
formatter.result({
  "duration": 1610225622,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_see_the_Facebook_Home_page()"
});
formatter.result({
  "duration": 127697535,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Email1\"",
      "offset": 8
    }
  ],
  "location": "FacebookStepDef.i_enter_email_from_spreadsheet(String)"
});
formatter.result({
  "duration": 1148382454,
  "status": "passed"
});
formatter.after({
  "duration": 705621908,
  "status": "passed"
});
formatter.before({
  "duration": 2560905890,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Reading from spreadsheet",
  "description": "",
  "id": "facebook-login-page;reading-from-spreadsheet;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "As a chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I launch Facebook page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I see the Facebook Home page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I enter \"Email2\" from spreadsheet",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStepDef.as_a_chrome_user()"
});
formatter.result({
  "duration": 164212,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_launch_Facebook_page()"
});
formatter.result({
  "duration": 1552733077,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_see_the_Facebook_Home_page()"
});
formatter.result({
  "duration": 13705513,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Email2\"",
      "offset": 8
    }
  ],
  "location": "FacebookStepDef.i_enter_email_from_spreadsheet(String)"
});
formatter.result({
  "duration": 429618278,
  "status": "passed"
});
formatter.after({
  "duration": 658271895,
  "status": "passed"
});
formatter.before({
  "duration": 2402913360,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "Reading from spreadsheet",
  "description": "",
  "id": "facebook-login-page;reading-from-spreadsheet;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 43,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 45,
  "name": "As a chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "I launch Facebook page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I see the Facebook Home page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "I enter \"Email3\" from spreadsheet",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookStepDef.as_a_chrome_user()"
});
formatter.result({
  "duration": 195823,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_launch_Facebook_page()"
});
formatter.result({
  "duration": 2106326623,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_see_the_Facebook_Home_page()"
});
formatter.result({
  "duration": 38082320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Email3\"",
      "offset": 8
    }
  ],
  "location": "FacebookStepDef.i_enter_email_from_spreadsheet(String)"
});
formatter.result({
  "duration": 404361297,
  "status": "passed"
});
formatter.after({
  "duration": 720436671,
  "status": "passed"
});
});