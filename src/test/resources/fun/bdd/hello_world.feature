Feature: Make sure development environment is setup
  Scenario: Run hello world
    Given I have a hello world app
    When I run hello world
    Then I get a message