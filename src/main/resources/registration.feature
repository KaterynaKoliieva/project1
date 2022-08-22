Feature: Smoke
  As a user
  I want to register on the site
  So that I can be sure that the registration works correctly

  Scenario Outline: Check the registration of a new user
    Given User opens login '<page>'
    When User clicks the Register now button
    And User enters email in the Email Address field
    And User clicks on the Continue button
    And User chooses Title
    And User enters first name in the First Name field
    And User enters last name in the Last Name field
    And User chooses Profession
    And User enters Postcode
    And User selects Address
    And User enters password and retypes it in the Password and Re-type Password fields
    And User clicks on the Register now button
    When User clicks the Continue Shopping button
    Then User sees his first name and last name in the Account field

    Examples:
      | page                            |
      | https://www.screwfix.com/login/ |
