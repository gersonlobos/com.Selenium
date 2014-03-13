$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PeopleSearch.feature");
formatter.feature({
  "id": "people-search",
  "description": "As a regular employee \nI can search for other employees \nso that I can find their contact information, title, or photo",
  "name": "People search",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "people-search;search-by-valid-last-name;;2",
  "description": "",
  "name": "Search by valid last name",
  "keyword": "Scenario Outline",
  "line": 14,
  "type": "scenario"
});
formatter.step({
  "name": "the input Krimm exists in the people directory",
  "keyword": "Given ",
  "line": 8,
  "matchedColumns": [
    1
  ]
});
formatter.step({
  "name": "it is input",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "the output should be Krimm",
  "keyword": "Then ",
  "line": 10,
  "matchedColumns": [
    3
  ]
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "id": "people-search;search-by-valid-last-name",
  "description": "",
  "name": "Search by valid last name",
  "keyword": "Scenario",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "the user is on search people page",
  "keyword": "Given ",
  "line": 19
});
formatter.step({
  "name": "he enters \"Krimm\" as employee last name",
  "keyword": "When ",
  "line": 20
});
formatter.step({
  "name": "he submits search request",
  "keyword": "When ",
  "line": 21
});
formatter.step({
  "name": "ensure employee with last name \"Krimm\" is presented",
  "keyword": "Then ",
  "line": 22
});
formatter.match({
  "location": "PeopleSearch.the_user_is_on_search_people_page()"
});
formatter.result({
  "duration": 4527835000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Krimm",
      "offset": 11
    }
  ],
  "location": "PeopleSearch.he_enters_as_employee_last_name(String)"
});
formatter.result({
  "duration": 87693000,
  "status": "passed"
});
formatter.match({
  "location": "PeopleSearch.he_submits_search_request()"
});
formatter.result({
  "duration": 73773000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Krimm",
      "offset": 32
    }
  ],
  "location": "PeopleSearch.ensure_employee_with_last_name_is_presented(String)"
});
formatter.result({
  "duration": 1029523000,
  "status": "passed"
});
});