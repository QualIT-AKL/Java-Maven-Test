Feature: Logging in to Auckland Transport (AT) site
  I want to test that my login will be rejected

  Scenario: Log into an existing AT account
    Given I am in "https://at.govt.nz/"
    When I click 'Log in'
    And login as "John" with password "Doe*"
    Then I should encounter log-in error
