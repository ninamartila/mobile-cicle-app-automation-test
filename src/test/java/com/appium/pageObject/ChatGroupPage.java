package com.appium.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.base.BaseTClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ChatGroupPage extends BaseTClass {
    public static AppiumDriver appiumDriver;
    public ChatGroupPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.widget.EditText")
    MobileElement typText;

    String text;
    public void setTypeText(String typeText) {
        text = typeText;
        MobileElement a = typText;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(typeText);
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.widget.Button[@index='6']")
    MobileElement sendButton;

    public void clickSendButton() {
        sendButton.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.widget.Button[@index='8']")
    MobileElement sendButton2;

    public void clickSendButton2() {
        sendButton2.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')] ")
    List<MobileElement> sendMessage;

    public String getLastMessage() {
        String a = sendMessage.get(sendMessage.size() - 1).getAttribute("content-desc");
        return a;
    }

    public void setTypeTextBlank(String text) {
        MobileElement a = typText;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(text);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')] ")
    MobileElement asrtBlankText;

    public void assertTextBlank() {
        MobileElement a = sendMessage.get(sendMessage.size() - 1);
        try {
            assertTrue(a.isDisplayed());
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

    public void setTypeTextLong(){
        MobileElement a = typText;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(longText);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'THE END')]")
    MobileElement asrtLongText;

    public void assertTypeTextLong() {
        String ab = asrtLongText.getAttribute("content-desc");
        try {
            assertTrue(ab.contains("THE END"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickText() {
        MobileElement a = sendMessage.get(sendMessage.size() - 1);
        a.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Select\"]")
    MobileElement clSelect;

    public void clickSelect() {
        clSelect.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View[2]/android.view.View")
    MobileElement clText;

    public void clickTextSelect() {
        MobileElement a = clText;
        a.click();
        a.click();
        a.click();
//        TouchActions action = new TouchActions(appiumDriver);
//        action.doubleTap(clText);
//        action.doubleTap(clText);
//        action.perform();

//        Actions ab = new Actions(appiumDriver);
//        ab.doubleClick(clText);
//        ab.doubleClick(clText);
//        ab.perform();
//        ab.clickAndHold();



    }



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Copy\"]")
    MobileElement clCopy;

    public void clickCopy() {
        clCopy.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"copy text to clipboard\"]")
    MobileElement asrtCopy;

    public void assertMessageCopy() {
        String message = asrtCopy.getAttribute("content-desc");
        try {
            assertTrue(asrtCopy.isDisplayed());
            Assert.assertEquals(message.toString(), "copy text to clipboard");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Delete\"]")
    MobileElement clDelete;

    public void clickDelete() {
        clDelete.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Ok\"]")
    MobileElement clOk;

    public void clickOk() {
        clOk.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Delete group chat message success\"]")
    MobileElement asrtDelete;

    public void assertMessageDelete() {
        String message = asrtDelete.getAttribute("content-desc");
        try {
            assertTrue(asrtDelete.isDisplayed());
            Assert.assertEquals(message.toString(), "Delete group chat message success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickBoxText() {
        typText.click();
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
    MobileElement mentionMember;

    public void clickMentionLogo() {
        mentionMember.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.ImageView")
    List<MobileElement> selectMentionMember;

    public void clickMentionPerson(int index) {
        selectMentionMember.get(index).click();
    }

    public void assertMentionPerson() {
        MobileElement message = sendMessage.get(sendMessage.size() - 1);
        try {
            message.isDisplayed();
            assertTrue(message.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"mention all\"]")
    MobileElement mentionAll;

    public void clickMentionAll() {
        mentionAll.click();
    }

    public void assertMentionAll() {
        MobileElement message = sendMessage.get(sendMessage.size() - 1);
        try {
            message.isDisplayed();
            assertTrue(message.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[5]")
    MobileElement clAttachLogo;

    public void clickAttachLogo() {
        clAttachLogo.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Document & Video\"]")
    MobileElement clDocument;

    public void clickDocumentAndVideo() {
        MobileElement a = clDocument;
        a.click();
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
    List<MobileElement> selectDoc;

    public void clickSelectFile(int index) {
        selectDoc.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'AM')] | //android.widget.ImageView[contains(@content-desc,'PM')]")
    List <MobileElement> messageAttach;

    public void assertMessageAttach() {
        MobileElement a = messageAttach.get(messageAttach.size() - 1);
        try {
            a.isDisplayed();
            assertTrue(a.isDisplayed());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Format file not allowed., status code: 400, Format file not allowed., Http status error [400]\"]")
    MobileElement asrtNotDoc;

    public void assertMessageNotDoc() {
        String message = asrtNotDoc.getAttribute("content-desc");
        try {
            assertTrue(asrtNotDoc.isDisplayed());
            Assert.assertEquals(message.toString(), " Format file not allowed., status code: 400, Format file not allowed., Http status error [400]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
    List<MobileElement> listAttachmens;

    public void selectAttach(int index) {
        listAttachmens.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shutter\"]")
    MobileElement clickCamera;

    public void ClickCamera() {
        clickCamera.click();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    MobileElement clickCheclis;

    public void ClickCheclis() {
        clickCheclis.click();
    }







}
