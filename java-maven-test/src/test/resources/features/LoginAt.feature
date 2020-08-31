    
Feature: Logging in to auckland transport
  I want to be able to log in and check the error

  Scenario: Log into an Auckland Transport
    Given I am auckland in "https://at.govt.nz/"
    When I click a 'Log in'
    And login good as “John” with password “Doe”
    Then my login should be rejected with an error message