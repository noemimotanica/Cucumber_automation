Feature: Logged in user view

  Background: Login scenarios
  Scenario: User logs in with valid credentials
    Given user navigates to the Login Page
    When user successfully enters the credentials
    Then he should be able to view the product category page

#Examples:
#  | username       |  | password  |
#  | Alex           |  | pisica123 |
#  | Alex	pisica123 |  |


