Feature: Add Task by mentor
  Scenario: Add Task mentor with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click icon options task and click delete
    Then Click Yes Delete button
    And Click ok button