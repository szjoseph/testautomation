Feature: The user should be able to change the language

  Rule: It is allowed to change the language

    Background:
      Given open main page

    Scenario: Change the language to english
      Given language is set to "hungarian"
      When change the language to "english"
      Then it shows the elements in "hungarian"