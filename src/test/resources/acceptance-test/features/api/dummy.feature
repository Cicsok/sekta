@api
Feature: Dummy API can be retrieved

  Scenario: client makes call to GET /dummy
    When the client calls /dummy endpoint
    Then the client receives status code of 200
    And the client receives "2022-06-09" value as "date" field in the JSON response
    And the client receives "08:07:00" value as "time" field in the JSON response
   