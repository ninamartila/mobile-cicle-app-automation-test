@ChatPersonal
Feature: Test the Chat Personal Functionality in Staging Cicle App

  Background: Scope chat personal
    Given User on app cicle stage
    When User click menu, and click Inbox

  @TCPC1 @PPC @Positive @TestRun
  Scenario: User add a new Chat personal
    And User add a new Chat
    And User chose friend to add new chat
    And User type text Test
    Then User get the result text Test

  @TCPC2 @PPC @Positive @TestRun
  Scenario: User copy a text chat
    When User choose a friend to select a chat
    And User click a text message
    And User click copy
    Then User get the copy a text

  @TCPC3 @PPC @Positive @TestRun
  Scenario: User delete a text chat
    When User choose a friend to select a chat
    And User click a text message
    And User click delete
    Then User get the delete a text

  @TCPC4 @PPC @Positive @TestRun
  Scenario: User mention a people by select
    When User choose a friend to select a chat
    And User click box message
    And User click a icon clip
    And User click person to mention
    Then User get the result

  @TCPC5 @PPC @Positive @TestRun
  Scenario: User attach a document at chat
    When User choose a friend to select a chat
    And User click attach logo
    And User click a document and video
    And User select a Document
    Then User get the Document

  @TCPC6 @PPC @Positive @TestRun
  Scenario: User attach a video at chat
    When User choose a friend to select a chat
    And User click attach logo
    And User click a document and video
    And User choose a Video
    Then User get the Video

  @TCPC7 @PPC @Positive @TestRun
  Scenario: User attach image from gallery
    When User choose a friend to select a chat
    And User click attach logo
    And User click a Image from Gallery
    And User choose image from gallery
    Then User get the image from gallery

  @TCPC8 @PPC @Positive @TestRun
  Scenario: User attach image from camera
    When User choose a friend to select a chat
    And User click attach logo
    And User click a Image from Camera
    And User click camera button
    Then User get the image from camera

  @TCPC9 @PPC @Positive @TestRun
  Scenario: User search valid history Private Message
    When User type valid a Kiki at box search
    Then User can see get the history search name true

  @TCPC10 @NPC @Negative @TestRun
  Scenario: User search invalid history Private Message
    When User type invalid a Kangguru at box search
    Then User can not get the history search name false

  @TCPC11 @NPC @Negative @TestRun
  Scenario: Add a new space chat to private message
    When User choose a friend to select a chat
    And User wrong sand the text blank to the group
    Then User not get the result text

  @TCPC12 @NPC @Negative @TestRun
  Scenario: User mention a people with incomplete email
    When User choose a friend to select a chat
    And User click box message
    And User click a icon clip
    And User type sand text kikisahnakri18@gmail
    Then User get the result

  @TCPC13 @NPC @Negative @TestRun
  Scenario: User send 2 emails without space
    When User choose a friend to select a chat
    And User click box message
    And User type text ninamartila03@gmail.comninamartila03@gmail.com
    Then User get the result




