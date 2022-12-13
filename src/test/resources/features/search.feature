Feature: Product Search
  As a user,
  I want to be able to search for products on the webshop from the homepage.
  So that I can find the items I am looking for

  Background:
    Given I am logged in
    And open main page

  Rule: The search function should be available on the homepage

    Scenario: Successful search
      Given I am on the webshop homepage
      When I enter a search term in the search box
      And I click the search button
      Then the search results page should be displayed
      And the search results should include the entered search term