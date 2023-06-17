@Home
Feature: Test the Home Functionality in Staging Cicle App

  Background:
    Given User on Home Page Cicle app

  @TCH1 @PH @Positive @TestRun
  Scenario: User add HQ company
    When User click button + yellow
    And User click Add New HQ
    And User write name Test HQ to the company
    And User write description Test Description to the company
    Then User click button Create

  @TCH2 @PH @Positive @TestRun
  Scenario: User add team company
    When User click button + yellow
    And User click Add New Team
    And User write name Test Team to the company
    And User write description Test Description to the company
    Then User click button Create

  @TCH3 @PH @Positive @TestRun
  Scenario: User add project company
    When User click button + yellow
    And User click Add New Project
    And User write name Test Project to the company
    And User write description Test Description to the company
    Then User click button Create

  @TCH4 @PH @Positive @TestRun
  Scenario: User invite people
    When User click button + invite
    And User write email testCicleApp01@gmail.com for invite
    And User click button Send
    Then User get result email has been sent

  @TCH5 @PH @Positive @TestRun
  Scenario: User Edit Photo Avatar
    When User click menu, and click profile
    And User click Edit profile
    And User click Edit photo profile
    And User select photo
    Then User get result edit photo

  @TCH6 @PH @Positive @TestRun
  Scenario: User Edit data profile
    When User click menu, and click profile
    And User click Edit profile
    And User change bio Test Automation in profile
    And User change about Test About in profile
    And User click icon save
    Then User get result edit data profile

  @TCH7 @NH @Negative @TestRun
  Scenario: User add HQ company with empty data
    When User click button + yellow
    And User click Add New HQ
    And User click button Create
    Then User get result empty data

  @TCH8 @NH @Negative @TestRun
  Scenario: User add HQ company with empty data Name
    When User click button + yellow
    And User click Add New HQ
    And User write description Test Description to the company
    And User click button Create
    Then User get result empty data

  @TCH9 @NH @Negative @TestRun
  Scenario: User add HQ company with empty data Description
    When User click button + yellow
    And User click Add New HQ
    And User write name Test HQ to the company
    And User click button Create
    Then User get result empty data

  @TCH10 @NH @Negative @TestRun
  Scenario: User add team company with empty data
    When User click button + yellow
    And User click Add New Team
    And User click button Create
    Then User get result empty data

  @TCH11 @NH @Negative @TestRun
  Scenario: User add team company with empty data name
    When User click button + yellow
    And User click Add New Team
    And User write description Test Description to the company
    And User click button Create
    Then User get result empty data

  @TCH12 @NH @Negative @TestRun
  Scenario: User add team company with empty data description
    When User click button + yellow
    And User click Add New Team
    And User write name Test Team to the company
    And User click button Create
    Then User get result empty data

  @TCH13 @PH @Negative @TestRun
  Scenario: User add project company with empty data
    When User click button + yellow
    And User click Add New Project
    And User click button Create
    Then User get result empty data

  @TCH14 @PH @Negative @TestRun
  Scenario: User add project company with empty data name
    When User click button + yellow
    And User click Add New Project
    And User write description Test Description to the company
    And User click button Create
    Then User get result empty data

  @TCH15 @PH @Negative @TestRun
  Scenario: User add project company with empty data description
    When User click button + yellow
    And User click Add New Project
    And User write name Test Project to the company
    And User click button Create
    Then User get result empty data