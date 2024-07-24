Feature: Edit Task Mentor
  @edit_task
  Scenario: Edit task mentor with valid credentials
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click icon options task and edit
    Then Input title "pembagian" description "kerjakan soal berikut ini" due date "2024-09-02" file and images
    And Click submit button task
    And Modal success edit shows and click ok button
    Then Click close button

  Scenario: Edit task mentor with empty fill
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click icon options task and edit
    Then Clear fill column
    And Click submit button task
    And Modal failed edit shows and click ok button
    Then Click close button

  Scenario: Edit task mentor with invalid input
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click icon options task and edit
    Then Input title "123" description "123" due date "123" file and images
    And Click submit button task
    And Modal failed edit shows and click ok button
    Then Click close button

  Scenario: Edit task mentor with 265 char
    When User input "mentor.mentutor@gmail.com" as username and "Mentor123$" as password
    Then User click login button
    And User should be redirect to dashboard page
    Then Click task menu on sidebar
    And Click icon options task and edit
    Then Input title "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vel velit quis tortor tempor sodales. Ut id nisi nec justo tincidunt accumsan in a arcu. Duis eget urna in ligula malesuada dictum at sed eros. Phasellus posuere quam id ex feugiat, et aliquam magna fermentum." description "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque vel velit quis tortor tempor sodales. Ut id nisi nec justo tincidunt accumsan in a arcu. Duis eget urna in ligula malesuada dictum at sed eros. Phasellus posuere quam id ex feugiat, et aliquam magna fermentum." due date "123" file and images
    And Click submit button task
    And Modal failed edit shows and click ok button
    Then Click close button