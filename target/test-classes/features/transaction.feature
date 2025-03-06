Feature: Online Shopping with Checkout

  Scenario: Complete a successful transaction in web checkout
    Given I am on the use cases screen
    When I select the web checkout option
    And I add items to cart
    And I click on go to cart button
    And I click on checkout button
    And I search for bank "Demo Bank"
    And I select the bank
    And I click on ok got it
    And I fill in username "usernameTest"
    And I fill in password "password"
    And I click on agree and sign in text
    And I click on agree and sign in button
    And I click on withdrawn button
    And I click on close button
    And I click on place order button
    Then I should see the message "Purchase successful"
    And I go back to use cases screen

#    Scenario: Successful transaction with OAuth Demo bank
#      Given I am on the use cases screen
#      When I select the web checkout option
#      And I add items to cart
#      And I click on go to cart button
#      And I click on checkout button
#      And I search for bank "OAuth Demo Bank"
#      And I select the bank
#      And I click on Go to OAuth Demo Bank Alternative
#      And I fill in username "usernameTest"
#      And I fill in password "password"
#      And I click on agree and sign in text
#      And I click on agree and sign in button
#      And I click on withdrawn button
#      And I click on close button
#      And I click on place order button
#      Then I should see the message "Purchase successful"
#      And I go back to use cases screen