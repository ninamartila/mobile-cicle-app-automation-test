package com.appium.stepDefinition;

import com.appium.pageObject.HomePage;
import com.appium.pageObject.KanbanPage;
import com.appium.pageObject.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.AppiumDriverEX;

import static org.junit.Assert.assertTrue;

public class KanbanBoardStep {

    public static AppiumDriver appiumDriver;
    public KanbanBoardStep() {
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;
    TeamPage team;
    KanbanPage kanban;

    @Given("User on Home Cicle app")
    public void userOnHomeCicleApp() {
        home = new HomePage(appiumDriver);
        team = new TeamPage(appiumDriver);
        kanban = new KanbanPage(appiumDriver);
        home.assertHomePage();
    }

    @When("User click Team, choose Kanban Board")
    public void userClickTeamChooseKanbanBoard() {
        home.clickTeam(0);
        team.clickBoard();
    }

    @When("User click a add new Board logo")
    public void userClickAAddNewBoardLogo() {
        kanban.clickNewBoard();
    }

    @And("^User set name list board (.*)$")
    public void userSetNameListBoardInProgress(String text) {
        kanban.inputBoardName(text);
    }

    @And("User click a button submit")
    public void userClickAButtonSubmit() {
        kanban.clickSubmitBoard();
    }

    @Then("User get the result of the board")
    public void userGetTheResultOfTheBoard() {
        kanban.assertBoard();
    }

    /*
       ini TS 002
    */

    @And("User set wrong name list board")
    public void userSetWrongNameListBoardInProgress() {
        kanban.inputWrongBoardName();
    }

    @And("User write without text list board")
    public void userWriteWithoutTextListBoard() {
            kanban.inputWithoutText();
            }

    @Then("User get the wrong result of the board")
    public void userGetTheWrongResultOfTheBoard() {
        kanban.assertLongText();
    }

    /*
       ini TS 002
    */

    @And("User set wrong name blank list board")
    public void userSetWrongNameBlankListBoardInProgress() {
        kanban.inputBlankBoardName(" ");
    }

    @Then("User get the wrong blank result of the board")
    public void userGetTheWrongBlankResultOfTheBoard() {
        kanban.assertBlankBoard();
    }

    /*
       ini TS 002
    */

    @When("User click a Add new card")
    public void userClickAAddNewCard() {
        kanban.clickAddNewCard();
    }

    @And("^User set name card (.*)$")
    public void userSetNameCardProject(String text) {
        kanban.inputCardName(text);
    }

    @And("User click a button ok logo")
    public void userClickAButtonOkLogo() {
        kanban.clickOkCard();
    }

    @Then("User get the result of the card")
    public void userGetTheResultOfTheCard() {
        kanban.assertCard();
    }

    /*
       ini TS 002
    */

    @And("User set name long card")
    public void userSetNameLongCard() {
        kanban.inputLongCardName();
    }

    @Then("User get long the result of the card")
    public void userGetLongTheResultOfTheCard() {
        kanban.assertLongCard();
    }

    /*
       ini TS 002
    */

    @And("User set name blank card")
    public void userSetNameBlankCard() {
        kanban.inputBlankCardName("   ");
    }

    @And("User write without text card")
    public void userWriteWithoutTextCard() {
        kanban.inputWithoutTextCard();
    }

    @Then("User get blank the result of the card")
    public void userGetBlankTheResultOfTheCard() {
        kanban.assertBlankCard();
    }

    @Then("User get not response at submit")
    public void userGetNotResponseAtSubmit() {
        kanban.assertNotResponse();
    }
    /*
       ini TS 002
    */

    @When("User click a name card list")
    public void userClickANameCardList() {
        kanban.clickCardName(0);
    }

    @And("User click set due date")
    public void userClickSetDueDate() {
        kanban.clickEditCard();
        kanban.clickSetDueDate();
    }

    @And("User set date, set time, click ok")
    public void userSetDateSetTimeClickOk() {
        kanban.clickDueDate();
    }

    @Then("User get the result of the set due date")
    public void userGetTheResultOfTheSetDueDate() {
        kanban.assertSetDueDate();
    }

    /*
       ini TS 002
    */

    @And("User click add tag +Labels")
    public void userClickAddTagLabels() {
        kanban.clickLabel();
    }

    @And("User click a Create new Label")
    public void userClickACreateNewLabel() {
        kanban.clickCreateLabel();

    }

    @And("^User input name label (.*)$")
    public void userInputNameLabelUrgent(String text) {
        kanban.inputNameLabel(text);
    }

    @And("User set colour, click button submit")
    public void userSetColourClickButtonSubmit() {
        kanban.clickColourLabel();
        kanban.enterlabelTag();
        kanban.clickSubmit();
    }

    @Then("User get the result of the create label tag")
    public void userGetTheResultOfTheCreateLabelTag() {
        kanban.assertLabel();
    }

    @And("User input long name label Urgent")
    public void userInputLongNameLabelUrgent() {
        kanban.inputLongNameLabel();
    }

    @And("User input blank name label Urgent")
    public void userInputBlankNameLabelUrgent() {
        kanban.inputBlankNameLabel("   ");
    }

    /*
       ini TS 002
    */

    @And("User select tag label")
    public void userSelectTagLabel() {
        kanban.selectListLabel(0);;
    }

    @Then("User get the result of the select label tag")
    public void userGetTheResultOfTheSelectLabelTag() {
        kanban.assertToggleLabel();
    }

    /*
       ini TS 002
    */

    @And("User click Description logo +")
    public void userClickDescriptionLogo() {
        kanban.clickDescription();
    }

    @And("User input set Desription")
    public void userInputSetDesription() {
        kanban.inputDescription();
        kanban.enterDescription();
    }

    @And("User click button publish")
    public void userClickButtonPublish() {
        kanban.clickPublish();
    }

    @Then("User get the result of the description")
    public void userGetTheResultOfTheDescription() {
        kanban.assertDescription();
    }

    /*
       ini TS 002
    */

    @And("User click Attach file logo +")
    public void userClickAttachFileLogo() {
        kanban.clickAttachFile();
    }

    @And("User select file to attach")
    public void userSelectFileToAttach() {
        kanban.selectFile(2);
    }

    @Then("User get the result of the attach file")
    public void userGetTheResultOfTheAttachFile() {
        kanban.assertAttachFile();
    }

    /*
       ini TS 002
    */

    @And("User select file txt to attach")
    public void userSelectFileTxtToAttach() {
        kanban.selectFileTxt();

    }

    @Then("User not get the result of the attach file")
    public void userNotGetTheResultOfTheAttachFile() {
        kanban.assertFileTxt();
    }

    /*
       ini TS 002
    */

    @And("User click remove logo + due date")
    public void userClickRemoveLogoDueDate() {
        kanban.clickRemoveLabel();
    }

    @Then("User get the result of the remove due date")
    public void userGetTheResultOfTheRemoveDueDate() {
        kanban.assertRemoveDueDate();
    }

    /*
       ini TS 002
    */

    @And("User click Description logo + to update")
    public void userClickDescriptionLogoToUpdate() {
        kanban.clickDescription();
        kanban.inputUpdateDesc();
    }

    @Then("User click button publish update description")
    public void userClickButtonPublishUpdateDescription() {
        kanban.clickPublish();
        kanban.assertDescription();
    }

    /*
       ini TS 002
    */

    @And("User click Attachment logo *** to update")
    public void userClickAttachmentLogoToUpdate() {
        kanban.clickAttachment();
    }

    @And("^User click Edit title valid (.*)$")
    public void userClickEditTitle(String title) {
        kanban.clickEditTitle();
        kanban.clickInputTitle(title);
    }

    @And("User click Edit title write blank text {string}")
    public void userClickEditTitleWriteBlankText(String text) {
        kanban.clickEditTitle();
        kanban.clickInputTitleBlank(text);
    }

    @And("User click Edit title write long text")
    public void userClickEditTitleWriteLongText() {
        kanban.clickEditTitle();
        kanban.clickInputTitleLong();

    }

    @And("User click Edit title write http text")
    public void userClickEditTitleWriteHttpText() {
        kanban.clickEditTitle();
        kanban.clickInputTitleHttp();
    }

    @And("User click button update title")
    public void userClickButtonUpdateTitle() {
        kanban.clickUpdateTitle();
    }

    @Then("User get the result of the update title")
    public void userGetTheResultOfTheUpdateTitle() {
        kanban.assertUpdateTitle();
    }

    /*
       ini TS 002
    */

    @And("User click Remove attachment")
    public void userClickRemoveAttachment() {
        kanban.clickRemove();
    }

    @And("User click button ok to remove")
    public void userClickButtonOkToRemove() {
        kanban.clickOk();
    }

    @Then("User get the result of the remove attachment")
    public void userGetTheResultOfTheRemoveAttachment() {
        kanban.assertRemoveAttachment();
    }

    /*
       ini TS 002
    */

    @And("User click Download attachment")
    public void userClickDownloadAttachment() {
        kanban.clickDownload();
    }

    @And("User click button ok to download")
    public void userClickButtonOkToDownload() {
        kanban.clickOkDownload();
    }

    @Then("User get the result of the download attachment")
    public void userGetTheResultOfTheDownloadAttachment() {
        kanban.assertDownload();
    }

    /*
       ini TS 002
    */

    @And("User click subscribers logo +")
    public void userClickSubscribersLogo() {
        kanban.clickSubscribers();
    }

    @And("User click check all member")
    public void userClickCheckAllMember() {
        kanban.clickAllCheckBox();
    }

    @And("User click uncheck member")
    public void userClickUncheckMember() {
        kanban.clickCheckBox();
    }

    @And("User click done to uncheck member")
    public void userClickDoneToUncheckMember() {
        kanban.clickDone();
    }

    @Then("User get the result of the uncheck member")
    public void userGetTheResultOfTheUncheckMember() {
        kanban.assertSubscribe();
    }

    /*
       ini TS 002
    */

    @When("User click a card list *** button")
    public void userClickACardListButton() {
        kanban.clickCardListMenu();
    }

    @And("User click Share card link")
    public void userClickShareCardLink() {
        kanban.clickShareCardLink();
    }

    @And("User select to share")
    public void userSelectToShare() {
        kanban.selectToShare();
    }

    @Then("User get the result of the share card")
    public void userGetTheResultOfTheShareCard() {
        kanban.assertToast();

    }

    /*
       ini TS 002
    */

    @And("User click Copy card")
    public void userClickCopyCard() {
        kanban.clickCopyCard();
    }

    @Then("User get the result of the copy card")
    public void userGetTheResultOfTheCopyCard() {
        kanban.assertFeatureCopy();
    }

    /*
       ini TS 002
    */

    @And("User click Archive card")
    public void userClickArchiveCard() {
        kanban.clickArchiveCard();
    }

    @And("User click archive")
    public void userClickArchive() {
        kanban.clickArchive();
    }

    @Then("User get the result of the archive button")
    public void userGetTheResultOfTheArchiveButton() {
        kanban.assertArchivedCard();
    }

    /*
       ini TS 002
    */

    @And("User click set card to Private")
    public void userClickSetCardToPrivate() {
        kanban.clickSetCardToPrivate();
    }

    @Then("User get the result of the set card to private")
    public void userGetTheResultOfTheSetCardToPrivate() {
        kanban.assertSetCardToPrivate();
    }

    /*
       ini TS 002
    */

    @When("User click name board")
    public void userClickNameBoard() {
        kanban.clickNameBoardNew();
    }

    @And("^User set new name board (.*)$")
    public void userSetNewNameBoard(String nameBoard) {
        kanban.enterNewBoardName(nameBoard);

    }

    @And("User click ok logo button")
    public void userClickOkLogoButton() {
        kanban.clickOkBoards();
    }

    @Then("^User get the result of the set new name board (.*)$")
    public void userGetTheResultOfTheSetNewNameBoard(String nameBoard) {
        String a = kanban.assertNewBoardName();
        assertTrue(a.equals(nameBoard));

    }

    /*
       ini TS 002
    */

    @When("User click a card list")
    public void userClickACardList() {
        kanban.clickCardName(0);
    }

    @And("User click edit logo title card")
    public void userClickEditLogoTitleCard() {
        kanban.clickEditNameCardLogo();
    }

    @And("User click edit logo title card blank text")
    public void userClickEditLogoTitleCardBlankText() {
        kanban.clickEditNameCardLogo2();
    }

    @And("User click edit logo title card http text")
    public void userClickEditLogoTitleCardHTTPText() {
        kanban.clickEditNameCardLogo3();
    }

    @And("^User set new name card (.*)$")
    public void userSetNewNameCard(String textName) {
        kanban.enterEditNameCardName(textName);
    }

    @And("^User set new name (?:blank|long|http) card text (.*)$")
    public void userSetNewNameBlankCardProject(String textName) {
        if (textName.contains("blank")){
            kanban.enterEditNameCardNameBlank("   ");
        } else if (textName.contains("long")){
            kanban.enterEditNameCardNameLong();
        } else if (textName.contains("http")){
            kanban.enterEditNameCardNameHttp();
        }
    }

    @And("User click ok logo button to new name card")
    public void userClickOkLogoButtonToNewNameCard() {
        kanban.clickOkEditNameCardSave();
    }

    @Then("^User get the result of the new name card$")
    public void userGetTheResultOfTheNewNameCard() {
        kanban.assertEditNameCardName();

    }

    @And("User click icon pencil")
    public void userClickIconPencil() {
        kanban.clickIconPencil(0);

    }

    @And("^User click Update title (.*)$")
    public void userClickUpdateTitle(String title) {
        kanban.inputTitle(title);
    }

    @And ("User click button checklis")
    public void userClickButtonChecklis() {
        kanban.buttonChecklis();
    }
    /*
       ini TS 002
    */

    @And("User click Add New comment")
    public void clickAddNewComment() {
        kanban.clComment();
    }

    @And("User write comment")
    public void userWriteComment() {
        kanban.writeComment("Test Comment");
    }

    @And("User set blank comment")
    public void userSetBlankComment() {
        kanban.blankComment(" ");
    }

    @And("User click a submit comment")
    public void userClickASubmitComment() {
        kanban.submitComment();
    }

    @Then ("User get not response at submit comment")
    public void userGetNotResponseAtSubmitComment() {
        kanban.assertComment();
    }

    String link = "https://staging.cicle.app/";

    @And("User set wrong name link list board")
    public void userClickUpdateLinkTitle() {
        kanban.inputBlankBoardName(link);
    }

    String unik = "✊♨  ＷＨ\uD835\uDCB6\uD835\uDD31 ίＳ \uD835\uDD43\uD835\uDC28ŕ\uD835\uDC52๓ 丨ρᔕ\uD835\uDD4C\uD835\uDCF6?";

    @And("User set wrong name unik list board")
    public void userClickUpdateUnikTitle() {
        kanban.inputBlankBoardName(unik);
    }

    String number = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15";

    @And("User set wrong name number list board")
    public void userClickUpdateNumberTitle() {
        kanban.inputBlankBoardName(number);
    }

    @And("User click Edit title write unik text")
    public void userClickEditTitleWriteUnikText() {
        kanban.clickEditTitle();
        kanban.clickInputAttechment(unik);
    }

    @And("User click Edit title write number text")
    public void userClickEditTitleWriteNumberText() {
        kanban.clickEditTitle();
        kanban.clickInputAttechment(number);
    }

    @And("User click Edit attachment")
    public void userClickEditAttachment() {
        kanban.clickEditTitle();
        kanban.clickInputAttechmentNoText();
    }

    @And("User set new name unik card text")
    public void userSetNewNameUnikCardProject() {
            kanban.enterEditTitleCard(unik);
    }

    @And("User set new name number card text")
    public void userSetNewNameNumberCardProject() {
        kanban.enterEditTitleCard(number);
    }

    @And("User set new card without name text")
    public void userSetNewCardWithoutNameText() {
        kanban.enterEditTitleCardNoText();
    }

    @And("User set name http card")
    public void userSetNameHTTPCard() {
        kanban.inputBlankCardName(link);
    }

    @And("User set name unik card")
    public void userSetNameUnikCard() {
        kanban.inputBlankCardName(unik);
    }

    @And("User set name number card")
    public void userSetNameNumberCard() {
        kanban.inputBlankCardName(number);
    }

    @Then("User get result at submit comment")
    public void userGetResultAtSubmitComment() {
        kanban.assertResultCard();
    }

    @And("User write comment with http text")
    public void userWriteCommentWithHTTPText() {
        kanban.writeComment(link);
    }

    @And("User write comment with unik text")
    public void userWriteCommentWithUnikText() {
        kanban.writeComment(unik);
    }

    @And("User write comment with number text")
    public void userWriteCommentWithNumberText() {
        kanban.writeComment(number);
    }

    @And("User write comment with blank text")
    public void userWriteCommentWithBlankText() {
        kanban.writeComment("     ");
    }

    @And("User write comment with long text")
    public void userWriteCommentWithLongText() {
        kanban.writeCommentLongText();
    }

    @And("User mantion all member")
    public void userMantionAllMember() {
        kanban.mantionAllMember();
    }

    @And("^User bold text, write (.*) in comment$")
    public void userBoldText(String text) {
        kanban.boldText(text);
    }

    @And("^User italic text, write (.*) in comment$")
    public void userItalicText(String text) {
        kanban.italicText(text);
    }

    @And("^User streak text, write (.*) in comment$")
    public void userStreakText(String text) {
        kanban.streakText(text);
    }

    @And("^User list number text, write (.*) in comment$")
    public void userListNumberText(String text) {
        kanban.listNumberText(text);
    }

    @And("^User list bullet text, write (.*) in comment$")
    public void userListBulletText(String text) {
        kanban.listBulletText(text);
    }

    @And("User add document file in comment")
    public void userAddDocumentFileInComment() {
        kanban.addDocumentFiled();
    }

    @And("^User add photo and write (.*) file in comment$")
    public void userAddPhotoAndWriteFileInComment(String text) {
        kanban.AddPhotoComment(text);
    }

    @And("User add document in comment")
    public void userAddDocumentInComment() {
        kanban.addDocument();
    }

    @And("User add video link in comment")
    public void userAddVideoLinkInComment() {
        kanban.addVideoLink();
    }

    @And("User add video in comment")
    public void userAddVideoInComment() {
        kanban.addVideo();
    }

    @And("User click set card to public")
    public void userClickSetCardToPublic() {
        kanban.clickSetCardToPublic();
    }
}
