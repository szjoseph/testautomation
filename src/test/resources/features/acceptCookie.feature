Feature: The user should be able to reject or accept the cookies

  Background:
    Given open main page
    And language is set to "magyar"

  Rule: Allow to reject cookies

    Scenario: Allow to reject cookies
      Given the "Összes Cookie elfogadás" button is visible
      When clicking on "Összes Cookie elfogadás"
      Then the cookie panel closes.