Feature: Hotstar Subscription

  Scenario: Verify subscription page

    Given user is on Hotstar home page
    When user clicks My Space
    And user clicks Premium
    And user clicks Payment Details
    And user selects subscription plan
    And user clicks Continue
    Then subscription page should be displayed