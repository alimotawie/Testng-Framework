$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": " I want to check that the user can register in our e-commerce website.",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered \"\u003cfirstname\u003e\" , \"\u003clastname\u003e\" , \"\u003cemail\u003e\" , \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "user-registration;user-registration;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "password"
      ],
      "line": 11,
      "id": "user-registration;user-registration;;1"
    },
    {
      "cells": [
        "ahmed",
        "mohamed",
        "ahmed33@user434.com",
        "12345678"
      ],
      "line": 12,
      "id": "user-registration;user-registration;;2"
    },
    {
      "cells": [
        "Moataz",
        "ahmed",
        "tes22t@newuser233.com",
        "87654321"
      ],
      "line": 13,
      "id": "user-registration;user-registration;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered \"ahmed\" , \"mohamed\" , \"ahmed33@user434.com\" , \"12345678\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "duration": 976489546,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "duration": 23081795,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ahmed",
      "offset": 11
    },
    {
      "val": "mohamed",
      "offset": 21
    },
    {
      "val": "ahmed33@user434.com",
      "offset": 33
    },
    {
      "val": "12345678",
      "offset": 57
    }
  ],
  "location": "UserRegistration.i_entered(String,String,String,String)"
});
formatter.result({
  "duration": 1976105262,
  "status": "passed"
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_successfullformatter.result({
  "duration": 59968642665,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat pages.PageBase.clickButton(PageBase.java:25)\r\n\tat pages.UserRegistrationPage.userLogout(UserRegistrationPage.java:56)\r\n\tat steps.UserRegistration.the_registration_page_displayed_successfully(UserRegistration.java:42)\r\n\tat ✽.Then The registration page displayed successfully(UserRegistration.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 13,
  "name": "User Registration",
  "description": "",
  "id": "user-registration;user-registration;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I entered \"Moataz\" , \"ahmed\" , \"test@newuser233.com\" , \"87654321\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "The registration page displayed successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "duration": 4041036885,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d72.0.3626.121)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027QE-AMOTAWEI-N\u0027, ip: \u0027192.168.3.69\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\amotawei\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 72.0.3626.121, webStorageEnabled: true}\nSession ID: 503e462d6f2493d343570f7e6f44c08e\n*** Element info: {Using\u003dcss selector, value\u003da.ico-register}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:411)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy23.click(Unknown Source)\r\n\tat pages.PageBase.clickButton(PageBase.java:25)\r\n\tat pages.HomePage.openRegistrationPage(HomePage.java:39)\r\n\tat steps.UserRegistration.the_user_in_the_home_page(UserRegistration.java:20)\r\n\tat ✽.Given the user in the home page(UserRegistration.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "UserRegistration.i_click_on_register_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Moataz",
      "offset": 11
    },
    {
      "val": "ahmed",
      "offset": 22
    },
    {
      "val": "test@newuser233.com",
      "offset": 32
    },
    {
      "val": "87654321",
      "offset": 56
    }
  ],
  "location": "UserRegistration.i_entered(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_successfully()"
});
formatter.result({
  "status": "skipped"
});
});