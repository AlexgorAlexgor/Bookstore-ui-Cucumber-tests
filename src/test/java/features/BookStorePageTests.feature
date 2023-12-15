@BookStorePageTests

Feature: using BookStore page without  login

  Background:
    Given I open Bookstore page
    Then I am on the BookStore page

  Scenario: Sorting by title A-Z on the BookStore page
    When I click on sorting field for sort title-colummn unter header-content on the BookStore page
    Then All items sorted by title alphabetically A-Z on the BookStore page
    When I click on sorting field for sort title-colummn unter header-content on the BookStore page
    Then All items sorted by title alphabetically Z-A on the BookStore page

  Scenario: Sorting by author A-Z on the BookStore page
    When I click on sorting field for sort colummn author unter header-content on the BookStore page
    Then All items sorted by author alphabetically A-Z on the BookStore page
    When I click on sorting field for sort colummn author unter header-content on the BookStore page
    Then All items sorted by author alphabetically Z-A on the BookStore page

  Scenario: Sorting by publisher  A-Z on the BookStore page
    When I click on sorting field for sort colummn publisher unter header-content on the BookStore page
    Then All items sorted by publisher alphabetically A-Z on the BookStore page
    When I click on sorting field for sort colummn publisher unter header-content on the BookStore page
    Then All items sorted by publisher alphabetically Z-A on the BookStore page
