Feature: Add Task by mentor
  @coba
  Scenario: Add Task mentor with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Input tittle "pembagian" description "kerjakan soal berikut ini" due to date "2024-10-10" select image & file
    Then Click add button
    And Modal success shows and click ok button

  Scenario: Add task mentor with empty fields
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click add button
    And Required message shows

  Scenario:  Add task mentor with 256 char
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Input tittle "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vel velit quis tortor tempor sodales. Ut id nisi nec justo tincidunt accumsan in a arcu. Duis eget urna in ligula malesuada dictum at sed eros. Phasellus posuere quam id ex feugiat, et aliquam magna fermentum." description "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vel velit quis tortor tempor sodales. Ut id nisi nec justo tincidunt accumsan in a arcu. Duis eget urna in ligula malesuada dictum at sed eros. Phasellus posuere quam id ex feugiat, et aliquam magna fermentum." due to date "2024-10-10" select image & file
    Then Click add button
    And Message maximal char show