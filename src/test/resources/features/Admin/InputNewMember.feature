@inputnewmember
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
  |Reno purnomo| renopurnomo@gmail.com |Mentor|Pemograman Java 1| Reno123! |

