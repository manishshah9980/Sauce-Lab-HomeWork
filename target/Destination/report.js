$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Feature/Categories.feature");
formatter.feature({
  "name": "Categories",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User can navigate to correct category page,",
  "description": "  so that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user click on \"\u003ccategory\u003e\" link from top menu",
  "keyword": "When "
});
formatter.step({
  "name": "user should able to navigate to \"\u003crelated category page\u003e\" successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "related category page"
      ]
    },
    {
      "cells": [
        "Computers",
        "https://demo.nopcommerce.com/computers"
      ]
    },
    {
      "cells": [
        "Electronics",
        "https://demo.nopcommerce.com/electronics"
      ]
    },
    {
      "cells": [
        "Apparel",
        "https://demo.nopcommerce.com/apparel"
      ]
    },
    {
      "cells": [
        "Digital downloads",
        "https://demo.nopcommerce.com/digital-downloads"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnAAHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to correct category page,",
  "description": "  so that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user click on \"Computers\" link from top menu",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnLinkFromTopMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/computers\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldAbleToNavigateToSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnAAHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to correct category page,",
  "description": "  so that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user click on \"Electronics\" link from top menu",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnLinkFromTopMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/electronics\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldAbleToNavigateToSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnAAHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to correct category page,",
  "description": "  so that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user click on \"Apparel\" link from top menu",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnLinkFromTopMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/apparel\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldAbleToNavigateToSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.userIsOnAAHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User can navigate to correct category page,",
  "description": "  so that he can use all products features from categories",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@category"
    }
  ]
});
formatter.step({
  "name": "user click on \"Digital downloads\" link from top menu",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userClickOnLinkFromTopMenu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to \"https://demo.nopcommerce.com/digital-downloads\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.userShouldAbleToNavigateToSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});