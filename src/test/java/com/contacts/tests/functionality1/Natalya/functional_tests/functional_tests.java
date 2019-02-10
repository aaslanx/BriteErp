package com.contacts.tests.functionality1.Natalya.functional_tests;

import com.contacts.utilities.Driver;
import com.contacts.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class functional_tests extends TestBase {


    @Test
    public void BRIT_2175() {
        extentLogger = report.createTest("Verifying from Manager perspective 'Contact' functionality working properly");

        pages.systemNavigatesToPage().loginWithPreconditions();

        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

    }


    @Test
    public void BRIT_2211() {
        extentLogger = report.createTest("Verifying manager can access person's information");

        pages.systemNavigatesToPage().loginWithPreconditions();

        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Click on desired contact person");
        extentLogger.info("Expected Result: Manager should be able to click on a contact");
        pages.systemNavigatesToPage().contactEphrem.click();

        extentLogger.info("Step 4: System should navigate to desired person's file");
        extentLogger.info("Expected Result: Manager should be able to see person's information");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().contactInfo.getText(), HEADER_OF_CONTACT);

    }

    @Test
    public void BRIT_2217() {
        extentLogger = report.createTest("System should navigate Manager to Send SMS page");

        pages.systemNavigatesToPage().loginWithPreconditions();

        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Click on desired contact person");
        extentLogger.info("Expected Result: Manager should be able to click on a contact");
        pages.systemNavigatesToPage().contactEphrem.click();

        extentLogger.info("Step 4: System should navigate to desired person's file");
        extentLogger.info("Expected Result: Manager should be able to see person's information");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().contactInfo.getText(), HEADER_OF_CONTACT);

        extentLogger.info("Step 5: Contact person via TextMsg. Click on envelope functionality");
        extentLogger.info("Expected Result: Manager should be able to click on envelope functionality");
        pages.systemNavigatesToPage().envelope.click();

        extentLogger.info("Step 6: System should navigate to 'Send SMS' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Send SMS' page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerSendSMS.getText(), HEADER_SEND_SMS);

    }

    @Test
    public void BRIT_2219() {
        extentLogger = report.createTest("Verifying from manager perspective, that manager CANNOT send SMS with NOT-Valid phone credentials");

        pages.systemNavigatesToPage().loginWithPreconditions();

        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Click on desired contact person");
        extentLogger.info("Expected Result: Manager should be able to click on a contact");
        pages.systemNavigatesToPage().contactEphrem.click();

        extentLogger.info("Step 4: System should navigate to desired person's file");
        extentLogger.info("Expected Result: Manager should be able to see person's information");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().contactInfo.getText(), HEADER_OF_CONTACT);

        extentLogger.info("Step 5: Contact person via TextMsg. Click on envelope functionality");
        extentLogger.info("Expected Result: Manager should be able to click on envelope functionality");
        pages.systemNavigatesToPage().envelope.click();

        extentLogger.info("Step 6: System should navigate to 'Send SMS' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Send SMS' page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerSendSMS.getText(), HEADER_SEND_SMS);


        extentLogger.info("Step 7: Click and type message");
        extentLogger.info("Expected Result: Manager should be able to type a message");
        pages.systemNavigatesToPage().typeMessage.sendKeys("Hello World!");

        extentLogger.info("Step 8: Click 'Send' button");
        extentLogger.info("Expected Result: Manager should be able to click on 'Send' button");
        pages.systemNavigatesToPage().send.click();

        extentLogger.info("Step 9: System should navigate to a pop up window of 'Warning'");
        extentLogger.info("Expected Result: Manager should be able to see a warning pop up window: 'The number dagfda is not correct. It must be in international format (E.164). No SMS were sent.'");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().dialogWarning.getText(), DIALOG_WARNING);

    }


    @Test
        public void BRIT_2225() {
        extentLogger = report.createTest("System should navigate Manager to a persons information page");

        pages.systemNavigatesToPage().loginWithPreconditions();
        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Click on desired contact person");
        extentLogger.info("Expected Result: Manager should be able to click on a contact");
        pages.systemNavigatesToPage().contactJoseph.click();

        extentLogger.info("Step 5: System should navigate to desired person's file");
        extentLogger.info("Expected Result: Manager should be able to see person's information");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().contactInfo.getText(), CONTACT_INFO);

    }

    @Test
    public void BRIT_2232() {
        extentLogger = report.createTest("System should navigate Manager to Manager's email");

        pages.systemNavigatesToPage().loginWithPreconditions();
        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Click on desired contact person");
        extentLogger.info("Expected Result: Manager should be able to click on a contact");
        pages.systemNavigatesToPage().contactJoseph.click();

        extentLogger.info("Step 4: System should navigate to desired person's file");
        extentLogger.info("Expected Result: Manager should be able to see person's information");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().contactInfo.getText(), CONTACT_INFO);

        extentLogger.info("Step 5: Click on email");
        extentLogger.info("Expected Result: Manager should be able to click on email");
        pages.systemNavigatesToPage().emailJoseph.click();

        extentLogger.info("Step 6: System should navigate Manager to Manager's email");
        extentLogger.info("Expected Result: Manager should be able to be navigated by system to the email");
        // Should take Manager to his email box

}

    @Test
    public void BRIT_2236() {
        extentLogger = report.createTest("Verifying from Manager perspective that 'Conversation' Functionality works properly");

        pages.systemNavigatesToPage().loginWithPreconditions();

        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Navigate to 'Conversations' functionality and click");
        extentLogger.info("Expected Result: Manager should be able to click on 'Conversations' functionality");
        pages.systemNavigatesToPage().conversationBox.click();

        extentLogger.info("Step 4: System should display a dropdown list of 'Conversations'");
        extentLogger.info("Expected Result: Manager should be able to see a dropdown of'Conversations'");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().mailDropdown.getText(), MAIL_DROPDOWN);

    }

    @Test
    public void BRIT_2240() {
        extentLogger = report.createTest("Verify from Manager perspective that 'Conversation' functionality works properly");

        pages.systemNavigatesToPage().loginWithPreconditions();

        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Navigate to 'Conversations' functionality and click");
        extentLogger.info("Expected Result: Manager should be able to click on 'Conversations' functionality");
        pages.systemNavigatesToPage().conversationBox.click();

        extentLogger.info("Step 4: System should display a dropdown list of 'Conversations'");
        extentLogger.info("Expected Result: Manager should be able to see a dropdown of'Conversations'");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().mailDropdown.getText(), MAIL_DROPDOWN);

        extentLogger.info("Step 5: Click on SalesManager4");
        extentLogger.info("Expected Result: Manager should be able to click on message from SalesManager4");
        pages.systemNavigatesToPage().SalesManager4.click();

        extentLogger.info("Step 6: System should navigate to a conversation window to reply");
        extentLogger.info("Expected Result: Manager should be able to reply on a message from SalesManager4");
        wait(5);
        Assert.assertEquals(pages.systemNavigatesToPage().conversationOpens.getText(), CONVERSATION_OPENS);

    }


    @Test
    public void BRIT_2942() {
        extentLogger = report.createTest("Verifying from Manager perspective that Manager can reply on conversation successfully");

        pages.systemNavigatesToPage().loginWithPreconditions();

        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Navigate to 'Conversations' functionality and click");
        extentLogger.info("Expected Result: Manager should be able to click on 'Conversations' functionality");
        pages.systemNavigatesToPage().conversationBox.click();

        extentLogger.info("Step 4: System should display a dropdown list of 'Conversations'");
        extentLogger.info("Expected Result: Manager should be able to see a dropdown of'Conversations'");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().mailDropdown.getText(), MAIL_DROPDOWN);

        extentLogger.info("Step 5: Click on SalesManager4");
        extentLogger.info("Expected Result: Manager should be able to click on message from SalesManager4");
        pages.systemNavigatesToPage().SalesManager4.click();

        extentLogger.info("Step 6: System should navigate to a conversation window to reply");
        extentLogger.info("Expected Result: Manager should be able to reply on a message from SalesManager4");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().conversationOpens.getText(), CONVERSATION_OPENS);

        extentLogger.info("Step 7: Click on 'Write Something'");
        extentLogger.info("Expected Result: Manager should be able to click on 'Write Something'");
        pages.systemNavigatesToPage().writeSomething.click();

    }


    @Test
    public void BRIT_2944() {
        extentLogger = report.createTest("Verifying from Manager perspective that Manager can SUBMIT a message on conversation successfully");

        pages.systemNavigatesToPage().loginWithPreconditions();

        extentLogger.info("Step 1: Click on 'Contacts' functionality on left top side of a webpage");
        extentLogger.info("Expected Result: Manager should be able to click on 'Contacts' functionality");
        pages.systemNavigatesToPage().contactsTopButton.click();

        extentLogger.info("Step 2: System should display 'Contacts' page");
        extentLogger.info("Expected Result: Manager should be able to see 'Contacts' header on a page");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().headerOfAPage.getText(), CONTACTS);

        extentLogger.info("Step 3: Navigate to 'Conversations' functionality and click");
        extentLogger.info("Expected Result: Manager should be able to click on 'Conversations' functionality");
        pages.systemNavigatesToPage().conversationBox.click();

        extentLogger.info("Step 4: System should display a dropdown list of 'Conversations'");
        extentLogger.info("Expected Result: Manager should be able to see a dropdown of'Conversations'");
        wait(10);
        Assert.assertEquals(pages.systemNavigatesToPage().mailDropdown.getText(), MAIL_DROPDOWN);

        extentLogger.info("Step 5: Click on SalesManager4");
        extentLogger.info("Expected Result: Manager should be able to click on message from SalesManager4");
        pages.systemNavigatesToPage().SalesManager4.click();

        extentLogger.info("Step 6: System should navigate to a conversation window to reply");
        extentLogger.info("Expected Result: Manager should be able to reply on a message from SalesManager4");
        wait(5);
        Assert.assertEquals(pages.systemNavigatesToPage().conversationOpens.getText(), CONVERSATION_OPENS);

        extentLogger.info("Step 7: Click on 'Write Something', type a message and submit");
        extentLogger.info("Expected Result: Manager should be able to click on 'Write Something' and send message");
        String message = "I LOVE CUCUMBER";
        wait(10);
        pages.systemNavigatesToPage().writeSomething.sendKeys(message + Keys.ENTER);

        extentLogger.info("MANUALLY REFRESH PAGE. Manager should able to see message that was sent");

    }
}

