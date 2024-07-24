Feature: Edit user on Mentutor Website
  @edituser
  Scenario Outline: Edit User with valid data
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click dropdown menu on user and click "<action>" as edit user and input "<newFullname>" as Name and user input "<newEmail>" and user input "<password>" as password and user click "<class>" as new class
    Then User click submit


  Examples:
    |action|newFullname|newEmail|password|class|
    |edit  |Ahmad solihin kur|ahmadsolihin12@gmail.com|Ahmad123$|Data Sains|
    |edit  |Ahmad solihin kur|ahmadsolihin1234@gmail.com|Ahmad123$|Data Sains|
    |edit  |Ahmad solihin kur|ahmadsolihin1234@gmail.com|Ahmad123$|Jaringan Komputer|

@deleteuser
    Scenario Outline: Delete user on table list
      Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
      When User should be directed to the dashboard page
      And User clicks dropdown menu on user and click "<action>" as delete user
      Then User click "<confirm>" as confirmation delete user


      Examples:
      |action|confirm|
      |delete|cancel |
      |delete|cancel |
