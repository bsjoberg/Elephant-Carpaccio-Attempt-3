Feature: Display order value
  Scenario: Provide order value when user enters number of items and item price
    Given I am using the retail calculator
    When I have 1 item
    And the item price is $10.00
    Then my order value is $10.00