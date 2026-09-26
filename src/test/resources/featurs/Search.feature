Feature: Hotstar Search

  Scenario: Search for a movie
    Given I am on the Hotstar home page
    When I click on the search icon
    And I enter "Pushpa" in the search box
    Then search results should be displayed

  Scenario: Search for an invalid movie
    Given I am on the Hotstar home page
    When I click on the search icon
    And I enter "XYZ12345" in the search box
    Then no relevant search result should be displayed