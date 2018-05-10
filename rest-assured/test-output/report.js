$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTests.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "verify get connectivity of Login Page",
  "description": "",
  "id": "login-page;verify-get-connectivity-of-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "a valid Login URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "a user calls the Login URL using get method",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "verify status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.a_valid_Login_url()"
});
formatter.result({
  "duration": 1321823646,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.a_user_calls_get_method()"
});
formatter.result({
  "duration": 2633966749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 19
    }
  ],
  "location": "LoginStepDefinitions.status_code_200(int)"
});
formatter.result({
  "duration": 740915153,
  "status": "passed"
});
});