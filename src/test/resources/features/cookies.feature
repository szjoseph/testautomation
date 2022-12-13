Feature: The user should be able to reject or accept the cookies
  As a user,
  I want to be able to manage cookies.

  Background:
    Given open main page
    And language is set to "magyar"

  Rule: Allow to reject or accept cookies.

    Scenario: Allow to reject cookies
      When clicking on "accept cookies"
      Then the cookie panel closes.