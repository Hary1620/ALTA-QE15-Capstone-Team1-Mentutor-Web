Feature: Assign Task by mentee on Mentutor website
  @task
  Scenario: Assign task with valid data
    Given User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    When User should be directed to the dashboard page
    And User click Task page
    And user click submit task and select file task and click submit
    Then click ok button

  #negative test
  Scenario: Assign multiple task
    Given User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    When User should be directed to the dashboard page
    And User click Task page
    And user click submit task and select file task and click submit
    And System wil show up error message "You have already submitted"

