$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("yahootest.feature");
formatter.feature({
  "line": 1,
  "name": "Test yahoo login",
  "description": "I want to use this template for my feature file",
  "id": "test-yahoo-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "test-yahoo-login;title-of-your-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the yahoo mail site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"\u003cemailid\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click on submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "test-yahoo-login;title-of-your-scenario;",
  "rows": [
    {
      "cells": [
        "emailid"
      ],
      "line": 9,
      "id": "test-yahoo-login;title-of-your-scenario;;1"
    },
    {
      "cells": [
        "lABU@gmail.com"
      ],
      "line": 10,
      "id": "test-yahoo-login;title-of-your-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9276412681,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Title of your scenario",
  "description": "",
  "id": "test-yahoo-login;title-of-your-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on the yahoo mail site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the \"lABU@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "YahooTestStep.i_am_on_the_yahoo_mail_site()"
});
formatter.result({
  "duration": 5559792654,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lABU@gmail.com",
      "offset": 13
    }
  ],
  "location": "YahooTestStep.i_enter_the(String)"
});
formatter.result({
  "duration": 961423271,
  "status": "passed"
});
formatter.match({
  "location": "submitStep.i_click_on_submit_button()"
});
formatter.result({
  "duration": 770015128,
  "status": "passed"
});
formatter.after({
  "duration": 1266086516,
  "status": "passed"
});
});