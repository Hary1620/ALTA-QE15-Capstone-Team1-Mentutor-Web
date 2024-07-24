Feature: User can submit a score for mentee
  Scenario: Mentor submit score with valid input
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click title task
    Then Click edit score at submission column
    And Input score task 70
    Then Click submit button
    And Modal success submit score shows and click ok button
   Then Click close button edit score

  Scenario: Mentor submit score with empty score
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click title task
    Then Click edit score at submission column
    And Input score task empty
    Then Click submit button
    And Modal failed submit score shows and click ok button
    Then Click close button edit score

  Scenario: Mentor submit score with empty score
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click title task
    Then Click edit score at submission column
    And Input score task "seratus"
    Then Click submit button
    And Modal failed submit score shows and click ok button
    Then Click close button edit score