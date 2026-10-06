Feature: Hotstar Subscription and Payment

  Background:
    Given user opens Hotstar application

  @subscription
  Scenario: TC21 Verify My Space
    When user opens My Space
    Then My Space page should be displayed

  @subscription
  Scenario: TC22 Verify Premium option
    When user opens My Space
    Then Premium option should be displayed

  @subscription
  Scenario: TC23 Open Premium subscription
    When user opens My Space
    And user selects Premium
    Then subscription page should be displayed

  @subscription
  Scenario: TC24 Verify Payment Details page
    When user opens My Space
    And user selects Premium
    Then Payment Details page should be displayed

  @subscription
  Scenario: TC25 Verify subscription plans
    When user opens My Space
    And user selects Premium
    Then subscription plans should be displayed

  @subscription
  Scenario: TC26 Select Premium plan
    When user opens My Space
    And user selects Premium
    And user selects Premium subscription plan
    Then Premium subscription plan should be selected

  @subscription
  Scenario: TC27 Verify Continue button
    When user opens My Space
    And user selects Premium
    Then Continue button should be displayed

  @subscription
  Scenario: TC28 Continue subscription
    When user opens My Space
    And user selects Premium
    And user selects Premium subscription plan
    And user clicks Continue
    Then subscription checkout page should be displayed

  @subscription
  Scenario: TC29 Verify subscription URL
    When user opens My Space
    And user selects Premium
    Then subscription URL should be displayed

  @subscription
  Scenario: TC30 Verify subscription page heading
    When user opens My Space
    And user selects Premium
    Then Payment Details heading should be displayed