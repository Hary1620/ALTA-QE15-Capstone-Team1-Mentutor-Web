Feature: Add status from mentee on mentutor website
  @addstatus
  Scenario: add status with valid data
    Given User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    When User should be directed to the dashboard page
    And User click forum page
    And User add new status "ada tugas apa hari ini?" and user upload image file and user click send status

    #negative test
  Scenario: add status with invalid data
    Given User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    When User should be directed to the dashboard page
    And User click forum page
    And User add new status "" and user upload image file and user click send status