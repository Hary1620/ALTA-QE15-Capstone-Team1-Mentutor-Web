Feature: Login Mentee with valid account
  Scenario: Login mentee with valid account
    Given user open mentutor website
    When User input "sintacantika@gmail.com" as email and "Sinta123!" as password and click login
    Then User should be directed to the dashboard page

    Scenario: Login mentee with invalid account
      Given user open mentutor website
      When User input "akunhilang@gmail.com" as email and "Hilang123$" as password and click login
      Then System will show up pop up invalid message "Invalid email or password"

    Scenario: Login mentee with invalid password lower than 8 characters
      Given user open mentutor website
      When User input "akunhilang@gmail.com" as email and "hilang" as password and click login
      Then System wil show up invalid password "password must be 8 characters"

  Scenario: Login mentee with invalid password no uppercase
    Given user open mentutor website
    When User input "akunhilang@gmail.com" as email and "akunhilang" as password and click login
    Then System wil show up invalid password1 "password must contain one uppercase"

  Scenario: Login mentee with invalid password no number
    Given user open mentutor website
    When User input "akunhilang@gmail.com" as email and "Akunhilang" as password and click login
    Then System wil show up invalid password2 "password must contain one number"

  Scenario: Login mentee with invalid password no special character
    Given user open mentutor website
    When User input "akunhilang@gmail.com" as email and "Akunhilang123" as password and click login
    Then System wil show up invalid password3 "password must contain one special character"