Feature: Display order value
  Scenario Outline: Provide order value when user enters number of items and item price
    Given I am using the retail calculator
    When I have <items> item
    And the item price is <price>
    Then my order value is <order value>

    Examples:
    | items | price  | order value |
    |   1   | $10.00 |  $10.00     |
    |   2   | $20.00 |  $40.00     |