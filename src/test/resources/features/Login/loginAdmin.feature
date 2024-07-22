Feature: Login Admin
  Scenario: Login admin with valid account
    Given user open mentutor website
    When User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    Then User should be directed to the dashboard page