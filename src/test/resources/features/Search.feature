Feature: Search feature
Scenario: sort product Name (Z to A) and choose product
When User login with valid username "standard_user" and password "secret_sauce"
  Then User should be directed to the dashboard page
  And sort product icon is displayed
  And user click on sort product icon
  And Choose sort Name (Z to A)
  And user click add to cart product "Sauce Labs Onesie" and product "Test.allTheThings() T-Shirt (Red)"
  And Click cart icon
  And click remove button on product "Test.allTheThings() T-Shirt (Red)"
  Then user click continue shopping button

