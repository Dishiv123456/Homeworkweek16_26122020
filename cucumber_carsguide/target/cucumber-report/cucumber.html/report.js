$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/SearchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that\r\nthe Search Cars page is working\r\nDoing the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 8605665800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover to buy+sell Menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on Search Cars link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select car brand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select \"1 Series\" as car model",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select location as \"NSW - Sydney\" from Select Location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "select \"$30,000\" as price",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see list of searched cars \"21 BMW 1 Series for Sale under $30,000 in Sydney, NSW\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "the page title should be \"Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchCarsStepdefs.iAmOnTheHomePageOfCarsGuideWebsite()"
});
formatter.result({
  "duration": 424034900,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsStepdefs.iMouseHoverToBuySellMenu()"
});
formatter.result({
  "duration": 1805383000,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsStepdefs.clickOnSearchCarsLink()"
});
formatter.result({
  "duration": 1959224800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 21
    }
  ],
  "location": "SearchCarsStepdefs.selectCarBrandAsFromAnyMakeDropdown(String)"
});
formatter.result({
  "duration": 405968200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 8
    }
  ],
  "location": "SearchCarsStepdefs.selectAsCarModel(String)"
});
formatter.result({
  "duration": 222739000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - Sydney",
      "offset": 20
    }
  ],
  "location": "SearchCarsStepdefs.selectLocationAsFromSelectLocationDropdown(String)"
});
formatter.result({
  "duration": 224484400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$30,000",
      "offset": 8
    }
  ],
  "location": "SearchCarsStepdefs.selectAsPrice(String)"
});
formatter.result({
  "duration": 235168200,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsStepdefs.clickOnFind_My_Next_CarButton()"
});
formatter.result({
  "duration": 2726195100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21 BMW 1 Series for Sale under $30,000 in Sydney, NSW",
      "offset": 36
    }
  ],
  "location": "SearchCarsStepdefs.iShouldSeeListOfSearchedCars(String)"
});
formatter.result({
  "duration": 30114653800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[contains(text(),\u002721 BMW 1 Series for Sale under $30,000 in Sydney, \u0027)]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-7TUP9CK\u0027, ip: \u0027192.168.1.70\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Windows\\TEMP\\scoped_dir1...}, goog:chromeOptions: {debuggerAddress: localhost:61021}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 353e8fe9033540241cd7138c5f4235f8\n*** Element info: {Using\u003dxpath, value\u003d//h1[contains(text(),\u002721 BMW 1 Series for Sale under $30,000 in Sydney, \u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.getText(Unknown Source)\r\n\tat au.com.carsguide.utils.Utility.getTextFromElement(Utility.java:51)\r\n\tat au.com.carsguide.pages.BMW1SeriesPage.UserShouldNavigateToBMW1SeriesPage(BMW1SeriesPage.java:23)\r\n\tat au.com.carsguide.stepdefs.SearchCarsStepdefs.iShouldSeeListOfSearchedCars(SearchCarsStepdefs.java:58)\r\n\tat ✽.Then I should see list of searched cars \"21 BMW 1 Series for Sale under $30,000 in Sydney, NSW\"(src/test/java/resources/featurefile/SearchCars.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCarsStepdefs.thePageTitleShouldBe(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1389374100,
  "status": "passed"
});
formatter.uri("src/test/java/resources/featurefile/UsedCarSearchSale.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "In order to validate that\r\nthe Used Search Cars page is working\r\nPerforming the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature"
});
