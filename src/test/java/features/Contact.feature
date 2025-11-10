Feature: Check contact page

  Background: Validate Contact Page
  Scenario: User checks contact page
    Given user navigates to the Contact Page
    When user clicks on Read the full documentation link
    Then he will be able to see the Github Page
