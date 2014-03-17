$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PeopleSearch.feature");
formatter.feature({
  "id": "people-search",
  "description": "As a regular employee \nI can search for other employees \nso that I can find their contact information, title, or photo",
  "name": "People search",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "people-search;search-people-by-valid-name",
  "description": "",
  "name": "Search people by valid name",
  "keyword": "Scenario",
  "line": 20,
  "type": "scenario",
  "comments": [
    {
      "value": "#\tScenario Outline: Search by valid last name",
      "line": 7
    },
    {
      "value": "#\t\tGiven the input \u003cemployeeLastName\u003e exists in the people directory",
      "line": 8
    },
    {
      "value": "#\t\tWhen it is input",
      "line": 9
    },
    {
      "value": "#\t\tThen the output should be \u003coutputB\u003e",
      "line": 10
    },
    {
      "value": "#\t\tExamples:",
      "line": 12
    },
    {
      "value": "#\t\t|FirstName  | LasttName | Email                           | PhoneNumber|Department|",
      "line": 13
    },
    {
      "value": "#        | Charles   | Allen     | Charles.Allen@whitestratus.com  |135-130-4627|Sales\t  |",
      "line": 14
    },
    {
      "value": "#        | Allen     | Martinez  | Allen.Martinez@whitestratus.com |616-216-0520|Sales\t  |",
      "line": 15
    }
  ]
});
formatter.step({
  "name": "user is on search page",
  "keyword": "Given ",
  "line": 21
});
formatter.step({
  "name": "the following employees exist",
  "keyword": "And ",
  "line": 22,
  "rows": [
    {
      "cells": [
        "FirstName",
        "LasttName",
        "Email",
        "PhoneNumber",
        "Department"
      ],
      "line": 23
    },
    {
      "cells": [
        "Charles",
        "Allen",
        "Charles.Allen@whitestratus.com",
        "135-130-4627",
        "Sales"
      ],
      "line": 24
    },
    {
      "cells": [
        "Allen",
        "Martinez",
        "Allen.Martinez@whitestratus.com",
        "616-216-0520",
        "Sales"
      ],
      "line": 25
    }
  ]
});
formatter.step({
  "name": "user enters \"Allen\" in search box",
  "keyword": "And ",
  "line": 26
});
formatter.step({
  "name": "user submits search request",
  "keyword": "When ",
  "line": 27
});
formatter.step({
  "name": "the output should be",
  "keyword": "Then ",
  "line": 28,
  "rows": [
    {
      "cells": [
        "FirstName",
        "LasttName",
        "Email",
        "PhoneNumber",
        "Department"
      ],
      "line": 29
    },
    {
      "cells": [
        "Charles",
        "Allen",
        "Charles.Allen@whitestratus.com",
        "135-130-4627",
        "Sales"
      ],
      "line": 30
    },
    {
      "cells": [
        "Allen",
        "Martinez",
        "Allen.Martinez@whitestratus.com",
        "616-216-0520",
        "Sales"
      ],
      "line": 31
    }
  ]
});
formatter.match({
  "location": "PeopleSearch.user_is_on_search_page()"
});
formatter.result({
  "duration": 1658557000,
  "status": "passed"
});
formatter.match({
  "location": "PeopleSearch.the_following_employees_exist(User\u003e)"
});
formatter.result({
  "duration": 13008000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Allen",
      "offset": 13
    }
  ],
  "location": "PeopleSearch.user_enters_in_search_box(String)"
});
formatter.result({
  "duration": 78180000,
  "status": "passed"
});
formatter.match({
  "location": "PeopleSearch.user_submits_search_request()"
});
formatter.result({
  "duration": 66231000,
  "status": "passed"
});
formatter.match({
  "location": "PeopleSearch.the_output_should_be(DataTable)"
});
formatter.result({
  "duration": 3123000,
  "status": "pending",
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.SeleniumCucumber.PeopleSearch.the_output_should_be(PeopleSearch.java:94)\n\tat ✽.Then the output should be(PeopleSearch.feature:28)\n"
});
});