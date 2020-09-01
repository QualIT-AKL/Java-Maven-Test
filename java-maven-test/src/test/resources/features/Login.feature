Feature: Logging in to an unexisting Auckland Transport account
  I want to be able to see an error message when trying to login to a unexisting account

  Scenario: Log into an existing lotto account
    Given I am in "https://at.govt.nz/"
    When I click 'Log in'
    And login as "John" with password "Doe"
    Then I should be warned the account doesn't exist

