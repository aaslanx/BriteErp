package com.contacts.tests.functionality2.Sergey.functional_tests;


import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import com.contacts.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class functional_tests extends TestBase {

    @Test(priority = 1)
    public void BRIT2946() {
        extentLogger = report.createTest("BRIT2946 Verify that user should be able to go to contacts");

        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Password; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();


    }

    @Test(priority = 2)
    public void BRIT2947(){
        extentLogger = report.createTest("BRIT2947 Verify that user should be able to create");

        wait(5);
        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Password; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();
        extentLogger.info("2. Click on Create on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateButton.click();

    }

    @Test(priority = 3)
    public void BRIT2948() {
        extentLogger = report.createTest("BRIT2948 Verify that user should be able to safe");

        wait(5);
        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Password; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();
        extentLogger.info("2. Click on Create on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateButton.click();
        extentLogger.info("3. Click on Save on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to see a pop up error: ! The following fields are invalid: *Name.");
        pages.contactLoginPage().SaveButton.click();

    }


    @Test(priority = 4)
    public void BRIT2949() {
        extentLogger = report.createTest("BRIT2949 Verify that user should be able to discard");

        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Passwoed; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();
        extentLogger.info("2. Click on Create on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateButton.click();
        extentLogger.info("3. Click on Save on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to see a pop up error: ! The following fields are invalid: *Name.");
        pages.contactLoginPage().SaveButton.click();
        extentLogger.info("4. Click on Discard on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Discard.");

        pages.contactLoginPage().DiscardButton.click();

    }




    @Test(priority = 5)
    public void BRIT2950() {

        extentLogger = report.createTest("Brite2950 Verify that sales user should be able click on sale and purchace");

        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Passwoed; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();

        extentLogger.info("2. Click on Create on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateButton.click();

        extentLogger.info("3. Type a name and click on Sales and Purchases.");
        extentLogger.info("Input: Angelo Perrero");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pages.contactLoginPage().NewName.sendKeys("Angero Perrero");

        pages.contactLoginPage().SaleAndPurchace.click();


    }

    @Test(priority = 6)
    public void BRIT2955() {

        extentLogger = report.createTest("Brite2955 Verify that user should be able to click on 0 Bank Accounts");

        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Passwoed; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();

        extentLogger.info("2. Click on Create on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateButton.click();

        extentLogger.info("3. Type a name and click on Sales and Purchases.");
        extentLogger.info("Input: Angelo Perrero");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pages.contactLoginPage().NewName.sendKeys("Angero Perrero");

        pages.contactLoginPage().SaleAndPurchace.click();

        extentLogger.info("4. Click on 0 Bank Accounts at a bottom under Payments header");
        extentLogger.info("Expected result: InventoryUser3 clicked on 0 Bank Accounts succesfully");

        pages.contactLoginPage().PaymentBank.click();

    }


    @Test(priority = 7)
    public void BRIT2956() {

        extentLogger = report.createTest("Brite2956 Verify that user should be able to create");

        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Passwoed; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();

        extentLogger.info("2. Click on Create on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateButton.click();

        extentLogger.info("3. Type a name and click on Sales and Purchases.");
        extentLogger.info("Input: Angelo Perrero");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pages.contactLoginPage().NewName.sendKeys("Angero Perrero");

        pages.contactLoginPage().SaleAndPurchace.click();

        extentLogger.info("4. Click on 0 Bank Accounts at a bottom under Payments header");
        extentLogger.info("Expected result: InventoryUser3 clicked on 0 Bank Accounts succesfully");

        pages.contactLoginPage().PaymentBank.click();

        extentLogger.info("5. Click on Create on upper left corner to create a bank account");
        extentLogger.info("InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateAdd.click();

    }


    @Test(priority = 8)
    public void BRIT2975() {

        extentLogger = report.createTest("Brite2975 Verify that user can see the Validation Error Account Number must be unique");

        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Passwoed; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();

        extentLogger.info("2. Click on Create on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateButton.click();

        extentLogger.info("3. Type a name and click on Sales and Purchases.");
        extentLogger.info("Input: Angelo Perrero");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Create");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pages.contactLoginPage().NewName.sendKeys("Angero Perrero");

        pages.contactLoginPage().SaleAndPurchace.click();

        extentLogger.info("4. Click on 0 Bank Accounts at a bottom under Payments header");
        extentLogger.info("Expected result: InventoryUser3 clicked on 0 Bank Accounts succesfully");

        pages.contactLoginPage().PaymentBank.click();

        extentLogger.info("5. Click on Create on upper left corner to create a bank account");
        extentLogger.info("InventoryUser3 should be able to click on Create");
        pages.contactLoginPage().CreateAdd.click();

        extentLogger.info("6. Account Number, ABA/Routing and Bank fields must be provided and click Safe on upper left corner");
        extentLogger.info("Input: Account Number: 9587432512165,  ABA/Routing: 1512  Bank: ING - Seven Oaks");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Safe and see a pop up Odoo Server Error: - Validation Error" +
                "Account Number must be unique.");
        pages.contactLoginPage().AccountNumber.sendKeys("9587432512165");
        pages.contactLoginPage().AbaRouting.sendKeys("1512");
        pages.contactLoginPage().Bank.sendKeys("ING - Seven Oaks");
        pages.contactLoginPage().Safe.click();

    }



    @Test(priority = 9)
    public void BRIT2976() {

        extentLogger = report.createTest("Brite2976 Verify that sales user should be able click on plus sign for direct message");

        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Passwoed; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();

        extentLogger.info("2. System should navigate to a new page with all contacts");
        extentLogger.info("Expected result: InventoryUser3 should be able to see a page full of contacts");
        wait(10);
        Assert.assertEquals(driver.getTitle(), CONTACTS_TITLE);

        extentLogger.info("3. Click on Conversations functionality on upper right corner");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Conversations on upper right corner");
        pages.contactLoginPage().ConversationButton.click();

    }


    @Test(priority = 10)
    public void BRIT2977() {

        extentLogger = report.createTest("Brite2977 Verify that sales user should be able click general message for direct message");

        extentLogger.info("Preconditions: 1. Open Url; 2. Click BritErpDemo; 3. Input Email and Passwoed; 4. Click Log in;");
        pages.contactLoginPage().preconditionUser();

        wait(2);
        extentLogger.info("1. Click on Contacts on upper left corner.");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Contacts");
        pages.contactLoginPage().ContactsButton.click();

        extentLogger.info("2. System should navigate to a new page with all contacts");
        extentLogger.info("Expected result: InventoryUser3 should be able to see a page full of contacts");
        wait(10);
        Assert.assertEquals(driver.getTitle(), CONTACTS_TITLE);

        extentLogger.info("3. Click on Conversations functionality on upper right corner");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on Conversations on upper right corner");
        pages.contactLoginPage().ConversationButton.click();
        extentLogger.info("4. Click on a receiving messages from 'general'");
        extentLogger.info("Expected result: InventoryUser3 should be able to click on a message ");
        wait(5);
        pages.contactLoginPage().General.click();

    }




}