package com.appium.stepDefinition;

import com.appium.pageObject.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.utils.AppiumDriverEX;

public class BlastStep {
    public static AppiumDriver appiumDriver;

    public BlastStep() {
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;
    TeamPage team;
    BlastPage blast;

    @Given("User allready on Home Cicle App")
    public void userAlreadyOnHomeCicleApp() {
        home = new HomePage(appiumDriver);
        team = new TeamPage(appiumDriver);
        blast = new BlastPage(appiumDriver);
        home.assertHomePage();
    }

    @When("User click Blast, choose Blast Page")
    public void userClickBlastChooseBlastPage() throws InterruptedException{
        home.clickTeam(0);
        team.clickBlast();
    }

    @When ("User click button + yellow on Blast Page")
    public void userClickButtonYellowOnBlastPage() {
        blast.clickYellowButton();
    }

    @And("^User write title name (.*) to the blast$")
    public void xuserWriteTitleNameToTheBlast(String text) {
        blast.writeTitleName(text);
    }

    @And("^User write description (.*) to the blast$")
    public void userWriteDescriptionTestDes(String text) {
        blast.writeDescription(text);
    }

    @And("User set date on the blast")
    public void userSetDateOnTheBlast() {
        blast.setDateBlast();
        blast.scrollTo();
    }

    @And("User click button publish on the blast")
    public void userClickButtonOnTheBlast() {
        blast.clButtonPublic();
    }
}
