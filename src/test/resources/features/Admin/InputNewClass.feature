@InputClass
Feature: Add new class on Mentutor Website
  Scenario: Add new class with valid class name
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input class on the sidebar menu
    And User should be directed to Add class page
    And User input "Kalkulus" as Class Name
    And User click add
    Then validate newly added classes "kalkulus"

@negnewclass
  Scenario: Add new class with empty class name
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input class on the sidebar menu
    And User should be directed to Add class page
    And User input "" as Class Name
    And User click add
    Then system will show error message "class is required"

  @negnewclass
  Scenario: Add new class special character class name
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input class on the sidebar menu
    And User should be directed to Add class page
    And User input "^%$%$%" as Class Name
    And User click add
    Then system will show pop up invalid message "Invalid Input From Client"


