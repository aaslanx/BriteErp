package com.contacts.tests.functionality2.Adilya.functional_tests;

import com.contacts.utilities.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class functional_tests extends TestBase {


    @Test
    public void BRIT_1906() {
        extentLogger = report.createTest("Verify that InventoryUser3 can update the name of the company in the Contacts section");
        extentLogger.info("Precondition 1: Environment must be ready. Must be signed in as Inventory User");
        pages.login().userLogin();

        wait(2);
        extentLogger.info("Precondition 2: Click on Contacts button in Top Nav bar");
        extentLogger.info("Expected Result: User is on the Contacts page");
        pages.homePage().contactsButton.click();

        extentLogger.info("1. Select the contact from the list");
        extentLogger.info("Expected result: contact record is clicked for further edits");
        pages.contactsPage().selectRandomNameFromContacts.click();

        extentLogger.info("2. Click on the EDIT button to edit contact's name");
        extentLogger.info("Expected result: EDIT button must be clickable");
        pages.contactsPage().editContactsButton.click();

        extentLogger.info("3. Click in the name field to type a new name or edit existing");
        extentLogger.info("Expected result: Name field is clickable");
        pages.contactsPage().nameField.click();

        extentLogger.info("4. Hover over the name and type in a new name. Delete previous name and type new one");
        extentLogger.info("Expected result: Can delete and update the name of the contact. ADA >> ADALET");
        pages.contactsPage().nameField.clear();
        pages.contactsPage().nameField.sendKeys("ADALET");

        extentLogger.info("5. Click on a \"Save\" button to save the change");
        extentLogger.info("Expected result: Updated record is saved");
        pages.contactsPage().saveButton.click();
    }

    @Test
    public void BRIT_1900() {
        extentLogger = report.createTest("Verify that InventoryUser3 can view all contacts in the Contacts section and change layout from table to list");
        extentLogger.info("Precondition 1: Environment must be ready. Must be signed in as Inventory User");
        pages.login().userLogin();

        wait(2);
        extentLogger.info("1. Click on \"Contacts\" tab from the top horizontal menu bar");
        extentLogger.info("Expected Result: User is on the Contacts page");
        pages.homePage().contactsButton.click();

        extentLogger.info("2. Scroll down to ensure the contacts are loaded and displayed on the page and page navigation tools are present");
        extentLogger.info("Expected Result: 80 contacts must be loaded per one page with side scroll bar. Total number of contacts must be clearly visible, with arrows allowing scrolling between pages ");

         scrollToElement(pages.contactsPage().lastContactForScrolling);

        extentLogger.info("3. Click on LIST icon on the right hand side to change the layout of the page and the way contacts are displayed");
        extentLogger.info("Expected Result: Upon clicking on the LIST icon on the right hand side of the page, the layout of the page is updated so the contacts are displayed as a list instead of a default table view");
        pages.contactsPage().listView.click();

    }

    @Test
    public void BRIT_1940() {
        extentLogger = report.createTest("Verify that InventoryUser3 can publish the unpublished contact on the website");
        extentLogger.info("Precondition 1: Environment must be ready. Must be signed in as Inventory User");
        pages.login().userLogin();

        wait(4);
        extentLogger.info("Precondition 2: Click on Contacts button in Top Nav bar");
        extentLogger.info("Expected Result: User is on the Contacts page");
        pages.homePage().contactsButton.click();

        extentLogger.info("1. Select the contact from the list");
        extentLogger.info("Expected result: contact record is clicked for further edits");
        pages.contactsPage().selectRandomNameFromContacts2.click();

        extentLogger.info("2. On the contact card, click on the button with status that displays \"Unpublished on Website\" with word unpublished highlighted in red to change the status to \"Published\"");
        extentLogger.info("Expected result: On the contact card, the button upon clicking should change to \"Published on Website\" with word \"published\" in green (or vice-versa if random contact is already published)");
        pages.contactsPage().unpublishedButton.click();

    }

    @Test
    public void BRIT_1942() {
        extentLogger = report.createTest("Verify that InventoryUser3 can publish the unpublished contact on the website");
        extentLogger.info("Precondition 1: Environment must be ready. Must be signed in as Inventory User");
        pages.login().userLogin();

        wait(4);
        extentLogger.info("Precondition 2: Click on Contacts button in Top Nav bar");
        extentLogger.info("Expected Result: User is on the Contacts page");
        pages.homePage().contactsButton.click();
        wait(6);
        extentLogger.info("1. Select the contact from the list randomly. Alternatively, search for contact using Search bar");
        extentLogger.info("Expected result: contact card is displayed. Alternative: search has returned the contact (Matthew)");
        pages.homePage().searchBox.sendKeys("Matthew");
        pages.homePage().searchBox.sendKeys(Keys.RETURN);
        extentLogger.info("Click on contact card for further edits");
        wait(2);
        pages.contactsPage().contactCard.click();

        extentLogger.info("2. Click on \"Sales & Purchases\" tab in the lower part of the Contacts card");
        extentLogger.info("Expected result: \"Sales & Purchases\" tab must load and corresponding sections must be displayed (Sale, Purchase, Misc., Payments). Payments section must show number of saved bank accounts and credit cards for selected user.");
        pages.contactsPage().sales_purcases_tab.click();

        extentLogger.info("3. Click on \"#/0 Bank Account(s)\"");
        extentLogger.info("Expected result: A new page with user's saved bank accounts must load with related buttons to create and import data");
        pages.contactsPage().bankAccounts.click();

        extentLogger.info("4. Click on \"Create\" button in the top left of the page");
        extentLogger.info("Expected result: A page with blank fields for Acct. number, ABA/Routing, Bank must appear to be filled in");
        pages.contactsPage().createBankAcctButton.click();

        extentLogger.info("5. Populate required fields with valid information");
        extentLogger.info("Test data: Bank Account: 000123456789 ABA/Routing: 322281617 Bank: Seven Oaks");
        extentLogger.info("Expected result: User is able to fill in required details for Acct. number, ABA/Routing, and select a Bank name from the drop-down menu");
        pages.contactsPage().accountNumberField.sendKeys("000123456789");
        pages.contactsPage().routingNumberField.sendKeys("322281617");
        pages.contactsPage().bankNameField.sendKeys("Seven Oaks");
        pages.contactsPage().sevenOaksField.click();

//STUCK HERE since cannot add bank name details using dropdown or just typing (xpath issue???)
    }

    @Test
    public void BRIT_1950() {
        extentLogger = report.createTest("NEGATIVE TEST: Verify that InventoryUser3 cannot add a new bank account for a contact in the database using invalid bank account number\n");
        extentLogger.info("Precondition 1: Environment must be ready. Must be signed in as Inventory User");
        pages.login().userLogin();

        wait(4);
        extentLogger.info("Precondition 2: Click on Contacts button in Top Nav bar");
        extentLogger.info("Expected Result: User is on the Contacts page");
        pages.homePage().contactsButton.click();
        wait(6);
        extentLogger.info("1. Select the contact from the list randomly. Alternatively, search for contact using Search bar");
        extentLogger.info("Expected result: contact card is displayed. Alternative: search has returned the contact (Matthew)");
        pages.homePage().searchBox.sendKeys("Matthew");
        pages.homePage().searchBox.sendKeys(Keys.RETURN);
        extentLogger.info("Click on contact card for further edits");
        wait(2);
        pages.contactsPage().contactCard.click();
        extentLogger.info("2. Click on \"Sales & Purchases\" tab in the lower part of the Contacts card");
        extentLogger.info("Expected result: \"Sales & Purchases\" tab must load and corresponding sections must be displayed (Sale, Purchase, Misc., Payments). Payments section must show number of saved bank accounts and credit cards for selected user.");
        pages.contactsPage().sales_purcases_tab.click();

        extentLogger.info("3. Click on \"#/1 Bank Account(s)\"");
        extentLogger.info("Expected result: A new page with user's saved bank accounts must load with related buttons to create and import data");
        pages.contactsPage().bankAccounts.click();

        extentLogger.info("4. Click on \"Create\" button in the top left of the page");
        extentLogger.info("Expected result: A page with blank fields for Acct. number, ABA/Routing, Bank must appear to be filled in");
        pages.contactsPage().createBankAcctButton.click();

        extentLogger.info("5. Populate required fields with valid information");
        extentLogger.info("Test data:   Bank Account: 12345 ABA/Routing: 322281617 Bank: Seven Oaks, or no bank at all");
        extentLogger.info("Expected result: User is able to fill in required details for Acct. number, ABA/Routing, and select a Bank name from the drop-down menu");
        pages.contactsPage().accountNumberField.sendKeys("12345");
        pages.contactsPage().routingNumberField.sendKeys("322281617");

        extentLogger.info("6. Click on \"SAVE\" button at the top left to save the change and create a new record");
        extentLogger.info("Expected result: \"SAVE\" button must be visible and clickable by the user, but should not allow saving incorrect data without validating it first");
        pages.contactsPage().saveBankDetails.click();
    }


    @Test
    public void BRIT_1954() {
        extentLogger = report.createTest("NEGATIVE TEST: Verify that InventoryUser3 cannot add a new bank account for a contact in the database using an invalid routing number\n");
        extentLogger.info("Precondition 1: Environment must be ready. Must be signed in as Inventory User");
        pages.login().userLogin();

        wait(4);
        extentLogger.info("Precondition 2: Click on Contacts button in Top Nav bar");
        extentLogger.info("Expected Result: User is on the Contacts page");
        pages.homePage().contactsButton.click();
        wait(6);
        extentLogger.info("1. Select the contact from the list randomly. Alternatively, search for contact using Search bar");
        extentLogger.info("Expected result: contact card is displayed. Alternative: search has returned the contact (Matthew)");
        pages.homePage().searchBox.sendKeys("Matthew");
        pages.homePage().searchBox.sendKeys(Keys.RETURN);
        extentLogger.info("Click on contact card for further edits");
        wait(2);
        pages.contactsPage().contactCard.click();
        extentLogger.info("2. Click on \"Sales & Purchases\" tab in the lower part of the Contacts card");
        extentLogger.info("Expected result: \"Sales & Purchases\" tab must load and corresponding sections must be displayed (Sale, Purchase, Misc., Payments). Payments section must show number of saved bank accounts and credit cards for selected user.");
        pages.contactsPage().sales_purcases_tab.click();

        extentLogger.info("3. Click on \"#/2 Bank Account(s)\"");
        extentLogger.info("Expected result: A new page with user's saved bank accounts must load with related buttons to create and import data");
        pages.contactsPage().bankAccounts.click();

        extentLogger.info("4. Click on \"Create\" button in the top left of the page");
        extentLogger.info("Expected result: A page with blank fields for Acct. number, ABA/Routing, Bank must appear to be filled in");
        pages.contactsPage().createBankAcctButton.click();

        extentLogger.info("5. Populate required fields with valid information");
        extentLogger.info("Test data:   Bank Account: 123456789000 ABA/Routing: 12345 Bank: Seven Oaks, or no bank at all");
        extentLogger.info("Expected result: User is able to fill in required details for Acct. number, ABA/Routing, and select a Bank name from the drop-down menu");
        pages.contactsPage().accountNumberField.sendKeys("123456789000");
        pages.contactsPage().routingNumberField.sendKeys("12345");

        extentLogger.info("6. Click on \"SAVE\" button at the top left to save the change and create a new record");
        extentLogger.info("Expected result: \"SAVE\" button must be visible and clickable by the user, but should not allow saving incorrect data without validating it first");
        pages.contactsPage().saveBankDetails.click();
    }


    @Test
    public void BRIT_1962() {
        extentLogger = report.createTest("NEGATIVE TEST: Verify that InventoryUser3 cannot add a new bank account for a contact in the database using same account number as before for this user\n");
        extentLogger.info("Precondition 1: Environment must be ready. Must be signed in as Inventory User");
        pages.login().userLogin();

        wait(4);
        extentLogger.info("Precondition 2: Click on Contacts button in Top Nav bar");
        extentLogger.info("Expected Result: User is on the Contacts page");
        pages.homePage().contactsButton.click();
        wait(6);
        extentLogger.info("1. Select the contact from the list randomly. Alternatively, search for contact using Search bar");
        extentLogger.info("Expected result: contact card is displayed. Alternative: search has returned the contact (Matthew)");
        pages.homePage().searchBox.sendKeys("Matthew");
        pages.homePage().searchBox.sendKeys(Keys.RETURN);
        extentLogger.info("Click on contact card for further edits");
        wait(2);
        pages.contactsPage().contactCard.click();

        extentLogger.info("2. Click on \"Sales & Purchases\" tab in the lower part of the Contacts card");
        extentLogger.info("Expected result: \"Sales & Purchases\" tab must load and corresponding sections must be displayed (Sale, Purchase, Misc., Payments). Payments section must show number of saved bank accounts and credit cards for selected user.");
        pages.contactsPage().sales_purcases_tab.click();

        extentLogger.info("3. Click on \"#/3 Bank Account(s)\"");
        extentLogger.info("Expected result: A new page with user's saved bank accounts must load with related buttons to create and import data");
        pages.contactsPage().bankAccounts.click();

        extentLogger.info("4. Click on \"Create\" button in the top left of the page");
        extentLogger.info("Expected result: A page with blank fields for Acct. number, ABA/Routing, Bank must appear to be filled in");
        pages.contactsPage().createBankAcctButton.click();

        extentLogger.info("5. Populate required fields with valid but duplicate information,entering same bank account number as already entered for this user");
        extentLogger.info("Test data:   Bank Account: 000123456789 ABA/Routing: 322281617 Bank: Seven Oaks");
        extentLogger.info("Expected result: User should not be able to save new account information if data is not unique for each account. Odoo Server validation error must show up with message: \"Account Number must be unique\"");
        pages.contactsPage().accountNumberField.sendKeys("000123456789");
        pages.contactsPage().routingNumberField.sendKeys("322281617");
        pages.contactsPage().bankNameField.sendKeys("Seven Oaks" );
        pages.contactsPage().sevenOaksField.click();


//STUCK HERE since cannot add bank name details using dropdown or just typing (xpath issue???)


    }

}