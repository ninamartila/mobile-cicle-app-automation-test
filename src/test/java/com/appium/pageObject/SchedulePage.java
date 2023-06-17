package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.base.BaseTClass;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SchedulePage extends BaseTClass {
    public static AppiumDriver appiumDriver;
    public SchedulePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.Button[3]")
    MobileElement yellowButton;

    public void clickYellowButton() {
        yellowButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText")
    MobileElement titleName;

    public void setTitleName(String typeText) {
        MobileElement a = titleName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Set date\"])[1]")
    MobileElement clStartDateButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"12, Monday, June 12, 2023\"]")
    MobileElement clDateStart;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")

    MobileElement clOkButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Switch to text input mode\"]")
    MobileElement clModeTimeInput;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")
    MobileElement setHour;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]")
    MobileElement setMinute;
    public void setStartDate() {
        clStartDateButton.click();
        clDateStart.click();
        clOkButton.click();
        clModeTimeInput.click();
        MobileElement hour = setHour;
        hour.click();
        hour.clear();
        hour.sendKeys("10");
        MobileElement minute = setMinute;
        minute.click();
        minute.clear();
        minute.sendKeys("10");
        clOkButton.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"CANCEL\"]")
    MobileElement clDateStartCencle;

    public void setStartDateCencle() {
        clStartDateButton.click();
        clDateStartCencle.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Don't repeat\"]")
    MobileElement clRepeat;

    @AndroidFindBy(xpath = "android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]")
    List<MobileElement> slRepeat;

    public void setRepeat(int index) {
        clRepeat.click();
        slRepeat.get(index).click();
    }

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Set date\"])[2]")
    MobileElement clEndDateButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"13, Tuesday, June 13, 2023\"]")
    MobileElement clDateEnd;

    public void setEndDate() {
        clEndDateButton.click();
        clDateEnd.click();
        clOkButton.click();
        clModeTimeInput.click();
        MobileElement hour = setHour;
        hour.click();
        hour.clear();
        hour.sendKeys("10");
        MobileElement minute = setMinute;
        minute.click();
        minute.clear();
        minute.sendKeys("10");
        clOkButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.ScrollView/android.view.View[11]")
    MobileElement clButtonMember;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.CheckBox")
    MobileElement selectAllMember;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"done\"]")
    MobileElement clDone;

    public void setMember() {
        clButtonMember.click();
        selectAllMember.click();
        clDone.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add a detailed notes here...\"]")
    MobileElement clButtonTextNote;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.EditText")
    MobileElement clWriteNote;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Publish\"]")
    MobileElement clPublishButton;

    @AndroidFindBy(xpath = "android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView")
    MobileElement clNote;
    public void setNote(String typeNote) {
        clButtonTextNote.click();
        MobileElement a = clWriteNote;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeNote);
        clNote.click();
        clPublishButton.click();
    }
    public void scrollTo(){
        appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100)"));
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Post Event\"]")
    MobileElement clPostEvent;
    public void clickPostEvent(){
        clPostEvent.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Test Event 05.00 - 06.00 PM no members for this event\"]")
    MobileElement cleventPost;
    public void selectEvent(){
        cleventPost.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add new comment...\"]")
    MobileElement clComment;
    public void clickComment(){
        clComment.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText")
    MobileElement boxComment;
    public void writeComment(String typeComment){
        boxComment.click();
        MobileElement a = boxComment;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeComment);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"submit\"]")
    MobileElement clSubmit;
    public void clickSubmit(){
        clSubmit.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'a moment ago')]")
    MobileElement asrtComment;

    public void assertComment() {
        String a = asrtComment.getAttribute("content-desc");
        try {
            assertTrue(asrtComment.isDisplayed());
            assertTrue(a.contains("a moment ago"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Create event successful\"]")
    MobileElement asrtPostEvent;

    public void assertPostEvent() {
        String a = asrtPostEvent.getAttribute("content-desc");
        try {
            assertTrue(asrtPostEvent.isDisplayed());
            assertTrue(a.contains("Create event successful"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Title must be filled\"]")
    MobileElement asrtNegativePostEvent;

    public void assertNegativePostEvent() {
        String a = asrtNegativePostEvent.getAttribute("content-desc");
        try {
            assertTrue(asrtNegativePostEvent.isDisplayed());
            assertTrue(a.contains("Title must be filled"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Start date must be filled\"]")
    MobileElement asrtNegativeStartDate;

    public void assertNegativeStartDate() {
        String a = asrtNegativeStartDate.getAttribute("content-desc");
        try {
            assertTrue(asrtNegativeStartDate.isDisplayed());
            assertTrue(a.contains("Start date must be filled"));
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public void writeLongTextComment(){
        boxComment.click();
        MobileElement a = boxComment;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    String httpText = "https://staging.cicle.app/signin";

    public void writeHttpTextComment(){
        boxComment.click();
        MobileElement a = boxComment;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(httpText);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[1]")
    MobileElement clMention;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"mention all\"]")
    MobileElement clMentionAll;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
    MobileElement clPopupOk;

    public void selectMember(){
        boxComment.click();
        clMention.click();
        clMentionAll.click();
        clPopupOk.click();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Aprijal_PQA17\"]")
    MobileElement clSomeone;

    public void selectSomeone(){
        boxComment.click();
        clMention.click();
        clSomeone.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ToggleButton[1]")
    MobileElement clBold;

    public void clickBold(){
        boxComment.click();
        clBold.click();
    }
    public void writeBold(String typeText){
        MobileElement a = boxComment;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ToggleButton[2]")
    MobileElement clItalic;

    public void clickItalic(){
        boxComment.click();
        clItalic.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.ToggleButton[3]")
    MobileElement clStreak;

    public void clickStreak(){
        boxComment.click();
        clItalic.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[3]")
    MobileElement clListNumber;

    public void clickListNumber(){
        boxComment.click();
        clListNumber.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.widget.Button")
    MobileElement clListBullet;

    public void clickListBullet(){
        boxComment.click();
        clListBullet.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[2]")
    MobileElement clAddDocument;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[2]")
    MobileElement clDocument;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"by upload\"]")
    MobileElement clByUpload;

    @AndroidFindBy(xpath = "android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout")
    MobileElement slPhoto;

    public void clickAddDocument(){
        boxComment.click();
        clAddDocument.click();
        clDocument.click();
        clByUpload.click();
        slPhoto.click();
    }

}
