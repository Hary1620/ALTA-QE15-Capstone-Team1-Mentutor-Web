
Feature: Add new member on mentutor Website
Scenario Outline: Add new member with valid data
   Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
   When User should be directed to the dashboard page
   And User click input member on the sidebar menu
   And User should be directed to Add member page
   And User input "<Name>" as full name and "<Email>" as email and choose "<Role>" and choose "<Class>" and input "<Password>" as password
#   Then click add button

  Examples:
  |Name | Email | Role|Class|Password |
  |Putri Ramadhani| putriramadani@gmail.com |Mentee|Data Sains| Putri123! |
  |Reno purnomo| renopurnomo@gmail.com |Mentor|Pemrograman Java 1| Reno123! |


  Scenario Outline: Add new member with empty full name field
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input member on the sidebar menu
    And User should be directed to Add member page
    And User input "<Name>" as full name and "<Email>" as email and choose "<Role>" and choose "<Class>" and input "<Password>" as password
    And click add button
    Then System should gift pop up error message "Fullname is required"

    Examples:
      |Name | Email | Role|Class|Password |
      || putriramadani@gmail.com |Mentee|Data Sains| Putri123! |


  Scenario Outline: Add new member with empty email field
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input member on the sidebar menu
    And User should be directed to Add member page
    And User input "<Name>" as full name and "<Email>" as email and choose "<Role>" and choose "<Class>" and input "<Password>" as password
    And click add button
    Then System should gift pop up error message on email field "Email is required"

    Examples:
      |Name | Email | Role|Class|Password |
      |Putri Ramadhani||Mentee|Data Sains| Putri123! |


  Scenario Outline: Add new member with empty role field
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input member on the sidebar menu
    And User should be directed to Add member page
    And User input "<Name>" as full name and "<Email>" as email and choose "<Role>" and choose "<Class>" and input "<Password>" as password
    And click add button
    Then System should gift pop up error message on role field "Role is required"

    Examples:
      |Name | Email | Role|Class|Password |
      |Putri Ramadhani| putriramadani@gmail.com ||Data Sains| Putri123! |


  Scenario Outline: Add new member with empty class field
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input member on the sidebar menu
    And User should be directed to Add member page
    And User input "<Name>" as full name and "<Email>" as email and choose "<Role>" and choose "<Class>" and input "<Password>" as password
    And click add button
    Then System should gift pop up error message on class field "Class is required"

    Examples:
      |Name | Email | Role|Class|Password |
      |Putri Ramadhani| putriramadani@gmail.com |Mentee|| Putri123! |


  Scenario Outline: Add new member with empty password field
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input member on the sidebar menu
    And User should be directed to Add member page
    And User input "<Name>" as full name and "<Email>" as email and choose "<Role>" and choose "<Class>" and input "<Password>" as password
    And click add button
    Then System should gift pop up error message on class field "Password is required"
    Examples:
      |Name | Email | Role|Class|Password |
      |Putri Ramadhani| putriramadani@gmail.com |Mentee|Data Sains| |

  @inputnewmember
  Scenario Outline: Add new member with special character name and email field
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input member on the sidebar menu
    And User should be directed to Add member page
    And User input "<Name>" as full name and "<Email>" as email and choose "<Role>" and choose "<Class>" and input "<Password>" as password
    And click add button
    Then System should gift pop up invalid message  "Invalid Input From Client"
    Examples:
      |Name | Email | Role|Class|Password |
      |&%^$^##%@#$K| putriramadani@gmail.com |Mentee|Data Sains| Putri123! |
      |Reno purnomo| %$#$%$$@gmaill.com |Mentor|Data Sains| Reno123! |
