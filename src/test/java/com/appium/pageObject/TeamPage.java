package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.base.BaseTClass;
import org.openqa.selenium.support.PageFactory;

public class TeamPage extends BaseTClass {

    public static AppiumDriver appiumDriver;
    public TeamPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Group Chat\"]")
    MobileElement clGroup;

    public void clickGroupChat(){
        clGroup.click();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Board\"] | //android.view.View[@content-desc=\"Board\"]")
    MobileElement clBoard;

    public void clickBoard(){
        clBoard.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Check-Ins\"][@index='4']")
    MobileElement clCheckIns;

    public void clickCheckIns(){
        clCheckIns.click();
    }

    public void scrollTo(){
        appiumDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100)"));
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Schedule\"]")
    MobileElement schedule;

    public void clickSchedule(){
        schedule.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Blast\"]")
    MobileElement blast;

    public void clickBlast(){
        blast.click();
    }

}
