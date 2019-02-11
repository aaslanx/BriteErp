package com.contacts.pages;

import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='list-group']//a[2]")
    public WebElement briteErpDemoButton;

    @FindBy(css = "input#login")
    public WebElement email_box;

    @FindBy(css = "input#password")
    public WebElement password_box;

    @FindBy(xpath = "//button[@type='submit']")
    //CSS would look like: div.clearfix.oe_login_buttons>button (where button is a child)
    public WebElement logInButton;

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li[4]/a/span")
    public WebElement contactsButton;

    @FindBy(css = "input.o_searchview_input")
    public WebElement searchBox;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox2;

    @FindBy(css = "div.o_searchview>input")
    public WebElement searchButton;

    @FindBy(css = "div.o_searchview_facet")
    public WebElement searchName;


}
