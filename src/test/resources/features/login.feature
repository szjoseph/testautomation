@TC05
Feature: Login

  As a user,
  I want to be able to log in to the app,
  So that I can access my account and its features.

  Rule: user already ha a registered account.

    Scenario Outline: Successful login
      Given open main page
      And I am on the login page
      When I log in with my "<email>" and "<password>"
      Then I should be logged in to my account
      Examples:
        | email                 | password  |
        | 8494ake3.uv@gmail.com | Jelszo123 |

#  Scenario: Incorrect password
#    Given I am on the login page
#    When I enter my username and an incorrect password
#    And I click the login button
#    Then I should see an error message indicating that the password is incorrect

