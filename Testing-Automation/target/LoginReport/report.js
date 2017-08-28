$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("smoketest.feature");
formatter.feature({
  "line": 3,
  "name": "Smoke Test zales site.",
  "description": "",
  "id": "smoke-test-zales-site.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5002845349,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "I want to test the functionality of zales application.",
  "description": "",
  "id": "smoke-test-zales-site.;i-want-to-test-the-functionality-of-zales-application.",
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
  "comments": [
    {
      "line": 11,
      "value": "#And I take a screenshot of zales home page"
    }
  ],
  "line": 12,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter the \"zales\" data",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#And I take a screenshot of zales login page"
    }
  ],
  "line": 15,
  "name": "I click on signin button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#And I take a screenshot of zales user account page"
    }
  ],
  "line": 17,
  "name": "I click on the serachbox field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter \"rings\" in the searchbox",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on the serachbox submit button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#And I take a screenshot of search result page"
    },
    {
      "line": 21,
      "value": "#And I verify the number of product on search result page"
    },
    {
      "line": 22,
      "value": "#And I click on favorite icon on PLP page"
    },
    {
      "line": 23,
      "value": "#And I verify that compare button is disabled on PLP page"
    },
    {
      "line": 24,
      "value": "#And I click on add to compare button"
    },
    {
      "line": 25,
      "value": "#And I click on add to compare button for second product"
    },
    {
      "line": 26,
      "value": "#And I verify that compare button is enabled on PLP page"
    }
  ],
  "line": 27,
  "name": "I click on product available on PLP page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 28,
      "value": "#And I take a screenshot of PDP page"
    },
    {
      "line": 29,
      "value": "#And I click on add to shopping bag on PDP page"
    },
    {
      "line": 30,
      "value": "#And I click on checkout now button on PDP page"
    },
    {
      "line": 31,
      "value": "#And I click on proceed to checkout"
    }
  ],
  "line": 32,
  "name": "I click on mini shopping bag icon",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#And I take a screenshot of checkout page"
    }
  ],
  "line": 34,
  "name": "I click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on save address on shipping detail page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I select saved address on shipping detail page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I click next button on shipping detail page",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click on next button on gift message page",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on save address on payment detail page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I select saved address on payment detail page",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I enter \"691\" cvv on payment details page",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on next button on payment detail page",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I click on place an order on summary page",
  "keyword": "And "
});
formatter.match({
  "location": "Smoketeststep.i_navigate_on_to_the_zales_site()"
});
formatter.result({
  "duration": 20654807295,
  "status": "passed"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_sign_in_button()"
});
formatter.result({
  "duration": 6318978018,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zales",
      "offset": 13
    }
  ],
  "location": "Smoketeststep.i_enter_the_data(String)"
});
formatter.result({
  "duration": 958315676,
  "status": "passed"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_signin_button()"
});
formatter.result({
  "duration": 3840384682,
  "status": "passed"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_the_serachbox_field()"
});
formatter.result({
  "duration": 354253190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rings",
      "offset": 9
    }
  ],
  "location": "Smoketeststep.i_enter_in_the_searchbox(String)"
});
formatter.result({
  "duration": 235928867,
  "status": "passed"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_the_serachbox_submit_button()"
});
formatter.result({
  "duration": 15511134736,
  "status": "passed"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_product_available_on_PLP_page()"
});
formatter.result({
  "duration": 12434236491,
  "status": "passed"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_mini_shopping_bag_icon()"
});
formatter.result({
  "duration": 3778583603,
  "status": "passed"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_checkout_button()"
});
formatter.result({
  "duration": 10241564935,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/main/div/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/button\"}\n  (Session info: chrome\u003d60.0.3112.101)\n  (Driver info: chromedriver\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.22 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.3.1\u0027, revision: \u00275234b325d5\u0027, time: \u00272017-03-10 09:10:29 +0000\u0027\nSystem info: host: \u0027DDC5-DX-50QN6C2\u0027, ip: \u002710.243.251.78\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477700 (0057494ad8732195794a7b32078424f92a5fce41), userDataDir\u003dC:\\Users\\LOVENI~1.SAL\\AppData\\Local\\Temp\\scoped_dir10512_2816}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d60.0.3112.101, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e7117e3c56ca8a19246d0e39144cc8e3\n*** Element info: {Using\u003dxpath, value\u003d/html/body/main/div/div[2]/div[3]/div[3]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:476)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat page_objects.Smoketest.clickCheckoutbutton(Smoketest.java:251)\r\n\tat Step_Definition.Smoketeststep.i_click_on_checkout_button(Smoketeststep.java:167)\r\n\tat ✽.And I click on checkout button(smoketest.feature:34)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_save_address_on_shipping_detail_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketeststep.i_select_saved_address_on_shipping_detail_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketeststep.i_click_next_button_on_shipping_detail_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_next_button_on_gift_message_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_save_address_on_payment_detail_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketeststep.i_select_saved_address_on_payment_detail_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "691",
      "offset": 9
    }
  ],
  "location": "Smoketeststep.i_enter_cvv_on_payment_details_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_next_button_on_payment_detail_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Smoketeststep.i_click_on_place_an_order_on_summary_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1318716130,
  "status": "passed"
});
});