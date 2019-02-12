$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Find elements using ID",
  "description": "",
  "id": "find-elements-using-id",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4439127363,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Find the Id\u0027s for Facebook page",
  "description": "",
  "id": "find-elements-using-id;find-the-id\u0027s-for-facebook-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "As a chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I access Facebook page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I see the Facebook Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I perform key actions",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDef.as_a_chrome_user()"
});
formatter.result({
  "duration": 127481186,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_access_Facebook_page()"
});
formatter.result({
  "duration": 3786636129,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_see_the_Facebook_Home_page()"
});
formatter.result({
  "duration": 678194461,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.I_perform_key_actions()"
});
formatter.result({
  "duration": 1039031874,
  "status": "passed"
});
formatter.after({
  "duration": 807177363,
  "status": "passed"
});
});