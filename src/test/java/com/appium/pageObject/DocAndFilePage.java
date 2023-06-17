package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.base.BaseTClass;
import org.openqa.selenium.support.PageFactory;

public class DocAndFilePage extends BaseTClass {
    public static AppiumDriver appiumDriver;
    public DocAndFilePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }
}
