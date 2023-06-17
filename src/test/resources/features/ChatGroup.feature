@GroupChat
Feature: Test the Chat Group Functionality in Staging Cicle App

  Background:
    Given User on team page cicle app
    When User click Team, choose Group Chat

  @TCGC1 @PGC @Positive @TestRun
  Scenario: Add a new chat to group Team
    When User write the text Test to the group and send it to the group
    Then User get text the result chat group Test

  @TCGC2 @PGC @Positive @TestRun
  Scenario: User copy a text message
    When User click a text message at group
    And User click a Copy
    Then User get text the result text a copy group

  @TCGC3 @PGC @Positive @TestRun
  Scenario: User delete a text message
    When User click a text message at group
    And User click a Delete
    Then User get text the result text a delete group

  @TCGC4 @PGC @Positive @TestRun
  Scenario: User mention a people by select
    When User click box a text message
    And User click a Mention Logo
    And User select person to mention
    Then User get the result a mention person

  @TCGC5 @PGC @Positive @TestRun
  Scenario: User mention a people by select all
    When User click box a text message
    And User click a Mention Logo
    And User select person by mention all
    Then User get the result a mention person by mention all

  @TCGC6 @PGC @Positive @TestRun
  Scenario: User attach a document at chat group
    When User click attach logo group chat
    And User click a document and video group
    And User choose a Document group
    Then User get the Document at group

  @TCGC7 @PGC @Positive @TestRun
  Scenario: Add a new long chat to group Team
    When User long write the text to the group and send it to the group
    Then User get long the result text group

  @TCGC8 @PGC @Positive @TestRun
  Scenario: User attach a photo camera at chat group
    When User click attach logo group chat
    And User click a image form camera group
    And User click icon camera
    And User click icon checklis
    Then User get the Photo at group

  @TCGC9 @PGC @Positive @TestRun
  Scenario: User attach a photo at chat group
    When User click attach logo group chat
    And User click a document and video group
    And User choose a Photo group
    Then User get the Photo at group

  @TCGC10 @PGC @Positive @TestRun
  Scenario: User attach a video at chat group
    When User click attach logo group chat
    And User click a document and video group
    And User choose a Video group
    Then User get the Video at group

  @TCGC11 @NGC @Negative @TestRun
  Scenario: Add a new space chat to group Team
    When User wrong write the text blank to the group and send it to the group
    Then User get wrong the result text group blank

  @TCGC12 @NGC @Negative @TestRun
  Scenario: User mention a people with incomplete email
    When User click box a text message
    And User click a Mention Logo
    And User send the text ninamartila03@gmail to the group
    Then User get the result a mention person

  @TCGC13 @NGC @Negative @TestRun
  Scenario: User send 2 emails without space
    When User write the text ninamartila03@gmail.comninamartila03@gmail.com to the group and send it to the group
    Then User get the result a mention person
