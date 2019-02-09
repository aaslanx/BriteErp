package com.contacts.tests.functionality2.Lachin.functional_tests;

import com.contacts.pages.ImportUserPage;
import com.contacts.utilities.ApplicationConstants;
import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import com.contacts.utilities.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class functional_tests extends TestBase {

    @Test
    public void BRIT_1305() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1305 Verify that InventoryUser3 should be able to click on Load File button");
        extentLogger.info("1.Click on “Contacts” tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page");
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on Import tab");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on Import tab");
        pages.importuserPage().importTab.click();

        extentLogger.info("3.Click on Load File");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on Load File");
        pages.importuserPage().loadFileTab.click();


    }

    @Test
    public void BRIT_1311() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1311 Verify that InventoryUser3 should be able to cancel while in import page");
        extentLogger.info("1.Click on “Contacts” tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page");
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on Import tab");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on Import tab");
        pages.importuserPage().importTab.click();


        extentLogger.info("3.Verify cancel button is clickable");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click to cancel button");
        pages.importuserPage().cancelButtonInImportPage.click();


    }

    @Test
    public void BRIT_1323() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1323 Verify that InventoryUser3 is able to click on “Cancel” botton and see Contacts header");
        extentLogger.info("1.Click on “Contacts” tab on upper left corner");
        wait(5);
        extentLogger.info("Expected Result:System should display Contacts page");
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on Import tab");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on Import tab");
        pages.importuserPage().importTab.click();


        extentLogger.info("3.Click on Cancel button");
        extentLogger.info("Expected Result: InventoryUser3 should be able to see 'Contacts/Import a File' page and be able to click on “Cancel” button");
        pages.importuserPage().cancelButton.click();

        extentLogger.info("4.After clicking “Cancel” button");
        extentLogger.info("Expected Result: InventoryUser3 should be able to see 'Contacts' homepage after clicking 'Cancel' button");

        wait(5);
        System.out.println(pages.importuserPage().contactsHeaderrr.getText());

        Assert.assertEquals(pages.importuserPage().contactsHeaderrr.getText(), CONTACTS);

    }

    @Test
    public void BRIT_1343() {
        pages.importuserPage().login();

        extentLogger = report.createTest("BRIT-1343 Verify that InventoryUser3 is able to click on “Help” button and see new page “How to import data into Odoo”");
        extentLogger.info("1.Click on “Contacts” tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page");
        wait(2);
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on Import tab");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on Import tab");
        pages.importuserPage().importTab.click();


        extentLogger.info("3.'Help' icon should be displayed on upper right side");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on 'Help' button on upper right side");

        pages.importuserPage().helpIcon.click();
        wait(2);
        // String target = driver.getTitle();
        String targetTitle = "How to import data into Odoo — Odoo 11.0 documentation";
        switchToWindow(targetTitle);


        extentLogger.info("4.'After clicking “Help” button");
        extentLogger.info("Expected Result: InventoryUser3 should be able to see 'How to import data into Odoo' page after clicking “Help” button");

        wait(2);
        System.out.println(pages.importuserPage().odooHeader.getText());
        Assert.assertEquals(pages.importuserPage().odooHeader.getText(), ODOOHEADER);
    }

    @Test
    public void BRIT_1357() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1357 Verify that InventoryUser3 should be able to click on 'How to start' button from Odoo import page");
        extentLogger.info("1.Click on “Contacts” tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page");
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on Import tab");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on Import tab");
        pages.importuserPage().importTab.click();

        extentLogger.info("3.'Help' icon should be displayed on upper right side");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on 'Help' button on upper right side");

        pages.importuserPage().helpIcon.click();
        wait(2);

        String targetTitle = "How to import data into Odoo — Odoo 11.0 documentation";
        switchToWindow(targetTitle);


        extentLogger.info("4.'How to start' button should be displayed on left side");
        extentLogger.info("Expected Result: InventoryUser3 should be able to click on 'How to start botton' ");
        pages.importuserPage().howToStart.click();


    }

    @Test
    public void BRIT_1366() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1366 Verify that InventoryUser3 is able to create and save contacts with providing Company Name , address, phone number");

        extentLogger.info("1.Click on 'Contacts' tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page ");
        pages.importuserPage().contactsTab.click();


        extentLogger.info("2.Click on 'Create' tab");
        extentLogger.info("Expected Result:System should display page 'Contacts / New' ");
        pages.importuserPage().createButton.click();

        extentLogger.info("3.InventoryUser3 click radio button 'Company' ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to click radio button 'Company' ");
        pages.importuserPage().companyRadioButton.click();

        extentLogger.info("4.InventoryUser3 should enter Company “Name” ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type company name in the given field ");
        pages.importuserPage().companyName.sendKeys("Jasmina LLC");

        extentLogger.info("5.InventoryUser3 should enter address ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type address in the given field ");
        pages.importuserPage().streetName.sendKeys("18 Richland Avenue");
        pages.importuserPage().cityName.sendKeys("Sugar Land");
        pages.importuserPage().stateName.sendKeys("IL");

        pages.importuserPage().zip.sendKeys("77487");
        pages.importuserPage().cancelpopButton.click();
        pages.importuserPage().countryName.sendKeys("United States");

        extentLogger.info("6.InventoryUser3 should enter phone number ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type phone number in the given field");
        pages.importuserPage().phoneTab.sendKeys("2813252933");


        extentLogger.info("7.Click create ");
        extentLogger.info("Expected Result: click create");
        pages.importuserPage().createCompanyButton.click();

        extentLogger.info("8.Enter Contact Name ,save and close");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type contact name, save and close the window");
        pages.importuserPage().contactNameTab.sendKeys("Jasmina Jones");
        pages.importuserPage().saveAndClose.click();
    }

    @Test
    public void BRIT_1376() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1376 Verify that InventoryUser3 is NOT able to create and save contacts without providing Company Name (Negative Scenario)");

        extentLogger.info("1.Click on 'Contacts' tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page ");
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on 'Create' tab");
        extentLogger.info("Expected Result:System should display page 'Contacts / New' ");
        pages.importuserPage().createButton.click();

        extentLogger.info("3.InventoryUser3 click radio button 'Company' ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to click radio button 'Company' ");
        pages.importuserPage().companyRadioButton.click();


        extentLogger.info("4.Click on “Create” without providing company name, save and close, see error message");
        extentLogger.info("Expected Result:InventoryUser3 should be able to see error message: “The following fields are invalid: Name” ");
        pages.importuserPage().createCompanyButton.click();
        pages.importuserPage().saveAndClose.click();

    }

    @Test
    public void BRIT_1379() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1379 Verify that InventoryUser3 is able to click upload image of the company");

        extentLogger.info("1.Click on 'Contacts' tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page ");
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on 'Create' tab");
        extentLogger.info("Expected Result:System should display page 'Contacts / New' ");
        pages.importuserPage().createButton.click();

        extentLogger.info("3.InventoryUser3 click radio button 'Company' ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to click radio button 'Company' ");
        pages.importuserPage().companyRadioButton.click();

        extentLogger.info("4.InventoryUser3 should enter Company “Name” ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type company name in the given field ");
        pages.importuserPage().companyName.sendKeys("Jasmina LLC");

        extentLogger.info("5.InventoryUser3 should enter address ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type address in the given field ");
        pages.importuserPage().streetName.sendKeys("18 Richland Avenue");
        pages.importuserPage().cityName.sendKeys("Sugar Land");
        pages.importuserPage().stateName.sendKeys("IL");

        pages.importuserPage().zip.sendKeys("77487");
        pages.importuserPage().cancelpopButton.click();
        pages.importuserPage().countryName.sendKeys("United States");

        extentLogger.info("6.InventoryUser3 should enter phone number ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type phone number in the given field");
        pages.importuserPage().phoneTab.sendKeys("2813252933");
        pages.importuserPage().createCompanyButton.click();

        extentLogger.info("7.Click on “Image” icon on top left ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to click upload picture");
        pages.importuserPage().pencilIcon.click();


    }

    @Test
    public void BRIT_1384() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1384 Verify that InventoryUser3 is able to click to delete button from an image icon of the company");

        extentLogger.info("1.Click on 'Contacts' tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page ");
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on 'Create' tab");
        extentLogger.info("Expected Result:System should display page 'Contacts / New' ");
        pages.importuserPage().createButton.click();


        extentLogger.info("3.InventoryUser3 click radio button 'Company' ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to click radio button 'Company' ");
        pages.importuserPage().companyRadioButton.click();

        extentLogger.info("4.InventoryUser3 should enter Company “Name” ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type company name in the given field ");
        pages.importuserPage().companyName.sendKeys("Jasmina LLC");


        extentLogger.info("5.InventoryUser3 should enter address ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type address in the given field ");
        pages.importuserPage().streetName.sendKeys("18 Richland Avenue");
        pages.importuserPage().cityName.sendKeys("Sugar Land");
        pages.importuserPage().stateName.sendKeys("IL");

        pages.importuserPage().zip.sendKeys("77487");
        pages.importuserPage().cancelpopButton.click();
        pages.importuserPage().countryName.sendKeys("United States");

        extentLogger.info("6.InventoryUser3 should enter phone number ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type phone number in the given field");
        pages.importuserPage().phoneTab.sendKeys("2813252933");

        extentLogger.info("7.Click on “Image” icon on top left ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to  click on DELETE icon ");
        pages.importuserPage().trashIcon.click();
    }

    @Test
    public void BRIT_1391() {
        pages.importuserPage().login();
        extentLogger = report.createTest("BRIT-1391 Verify that InventoryUser3 is able to click on Discard button when created company contact name is no longer needed");

        extentLogger.info("1.Click on 'Contacts' tab on upper left corner");
        extentLogger.info("Expected Result:System should display Contacts page ");
        pages.importuserPage().contactsTab.click();

        extentLogger.info("2.Click on 'Create' tab");
        extentLogger.info("Expected Result:System should display page 'Contacts / New' ");
        pages.importuserPage().createButton.click();


        extentLogger.info("3.InventoryUser3 click on 'Company' radio button ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to click radio button 'Company' ");
        pages.importuserPage().companyRadioButton.click();

        extentLogger.info("4.InventoryUser3 should enter Company “Name” ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type company name in the given field ");
        pages.importuserPage().companyName.sendKeys("MO LLC");
        pages.importuserPage().createCompanyButton.click();

        extentLogger.info("5.Enter “Contact name” ");
        extentLogger.info("Expected Result:InventoryUser3 should be able to type MO and click save and close button ");
        pages.importuserPage().contactNameMO.sendKeys("MO");
        pages.importuserPage().saveButton.click();

        extentLogger.info("6.Click “Discard” button ");
        extentLogger.info("Expected Result:should see “Contacts / New” page and under that title InventoryUser3 should see Discard button  ");
        wait(2);
        pages.importuserPage().discardButtonbutton.click();

        extentLogger.info("7.Warning pop up ");
        extentLogger.info("Expected Result:InventoryUser3 should see warning message :“The record has been modified, your changes will be discarded. Do you want to proceed?” InventoryUser3 should be able to click OK button and contact should be discarded ");
        pages.importuserPage().okButton.click();
    }
}