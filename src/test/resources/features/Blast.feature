@Blast
Feature: Test the Blast Functionality in Staging Cicle App

  Background:
    Given User allready on Home Cicle App
    When User click Blast, choose Blast Page

  @TCB1 @PB @Blast @Positive @TestRun
  Scenario: User add Post Blast
    When User click button + yellow on Blast Page
    And User write title name Test Blast to the blast
#    And User write description Test Description to the blast
#    And User set date on the blast
#    And User click button publish on the blast