Feature: Hotstar Watchlist Functionality

  Background:
    Given user opens Hotstar application

  @watchlist
  Scenario: TC11 Verify watchlist option
    Then watchlist option should be displayed

  @watchlist
  Scenario: TC12 Add movie to watchlist
    When user searches for movie "Kantara"
    And user adds the movie to watchlist
    Then movie should be added to watchlist

  @watchlist
  Scenario: TC13 Add another movie to watchlist
    When user searches for movie "Jailer"
    And user adds the movie to watchlist
    Then movie should be added to watchlist

  @watchlist
  Scenario: TC14 Open watchlist
    When user opens watchlist
    Then watchlist page should be displayed

  @watchlist
  Scenario: TC15 Verify movie in watchlist
    When user opens watchlist
    Then selected movie should be displayed

  @watchlist
  Scenario: TC16 Add multiple movies
    When user searches for movie "Kantara"
    And user adds the movie to watchlist
    And user searches for movie "Jailer"
    And user adds the movie to watchlist
    Then movies should be added to watchlist

  @watchlist
  Scenario: TC17 Verify watchlist after refresh
    When user opens watchlist
    And user refreshes the page
    Then watchlist page should be displayed

  @watchlist
  Scenario: TC18 Verify watchlist URL
    When user opens watchlist
    Then watchlist URL should be displayed

  @watchlist
  Scenario: TC19 Verify watchlist movie card
    When user opens watchlist
    Then movie card should be displayed

  @watchlist
  Scenario: TC20 Verify watchlist page title
    When user opens watchlist
    Then watchlist page title should be displayed