Feature: Hotstar Search Functionality

  Background:
    Given user opens Hotstar application

  @search
  Scenario: TC01 Verify Hotstar home page
    Then Hotstar home page should be displayed

  @search
  Scenario: TC02 Verify search button
    Then search option should be displayed

  @search
  Scenario: TC03 Open search page
    When user clicks search
    Then search page should be displayed

  @search
  Scenario: TC04 Search for a valid movie
    When user clicks search
    And user searches for movie "Kantara"
    Then search results should be displayed

  @search
  Scenario: TC05 Search for another movie
    When user clicks search
    And user searches for movie "Jailer"
    Then search results should be displayed

  @search
  Scenario: TC06 Search for invalid movie
    When user clicks search
    And user searches for movie "XYZABC12345"
    Then no search results should be displayed

  @search
  Scenario: TC07 Search with partial movie name
    When user clicks search
    And user searches for movie "Kan"
    Then search results should be displayed

  @search
  Scenario: TC08 Search using lowercase text
    When user clicks search
    And user searches for movie "kantara"
    Then search results should be displayed

  @search
  Scenario: TC09 Search using uppercase text
    When user clicks search
    And user searches for movie "KANTARA"
    Then search results should be displayed

  @search
  Scenario: TC10 Search with spaces
    When user clicks search
    And user searches for movie "  Kantara  "
    Then search results should be displayed