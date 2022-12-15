Feature: View Product Details

  As a user, I want to be able to view detailed information about a product.

  Rule: The product details page must contain extra information.
    Scenario Outline: View Product Details
      Given open main page
      When user searches for an "<item>"
      Then search reults are shown
      And click on product
      Then details visible

      Examples:
        | item            |
        | hamburger szósz |