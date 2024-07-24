Feature: Login Mentee with valid account
  Scenario: Login mentee with valid account
    Given user open mentutor website
    When User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    Then User should be directed to the dashboard page