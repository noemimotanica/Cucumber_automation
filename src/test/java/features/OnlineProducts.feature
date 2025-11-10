Feature: Check products

  Background: View articles
  Scenario: User checks sport shoes type
    Given user navigates to the Online Products Page
    When user clicks on Sports Shoes arrow
    And  he will be able to view the shoe type
    Then he will be able to set the size and the color
