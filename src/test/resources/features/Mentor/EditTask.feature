Feature: Add Task by mentor
  Scenario: Add Task mentor with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click icon options task and edit
    Then Input title "pembagian" description "kerjakan soal berikut ini" due date "2024-09-02" file and images
    And Click submit button task and click ok button
    Then Click close button