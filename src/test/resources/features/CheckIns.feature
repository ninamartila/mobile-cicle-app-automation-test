@Checkins
Feature: Test the Check-Ins Functionality in Staging Cicle App

  Background:
    Given User allready on Home page
    When User click Team, choose Checkins Page

  @TCCI1 @PCI @Positive @TestRun
  Scenario: User add new a title check ins question
    When User click logo add a new checkins
    And User set name question Test Question
    And User click day to schedule
    And User click set time
    And User click button Start collecting answer!
    Then User get the results of the qustions

  @TCCI2 @PCI @Positive @TestRun
  Scenario: User add new a comment
    When User click a checkins question
    And User click box add new comment
    And User type to question text Test Comment
    And User send a message
    Then User get the result of the text question

  @TCCI3 @PCI @Positive @TestRun
  Scenario: User reply comment
    When User click a checkins question
    And User click button reply comment
    And User click box add new comment
    And User type reply a text Balas Test Comment
    And User send a message
    Then User get the result of the reply text

  @TCCI4 @PCI @Positive @TestRun
  Scenario: User add Bold to make text bold at chat comment
    When User click a checkins question
    And User click box add new comment
    And User click Bold logo
    And User type to question text Test by Automate
    And User send a message with text bold at chat comment
    Then User get the result of the text bold at chat comment

  @TCCI5 @PCI @Positive @TestRun
  Scenario: User add tag mention all member at chat comment
    When User click a checkins question
    And User click box add new comment
    And User click mention logo @
    And User select member to mention
    Then User get the result of the mention member

  @TCCI6 @PCI @Positive @TestRun
  Scenario: User add Italic to make text italicsize at chat comment
    When User click a checkins question
    And User click box add new comment
    And User click Italic logo
    And User type to question text Test Italic Font
    And User send a message with text italicsize at chat comment
    Then User get the result of the text italicsize at chat comment

  @TCCI7 @PCI @Positive @TestRun
  Scenario: User add strike through to make text drawing line at chat comment
    When User click a checkins question
    And User click box add new comment
    And User click strike through logo
    And User type to question text Test text drawing
    And User send a message with text strike through at chat comment
    Then User get the result of the text strike through at chat comment

  @TCCI8 @PCI @Positive @TestRun
  Scenario: User add attach image to chat with comment
    When User click a checkins question
    And User click box add new comment
    And User type to question text Test Show Image
    And User click attach + logo
    And User click a image logo
    And User click by upload
    And User select image
    And User submit attachment
    Then User get the result of the attach image at chat comment

  @TCCI9 @PCI @Positive @TestRun
  Scenario: User add attach document to chat with comment
    When User click a checkins question
    And User click box add new comment
    And User type to question text Test Show Document
    And User click attach + logo
    And User click a document logo
    And User click by upload
    And User select document
    And User submit attachment
    Then User get the result of the attach document at chat comment

  @TCCI10 @PCI @Positive @TestRun
  Scenario: User add attach video to chat with comment
    When User click a checkins question
    And User click box add new comment
    And User type to question text Test Show Video
    And User click attach + logo
    And User click a video logo
    And User click by upload
    And User select video
    And User submit attachment
    Then User get the result of the attach video at chat comment

  @TCCI11 @PCI @Positive @TestRun
  Scenario: User add numbering text to chat comment
    When User click a checkins question
    And User click box add new comment
    And User User click attach numbering logo
    And User type to question text Test Numbering
    And User send a message with text numbering at chat comment
    Then User get the result of the text numbering at chat comment

  @TCCI12 @PCI @Positive @TestRun
  Scenario: User add bullets to text chat comment
    When User click a checkins question
    And User click box add new comment
    And User User click attach bullets logo
    And User type to question text Test Bullet
    And User send a message with text bullets at chat comment
    Then User get the result of the text bullets at chat comment

  @TCCI13 @PCI @Positive @TestRun
  Scenario: User add cheers features comment
    When User click a checkins question
    And User click cheers logo
    And User input text "Test" to cheers
    Then User get the result of the cheers "Test"

  @TCCI14 @NCI @Negative @TestRun
  Scenario: User add attach image to chat without comment
    When User click a checkins question
    And User click box add new comment
    And User click attach + logo
    And User click a image logo
    And User click by upload
    And User select image
    And User submit attachment
    Then User get the result of the attach file at chat comment

  @TCCI15 @NCI @Negative @TestRun
  Scenario: User add new a comment with blank text
    When User click a checkins question
    And User click box add new comment
    And User input text blank comment question text "   "
    And User send a message
    Then User get the result of comment with blank text the question

  @TCCI16 @NCI @Negative @TestRun
  Scenario: User add cheers features comment with blank text
    When User click a checkins question
    And User click cheers logo
    And User input text "   " to cheers
    Then User get the result of the cheers "   "

  @TCCI17 @NCI @Negative @TestRun
  Scenario: User add new a title check ins long question
    And User click logo add a new checkins
    And User set long name question
    And User click day to schedule
    And User click set time
    And User click button Start collecting answer!
    Then User get the results of the long question

  @TCCI18 @NCI @Negative @TestRun
  Scenario: User add new a title check ins blank question
    And User click logo add a new checkins
    And User set blank name question
    And User click day to schedule
    And User click set time
    And User click button Start collecting answer!
    Then User get the results of the blank question

  @TCCI19 @NCI @Negative @TestRun
  Scenario: User add new a title check ins number question
    And User click logo add a new checkins
    And User set number name question
    And User click day to schedule
    And User click set time
    And User click button Start collecting answer!
    Then User get the results of the number question

  @TCCI20 @NCI @Negative @TestRun
  Scenario: User add new a title check ins special character question
    And User click logo add a new checkins
    And User set special character name question
    And User click day to schedule
    And User click set time
    And User click button Start collecting answer!
    Then User get the results of the special character question

  @TCCI21 @NCI @Negative @TestRun
  Scenario: User add new a title check ins no text question
    And User click logo add a new checkins
    And User click button Start collecting answer!
    Then User get the results of the no text question

  @TCCI22 @NCI @Negative @TestRun
  Scenario: User add new a title check ins no title question
    And User click logo add a new checkins
    And User click day to schedule
    And User click set time No title
    And User click button Start collecting answer!
    Then User get the results of the no text question

  @TCCI23 @NCI @Negative @TestRun
  Scenario: User add new a title check ins no day question
    And User click logo add a new checkins
    And User set name question Test Question
    And User click set time
    And User click button Start collecting answer!
    Then User get the results of the no day question

  @TCCI24 @NCI @Negative @TestRun
  Scenario: User add new a comment no text
    When User click a checkins question
    And User click box add new comment
    And User send a message
    Then User get the result of comment with blank text the question

