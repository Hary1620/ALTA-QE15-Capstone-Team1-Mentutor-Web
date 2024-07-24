Feature: Update profile mentor
  @update_profile
  Scenario: update profile mentor with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click menu profile and icon pencil button
    And Input name "Jacob Martin" email "jacob@gmail.com" password "Jacob123$" and images
    Then Click submit button edit profile
    And Modal success edit profile shows and click ok button

  Scenario: update profile mentor with empty fill
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click menu profile and icon pencil button
    And Input name, email, password, and images empty
    Then Click submit button edit profile
    And Modal failed edit profile shows and click ok button

  Scenario: update profile mentor with number value
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click menu profile and icon pencil button
    And Input name "123" email "123@gmail.com" password "123" and images
    Then Click submit button edit profile
    And Modal failed edit profile shows and click ok button