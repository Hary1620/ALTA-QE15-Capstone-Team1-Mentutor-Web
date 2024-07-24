Feature: Edit profile user of Mentee on Mentutor website

  Scenario: Edit profile user of mentee with valid data
    Given User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    When User should be directed to the dashboard page
    And User click profile page on sidebar menu
    And User click edit profile and input name "Sinta cantika Putri" and input email "sintacantika@gmail.com" and input password "Sinta123!"
    And User upload profile picture
#    Then User click submit update profile

  @editprofile
  Scenario: Edit profile user of mentee with special character name
    Given User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    When User should be directed to the dashboard page
    And User click profile page on sidebar menu
    And User click edit profile and input name "^$%^$%@$" and input email "sintacantika@gmail.com" and input password "Sinta123!"
    And User upload profile picture
    Then User click submit update profile
    And System will show up pop up failed message "Failed Updated"



