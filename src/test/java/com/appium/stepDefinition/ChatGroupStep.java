package com.appium.stepDefinition;

import com.appium.pageObject.ChatGroupPage;
import com.appium.pageObject.HomePage;
import com.appium.pageObject.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.AppiumDriverEX;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;

public class ChatGroupStep {
    public static AppiumDriver appiumDriver;
    public ChatGroupStep() {
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;
    TeamPage team;
    ChatGroupPage chat;

    @Given("User on team page cicle app")
    public void userOnTeamPageCicleApp() {
        home = new HomePage(appiumDriver);
        team = new TeamPage(appiumDriver);
        chat = new ChatGroupPage(appiumDriver);
        home.assertHomePage();
    }

    @When("User click Team, choose Group Chat")
    public void userClickTeamChooseGroupChat() {
        home.clickTeam(0);
        team.clickGroupChat();
    }

    @When("^User write the text (.*) to the group and send it to the group$")
    public void userWriteTheTextToTheGroupAndSendItToTheGroup(String text) {
        chat.setTypeText(text);
        chat.clickSendButton();
    }

    @And ("^User send the text (.*) to the group$")
    public void userSendTheTextToTheGroup(String text) {
        chat.setTypeText(text);
        chat.clickSendButton2();
    }

    @Then("^User get text the result chat group (.*)$")
    public void userGetTextTheResultChatGroup(String text) {
        String a = chat.getLastMessage();
        assertTrue(a.contains(text));
    }

    /*
       ini TS 002
    */

    @When("User wrong write the text blank to the group and send it to the group")
    public void userWrongWriteTheTextToTheGroupAndSendItToTheGroup() {
        chat.setTypeTextBlank("   ");
        chat.clickSendButton();
    }

    @Then("User get wrong the result text group blank")
    public void userGetWrongTheResultTextGroup() {
        chat.assertTextBlank();


    }

    /*
       ini TS 002
    */

    @When("User long write the text to the group and send it to the group")
    public void userLongWriteTheTextToTheGroupAndSendItToTheGroup() {
        chat.setTypeTextLong();
        chat.clickSendButton();
    }

    @Then("User get long the result text group")
    public void userGetLongTheResultTextGroup() {
        chat.assertTypeTextLong();
    }

    /*
       ini TS 002
    */

    @When("User click a text message at group")
    public void userClickATextMessageAtGroup() {
        chat.clickText();
    }

    @When("User click menu a photo message at group")
    public void userClickAMenuPhotoMessageAtGroup() {
        chat.clickText();
    }

    @And("User click a Select")
    public void userClickASelect() {
        chat.clickSelect();

    }

    /*
       ini TS 002
    */



    @And("User click a Copy")
    public void userClickACopy() {
        chat.clickCopy();
    }

    @Then("User get text the result text a copy group")
    public void userGetTextTheResultTextACopyGroup() {
        chat.assertMessageCopy();
    }

    /*
       ini TS 002
    */

    @And("User click a Delete")
    public void userClickADelete() {
        chat.clickDelete();
        chat.clickOk();

    }

    @Then("User get text the result text a delete group")
    public void userGetTextTheResultTextADeleteGroup() {
        chat.assertMessageDelete();
    }

    /*
       ini TS 002
    */

    @When("User click box a text message")
    public void userClickBoxATextMessage() {
        chat.clickBoxText();
    }

    @And("User click a Mention Logo")
    public void userClickAMentionLogo() throws InterruptedException {
        Thread.sleep(2000);
        chat.clickMentionLogo();
    }

    @And("User select person to mention")
    public void userSelectPersonToMention() {
        chat.clickMentionPerson(1);
        chat.clickSendButton();
    }

    @Then("User get the result a mention person")
    public void userGetTheResultAMentionPerson() {
        chat.assertMentionPerson();
    }

    /*
       ini TS 002
    */

    @And("User select person by mention all")
    public void userSelectPersonByMentionAll() {
        chat.clickMentionAll();
        chat.clickSendButton();

    }

    @Then("User get the result a mention person by mention all")
    public void userGetTheResultAMentionPersonByMentionAll() {
        chat.assertMentionAll();
    }

    /*
       ini TS 002
    */

    @When("User click attach logo group chat")
    public void userClickAttachLogoGroupChat() {
        chat.clickBoxText();
        chat.clickAttachLogo();
    }

    @And("User click a document and video group")
    public void userClickADocumentAndVideoGroup() {
        chat.selectAttach(0);
    }

    @And("User click a image form camera group")
    public void userClickAImageFormCameraGroup() {
        chat.selectAttach(1);
    }

    @And ("User click icon camera")
    public void userClickIconCamera() {
        chat.ClickCamera();
    }

    @And ("User click icon checklis")
    public void userClickIconChecklis() {
        chat.ClickCheclis();
    }

    @And("User choose a Document group")
    public void userChooseADocumentGroup() {
        chat.clickSelectFile(2);
    }

    @And("User choose a Photo group")
    public void userChooseAPhotoGroup() {
        chat.clickSelectFile(1);
    }

    @And("User choose a Video group")
    public void userChooseAVideoGroup() {
        chat.clickSelectFile(0);
    }

    @Then("User get the Document at group")
    public void userGetTheDocumentAtGroup() {
        chat.assertMessageAttach();
    }

    @Then ("User get the Photo at group")
    public void userGetThePhotoAtGroup() {
        chat.assertMessageAttach();
    }

    @Then ("User get the Video at group")
    public void userGetTheVideoAtGroup() {
        chat.assertMessageAttach();
    }

    /*
       ini TS 002
    */

    @And("User choose a Document txt group")
    public void userChooseADocumentTxtGroup() {
        chat.clickSelectFile(3);
    }

    @Then("User not get the Document text at group")
    public void userNotGetTheDocumentTextAtGroup() {
        chat.assertMessageNotDoc();
    }



    @And("User click a image from gallery group")
    public void userClickAImageFromGalleryGroup() {
        chat.selectAttach(2);
    }

    @Then("^User (.*) get the file at gallery group$")
    public void userNotGetTheFileAtGalleryGroup(String text) {
        try {
            if (text.contains("not")) {
                System.out.printf("File not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
