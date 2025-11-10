Feature: Check products

  Background: View articles
  Scenario: User registers successfully
    Given user navigates to the Registration Page
    When user select the form of salutation
    And he completes all the blank fields
    And he clicks on submit button
    Then he will be registered successfully