$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Find elements using ID",
  "description": "",
  "id": "find-elements-using-id",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9175245835,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Find the Id\u0027s for Facebook page",
  "description": "",
  "id": "find-elements-using-id;find-the-id\u0027s-for-facebook-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "As a chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I access Facebook page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I see the Facebook Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I perform key actions",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDef.as_a_chrome_user()"
});
formatter.result({
  "duration": 230241543,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_access_Facebook_page()"
});
formatter.result({
  "duration": 3465549425,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_see_the_Facebook_Home_page()"
});
formatter.result({
  "duration": 637564397,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.I_perform_key_actions()"
});
formatter.result({
  "duration": 905428467,
  "status": "passed"
});
formatter.after({
  "duration": 692987876,
  "status": "passed"
});
});