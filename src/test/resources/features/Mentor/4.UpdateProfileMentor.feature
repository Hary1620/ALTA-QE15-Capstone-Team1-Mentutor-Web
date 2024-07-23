Feature: Update profile mentor
  @update_profile
  Scenario: update profile mentor with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click menu profile and icon pencil button
    And Input name "Jacob Martin" email "jacob@gmail.com" password "Jacob123$" and images
    Then Click submit button and click ok button