package com.contacts.pages;

import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='list-group']//a[2]")
    public WebElement britErpDemoButton;

    @FindBy(css = "input#login")
    public WebElement email_box;

    @FindBy(css = "input#password")
    public WebElement password_box;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li[4]/a/span")
    public WebElement contactsTopButton;

    @FindBy(css = "div.o_searchview>input")
    public WebElement searchButton;

}
