Feature: Searching of various product categories along with normal product search

Scenario: User should be able to search for the products under book categories
Given I visited the website as Guest User
When I select the Books from the Search Dropdown
And I click on search icon option
Then I should see the page having heading as Amazon best reads is displayed
But I should not see the other category product



