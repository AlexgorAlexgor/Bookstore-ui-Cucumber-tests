@ProfilePageTests

Feature: using Profile page with success login

  Background:
    Given I open Bookstore page
    When I push the Login button on Bookstore page
    Then  I am on the page with Login-form
    Then I am on the page Profile

  Scenario: Sorting by title A-Z
    When I click on sorting field for sort title-colummn unter header-content .
    Then All items sorted by title alphabetically A-Z
    When I click on sorting field for sort title-colummn unter header-content .
    Then All items sorted by title alphabetically Z-A

  Scenario: Sorting by author A-Z
    When I click on sorting field for sort colummn author unter header-content .
    Then All items sorted by author alphabetically A-Z
    When I click on sorting field for sort colummn author unter header-content .
    Then All items sorted by author alphabetically Z-A

  Scenario: Sorting by publisher  A-Z
    When I click on sorting field for sort colummn publisher unter header-content .
    Then All items sorted by publisher alphabetically A-Z
    When I click on sorting field for sort colummn publisher unter header-content .
    Then All items sorted by publisher alphabetically Z-A

