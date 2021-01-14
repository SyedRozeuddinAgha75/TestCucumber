Feature: Login into application
  Scenario: Home page login
    Given User is on landing page
    When User logins with "Agha" and "12345"
    Then Home page is displayed
    And All the cards on homepage are displayed

