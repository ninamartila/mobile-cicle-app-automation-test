package com.appium.stepDefinition;

import com.appium.pageObject.ChatGroupPage;
import com.appium.pageObject.ChatPersonalPage;
import com.appium.pageObject.HomePage;
import com.appium.pageObject.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.AppiumDriverEX;

public class HomeStep {
    public static AppiumDriver appiumDriver;
    public HomeStep() {
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;

    @Given("User on Home Page Cicle app")
    public void userOnAppCicleStage() {
        home = new HomePage(appiumDriver);
        home.assertHomePage();
    }

    @When("User click button + yellow")
    public void userClickButtonYellow() {
        home.clickButtonYellow();
    }

    @And("User click Add New HQ")
    public void userClickAddNewHQ() {
        home.clickNewHQ();
    }

    @And("User click Add New Team")
    public void userClickAddNewTeam() {
        home.clickNewTeam();
    }

    @And("User click Add New Project")
    public void userClickAddNewProject() {
        home.clickNewProject();
    }

    @And("^User write name (.*) to the company$")
    public void userWriteNameToTheCompany(String text) {
        home.setTypeName(text);
    }

    @When("User click button + invite")
    public void userClickButtonInvite() {
        home.clickButtonInvite();
    }

    @And("^User write description (.*) to the company$")
    public void userWriteDescriptionToTheCompany(String text) {
        home.setTypeDescription(text);
    }

    @Then("User click button Create")
    public void userClickButtonCreate() {
        home.clickButtonCreate();
    }

    @And("^User write email (.*) for invite$")
    public void userWriteEmailForInvite(String text) {
        home.setTypeEmail(text);
    }

    @And("User click button Send")
    public void userClickButtonSend() {
        home.clickButtonSend();
    }

    @Then("User get result email has been sent")
    public void userGetResultEmailHasBeenSent() {
        home.assertInvite();
    }

    @When("User click menu, and click profile")
    public void userClickMenuAndClickProfile() {
        home.clickMenu();
        home.clickProfile();
    }

    @And("User click Edit profile")
    public void userClickEditProfile() {
        home.clickEditProfile();
    }

    @And("User click Edit photo profile")
    public void userClickEditPhotoProfile() {
        home.clickPhotoProfile();
    }

    @And ("User select photo")
    public void userSelectPhoto() {
        home.selectPhoto();
    }

    @Then("User get result edit photo")
    public void userGetResultEditPhoto() {
        home.assertEditPhoto();
    }

    @And ("^User change bio (.*) in profile$")
    public void userChangeBioProfile(String text) {
        home.changeBio(text);
    }

    @And ("^User change about (.*) in profile$")
    public void userChangeAboutProfile(String text) {
        home.changeAbout(text);
    }

    @And("User click icon save")
    public void userClickIconSave() {
        home.clickIconSave();
    }

    @Then("User get result edit data profile")
    public void userGetResultEditDataProfile() {
        home.assertEditProfile();
    }

    @When("User click menu, and click logout")
    public void userClickMenuAndClickLogout() {
        home.clickMenu();
        home.clickLogout();
    }

    @And("User click popup OK")
    public void userClickPopUpOK() {
        home.clickPopupOK();
    }

    @Then("User get result empty data")
    public void userGetResultEmptyData() {
        home.assertEmptyDataHQ();
    }

}
