Feature: Add comment from mentee on mentutor website
  @addcomment
  Scenario: Add comment with valid data
    Given User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    When User should be directed to the dashboard page
    And User click forum page
    And User add new comment "halo kak" and click send comment button

    #negative test
  Scenario: Add comment with empty data
    Given User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    When User should be directed to the dashboard page
    And User click forum page
    And User add new comment "" and click send comment button