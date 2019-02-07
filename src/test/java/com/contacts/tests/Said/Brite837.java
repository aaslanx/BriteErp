package com.contacts.tests.Said;

import com.contacts.pages.HomePage;
import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import com.contacts.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Brite837 extends TestBase {

    @Test
    public void BRIT_837(){

        extentLogger = report.createTest("Brite 837 Verify that sales manager user should be able click on plus sign for direct messages");

        extentLogger.info("1. Open Url");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));

        extentLogger.info("2. click briteErpDemo button");
        extentLogger.info("Exptec result: ");
        pages.homePage().britErpDemoButton.click();

        extentLogger.info("3. Enter valid username and password then click on \"Login\" button.");
        extentLogger.info("Expected result: System should displayed login button successfully.");
        pages.homePage().email_box.sendKeys(ConfigurationReader.getProperties("usernameManager"));
        pages.homePage().password_box.sendKeys(ConfigurationReader.getProperties("passwordManager"));
        pages.homePage().loginButton.click();


        System.out.println(pages.homePage().contactsTopButton.getText() + " get text");
        System.out.println(pages.homePage().contactsTopButton.getAttribute("innerText") + " get atribute");

        Assert.assertEquals(pages.homePage().contactsTopButton.getAttribute("innerText").trim(), "Contacts");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        pages.homePage().contactsTopButton.click();




    }


}
