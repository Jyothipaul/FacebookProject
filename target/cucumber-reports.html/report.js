$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook Login Page.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Page",
  "description": "",
  "id": "facebook-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4318980278,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Find the Id\u0027s for Facebook page",
  "description": "",
  "id": "facebook-login-page;find-the-id\u0027s-for-facebook-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "As a chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "I launch Facebook page",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I see the Facebook Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I perform key actions",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I select Day Option",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on Forgotten Account Link",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDef.as_a_chrome_user()"
});
formatter.result({
  "duration": 129499347,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_launch_Facebook_page()"
});
formatter.result({
  "duration": 2273822079,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_see_the_Facebook_Home_page()"
});
formatter.result({
  "duration": 21703852,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.I_perform_key_actions()"
});
formatter.result({
  "duration": 624138043,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_select_Day_Option()"
});
formatter.result({
  "duration": 349062208,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_click_on_Forgotten_Account()"
});
formatter.result({
  "duration": 1587808271,
  "status": "passed"
});
formatter.after({
  "duration": 753749875,
  "status": "passed"
});
});