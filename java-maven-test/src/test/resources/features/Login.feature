Feature: Logging in to an existing twitter handle
  I want to be able to log in and check my feeds in twitter

  Scenario: Log into an existing lotto account
    Given I am in "https://mylotto.co.nz/"
    When I click 'Log in'
    And login as "joe.doe.auto@gmail.com" with password "testautomation123*"
    Then I should land on my personal landing page
    And I verify email ID "joe.doe.auto@gmail.com"
    And I logout from lotto account
    
Feature: Logging in to auckland transport
  I want to be able to log in and check the error

  Scenario: Log into an Auckland Transport
    Given I am auckland in "https://at.govt.nz/"
    When I click a 'Log in'
    And login good as “John” with password “Doe”
    Then my login should be rejected with an error message