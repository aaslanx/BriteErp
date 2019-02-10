package com.contacts.pages;

import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.contacts.utilities.BrowserUtils.waitForClickablility;

public class SystemNavigatesToPage {
    public SystemNavigatesToPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //    TestCase1
    @FindBy(xpath = "//div[@class='list-group']//a[2]")
    public WebElement briteErpDemoButton;

    @FindBy(id = "login")
    public WebElement eMail;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = "div.clearfix.oe_login_buttons>button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li[4]/a/span")
    public WebElement contactsTopButton;

    @FindBy(xpath = "//html/body/div/div[2]/div/ol/li")
    public WebElement headerOfAPage;

    @FindBy(xpath = "//html/body//../../..//../span[text()='ASUSTeK, ephrem ketema']")
    public WebElement contactEphrem;

    @FindBy(xpath = "//*[@class='o_field_char o_field_widget o_required_modifier']")
    public WebElement contactInfo;

    @FindBy(xpath = "(//div[@class='o_group']/table)[2]/tbody/tr[3]/td[2]/div/button")
    public WebElement envelope;

    @FindBy(tagName = "h4")
    public WebElement headerSendSMS;

    @FindBy(xpath = "//*[@class='o_input']")
    public WebElement typeMessage;

    @FindBy(xpath = "//*[@class='btn btn-sm oe_highlight']")
    public WebElement send;

    @FindBy(xpath = "//*[@class='o_dialog_warning modal-body']")
    public WebElement dialogWarning;

    //    TestCase2
    @FindBy(xpath = "//span[text()='ASUSTeK, Joseph Walters']")
    public WebElement contactJoseph;

    @FindBy(xpath = "//*[@class='o_field_email o_field_widget o_form_uri o_text_overflow']")
    public WebElement emailJoseph;

    //    TestCase3
    @FindBy(xpath = "//ul[3]/li[2]")
    public WebElement conversationBox;

    @FindBy(xpath = "//*[@class='o_mail_navbar_dropdown_top']")
    public WebElement mailDropdown;

    @FindBy(xpath = "(//div[@class='o_channel_title'])[4]")
    public WebElement SalesManager4;

    @FindBy(xpath = "//*[@class='o_chat_title']")
    public WebElement conversationOpens;

    @FindBy(css = "div.o_composer_container>div>div>textarea")
    public WebElement writeSomething;

    @FindBy(css = "div.navbar-collapse.collapse>ul>li:nth-of-type(4)>a>span")
    public WebElement ContactsHeader;






    public void loginWithPreconditions(){
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        waitForClickablility (briteErpDemoButton, 5);
        briteErpDemoButton.click ();
        eMail.sendKeys(ConfigurationReader.getProperties("usernameManager"));
        password.sendKeys(ConfigurationReader.getProperties("passwordManager"));
        loginButton.click();
    }
}
