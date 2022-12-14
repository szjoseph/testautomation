Feature: Sign up
  As a user
  I want to be able to create an account
  So that I can access the different features of the website

  Rule: Registration can't proceed without filling out the necessary fields with valid data
  Rule: Registration must require password confirmation

    Scenario: Successful registration
      Given open main page
      And the user is on the sign up page
      When the user registers
      Then the user will have a profile

  #When user registers

#    Scenario: Email already in use
#      Given I am on the registration page
#      When I enter an email that is already in use
#      And I click the register button
#      Then I should see an error message indicating that the email is already in use

#    Scenario: Unsuccessful sign up
#      Given the user is on the sign up page
#      When the user fills out the sign up form with invalid information and submits it
#      Then the user should receive an error message
