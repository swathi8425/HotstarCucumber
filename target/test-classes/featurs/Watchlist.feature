Feature: Hotstar Watchlist

  Scenario: Add a movie to watchlist

    Given I am on the Hotstar home page
    When I search for "Pushpa"
    And I select a movie from the search results
    And I click the Add to Watchlist button
    Then the movie should be added to my watchlist

  Scenario: Open My Space

    Given I am on the Hotstar home page
    When I click My Space
    Then My Space page should be displayed

  Scenario: Verify watchlist movie

    Given I have added a movie to my watchlist
    When I open My Space
    Then the movie should be displayed in my watchlist