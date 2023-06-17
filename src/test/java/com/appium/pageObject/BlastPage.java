package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.base.BaseTClass;
import org.openqa.selenium.support.PageFactory;

public class BlastPage extends BaseTClass {
    public static AppiumDriver appiumDriver;
    public BlastPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.widget.Button")
    MobileElement clYellowButton;

    public void clickYellowButton() {
        clYellowButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText")
    MobileElement wrTitleName;

    public void writeTitleName(String typeText) {
        MobileElement a = wrTitleName;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View")
    MobileElement wrDescription;

    public void writeDescription(String typeText) {
        MobileElement a = wrDescription;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]")
    MobileElement clSetDate;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"18, Sunday, June 18, 2023\"]")
    MobileElement slSetDate;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"OK\"]")
    MobileElement clOkOnDate;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Switch to text input mode\"]")
    MobileElement setModeTime;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")
    MobileElement setHour;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]")
    MobileElement setMinute;

    public void setDateBlast() {
        clSetDate.click();
        slSetDate.click();
        clOkOnDate.click();
        setModeTime.click();
        MobileElement hour = setHour;
        hour.click();
        hour.clear();
        hour.sendKeys("10");
        MobileElement minute = setMinute;
        minute.click();
        minute.clear();
        minute.sendKeys("10");
        clOkOnDate.click();
    }

    public void scrollTo(){
        appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100)"));
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Publish\"]")
    MobileElement clPublic;

    public void clButtonPublic() {
        clPublic.click();
    }
}
