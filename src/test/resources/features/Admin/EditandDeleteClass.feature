@editclass
Feature: Edit or delete class on mentutor website
  Scenario Outline: Edit class with valid data
    Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
    When User should be directed to the dashboard page
    And User click input class on the sidebar menu
    And User should be directed to Add class page
    And User clicks dropdown menu on class and click "<action>" as edit class and input "<newClassName>" as new class name and click "<status>" as new status
    Then User click submit and click Ok


    Examples:
    | action |newClassName|status |
    | edit kelas| Kalkulus Lanjut | non active |
    | edit kelas| Kalkulus  | active |


    @deleteclass
    Scenario Outline: Delete Class on table list
      Given User input "admin1.mentutor@gmail.com" as email and "Admin123$" as password and click login
      When User should be directed to the dashboard page
      And User click input class on the sidebar menu
      And User should be directed to Add class page
      And User clicks dropdown menu on class and click "<action>" as delete class
      Then User click "<confirm>" as confirmation


      Examples:
        | action |confirm|
        | delete| cancel |
        | delete| YesDelete |
