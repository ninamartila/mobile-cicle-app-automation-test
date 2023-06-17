@KanbanTest
Feature: Test the Kanban Board Functionality in Staging Cicle App

  Background:
    Given User on Home Cicle app
    When User click Team, choose Kanban Board

  @TCKB1 @PKD @Positive @TestRun
  Scenario: User Create Add List Backlog in Kanban board page
    When User click a add new Board logo
    And User set name list board In Progress
    And User click a button submit
    Then User get the result of the board

  @TCKB2 @PKD @Positive @TestRun
  Scenario: User Create Add Card in Kanban board
    When User click a Add new card
    And User set name card TestCicle
    And User click a button ok logo
    Then User get the result of the card

  @TCKB3 @PKD @Positive @TestRun
  Scenario: User attachments file document at card list
    When User click a name card list
    And User click Attach file logo +
    And User select file to attach
    Then User get the result of the attach file

  @TCKB4 @PKD @Positive @TestRun
  Scenario: User remove due date at card list
    When User click a name card list
    And User click remove logo + due date
    Then User get the result of the remove due date

  @TCKB5 @PKD @Positive @TestRun
  Scenario: User update title Attachment at card list
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title valid Update Name File
    And User click button update title
    Then User get the result of the update title

  @TCKB6 @PKD @Positive @TestRun
  Scenario: User add subscribe all member
    When User click a name card list
    And User click subscribers logo +
    And User click check all member
    And User click done to uncheck member
    Then User get the result of the uncheck member

  @TCKB7 @PKD @Positive @TestRun
  Scenario: User remove subscribe all member
    When User click a name card list
    And User click subscribers logo +
    And User click uncheck member
    And User click done to uncheck member
    Then User get the result of the uncheck member

  @TCKB8 @PKD @Positive @TestRun
  Scenario: User download title Attachment at card list
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Download attachment
    And User click button ok to download
    Then User get the result of the download attachment

  @TCKB9 @PKD @Positive @TestRun
  Scenario: User remove title Attachment at card list
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Remove attachment
    And User click button ok to remove
    Then User get the result of the remove attachment

  @TCKB10 @PKD @Positive @TestRun
  Scenario: User share card to another member/platform
    When User click a name card list
    When User click a card list *** button
    And User click Share card link
    And User select to share
    Then User get the result of the share card

  @TCKB11 @PKD @Positive @TestRun
  Scenario: User copy card
    When User click a name card list
    When User click a card list *** button
    And User click Copy card
    Then User get the result of the copy card

  @TCKB12 @PKD @Positive @TestRun
  Scenario: User set card to private
    When User click a name card list
    When User click a card list *** button
    And User click set card to Private
    Then User get the result of the set card to private

  @TCKB13 @PKD @Positive @TestRun
  Scenario: User update title card
    When User click a card list
    And User click edit logo title card
    And User set new name card Test Cicle
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TCKB14 @PKD @Positive @TestRun
  Scenario: User archive card
    When User click a name card list
    When User click a card list *** button
    And User click Archive card
    And User click archive
    Then User get the result of the archive button

  @TCKB15 @NKD @Negative @TestRun
  Scenario: User update title Attachment at card list with blank text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title write blank text "   "
    And User click button update title
    Then User get the result of the update title

  @TCKB16 @NKD @Negative @TestRun
  Scenario: User update title Attachment at card list with long text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title write long text
    And User click button update title
    Then User get the result of the update title

  @TCKB17 @NKD @Negative @TestRun
  Scenario: User update title Attachment at card list with web text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title write http text
    And User click button update title
    Then User get the result of the update title

  @TCKB18 @NKD @Negative @TestRun
  Scenario: User update title card with blank text
    When User click a card list
    And User click edit logo title card blank text
    And User set new name blank card text blank
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TCKB19 @NKD @Negative @TestRun
  Scenario: User update title card with http text
    When User click a card list
    And User click edit logo title card http text
    And User set new name http card text http
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TCKB20 @NKD @Negative @TestRun
  Scenario: User update title card with long text
    When User click a card list
    And User click edit logo title card http text
    And User set new name long card text long
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TCKB21 @NKD @Negative @TestRun
  Scenario: User Create Add List Backlog in Kanban board page with long text
    When User click a add new Board logo
    And User set wrong name list board
    And User click a button submit
    Then User get the wrong result of the board

  @TCKB22 @NKD @Negative @TestRun
  Scenario: User Create Add List Backlog in Kanban board page with bank text
    When User click a add new Board logo
    And User set wrong name blank list board
    And User click a button submit
    Then User get the wrong blank result of the board

  @TCKB23 @NKD @Negative @TestRun
  Scenario: User Create Add Card in Kanban board with long text
    When User click a Add new card
    And User set name long card
    And User click a button ok logo
    Then User get long the result of the card

  @TCKB24 @NKD @Negative @TestRun
  Scenario: User Create Add Card in Kanban board with blank text
    When User click a Add new card
    And User set name blank card
    And User click a button ok logo
    Then User get blank the result of the card

  @TCKB25 @NKD @Negative @TestRun
  Scenario: User Create Add List Backlog in Kanban board page without text
    When User click a add new Board logo
    And User write without text list board
    And User click a button submit
    Then User get not response at submit

  @TCKB26 @NKD @Negative @TestRun
  Scenario: User Create Add Card in Kanban board without text
    When User click a Add new card
    And User write without text card
    And User click a button ok logo
    Then User get blank the result of the card

  @TCKB27 @NKD @Negative @TestRun
  Scenario: User Create comment in card without text
    When User click a name card list
    And User click Add New comment
    And User click a submit comment
    Then User get not response at submit comment

  @TCKB28 @PKD @Positive @TestRun
  Scenario: User Create comment in card with add photo and text
    When User click a name card list
    And User add photo and write Test Photo file in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB29 @PKD @Positive @TestRun
  Scenario: User Create comment in card with add document
    When User click a name card list
    And User add document in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB30 @PKD @Positive @TestRun
  Scenario: User Create comment in card with add video link
    When User click a name card list
    And User add video link in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB31 @PKD @Positive @TestRun
  Scenario: User Create comment in card with add video
    When User click a name card list
    And User add video in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB32 @PKD @Positive @TestRun
  Scenario: User set card to public
    When User click a name card list
    When User click a card list *** button
    And User click set card to public
    Then User get the result of the set card to private

  @TCKB33 @PKD @Positive @TestRun
  Scenario: User Create comment in card with long text
    When User click a name card list
    And User write comment with long text
    And User click a submit comment
    Then User get result at submit comment

  @TCKB34 @PKD @Positive @TestRun
  Scenario: User Create comment in card with mantion all member
    When User click a name card list
    And User mantion all member
    And User click a submit comment
    Then User get result at submit comment

  @TCKB35 @PKD @Positive @TestRun
  Scenario: User Create comment in card with bold text
    When User click a name card list
    And User bold text, write Test Bold in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB36 @PKD @Positive @TestRun
  Scenario: User Create comment in card with italic text
    When User click a name card list
    And User italic text, write Test Italic in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB37 @PKD @Positive @TestRun
  Scenario: User Create comment in card with streak text
    When User click a name card list
    And User streak text, write Test Streak in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB38 @PKD @Positive @TestRun
  Scenario: User Create comment in card with list number text
    When User click a name card list
    And User list number text, write Test List Number in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB39 @PKD @Positive @TestRun
  Scenario: User Create comment in card with list bullet text
    When User click a name card list
    And User list bullet text, write Test List Bullet in comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB40 @PKD @Positive @TestRun
  Scenario: User Create Add List Backlog in Kanban board page with number text
    When User click a add new Board logo
    And User set wrong name number list board
    And User click a button submit
    Then User get the wrong blank result of the board

  @TCKB41 @PKD @Positive @TestRun
  Scenario: User update title Attachment at card list with number text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title write number text
    And User click button update title
    Then User get the result of the update title

  @TCKB42 @PKD @Positive @TestRun
  Scenario: User update title card with number text
    When User click a card list
    And User click edit logo title card http text
    And User set new name number card text
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TCKB43 @PKD @Positive @TestRun
  Scenario: User Create Add Card in Kanban board with unik text
    When User click a Add new card
    And User set name unik card
    And User click a button ok logo
    Then User get blank the result of the card

  @TCKB44 @PKD @Positive @TestRun
  Scenario: User Create Add Card in Kanban board with number text
    When User click a Add new card
    And User set name number card
    And User click a button ok logo
    Then User get blank the result of the card

  @TCKB45 @PKD @Positive @TestRun
  Scenario: User Create comment in card
    When User click a name card list
    And User write comment
    And User click a submit comment
    Then User get result at submit comment

  @TCKB46 @PKD @Positive @TestRun
  Scenario: User Create comment in card with unik text
    When User click a name card list
    And User write comment with unik text
    And User click a submit comment
    Then User get result at submit comment

  @TCKB47 @PKD @Positive @TestRun
  Scenario: User Create comment in card with number text
    When User click a name card list
    And User write comment with number text
    And User click a submit comment
    Then User get result at submit comment

  @TCKB48 @NKD @Negative @TestRun
  Scenario: User Create Add List Backlog in Kanban board page with link text
    When User click a add new Board logo
    And User set wrong name link list board
    And User click a button submit
    Then User get the wrong blank result of the board

  @TCKB49 @NKD @Negative @TestRun
  Scenario: User Create Add List Backlog in Kanban board page with unik text
    When User click a add new Board logo
    And User set wrong name unik list board
    And User click a button submit
    Then User get the wrong blank result of the board

  @TCKB50 @NKD @Negative @TestRun
  Scenario: User update title Attachment at card list with unik text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit title write unik text
    And User click button update title
    Then User get the result of the update title

  @TCKB51 @NKD @Negative @TestRun
  Scenario: User update title Attachment at card list without text
    When User click a name card list
    And User click Attachment logo *** to update
    And User click Edit attachment
    And User click button update title
    Then User get the result of the update title

  @TCKB52 @NKD @Negative @TestRun
  Scenario: User update title card with unik text
    When User click a card list
    And User click edit logo title card http text
    And User set new name unik card text
    And User click ok logo button to new name card
    Then User get the result of the new name card

  @TCKB53 @NKD @Negative @TestRun
  Scenario: User update title card without text
    When User click a card list
    And User click edit logo title card http text
    And User set new card without name text
    And User click ok logo button to new name card

  @TCKB54 @NKD @Negative @TestRun
  Scenario: User Create Add Card in Kanban board with http text
    When User click a Add new card
    And User set name http card
    And User click a button ok logo
    Then User get blank the result of the card

  @TCKB55 @NKD @Negative @TestRun
  Scenario: User Create comment in card with http text
    When User click a name card list
    And User write comment with http text
    And User click a submit comment
    Then User get result at submit comment

  @TCKB56 @NKD @Negative @TestRun
  Scenario: User Create comment in card with blank text
    When User click a name card list
    And User write comment with blank text
    And User click a submit comment
    Then User get not response at submit comment

  @TCKB57 @NKD @Negative @TestRun
  Scenario: User cant Create comment in card with add photo
    When User click a name card list
    And User add document file in comment
    And User click a submit comment
    Then User get not response at submit comment