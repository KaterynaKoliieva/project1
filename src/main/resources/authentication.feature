Feature: Smoke
  As a user
  I want to log in and log out to the site
  So that I can be sure that authentication works correctly

  Background: User is Logged In
    Given User opens login page
    When User enters email in the Email field
    And User enters password in the Password field
    Then User clicks the Sign in button

  @LogInTest
  Scenario Outline: Check the login of a registered user to the site
    Then User sees his '<first and last name>' in the Account field

    Examples:
    | first and last name                        |
    | 1660074366230cucumber 1660074366230cucumber|

  @LogOutTest
  Scenario Outline: Check the logout of the registered user from the site
    Given User clicks the Your Account Button
    When User clicks the log out button
    Then User checks is the '<sign in>' button displayed

    Examples:
      | sign in            |
      | Sign in / Register |

