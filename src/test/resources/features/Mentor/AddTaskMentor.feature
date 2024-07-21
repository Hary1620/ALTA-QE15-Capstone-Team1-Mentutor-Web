Feature: Add Task by mentor
  Scenario: Add Task mentor with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Input tittle "pembagian" description "kerjakan soal berikut ini" due to date "2024-10-10" select image & file
    Then Click add button