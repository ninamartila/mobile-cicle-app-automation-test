package com.appium.stepDefinition;

import com.appium.pageObject.HomePage;
import com.appium.pageObject.SchedulePage;
import com.appium.pageObject.TeamPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utils.AppiumDriverEX;

public class ScheduleStep {
    public static AppiumDriver appiumDriver;

    public ScheduleStep() {
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;
    TeamPage team;
    SchedulePage schedule;

    @Given("User allready on Home page Cicle App")
    public void userAllreadyOnHomePage() {
        home = new HomePage(appiumDriver);
        team = new TeamPage(appiumDriver);
        schedule = new SchedulePage(appiumDriver);
        home.assertHomePage();
    }

    @When("User click Team, choose schedule Page")
    public void userClickTeamChooseSchedulePage() throws InterruptedException {
        home.clickTeam(0);
        team.clickSchedule();
    }

    @When("User click yellow button +")
    public void userClickYellowButton() {
        schedule.clickYellowButton();
    }

    @And("^User write title event (.*) in event$")
    public void userWriteTitleEventInEvent(String text) {
        schedule.setTitleName(text);
    }

    @And("User write title event")
    public void userWriteTitleEvent() {
        schedule.setTitleName("   ");
    }

    String longText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
            "\n" +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,\n" +
            "\n" +
            "when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n" +
            "\n" +
            "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.”\n" +
            "\n" +
            "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,”\n" +
            "\n" +
            "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
            "\n" +
            "THE END ";

    String http = "https://staging.cicle.app/";

    @And("User write title event http text")
    public void userWriteTitleEventHTTPText() {
        schedule.setTitleName(http);
    }

    String number = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15";

    @And("User write title event number text")
    public void userWriteTitleEventNumberText() {
        schedule.setTitleName(number);
    }

    String unik = "✊♨  ＷＨ\uD835\uDCB6\uD835\uDD31 ίＳ \uD835\uDD43\uD835\uDC28ŕ\uD835\uDC52๓ 丨ρᔕ\uD835\uDD4C\uD835\uDCF6?";

    @And("User write title event unik text")
    public void userWriteTitleEventUnikText() {
        schedule.setTitleName(number);
    }

    @And("User set start date")
    public void userSetStartDate(){
        schedule.setStartDate();
    }

    @And("User set start date cencel")
    public void userSetStartDateCencle() {
        schedule.setStartDateCencle();
    }

    @And("User set Repeat")
    public void userSetRepeat() {
        schedule.setRepeat(0);
    }

    @And("User set End date")
    public void userSetEndDate() {
        schedule.setEndDate();
    }

    @And("User set Member")
    public void userSetMember() {
        schedule.setMember();
    }

    @And("^User write (.*) on Event$")
    public void userWriteOnEvent(String text) {
        schedule.setNote(text);
        schedule.scrollTo();
    }

    @And("User click post event")
    public void userClickPostEvent(){
        schedule.clickPostEvent();
    }

    @When("User click event")
    public void userClickEvent() {
        schedule.selectEvent();
    }

    @And("User click comment")
    public void userClickComment() {
        schedule.clickComment();
    }

    @And("^User write (.*) in comment$")
    public void userWriteInComment(String text) {
        schedule.writeComment(text);
    }

    @And("User click submit")
    public void userCilckSubmit() {
        schedule.clickSubmit();
    }

    @Then("User get the result comment")
    public void userGetTheResultComment() {
        schedule.assertComment();
    }

    @Then("User get result post event")
    public void userGetTheResultPostEvent() {
        schedule.assertPostEvent();
    }

    @Then("User get result negative post event")
    public void userGetTheResultNegativePostEvent() {
        schedule.assertNegativePostEvent();
    }

    @Then("User get result post event without start date")
    public void userGetTheResultPostEventWithoutStartDate() {
        schedule.assertNegativeStartDate();
    }

    @And("User write long text")
    public void userWriteLongText() {
        schedule.writeLongTextComment();
    }

    @And("User write http text")
    public void userWriteHttpText() {
        schedule.writeHttpTextComment();
    }

    @And ("User click mention, and select all member")
    public void userClickMentionAndSelectAllMember() {
        schedule.selectMember();
    }

    @And("User click mention, and select someone")
    public void userClickMentionAndSelectSomeone() {
        schedule.selectSomeone();
    }

    @And("User click bold")
    public void userClickBold() {
        schedule.clickBold();
    }

    @And("^User write (.*) in comment post event$")
    public void userWriteInCommentPostEvent(String text) {
        schedule.writeBold(text);
    }

    @And("User click italic")
    public void userClickItalic() {
        schedule.clickItalic();
    }

    @And("User click streak")
    public void userClickStreak() {
        schedule.clickStreak();
    }

    @And("User click list number")
    public void userClickListNumber() {
        schedule.clickListNumber();
    }

    @And("User click list bullet")
    public void userClickListBullet() {
        schedule.clickListBullet();
    }

    @And("User click add document")
    public void userClickAddDocument() {
        schedule.clickAddDocument();
    }
}
