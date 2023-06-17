package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.base.BaseTClass;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class HomePage extends BaseTClass {

    public static AppiumDriver appiumDriver;
    public HomePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Home')]")
    MobileElement asrtHome;

    public void assertHomePage() {
        asrtHome.isDisplayed();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Team\"]/android.view.View/android.view.View/android.view.View")
    List<MobileElement> clTeam;

    public void clickTeam(int index) {
        clTeam.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button")
    MobileElement clButtonYellow;

    public void clickButtonYellow() {
        clButtonYellow.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add new HQ\"]")
    MobileElement clMenuNewHQ;

    public void clickNewHQ() {
        clMenuNewHQ.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add new team\"]")
    MobileElement clMenuNewTeam;

    public void clickNewTeam() {
        clMenuNewTeam.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add new project\"]")
    MobileElement clMenuNewProject;

    public void clickNewProject() {
        clMenuNewProject.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[1]")
    MobileElement typText;

    public void setTypeName(String typeText) {
        MobileElement a = typText;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]")
    MobileElement typDescription;

    public void setTypeDescription(String typeText) {
        MobileElement a = typDescription;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Create\"]")
    MobileElement clButtonCreate;

    public void clickButtonCreate() {
        clButtonCreate.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]")
    MobileElement clButtonInvite;

    public void clickButtonInvite() {
        clButtonInvite.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    MobileElement typEmail;

    public void setTypeEmail(String typeText) {
        MobileElement a = typEmail;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Send\"]")
    MobileElement clButtonSend;

    public void clickButtonSend() {
        clButtonSend.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Invitation has been sent\"]")
    MobileElement asrtInvitation;

    public void assertInvite() {
        String message = asrtInvitation.getAttribute("content-desc");
        try {
            assertTrue(asrtInvitation.isDisplayed());
            Assert.assertEquals(message.toString(), "Invitation has been sent");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Menu')]")
    MobileElement menu;

    public void clickMenu() {
        menu.click();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Nina Martila_PQA17\"]")
    MobileElement profile;

    public void clickProfile() {
        profile.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[1]/android.widget.Button[2]")
    MobileElement clEditProfile;

    public void clickEditProfile() {
        clEditProfile.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")
    MobileElement clPhotoProfile;

    public void clickPhotoProfile() {
        clPhotoProfile.click();
    }

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
    MobileElement slPhoto;

    public void selectPhoto() {
        slPhoto.click();
    }


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Successfully changing avatar\"]")
    MobileElement asrtEditPhoto;

    public void assertEditPhoto() {
        String message = asrtEditPhoto.getAttribute("content-desc");
        try {
            assertTrue(asrtEditPhoto.isDisplayed());
            Assert.assertEquals(message.toString(), "Successfully changing avatar");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[2]")
    MobileElement chBio;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View/android.widget.EditText[2]")
    MobileElement textBio;

    public void changeBio(String typeText) {
        MobileElement a = chBio;
        a.isDisplayed();
        a.click();
        a.clear();
        textBio.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View/android.widget.EditText[3]")
    MobileElement chAbout;

    public void changeAbout(String typeText) {
        MobileElement a = chAbout;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[1]/android.widget.Button[2]")
    MobileElement clIconSave;

    public void clickIconSave() {
        clIconSave.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Test Automation\"]")
    MobileElement asrtEditProfile;

    public void assertEditProfile() {
        String message = asrtEditProfile.getAttribute("content-desc");
        try {
            assertTrue(asrtEditProfile.isDisplayed());
            Assert.assertEquals(message.toString(), "Test Automation");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Logout v2.0.38+58\"]")
    MobileElement logout;

    public void clickLogout() {
        logout.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
    MobileElement popUpOK;

    public void clickPopupOK() {
        popUpOK.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Name and description fields must be filled\"]")
    MobileElement asrtemptyDataHQ;

    public void assertEmptyDataHQ() {
        String message = asrtemptyDataHQ.getAttribute("content-desc");
        try {
            assertTrue(asrtemptyDataHQ.isDisplayed());
            Assert.assertEquals(message.toString(), "Name and description fields must be filled");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
