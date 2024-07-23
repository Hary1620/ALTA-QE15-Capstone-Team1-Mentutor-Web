Feature: User comment on status
  Scenario: user comment status with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click forum menu on sidebar
    And Input comment on status mentee "Apapun coba test"
    Then Click send button

  Scenario:  user comment status with max char 265
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click forum menu on sidebar
    And Input comment on status mentee "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vel velit quis tortor tempor sodales. Ut id nisi nec justo tincidunt accumsan in a arcu. Duis eget urna in ligula malesuada dictum at sed eros. Phasellus posuere quam id ex feugiat, et aliquam magna fermentum."
    Then Click send button

  Scenario:  user comment status with empty fields
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click forum menu on sidebar
    And Click send button