
Feature: Logging in to an existing twitter handle
  I want to be able to log in and check my feeds in twitter

  Scenario: Log into an existing twitter account
    Given I am in the twitter home page
    And login as "johndoe310718@yahoo.com" with password "testaccount#1"
    Then I should land on my personal landing page "John Doe"
 
 @at
 Scenario: Log into AT with a random account
 	Given I am in "http://at.govt.nz/"
 	When I click "Log in"
 	And now login as "John" with password "Doe"
 	Then I should receive an login error message