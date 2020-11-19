Feature: Logging in to an existing twitter handle
  I want to be able to log in lotto webpage

  Scenario: Log into an existing lotto account
    Given I am in "https://mylotto.co.nz/"
    When I click 'Log in'
    And login as "username" with password "password"
    Then I should land on my personal landing page
    And I verify email ID "email"
    And I logout from lotto account
