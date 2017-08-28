$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("smoketest.feature");
formatter.feature({
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3565701396,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I navigate on to the zales site",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter the \"zales\" data",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I enter rings in the searchbox",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify the number of product on search result page",
  "keyword": "And "
});
formatter.match({
  "location": "flipkartStep.i_navigate_on_to_the_zales_site()"
});
formatter.result({
  "duration": 48161386284,
  "status": "passed"
});
formatter.match({
  "location": "flipkartStep.i_click_on_sign_in_button()"
});
formatter.result({
  "duration": 44837571126,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zales",
      "offset": 13
    }
  ],
  "location": "flipkartStep.i_enter_the_data(String)"
});
formatter.result({
  "duration": 1365562472,
  "status": "passed"
});
formatter.match({
  "location": "flipkartStep.i_enter_rings_in_the_searchbox()"
});
