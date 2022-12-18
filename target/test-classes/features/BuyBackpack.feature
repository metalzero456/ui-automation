Feature: Buy an item from the store

	@ShoppingPage
  Scenario: I want to buy blue backpack with the quantity of two
    Given I open the app
    When I am in the shopping page
    Then I select the backpack
    Then I pick the color blue
    And I add the quantity to two
    And I select add to cart button
    Then I select proceed checkout
    Then I complete the login form
    And I select login
    Then I complete the shipping form
    And I select to payment button
    Then I complete the payment form
    And I select review order button
    Then I select place order button
    Then I select go back shopping button