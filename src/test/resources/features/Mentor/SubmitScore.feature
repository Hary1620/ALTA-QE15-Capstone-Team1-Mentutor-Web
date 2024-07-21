Feature: User can submit a score for mentee
  Scenario:  Given User open mentutor website
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page