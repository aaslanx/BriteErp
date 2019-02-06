package com.contacts.tests.functionality1.Natalya.functional_tests;

import com.contacts.utilities.Driver;
import com.contacts.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class functional_tests extends TestBase {


    @Test
    public void Said(){
    extentLogger = report.createTest(" Your Jira BRIT number and Comment what are you automating now.");


    extentLogger.info("1. Pre-Condition Environment is up and running. ");
    extentLogger.info("2. Go to url");
    extentLogger.info("Expected Result: Home page is displayed. ");
    pages.login().open();

    extentLogger.info("3. Click Brite Erp Demo");
    extentLogger.info("Expected Result: Clicked");
    pages.login().briteButton.click();

    extentLogger.info("4. Enter username and password for Inventory Manager 2 and sign in");
    extentLogger.info("Expected Result: Login successful ");

    }


}
