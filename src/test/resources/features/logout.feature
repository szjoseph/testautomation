Feature: Log out of website

  As a user, I want to be able to log out of the website
  so that my account remains secure when I am not using it.

  Rule: functional logout button available

    Scenario Outline: Log out of website
      Given open main page
      And I am on the login page
      And I log in with my "<email>" and "<password>"
      When the user clicks on the log out button
      Then the user should be logged out of the website
      Examples:
        | email                 | password  |
        | 8494ake3.uv@gmail.com | Jelszo123 |