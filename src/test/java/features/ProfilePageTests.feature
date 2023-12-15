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

 # @invalid_data
 # Scenario Outline: Login with invalid data
 #   When I input "<username>" to username field
 #   And input "<password>" to password field
 #   When I push the Login button
 #   Then error message about invalid user with text "<errorMessageText>" is displayed
 #   Examples:
  #    | username        | password     | errorMessageText                                            |
  #    | standard_user   | 34567890     | Username and password do not match any user in this service |
  #    | standard_userr  | secret_sauce | Username and password do not match any user in this service |
  #    | locked_out_user | secret_sauce | Sorry, this user has been locked out.                       |

  #@empty_fields
  #Scenario Outline: login with empty fields
   # When I input "<username>" to username field
   # And input "<password>" to password field
  #  When I push the Login button
  #  Then error message about empty user_data with text "<errorMessageText>" is displayed
  #  Examples:
   #   | username      | password | errorMessageText     |
   #   |               | 34567890 | Username is required |
    #  | standard_user |          | Password is required |
    #  |               |          | Username is required |
