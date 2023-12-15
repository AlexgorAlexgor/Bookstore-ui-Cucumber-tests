Feature:
  Background:
    Given I open Bookstore page
    When I push the Login button on Bookstore page
    Then  I am on the page with Login-form
 #   Given I open "Profile" page

  Scenario: Success login with valid data
    When I input "alexgor@gmx.de" to username field
    And input "Alexgor0!" to password field
    When I push the Login button on page with Login-form
    Then I am on the page Profile

  Scenario: Success logout with valid data
    When I input "alexgor@gmx.de" to username field
    And input "Alexgor0!" to password field
    When I push the Login button on page with Login-form
    Then I am on the page Profile
    When I push the Logout button
    Then I am on the page with Login-form

    Scenario: Unsuccess register with valid data but without capcha
      When I push the NewUser button on page with Login-form
      Then I am on the page with Register-form
      When I input valid value "firstNameValue" to FirstName field
      And  I input valid value "lastNameValue" to LastName field
      And I input valid value :  "muster@gmail.com" to username field from this form
      And I input valid value : "Muster0!" to password field from this form
      Then I push the Register button
      Then I see mesage "Please verify reCaptcha to register!" on the page with Register-form