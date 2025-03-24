#Feature: Trx with use cases from Alpha Merchant
#
#  Scenario: Complete a successful transaction with shop On (web checkout)
#    Given I am on the use cases screen
#    When I select the Shop On web checkout use case
#    And I add items to cart
#    And I click on go to cart button
#    And I click on checkout button
#    And I search for bank "Demo Bank"
#    And I select the bank
#    And I click on ok got it
#    And I fill in username "usernameTest"
#    And I fill in password "password"
#    And I click on agree and sign in text
#    And I click on agree and sign in button
#    And I click on withdrawn button
#    And I click on close button
#    And I click on place order button
#    Then I should see the message "Purchase successful"
#    And I go back to use cases screen
#
#  Scenario: Complete a successful transaction with shop On
#    Given I am on the use cases screen
#    When I select the Shop.On use case
#    And I add items to cart
#    And I click on go to cart button
#    And I click on checkout button
#    And I search for bank "Demo Bank"
#    And I select the bank
#    And I click on ok got it
#    And I fill in username "usernameTest"
#    And I fill in password "Jwwg863%3bs@"
#    And I click on agree and sign in text
#    And I click on agree and sign in button
#    And I click on withdrawn button
#    And I click on back to checkout button
#    And I click on place order button
#    Then I should see the message "Purchase successful"
#    And I go back to use cases screen
#
#
#  Scenario:  Complete a successful transaction with Game.on
#    Given I am on the use cases screen
#    When I select the Game.on use case
#    And I search for bank "Demo Bank"
#    And I select the bank
#    And I click on ok got it
#    And I fill in username "usernameTest"
#    And I fill in password "password"
#    And I click on agree and sign in text
#    And I click on agree and sign in button
#    And I click on withdrawn button
#    And I click on back to checkout button
#    And I choose a deposit amount value "$10"
#    And I click on Make deposit button
#    Then I should see the message "Deposit completed"
#    And I go back to use cases screen
#
#  Scenario:
#    Given I am on the use cases screen
#    When I select the "Custom" use case
#    And I choose the amount value "$1.00"
#    And I choose the Environment "Sandbox"
#    And I choose the payment type "Deferred"
#    And I click on continue button
#    And I search for bank "Demo Bank"
#    And I select the bank
#    And I click on ok got it
#    And I fill in username "usernameTest"
#    And I fill in password "password"
#    And I click on agree and sign in text
#    And I click on agree and sign in button
#    And I click on withdrawn button
#    And I click on back to checkout button
#    And I click on place order button
#
