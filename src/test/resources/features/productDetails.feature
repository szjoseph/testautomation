@TC08
Feature: View Product Details

  As a user, I want to be able to view detailed information about a product.

  Rule: The product details page must contain extra information.
    Scenario Outline: View Product Details
      Given open main page
      When user searches for an "<item>"
      Then search results are shown
      And click on product
      Then details visible

      Examples:
        | item            |
        | hamburger szósz |