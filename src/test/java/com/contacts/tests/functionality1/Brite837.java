package com.contacts.tests.functionality1;

import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import com.contacts.utilities.TestBase;
import org.testng.annotations.Test;

public class Brite837 extends TestBase {

    @Test
    public void BRIT_837(){

        extentLogger = report.createTest("Brite 837 Verify that sales manager user should be able click on plus sign for direct messages");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));

    }


}
