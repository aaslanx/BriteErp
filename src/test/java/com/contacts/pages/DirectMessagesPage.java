package com.contacts.pages;

import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectMessagesPage {

    public DirectMessagesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class='list-group']//a[2]")
    public WebElement britErpDemoButton;

    @FindBy(css = "input#login")
    public WebElement email_box;

    @FindBy(css = "input#password")
    public WebElement password_box;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBotton;

    @FindBy(xpath = "(//span[@class='fa fa-plus o_add'])[2]")
    public WebElement directMessagesPlusSign;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement directMessagesSearchBox;

    @FindBy(css = "body.o_web_client.o_no_chat_window>ul>li>a")
    public WebElement administrator;

    @FindBy(xpath = "//div[@class='o_chat_composer o_chat_inline_composer']//div/div/div/textarea[1]")
    public WebElement writeSomethingBox;

    @FindBy(xpath = "//div[@class='o_chat_composer o_chat_inline_composer']//div[2]/button")
    public WebElement send;



}
