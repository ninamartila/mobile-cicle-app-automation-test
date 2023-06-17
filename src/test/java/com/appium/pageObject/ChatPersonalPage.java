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

public class ChatPersonalPage extends BaseTClass {

    public static AppiumDriver appiumDriver;
    public ChatPersonalPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc,'Menu')]")
    MobileElement menu;

    public void clickMenu() {
        menu.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Inbox\"]")
    MobileElement inbox;

    public void clickInbox() {
        inbox.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index=\"3\"]")
    MobileElement addNew;

    public void clickAddNewChat() {
        addNew.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Company Members\"]/android.widget.EditText")
    MobileElement search;

    public void clickSearch() {
        search.isDisplayed();
        search.click();
        search.clear();
        search.sendKeys("Kiki Sahnakri");
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Kiki Sahnakri')]")
    MobileElement selMember;

    public void clickSelMember() {
        selMember.click();
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='type message...']")
    MobileElement typMessage;

    public void typeMessage(String textChat) {
        MobileElement a = typMessage;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(textChat);
    }

    public void clickBoxText() {
        typMessage.click();
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@index='5']")
    MobileElement send;

    @AndroidFindBy(xpath = "//android.widget.Button[@index='6']")
    MobileElement send2;

    public void clickSend() {
        send.click();
    }

    public void clickSend2() {
        send2.click();
    }

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AM')] | //android.view.View[contains(@content-desc, 'PM')] ")
    List<MobileElement> sendMessage;

    public String getLastMessage() {
        String a = sendMessage.get(sendMessage.size() - 1).getAttribute("content-desc");
        return a;
    }

    String text;
    public void typeMessageBlank(String text) {
        MobileElement a = typMessage;
        a.isDisplayed();
        a.click();
        a.clear();
        a.sendKeys(text);
    }

    public void assertTextBlank() {
        MobileElement a = sendMessage.get(sendMessage.size() - 1);
        try {
            assertTrue(a.isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'Kiki Sahnakri')]")
    MobileElement clText;

    public void clickFriend() {
        clText.isDisplayed();
        clText.click();
    }

    public void clickText() {
        MobileElement a = sendMessage.get(sendMessage.size() - 1);
        a.click();
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

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Delete chat message success\"]")
    MobileElement asrtDelete;

    public void assertMessageDelete() {
        String message = asrtDelete.getAttribute("content-desc");
        try {
            assertTrue(asrtDelete.isDisplayed());
            Assert.assertEquals(message.toString(), "Delete chat message success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[3][@index='2']")
    MobileElement attachLogo;

    public void clickAttachLogo() {
        attachLogo.click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
    List<MobileElement> selAttachment;

    public void selectAttachment(int index) {
        selAttachment.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Document & Video\"]")
    MobileElement attachDocVideo;

    public void clickDocumentAndVideo() {
        attachDocVideo.click();
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
    List<MobileElement> docList;

    public void selectFile(int index) {
        docList.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc,'AM')] | //android.widget.ImageView[contains(@content-desc,'PM')]")
    List <MobileElement> messageAttach;

    public void assertMessageAttach() {
        MobileElement a = messageAttach.get(messageAttach.size() - 1);
        a.getAttribute("content-desc");
        a.isDisplayed();
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

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Nina Martila CV_4 (1).pdf\"]/android.view.View")
    List<MobileElement> attachDocMenu;

    public void clickAttachMenu(int index) {
        attachDocMenu.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Delete chat attachment success\"]")
    MobileElement asrtDeleteAttachment;

    public void assertMessageDeleteAttachment() {
        String message = asrtDeleteAttachment.getAttribute("content-desc");
        try {
            assertTrue(asrtDeleteAttachment.isDisplayed());
            Assert.assertEquals(message.toString(), "Delete chat attachment success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shutter\"]")
    MobileElement shutter;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    MobileElement shuterDone;

    public void clickShutter() {
        shutter.click();
        shuterDone.click();
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
    List<MobileElement> selImage;

    public void selectImageFromGallery(int index) {
        selImage.get(index).click();
    }

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.widget.EditText[1]")
    MobileElement searchMessage;

    public void inputSearchMessage(String textUser) {
        text = textUser;
        MobileElement inputUser = searchMessage;
        inputUser.isDisplayed();
        inputUser.click();
        inputUser.clear();
        inputUser.sendKeys(textUser);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
    MobileElement searchValid;

    public void assertSearchValid() {
        try {
            MobileElement a = searchValid;
            assertTrue(a.isDisplayed());
            String ab = searchValid.getAttribute("content-desc");
            assertTrue(ab.contains(text));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@index='4']")
    MobileElement searchInvalid;

    public void assertSearchInvalid(){
        try {
            MobileElement a = searchInvalid;
            assertTrue(a.isDisplayed());
            String ab = searchInvalid.getAttribute("content-desc");
            Assert.assertEquals("There is no recent chat\n" +
                    "from "+text+"...",ab);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]")
    MobileElement mentionMember;

    public void clickMentionLogo() {
        mentionMember.click();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Kiki Sahnakri_PQA17\"]")
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

    @AndroidFindBy(xpath = "//android.widget.Button[@index='6']")
    MobileElement clickSand;

    public void clickSendButton() {
        clickSand.click();
    }










}
