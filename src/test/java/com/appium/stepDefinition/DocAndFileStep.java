package com.appium.stepDefinition;

import com.appium.pageObject.CheckInsPage;
import com.appium.pageObject.DocAndFilePage;
import com.appium.pageObject.HomePage;
import com.appium.pageObject.TeamPage;
import io.appium.java_client.AppiumDriver;
import org.example.utils.AppiumDriverEX;

public class DocAndFileStep {
    public static AppiumDriver appiumDriver;

    public DocAndFileStep() {
        this.appiumDriver = AppiumDriverEX.appiumDriver;
    }

    HomePage home;
    TeamPage team;
    DocAndFilePage doc;
}
