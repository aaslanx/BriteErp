package com.contacts.tests.functionality2.Lachin.functional_tests;

import com.contacts.utilities.TestBase;
import org.testng.annotations.Test;

public class functional_tests extends TestBase {


        @Test
        public void Test(){

            extentLogger = report.createTest("BRIT_248_Error Message Test");


            extentLogger.info("1. Pre-Condition Environment is up and running.");

            extentLogger.info("2. Go to url");
            extentLogger.info("Expected  Result: Home page is displayed.");
            pages.login().open();

            extentLogger.info("3. Click Brite Erp Demo");
            extentLogger.info("Expected  Result: Clicked");


            extentLogger.info("4. Enter username and password for Inventory Manager 2 ");
            extentLogger.info("Expected  Result: Login successful");
            pages.login().userLogin();



        }
}
