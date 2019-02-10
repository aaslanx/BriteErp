package com.contacts.tests.functionality1.Albert.functional_tests;


import com.contacts.utilities.TestBase;
import org.testng.annotations.Test;

public class functional_tests extends TestBase{




    // FIRST 5 Test are for UPLOAD feature. There are UPLOAD files in UploadFiles folder.


    //-----------------------------|     TEST 1     |----------------------------------------------

    @Test (testName = "BRIT 2844",priority = 1)
    public void uploadXLSX() {
        String file = CWD + uploadFile_XLSX;
        extentLogger = report.createTest("|  TEST  -->  BRIT-2844  |\nManager should be able to import contacts with import feature");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition --> \nContacts Page Loaded \nUpload file: " + file );

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(file);
        pages.onContactsPage().loadFileButton.sendKeys(file);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    //-----------------------------|     TEST 2     |----------------------------------------------

    @Test (testName = "BRIT 2847",priority = 2)
    public void uploadUnknown() {
        String file = CWD + uploadFile_TXT;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2847  |\nManager should 'NOT' be able to import contacts from unknown format");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition --> \nContacts Page Loaded \nUpload file: " + file );

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(file);
        pages.onContactsPage().loadFileButton.sendKeys(file);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    //-----------------------------|     TEST 3     |----------------------------------------------

    @Test (testName = "BRIT 2849",priority = 3)
    public void uploadXLSX_Unmatch_Row() {
        String file =CWD + uploadFile_XLSX_Unmatch_Row;
        extentLogger = report.createTest("|  TEST  -->  BRIT-2849  |\nManager should be able to import contacts with unmatch fields");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \nUpload file: "+ file);

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(CWD + uploadFile_XLSX_Unmatch_Row);
        pages.onContactsPage().loadFileButton.sendKeys(CWD + uploadFile_XLSX_Unmatch_Row);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    //-----------------------------|     TEST 4     |----------------------------------------------

    @Test (testName = "BRIT 2852",priority = 4)
    public void uploadXLSX_Unknown_Row() {
        String file = CWD + uploadFile_XLSX_Unknown_Row;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2852  |\nManager should be able to import contacts with unknown fields");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition --> \nContacts Page Loaded \nUpload file: " + file );

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(file);
        pages.onContactsPage().loadFileButton.sendKeys(file);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    //-----------------------------|     TEST 5     |----------------------------------------------

    @Test (testName = "BRIT 2853",priority = 5)
    public void accuracy_of_configurableFields() {
        String file = CWD + uploadFile_XLSX;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2853  |\nManager should be able to test the accuracy of configurable fileds before importing the contacts");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \nUpload file: "+ file);

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(file);
        pages.onContactsPage().loadFileButton.sendKeys(file);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    // 6-10 TEST of Creating and Editing Contacts
    //-----------------------------|     TEST 6     |----------------------------------------------

    @Test (testName = "BRIT 2895",priority = 6)
    public void newContact() {

        extentLogger = report.createTest("|  TEST  -->  BRIT-2895  |\nManager should be able to create a new contact with appropriate information");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \nCreating new Contact: "+ newContact.n_name);

        extentLogger.info("STEP 2 | Click CREATE button");
        pages.onContactsPage().createButton.click();

        extentLogger.info("STEP 3 | Fill the Fields");
        pages.onContactsPage().field_Name.sendKeys(newContact.n_name);
        pages.onContactsPage().field_Street.sendKeys(newContact.n_street);
        pages.onContactsPage().field_City.sendKeys(newContact.n_city);
        pages.onContactsPage().field_State.sendKeys(newContact.n_state);
        pages.onContactsPage().field_ZipCode.sendKeys(newContact.n_zipcode);
        pages.onContactsPage().field_Country.sendKeys("USA");

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    //-----------------------------|     TEST 7     |----------------------------------------------

    @Test (testName = "BRIT 2897",priority = 7)
    public void newContact_withoutinfo() {
        String file = CWD + uploadFile_XLSX;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2897  |\nManager should 'NOT'be able to create a new contact without filling any field");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \nUpload file: "+ file);

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(file);
        pages.onContactsPage().loadFileButton.sendKeys(file);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    //-----------------------------|     TEST 8     |----------------------------------------------

    @Test (testName = "BRIT 2900",priority = 8)
    public void newContact_name_Digits() {
        String file = CWD + uploadFile_XLSX;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2900  |\nManager should 'NOT'be able to create a new contact without filling any field");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \nUpload file: "+ file);

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(file);
        pages.onContactsPage().loadFileButton.sendKeys(file);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    //-----------------------------|     TEST 9     |----------------------------------------------

    @Test (testName = "BRIT 2910",priority = 9)
    public void editContact() {
        String file = CWD + uploadFile_XLSX;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2910  |\nManager should 'NOT'be able to create a new contact without filling any field");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \nUpload file: "+ file);

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(file);
        pages.onContactsPage().loadFileButton.sendKeys(file);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }


    //-----------------------------|     TEST 10     |----------------------------------------------

    @Test (testName = "BRIT 2914",priority = 10)
    public void createCompany() {
        String file = CWD + uploadFile_XLSX;

        extentLogger = report.createTest("|  TEST  -->  BRIT-2914  |\nManager should 'NOT'be able to create a new contact without filling any field");
        pages.onContactsPage().login();
        extentLogger.info("STEP 1 | Pre Condition \n--> Contacts Page Loaded \nUpload file: "+ file);

        extentLogger.info("STEP 2 | Click IMPORT button");
        pages.onContactsPage().importButton.click();

        extentLogger.info("STEP 3 | Upload XLSX file & click Load button");
        pages.onContactsPage().importUploadBox.sendKeys(file);
        pages.onContactsPage().loadFileButton.sendKeys(file);

        pages.onContactsPage().loadFileButton.click();

//
//        Assert.assertTrue(pages.crmPage().activities.isDisplayed());
//        System.out.println(pages.crmPage().activities.isDisplayed());

    }












}
