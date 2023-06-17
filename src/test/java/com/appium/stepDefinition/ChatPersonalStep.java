package com.appium.stepDefinition;

import com.appium.pageObject.ChatPersonalPage;
import com.appium.pageObject.HomePage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.AppiumDriverEX;

import static org.junit.Assert.assertTrue;

public class ChatPersonalStep {

    public static AppiumDriver appiumDriver;
    public ChatPersonalStep(){
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;
    ChatPersonalPage chat;

    @Given("User on app cicle stage")
    public void userOnAppCicleStage() {
        home = new HomePage(appiumDriver);
        home.assertHomePage();
    }

    @When("User click menu, and click Inbox")
    public void userClickMenuAndClickInbox() {
        chat = new ChatPersonalPage(appiumDriver);
        chat.clickMenu();
        chat.clickInbox();

    }

    @And("User add a new Chat")
    public void userAddANewChat() {
        chat.clickAddNewChat();
    }

    @And("User chose friend to add new chat")
    public void userChoseFriendToAddNewChat() {
        chat.clickSearch();
        chat.clickSelMember();
    }

    @And("^User type sand text (.*)$")
    public void userTypeTextTestingSandByAutomation(String text) {
        chat.typeMessage(text);
        chat.clickSend2();
    }

    @And("^User type text (.*)$")
    public void userTypeTextTestingByAutomation(String text) {
        chat.typeMessage(text);
        chat.clickSend();
    }

    @Then("^User get the result text (.*)$")
    public void userGetTheResultText(String text) {
        String a = chat.getLastMessage();
        assertTrue(a.contains(text));
    }

    /*
       ini TS 002
    */

    @And("User not type text blank")
    public void userNotTypeText(String text) {
        chat.typeMessageBlank(text);
        chat.clickSend();
    }

    @Then("User not get the result text")
    public void userNotGetTheResultText() {
        chat.assertTextBlank();
    }

    /*
       ini TS 002
    */

    @When("User choose a friend to select a chat")
    public void userChooseAFriendToSelectAChat() {
        chat.clickFriend();

    }

    @And("User click a text message")
    public void userClickATextMessage() {
        chat.clickText();
    }

    /*
       ini TS 002
    */


    @And("User click copy")
    public void userClickCopy() {
        chat.clickCopy();
    }

    @Then("User get the copy a text")
    public void userGetTheCopyAText() {
        chat.assertMessageCopy();
    }

    /*
       ini TS 002
    */

    @And("User click delete")
    public void userClickDelete() {
        chat.clickDelete();
        chat.clickOk();
    }

    @Then("User get the delete a text")
    public void userGetTheDeleteAText() {
        chat.assertMessageDelete();
    }

    /*
       ini TS 002
    */

    @And("User click attach logo")
    public void userClickAttachLogo() {
        chat.clickAttachLogo();
    }

    @And("User click a document and video")
    public void userClickADocumentAndVideo() {
        chat.selectAttachment(0);
    }

    @And("User select a Document")
    public void userChooseADocument() {
        chat.selectFile(2);
    }

    @Then("User get the Document")
    public void userGetTheDocument() {
        chat.assertMessageAttach();

    }

    /*
       ini TS 002
    */

    @And("User choose a not Document")
    public void userChooseANotDocument() {
        chat.selectFile(3);
    }

    @Then("User not get the Document")
    public void userNotGetTheDocument() {
        chat.assertMessageNotDoc();
    }

    /*
       ini TS 002
    */

    @And("User click file document ***")
    public void userClickFileDocument() {
        chat.clickAttachMenu(0);
    }

    @And("User click file video ***")
    public void userClickFileVideo() {
        chat.clickAttachMenu(0);
    }

    @Then("User get the delete chat attachment a text")
    public void userGetTheDeleteChatAttachmentAText() {
        chat.assertMessageDeleteAttachment();
    }

    /*
       ini TS 002
    */

    @And("User choose a Video")
    public void userChooseAVideo() {
        chat.selectFile(0);
    }

    @Then("User get the Video")
    public void userGetTheVideo() {
        chat.assertMessageAttach();
    }

    /*
       ini TS 002
    */

    @And("User click a Image from Camera")
    public void userClickAImageFromCamera() {
        chat.selectAttachment(1);
    }

    @And("User click camera button")
    public void userClickCameraButton() {
        chat.clickShutter();
    }

    @Then("User get the image from camera")
    public void userGetTheImageFromCamera() {
        chat.assertMessageAttach();

    }

    /*
       ini TS 002
    */

    @And("User click a Image from Gallery")
    public void userClickAImageFromGallery() {
        chat.selectAttachment(2);
    }

    @And("User choose image from gallery")
    public void userChooseImageFromGallery() {
        chat.selectImageFromGallery(0);

    }

    @Then("User get the image from gallery")
    public void userGetTheImageFromGallery() {
        chat.assertMessageAttach();
    }

    /*
       ini TS 002
    */

    @When("^User type (?:valid|invalid) a (.*) at box search$")
    public void userTypeValidATryAtBoxSearch(String user) {
        chat.inputSearchMessage(user);
    }

    @Then("^User can (?:see|not) get the history search name (.*)$")
    public void userCanSeeGetTheHistorySearchName(String text) {
        if (text.contains("true")) {
            chat.assertSearchValid();
        } else if (text.contains("false")) {
            chat.assertSearchInvalid();
        }
    }

    @Then("^User (.*) get the file at the gallery$")
    public void userNotGetTheFileAtTheGallery(String text) {
        try {
            if (text.contains("not")) {
                System.out.printf("File not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
       ini TS 002
    */

    @And("User click a icon clip")
    public void userClickAIconClip() throws InterruptedException {
        Thread.sleep(2000);
        chat.clickMentionLogo();
    }

    @And("User click person to mention")
    public void userClickPersonToMention() {
        chat.clickMentionPerson(0);
        chat.clickSend();
    }

    @Then("User get the result")
    public void userGetTheResult() {
        chat.assertMentionPerson();
    }

    @When("User click box message")
    public void userClickBoxMessage() {
        chat.clickBoxText();
    }

    @And ("User wrong sand the text blank to the group")
    public void userWrongWriteTheTextToTheGroupAndSendItToTheGroup() {
        chat.typeMessage("   ");
        chat.clickSend();
    }
}
