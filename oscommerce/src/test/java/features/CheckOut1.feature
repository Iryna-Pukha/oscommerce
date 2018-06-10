Feature: Add_to_cart
  Scenario: valid_add_to_cart
    Given I open the browser
    Then I navigate to Product Page
    Then I click on add to cart and proceeding checkout
    Then I enter credentials into input fields and loging in
    Then I navigate forward to confirmation page
	