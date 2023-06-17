package com.appium.stepDefinition;

import com.appium.pageObject.CheckInsPage;
import com.appium.pageObject.HomePage;
import com.appium.pageObject.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.AppiumDriverEX;

import static org.junit.Assert.assertTrue;

public class CheckInsStep {
    public static AppiumDriver appiumDriver;

    public CheckInsStep() {
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;
    TeamPage team;
    CheckInsPage check;

    @Given("User allready on Home page")
    public void userAllreadyOnHomePage() {
        home = new HomePage(appiumDriver);
        team = new TeamPage(appiumDriver);
        check = new CheckInsPage(appiumDriver);
        home.assertHomePage();
    }

    @When("User click Team, choose Checkins Page")
    public void userClickTeamChooseCheckinsPage() throws InterruptedException {
        home.clickTeam(0);
        team.scrollTo();
        Thread.sleep(3000);
        team.clickCheckIns();
    }

    @When("User click logo add a new checkins")
    public void userClickLogoAddANewCheckins() {
        check.clickNewQuestionButton();

    }

    @And("^User set name question (.*)$")
    public void userSetNameQuestionSundayMorings(String name) {
        check.inputSetQuestion(name);
    }

    @And("User click day to schedule")
    public void userClickDayToSchedule() {
        check.clickDay();
    }

    @And("User click set time")
    public void userClickSetTime() {
        check.clickSetTime();
    }

    @And("User click set time No title")
    public void userClickSetTimeNoTitle() {
        check.clickSetTime2();
    }

    @And("User click to add member")
    public void userClickToAddMember() {
        check.clickAddMember();
        check.clickCheckAll();
        check.clickDoneButton();
    }

    @And("User click button Start collecting answer!")
    public void userClickButtonStartCollectingAnswer() {
        check.clickStartCollectingAnswer();
    }

    @Then("User get the results of the qustions")
    public void userGetTheResultsOfTheQustions() {
        check.assertQuestionNew();
    }

    /*
      ini TS 10
    */

    @And("User set long name question")
    public void userSetLongNameQuestionSundayMorings() {
        check.inputSetLongQuestion();
    }

    @Then("User get the results of the long question")
    public void userGetTheResultsOfTheLongQustions() {
        check.assertQuestionNew();
    }

    /*
      ini TS 10
    */

    @And("User set blank name question")
    public void userSetBlankNameQuestionSundayMorings() {
        check.inputSetBlankQuestion("   ");
    }

    @Then("User get the results of the blank question")
    public void userGetTheResultsOfTheBlankQustions() {
        check.assertQuestionNew();
    }

    /*
      ini TS 10
    */

    @And("User set number name question")
    public void userSetNumberNameQuestion() {
        check.inputSetNumberQuestion();
    }

    @Then("User get the results of the number question")
    public void userGetTheResultsOfTheNumberQuestion() {
        check.assertQuestionNew();
    }

    /*
      ini TS 10
    */

    @And("User set special character name question")
    public void userSetSpecialCharacterNameQuestion() {
        check.inputSetSpecialQuestion();
    }

    @Then("User get the results of the special character question")
    public void userGetTheResultsOfTheSpecialCharacterQuestion() {
        check.assertQuestionNew();
    }

    @Then("User get the results of the no text question")
    public void userGetTheResultsOfTheNoTextQuestion() {
        check.assertQuestionNewFeild();
    }

    @Then("User get the results of the no day question")
    public void userGetTheResultsOfTheNoDayQuestion() {
        check.assertQuestionNewFeildDay();
    }


    /*
      ini TS 10
    */

    @When("User click a checkins question")
    public void userClickACheckinsQuestion() throws InterruptedException {
        Thread.sleep(2000);
        check.clickQuestionList(0);
    }

    @And("User click box add new comment")
    public void userClickBoxAddNewComment() {
        check.clickBoxAddNewComment();
    }

    @And("^User type to question text (.*)$")
    public void userTypeToQuestionText(String userType) {
        check.inputCommment(userType);
    }

    @And("User send a message")
    public void userSendAMessage() {
        check.clickSendMessage();
    }

    @Then("User get the result of the text question")
    public void userGetTheResultOfTheTextQuestion() {
        check.assertCommentNew();
    }

    /*
      ini TS 10
    */

    @And("User click button reply comment")
    public void userClickButtonReplyComment() {
        check.clickReplyComment();
    }

    @And("^User type reply a text (.*)$")
    public void userTypeReplyAText(String text) {
        check.inputReplyComment(text);

    }

    @Then("User get the result of the reply text")
    public void userGetTheResultOfTheReplyText() {
        check.assertCommentNew();
    }

    /*
      ini TS 10
    */

    @And("User click mention logo @")
    public void userClickMentionLogo() {
        check.clickMentionLogo();
    }

    @And("User select member to mention")
    public void userSelectMemberToMention() {
        check.clickMentionList();
    }

    @Then("User get the result of the mention member")
    public void userGetTheResultOfTheMentionMember() {
        check.assertMentionMemberNew();
        check.clickSendMessage();
        check.assertCommentNew();

    }

    /*
      ini TS 10
    */

    @And("User click Bold logo")
    public void userClickBoldLogo() {
        check.clickFormatText(0);
    }

    @And("User send a message with text bold at chat comment")
    public void userSendAMessageWithTextBoldAtChatComment() {
        check.clickSendMessage();
    }

    @Then("User get the result of the text bold at chat comment")
    public void userGetTheResultOfTheTextBoldAtChatComment() {
        check.assertCommentNew();
    }

    /*
      ini TS 10
    */

    @And("User click Italic logo")
    public void userClickItalicLogo() {
        check.clickFormatText(1);
    }

    @And("User send a message with text italicsize at chat comment")
    public void userSendAMessageWithTextItalicsizeAtChatComment() {
        check.clickSendMessage();
    }

    @Then("User get the result of the text italicsize at chat comment")
    public void userGetTheResultOfTheTextItalicsizeAtChatComment() {
        check.assertCommentNew();
    }

    /*
      ini TS 10
    */

    @And("User click strike through logo")
    public void userClickStrikeThroughLogo() {
        check.clickFormatText(2);
    }

    @And("User send a message with text strike through at chat comment")
    public void userSendAMessageWithTextStrikeThroughAtChatComment() {
        check.clickSendMessage();
    }

    @Then("User get the result of the text strike through at chat comment")
    public void userGetTheResultOfTheTextStrikeThroughAtChatComment() {
        check.assertCommentNew();
    }

    /*
      ini TS 10
    */

    @And("User click attach + logo")
    public void userClickAttachLogo() {
        check.clickAttachLogo();
    }

    @And("User click a image logo")
    public void userClickAImageLogo() {
        check.clickAttachImageLogo();
    }

    @And("User click by upload")
    public void userClickByUpload() {
        check.clickAttachByUpload();
    }

    @And("User select image")
    public void userSelectImage() {
        check.clickSelImageView(0);
    }

    @And("User submit attachment")
    public void userSubmitImage() {
        check.clickSubmitAttach();
    }

    @Then("User get the result of the attach image at chat comment")
    public void userGetTheResultOfTheAttachImageAtChatComment() {
        check.assertAttachNew();
    }

    /*
      ini TS 10
    */

    @And("User click a document logo")
    public void userClickADocumentLogo() {
        check.clickAttachDocumentLogo();
    }

    @And("User select document")
    public void userSelectDocument() {
        check.clickSelFile();

    }

    @Then("User get the result of the attach document at chat comment")
    public void userGetTheResultOfTheAttachDocumentAtChatComment() {
        check.assertAttachNew();
    }

    /*
      ini TS 10
    */

    @And("User click a video logo")
    public void userClickAVideoLogo() {
        check.clickAttachVideoLogo();
    }

    @And("User select video")
    public void userSelectVideo() {
        check.clickSelVideo();
    }

    @Then("User get the result of the attach video at chat comment")
    public void userGetTheResultOfTheAttachVideoAtChatComment() {
        check.assertAttachNew();
    }

    /*
      ini TS 10
    */

    @And("User User click attach numbering logo")
    public void userUserClickAttachNumberingLogo() {
        check.clickNumbering();
    }

    @And("User send a message with text numbering at chat comment")
    public void userSendAMessageWithTextNumberingAtChatComment() {
        check.clickSendMessage();
    }

    @Then("User get the result of the text numbering at chat comment")
    public void userGetTheResultOfTheTextNumberingAtChatComment() {
        check.assertCommentNew();
    }

    /*
      ini TS 10
    */

    @And("User User click attach bullets logo")
    public void userUserClickAttachBulletsLogo() {
        check.clickBullets();
    }

    @And("User send a message with text bullets at chat comment")
    public void userSendAMessageWithTextBulletsAtChatComment() {
        check.clickSendMessage();
    }

    @Then("User get the result of the text bullets at chat comment")
    public void userGetTheResultOfTheTextBulletsAtChatComment() {
        check.assertCommentNew();
    }

    @Then("User get the result of the attach file at chat comment")
    public void userGetTheResultOfTheAttachFileAtChatComment() {
        check.assertCommentsEmpty();

    }

    /*
      ini TS 10
    */

    @And("User click cheers logo")
    public void userClickCheersLogo() {
        check.clickCheersLogo();
    }

    @And("User input text {string} to cheers")
    public void userInputTextToCheers(String text) {
        check.inputTextCheers(text);
        check.clickClOkCheers();
    }

    @Then("User get the result of the cheers {string}")
    public void userGetTheResultOfTheCheers(String text) {
        String a = check.assertCheers();
        assertTrue(a.contains(text));
    }

    @And("User input text blank comment question text {string}")
    public void userInputTextBlankCommentQuestionText(String text) {
        check.inputCommmentBlank(text);
    }

    @Then("User get the result of comment with blank text the question")
    public void userGetTheResultOfCommentWithBlankTextTheQuestion() {
        check.assertCommentEmpty();
    }







    /*
      ini TS 10
    */
}
