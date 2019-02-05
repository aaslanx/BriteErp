package com.oddo.tests;


import com.contacts.utilities.TestBase;
import com.oddo.pages.HomePage;
import com.oddo.utilities.MyConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LachinTestCases extends TestBase {

    public void login() {
        HomePage homePage = new HomePage();
        driver.get(MyConfig.getProperty("url"));
        homePage.BriteErpDemoDropDown.click();
        homePage.username.sendKeys(MyConfig.getProperty("username"));
        homePage.password.sendKeys(MyConfig.getProperty("password"));
        homePage.logInButton.click();

    }

    public void ContactsImportTabsOnly() {
        WebElement contactsTab = driver.findElement(By.xpath("(//a[@class='oe_menu_toggler'])[1]"));
        contactsTab.click();

        driver.findElement(By.xpath("//div/button[@class='btn btn-sm btn-default o_button_import']")).click();
    }


    @Test
    public void userShouldNotImport() {
        login();
        ContactsImportTabsOnly();

        WebElement loadFile = driver.findElement(By.xpath("//div/span/label[@class='btn btn-primary']"));
        loadFile.click();
        WebElement disabledImport = driver.findElement(By.xpath("//div/button[@class='btn btn-sm btn-default o_import_button o_import_import']"));
        if (disabledImport.isEnabled()) {
            System.out.println("Import button is enabled");
        } else {
            System.out.println("Import button is disabled");
        }
    }

    @Test
    public void userShouldNotTestImport() {
        login();
        ContactsImportTabsOnly();

        WebElement disabledTestImportButton = driver.findElement(By.xpath("//div/button[@class='btn btn-sm btn-primary o_import_button o_import_validate']"));
        if (disabledTestImportButton.isEnabled()) {
            System.out.println("Test import button is enabled");
        } else {
            System.out.println("Test import button is disabled");
        }
    }

   // @Test
    //public void userIsAbleToClickCancel()  {
      //  login();
       // ContactsImportTabsOnly();
       // WebElement cancelButton = driver.findElement(By.cssSelector("button[class*='btn btn-sm btn-default o_import_cancel']"));
       // cancelButton.click();


   // }
}



