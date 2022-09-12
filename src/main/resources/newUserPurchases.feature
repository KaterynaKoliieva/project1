Feature: Smoke
  As a user
  I want to register and make purchases on the site
  So that I can be sure that the registration and adding items to the cart work correctly

  Background: the registration of a new user
    Given User opens login page
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
    Then User clicks the Continue Shopping button

  @RegistrationTest
  Scenario Outline: Check the registration of a new user
    Then User sees his first name and last name in the Account field

    Examples:
      |  |

  @ShoppingCartTest
  Scenario Outline: Check the shopping cart
      Given User enters the '<name>' of the product in the search field
      And User clicks the Deliver button for the desired product1
      And User clicks the Click and Collect button for the desired product2
      And User enters the '<postcode>' in the Find Stores Field
      And User finds a suitable store
      And User clicks the Basket button
      And User checks if the Delivery button is selected for the product1
      And User checks if the Click And Collect button is selected for the product2
      And User checks Sub Total Field
      And User checks the '<text>' of the Delivery Field
      And User checks if the Total Field is the same as the Sub Total Field

      Examples:
      | name   | postcode | text |
      | drills | BA22 8RT | FREE |
