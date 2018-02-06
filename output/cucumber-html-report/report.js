$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Resources/SearchScenario.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon",
  "description": "",
  "id": "amazon",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Open browser and Nevigate to Amazon",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I nevigate to \"http://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.com/",
      "offset": 15
    }
  ],
  "location": "SearchSteps.i_nevigate_to(String)"
});
formatter.result({
  "duration": 35332722512,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search for product and verify Product Detail page",
  "description": "",
  "id": "amazon;search-for-product-and-verify-product-detail-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I enter search key \"Nikon\" and press Enter",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Choose Price: Hight to Low from sort dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I choose second option from sorted result",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "selected product should contains \"Nikon AF-S\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon",
      "offset": 20
    }
  ],
  "location": "SearchSteps.i_enter_search_key_and_press_Enter(String)"
});
formatter.result({
  "duration": 11875472969,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.choose_Price_Hight_to_Low_from_sort_dropdown()"
});
formatter.result({
  "duration": 5259761069,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_choose_second_option_from_sorted_result()"
});
formatter.result({
  "duration": 13488102997,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon AF-S",
      "offset": 34
    }
  ],
  "location": "SearchSteps.selected_product_should_contains(String)"
});
formatter.result({
  "duration": 75171295,
  "status": "passed"
});
formatter.write(" Test Passed ");
formatter.after({
  "duration": 2368658468,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Open browser and Nevigate to Amazon",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I nevigate to \"http://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.amazon.com/",
      "offset": 15
    }
  ],
  "location": "SearchSteps.i_nevigate_to(String)"
});
formatter.result({
  "duration": 34957003017,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search for product and verify Product Detail page failed",
  "description": "",
  "id": "amazon;search-for-product-and-verify-product-detail-page-failed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I enter search key \"Nikon\" and press Enter",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Choose Price: Hight to Low from sort dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I choose second option from sorted result",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "selected product should contains \"sfskdh\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Nikon",
      "offset": 20
    }
  ],
  "location": "SearchSteps.i_enter_search_key_and_press_Enter(String)"
});
formatter.result({
  "duration": 12608128214,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.choose_Price_Hight_to_Low_from_sort_dropdown()"
});
formatter.result({
  "duration": 5361438354,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_choose_second_option_from_sorted_result()"
});
formatter.result({
  "duration": 12375434875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sfskdh",
      "offset": 34
    }
  ],
  "location": "SearchSteps.selected_product_should_contains(String)"
});
formatter.result({
  "duration": 43484509,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.AmazonDemo.Search.SearchVerification.getProductText(SearchVerification.java:23)\r\n\tat stepDefinitions.SearchSteps.selected_product_should_contains(SearchSteps.java:49)\r\n\tat ✽.Then selected product should contains \"sfskdh\"(Resources/SearchScenario.feature:16)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write(" Test Failed ");
formatter.after({
  "duration": 4415081551,
  "status": "passed"
});
});