package com.oddo.tests;

import com.contacts.utilities.TestBase;
import com.oddo.pages.HomePage;
import com.oddo.utilities.MyConfig;
import org.testng.annotations.Test;

public class Login extends TestBase {


   @Test
 public void login(){

        HomePage homePage = new HomePage();
        driver.get(MyConfig.getProperty("url"));
        homePage.BriteErpDemoDropDown.click();
        homePage.username.sendKeys(MyConfig.getProperty("username"));
        homePage.password.sendKeys(MyConfig.getProperty("password"));
        homePage.logInButton.click();
      //  homePage.contactsModule.click();


    }
}
