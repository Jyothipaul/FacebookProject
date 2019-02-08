$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Find elements using ID",
  "description": "",
  "id": "find-elements-using-id",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4225500343,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Find the Id\u0027s for Facebook page",
  "description": "",
  "id": "find-elements-using-id;find-the-id\u0027s-for-facebook-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "As a chrome user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I access Facebook page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I see the Facebook Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I perform key actions",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookStepDef.as_a_chrome_user()"
});
formatter.result({
  "duration": 107615684,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_access_Facebook_page()"
});
formatter.result({
  "duration": 3155649230,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.i_see_the_Facebook_Home_page()"
});
formatter.result({
  "duration": 663560741,
  "status": "passed"
});
formatter.match({
  "location": "FacebookStepDef.I_perform_key_actions()"
});
formatter.result({
  "duration": 929318797,
  "status": "passed"
});
formatter.after({
  "duration": 709907422,
  "status": "passed"
});
formatter.uri("Santander.feature");
formatter.feature({
  "line": 1,
  "name": "Santander useful links",
  "description": "",
  "id": "santander-useful-links",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2444715074,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Launch different Santander useful links",
  "description": "",
  "id": "santander-useful-links;launch-different-santander-useful-links",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "As a Santander user",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I launch Santander website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Online Banking link",
  "keyword": "Then "
});
formatter.match({
  "location": "SantanderStepDef.as_a_Santander_user()"
});
formatter.result({
  "duration": 20950941,
  "status": "passed"
});
formatter.match({
  "location": "SantanderStepDef.i_launch_Santander_website()"
});
formatter.result({
  "duration": 6079190240,
  "status": "passed"
});
formatter.match({
  "location": "SantanderStepDef.i_click_on_Online_Banking_link()"
});
formatter.result({
  "duration": 7898545126,
  "status": "passed"
});
formatter.after({
  "duration": 724970555,
  "status": "passed"
});
});