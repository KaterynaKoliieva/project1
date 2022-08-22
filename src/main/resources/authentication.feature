Feature: Smoke
  As a user
  I want to log in and log out to the site
  So that I can be sure that authentication works correctly

  Scenario Outline: Check the login of a registered user to the site
    Given User opens login '<page>'
    When User enters '<email>' in the email field
    And User enters '<password>' in the password field
    And User clicks the Sign in button
    Then User sees his '<first and last name>' in the Account field

    Examples:
    | page                            | email                          | password              | first and last name                        |
    | https://www.screwfix.com/login/ | 1660074366230cucumber@test.com | 1660074366230cucumber | 1660074366230cucumber 1660074366230cucumber|

  Scenario Outline: Check the logout of the registered user from the site
    Given User opens login '<page>'
    When User enters '<email>' in the email field
    And User enters '<password>' in the password field
    And User clicks the Sign in button
    And User clicks the Your Account Button
    And User clicks the log out button
    Then User checks is the '<sign in>' button displayed

    Examples:
      | page                            | email                          | password              | sign in            |
      | https://www.screwfix.com/login/ | 1660074366230cucumber@test.com | 1660074366230cucumber | Sign in / Register |

