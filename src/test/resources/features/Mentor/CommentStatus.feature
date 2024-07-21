Feature: User comment on status
  Scenario: user comment status with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page