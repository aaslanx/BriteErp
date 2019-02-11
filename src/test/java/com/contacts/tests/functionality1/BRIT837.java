package com.contacts.tests.functionality1;

import com.contacts.pages.HomePage;
import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import com.contacts.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BRIT837 extends TestBase {
//
//    @Test
//    public void BRIT_837(){
//
//            extentLogger = report.createTest("Verify that sales manager user should be able click on plus sign for direct messages");
//
//            extentLogger.info("1. Open url");
//            Driver.getDriver().get(ConfigurationReader.getProperties("url"));
//
//            extentLogger.info("2. Click BriteErpDemo button");
//            extentLogger.info("Expected result: clickable");
//            pages.homePage().briteErpDemoButton.click();
//
//            extentLogger.info("3. Enter valid username and password and click Log in button");
//            extentLogger.info("Expected result: System should display login button successfully");
//            pages.homePage().email_box.sendKeys(ConfigurationReader.getProperties("usernameManager"));
//            pages.homePage().password_box. sendKeys(ConfigurationReader.getProperties("passwordManager"));
//
//            pages.homePage().logInButton.click();
//
//            //wait(2);
//            System.out.println(pages.homePage().contactsButton.getText() + " get text");
//            System.out.println(pages.homePage().contactsButton.getAttribute("innerText").trim() + " get attribute");
//
//            Assert.assertEquals(pages.homePage().contactsButton.getAttribute("innerText").trim(), "Contacts");
//                try {
//                        Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                        e.printStackTrace();
//                }
//
//                pages.homePage().contactsButton.click();
//    }
}
