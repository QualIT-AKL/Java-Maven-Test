Feature: Logging in to an existing twitter handle
  I want to be able to log in and check my feeds in twitter

#  Scenario: Log into an existing twitter account
#    Given I am in the twitter home page
#    And login as "johndoe310718@yahoo.com" with password "testaccount#1"
#    Then I should land on my personal landing page "John Doe"
#    And I verify profile ID "@JohnDoe07901945"
#    And I logout from twitter account

    Scenario: Select and validate Lotto numbers
      Given I am in the lotto home page
      And I want to pick my own numbers
      And I should land on the page where numbers can be selected
      Then I should be able to fill the first row by selecting autofill option
      And I could select the numbers "5", "6", "7", "8", "9", "10" from Lotto section in the left
      And I could select the number "7" from Powerball section
      And I verify that the numbers selected are displayed on the right pane in yellow