package com.contacts.tests.Said;

import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import com.contacts.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class DirectMessageTest extends TestBase {


    @Test
    public void Brit_842(){
        extentLogger = report.createTest("Brite 842: Verify that sales manager user should be able to write something");

        extentLogger.info("1. Open Url");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));

        extentLogger.info("2. click briteErpDemo button");
        extentLogger.info("Exptec result: ");
        pages.directMessagesPage().britErpDemoButton.click();

        extentLogger.info("3. Enter valid username and password then click on \"Login\" button.");
        extentLogger.info("Expected result: System should displayed login button successfully.");
        pages.directMessagesPage().email_box.sendKeys(ConfigurationReader.getProperties("usernameManager"));
        pages.directMessagesPage().password_box.sendKeys(ConfigurationReader.getProperties("passwordManager"));
        pages.directMessagesPage().loginBotton.click();

        extentLogger.info("Clicking on the plus sign");
        extentLogger.info("Direct message search box");
        pages.directMessagesPage().directMessagesPlusSign.click();

        extentLogger.info("entering valid user name like Administrator");
        pages.directMessagesPage().directMessagesSearchBox.sendKeys("Administrator");

        extentLogger.info("Clicking on administrator");
        pages.directMessagesPage().administrator.click();


        extentLogger.info("Writing hello administrator");
        pages.directMessagesPage().writeSomethingBox.sendKeys("hello administrator");

        wait(2);
        extentLogger.info("Clicking on send button");
        pages.directMessagesPage().send.click();

        extentLogger.pass("Pass : hello administrator");




    }




}

