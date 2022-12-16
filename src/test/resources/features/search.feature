@TC10
@Search
Feature: Product Search
  As a user,
  I want to be able to search for products on the webshop from the homepage.
  So that I can find the items I am looking for

  Rule: The search function should be available on the homepage

    Scenario Outline: Successful search
      Given open main page
      And I am on the login page
      And I log in with my "<email>" and "<password>"
      When user searches for an "<item>"
      Then search results are shown

      Examples:
        | email                 | password  | item            |
        | 8494ake3.uv@gmail.com | Jelszo123 | hamburger szósz |


#      When I enter a search term in the search box
 #     And I click the search button
  #    Then the search results page should be displayed
   #   And the search results should include the entered search term