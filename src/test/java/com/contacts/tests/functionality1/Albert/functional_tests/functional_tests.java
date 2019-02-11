package com.contacts.tests.functionality1.Albert.functional_tests;


import com.contacts.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class functional_tests extends TestBase{




    // FIRST 5 Test are for UPLOAD feature. There are UPLOAD files in UploadFiles folder.


    //-----------------------------|     TEST 1     |----------------------------------------------

    @Test (testName = "BRIT 2844",priority = 1)
    public void uploadXLSX() {
        String file = CWD + uploadFile_XLSX;
        extentLogger = report.createTest("|  TEST  -->  BRIT-2844  |\nManager should be able to import contacts with import feature");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition --> \nContacts Page Loaded \n-->Upload file: " + file );

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().loadFileButton.sendKeys(file);
        wait(5);

        // Assert test with Log
        extentLogger.info(pages.onContactsPage().uploadedMessage.isDisplayed()?"TEST passed: File Uploaded":"TEST failed - File could NOT be uploaded");
        Assert.assertTrue(pages.onContactsPage().uploadedMessage.isDisplayed());

    }


    //-----------------------------|     TEST 2     |----------------------------------------------

    @Test (testName = "BRIT 2847",priority = 2)
    public void uploadUnknown() {
        String file = CWD + uploadFile_TXT;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2847  |\nManager should 'NOT' be able to import contacts from unknown format");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition --> \nContacts Page Loaded \n-->Upload file: " + file );

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        pages.onContactsPage().loadFileButton.sendKeys(file);
        wait(5);

        // Assert test with Log
        extentLogger.info(pages.onContactsPage().uploadErrorMessage.isDisplayed()?"TEST passed: File Uploaded":"TEST failed - File could NOT be uploaded");
        Assert.assertTrue(pages.onContactsPage().uploadErrorMessage.isDisplayed());

    }


    //-----------------------------|     TEST 3     |----------------------------------------------

    @Test (testName = "BRIT 2849",priority = 3)
    public void uploadXLSX_Unmatch_Row() {
        String file =CWD + uploadFile_XLSX_Unmatch_Row;
        extentLogger = report.createTest("|  TEST  -->  BRIT-2849  |\nManager should be able to import contacts with unmatch fields");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \n-->Upload file: "+ file);

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().loadFileButton.sendKeys(file);
        wait(5);

        // Assert test with Log
        extentLogger.info(pages.onContactsPage().uploadedMessage.isDisplayed()?"TEST passed: File Uploaded":"TEST failed - File could NOT be uploaded");
        Assert.assertTrue(pages.onContactsPage().uploadedMessage.isDisplayed());

    }


    //-----------------------------|     TEST 4     |----------------------------------------------

    @Test (testName = "BRIT 2852",priority = 4)
    public void uploadXLSX_Unknown_Row() {
        String file = CWD + uploadFile_XLSX_Unknown_Row;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2852  |\nManager should be able to import contacts with unknown fields");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition --> \nContacts Page Loaded \n-->Upload file: " + file );

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().loadFileButton.sendKeys(file);
        wait(5);

        // Assert test with Log
        extentLogger.info(pages.onContactsPage().uploadedMessage.isDisplayed()?"TEST passed: File Uploaded":"TEST failed - File could NOT be uploaded");
        Assert.assertTrue(pages.onContactsPage().uploadedMessage.isDisplayed());

    }


    //-----------------------------|     TEST 5     |----------------------------------------------

    @Test (testName = "BRIT 2853",priority = 5)
    public void accuracy_of_configurableFields() {
        String file = CWD + uploadFile_XLSX;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2853  |\nManager should be able to test the accuracy of configurable fileds before importing the contacts");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \n-->Upload file: "+ file);

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().loadFileButton.sendKeys(file);
        wait(5);

        // Assert test with Log
        extentLogger.info(pages.onContactsPage().uploadedMessage.isDisplayed()?"TEST passed: File Uploaded":"TEST failed - File could NOT be uploaded");
        Assert.assertTrue(pages.onContactsPage().uploadedMessage.isDisplayed());

    }


    // 6-10 TEST of Creating and Editing Contacts
    //-----------------------------|     TEST 6     |----------------------------------------------

    @Test (testName = "BRIT 2895",priority = 6)
    public void newContact() {

        extentLogger = report.createTest("|  TEST  -->  BRIT-2895  |\nManager should be able to create a new contact with appropriate information");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \n-->Creating new Contact: "+ newContact.n_name);

        extentLogger.info("STEP 2 | Click CREATE button");
        pages.onContactsPage().createButton.click();

        extentLogger.info("STEP 3 | Fill the Fields");
        pages.onContactsPage().field_Name.sendKeys(newContact.n_name);
        pages.onContactsPage().field_Street.sendKeys(newContact.n_street);
        pages.onContactsPage().field_City.sendKeys(newContact.n_city);
//        pages.onContactsPage().field_State.sendKeys(newContact.n_state);
//        pages.onContactsPage().field_ZipCode.sendKeys(newContact.n_zipcode);
//        pages.onContactsPage().field_Country.sendKeys("USA");

        pages.onContactsPage().saveButton.click();


        // Assert test with Log
        wait(3);
        extentLogger.info(pages.onContactsPage().edittedContact_Name.getText().equals(newContact.n_name)?"TEST passed: Editted name: "+newContact.n_name:"TEST failed - Name could not be editted");
        Assert.assertTrue(pages.onContactsPage().edittedContact_Name.getText().equals(newContact.n_name));


    }


    //-----------------------------|     TEST 7     |----------------------------------------------

    @Test (testName = "BRIT 2897",priority = 7)
    public void newContact_withoutinfo() {

        extentLogger = report.createTest("|  TEST  -->  BRIT-2897  |  Manager should 'NOT'be able to create a new contact without filling any field");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition --> Contacts Page Loaded -->Creating new Contact without filling the fields");
        extentLogger.info("STEP 2 | Click CREATE button");
        pages.onContactsPage().createButton.click();

        extentLogger.info("STEP 3 | Leave fields blank and click Save button");
        pages.onContactsPage().saveButton.click();

        // Assert test with Log

        extentLogger.info(driver.getTitle()=="New - Odoo"?"TEST passed: Warning message was displayed ":"TEST failed - Warning message is displayed");
        Assert.assertTrue(driver.getTitle().equals("New - Odoo"),"CONTACT SHOULD NOT BE CREATED");


    }


    //-----------------------------|     TEST 8     |----------------------------------------------

    @Test (testName = "BRIT 2900",priority = 8)
    public void newContact_name_Digits() {
        int randomNumber = (int)(Math.random() * 5000 + 1);

        extentLogger = report.createTest("|  TEST  -->  BRIT-2900  |  Manager should 'NOT'be able to create a new contact whose name consists of numbers");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition --> Contacts Page Loaded -->Creating new Contact: "+ newContact.n_name + "-->Editted name: " + randomNumber);

        wait(2);
        extentLogger.info("STEP 2 | Click CREATE button");
        pages.onContactsPage().createButton.click();

        extentLogger.info("STEP 3 | Fill the Fields  -->Name with DIGIT:"+randomNumber+ "  -->New Address: "+newContact.n_address);
        System.out.println("NAME: " + newContact.n_name + "\nADDRESS: " +newContact.n_address);

        pages.onContactsPage().field_Name.sendKeys(" "+randomNumber);
        pages.onContactsPage().field_Street.sendKeys(newContact.n_street);
        pages.onContactsPage().field_City.sendKeys(newContact.n_city);


        extentLogger.info("STEP 4 | Click Save button");
        pages.onContactsPage().saveButton.click();


        // Assert test with Log
        extentLogger.info(pages.onContactsPage().edittedContact_Name.getText().equals(randomNumber)?"TEST Failed: Contacts's name contains numbers: "+randomNumber:"TEST passed: Warning message was displayed");
        Assert.assertFalse(pages.onContactsPage().edittedContact_Name.getText().equals(randomNumber));


    }


    //-----------------------------|     TEST 9     |----------------------------------------------

    @Test (testName = "BRIT 2910", priority = 9)
    public void editContact() {
        wait(2);
        extentLogger = report.createTest("|  TEST  -->  BRIT-2910  |  Manager should be able to edit a contact");
        pages.onContactsPage().login("Manager");

        extentLogger.info("STEP 1 | Pre Condition --> Contacts Page Loaded -->Choosen Contact: '"+ newContact.choosenContact_Name.getText()  + "' -->Contact's name will be: "+ newContact.n_name);

        extentLogger.info("STEP 2 | Click the first Contact");
        pages.onContactsPage().firstContactOnTheContactsList.click();

        extentLogger.info("STEP 3 | Click Edit button");
        pages.onContactsPage().editButton.click();
        wait(2);

        extentLogger.info("STEP 4 | Clear name and type new name");
        pages.onContactsPage().field_Name.clear();
        pages.onContactsPage().field_Name.sendKeys(newContact.n_name);

        extentLogger.info("STEP 5 | Click Save button");
        pages.onContactsPage().saveButton.click();

        // Assert test with Log
        extentLogger.info(pages.onContactsPage().edittedContact_Name.getText().equals(newContact.n_name)?"TEST passed: Editted name: "+newContact.n_name:"TEST failed - Name could not be editted");
        Assert.assertTrue(pages.onContactsPage().edittedContact_Name.getText().equals(newContact.n_name));

    }


    //-----------------------------|     TEST 10     |----------------------------------------------

    @Test (testName = "BRIT 2914",priority = 10)
    public void createCompany() {

        extentLogger = report.createTest("|  TEST  -->  BRIT-2914  |  Manager should 'NOT'be able to create a new contact without filling any field");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded");

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");


//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }












}
