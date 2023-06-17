@ScheduleTest
Feature: Test the Schedule Functionality in Staging Cicle App

  Background:
    Given User allready on Home page Cicle App
    When User click Team, choose schedule Page

  @TCS1 @PS @Positive @TestRun
  Scenario: User add new event
    When User click yellow button +
    And User write title event Test Event in event
    And User set start date
    And User set Member
    And User click post event
    Then User get result post event

  @TCS2 @PS @Positive @TestRun
  Scenario: User add new event without member
    When User click yellow button +
    And User write title event Test Event in event
    And User set start date
    And User click post event
    Then User get result post event

  @TCS3 @NS @Negative @TestRun
  Scenario: User add new event without start date
    When User click yellow button +
    And User write title event Test Event in event
    And User set start date cencel
    And User set Member
    And User click post event
    Then User get result post event without start date

  @TCS4 @NS @Negative @TestRun
  Scenario: User add new event without data event
    When User click yellow button +
    And User click post event
    Then User get result negative post event

  @TCS5 @NS @Negative @TestRun
  Scenario: User add new event with space text
    When User click yellow button +
    And User write title event
    And User set start date
    And User click post event
    Then User get result post event

  @TCS6 @NS @Negative @TestRun
  Scenario: User add new event with link text
    When User click yellow button +
    And User write title event http text
    And User set start date
    And User click post event
    Then User get result post event

  @TCS7 @NS @Negative @TestRun
  Scenario: User add new event with number text
    When User click yellow button +
    And User write title event number text
    And User set start date
    And User click post event
    Then User get result post event

  @TCS8 @NS @Negative @TestRun
  Scenario: User add new event with unit text
    When User click yellow button +
    And User write title event unik text
    And User set start date
    And User click post event
    Then User get result post event
