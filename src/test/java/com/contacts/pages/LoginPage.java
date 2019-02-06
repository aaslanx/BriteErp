package com.contacts.pages;

import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.contacts.utilities.BrowserUtils.waitForPageToLoad;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='form-group field-login']/input")
    public WebElement emailBox;


    @FindBy(xpath = "//div[@class='form-group field-password']/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[@class='clearfix oe_login_buttons']/button")
    public WebElement login_button;


    @FindBy(css = "div.list-group>a:nth-of-type(2)")
    public WebElement briteButton;


    public void userLogin(){
        emailBox.sendKeys(ConfigurationReader.getProperties("usernameUser"));
        passwordBox.sendKeys(ConfigurationReader.getProperties("passwordUser"));
        login_button.click();
    }


    public void managerLogin(){

        emailBox.sendKeys(ConfigurationReader.getProperties("usernameManager"));
        passwordBox.sendKeys(ConfigurationReader.getProperties("passwordManager"));
        login_button.click();
    }

    public void open(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        waitForPageToLoad(5);
    }

}
