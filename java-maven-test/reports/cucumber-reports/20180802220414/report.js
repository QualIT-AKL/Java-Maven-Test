$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Logging in to an existing twitter handle",
  "description": "  I want to be able to log in and check my feeds in twitter",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Log into an existing twitter account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in the twitter home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TwitterSmokeStepDefinition.i_am_in_the_twitter_login_or_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login as \"johndoe310718@yahoo.com\" with password \"testaccount#1\"",
  "keyword": "And "
});
formatter.match({
  "location": "TwitterSmokeStepDefinition.loginAsGiven(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on my personal landing page \"John Doe\"",
  "keyword": "Then "
});
formatter.write("This should go to the report");
formatter.match({
  "location": "TwitterSmokeStepDefinition.verifyUserLandingPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});