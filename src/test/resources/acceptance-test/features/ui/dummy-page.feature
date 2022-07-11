@ui
Feature: UI - Dummy Page

  Scenario: Successfully load the Dummy Page
    Given the Dummy page URL is opened
    When the Dummy page is loaded
    Then I see the date UI element with "2022-06-09" value on the Dummy page
    And I see the time UI element with "08:07:00" value on the Dummy page