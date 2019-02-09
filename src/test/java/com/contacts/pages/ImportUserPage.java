package com.contacts.pages;

import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import static com.contacts.utilities.BrowserUtils.waitForClickablility;

public  class ImportUserPage {
    //2.
    public ImportUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div/a[2]")
    public WebElement briteErpDemoButton;

    @FindBy(css = "input#login")
    public WebElement email;


    @FindBy(css = "input#password")
    public WebElement password;

    @FindBy(xpath = "//div/button[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@class='oe_menu_toggler'])[1]")
    public WebElement contactsTab;

    @FindBy(xpath = "//div/button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importTab;

    @FindBy(xpath = "//div/span/label[@class='btn btn-primary']")
    public WebElement loadFileTab;

    @FindBy(xpath = "//div/button[@class='btn btn-sm btn-default o_import_button o_import_import']")
    public WebElement importdisabled;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary o_import_button o_import_validate']")
    public WebElement disabledTestImportButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_import_cancel']")
    public WebElement cancelButtonInImportPage;

    @FindBy(xpath = "(//div/ul/li/a[@class='ripple internal reference'])[1]")
    public WebElement howToStart;


    @FindBy(css = "button[class*='btn btn-sm btn-default o_import_cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[@class='o_control_panel']/ol/li")
    public WebElement contactsHeaderrr;

    @FindBy(xpath = "//div[@class='container text-center']//h1")
    public WebElement odooHeader;

    @FindBy(xpath = "//a[@class='pull-right']")
    public WebElement helpIcon;

    @FindBy(xpath = "//button[@class='btn btn-default oe_import_file_reload']")
    public WebElement reloadFileButton;

    @FindBy(xpath = "//div/button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy(xpath = "(//div/input[@class='o_radio_input'])[2]")
    public WebElement companyRadioButton;


    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement companyName;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetName;


    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_address_city']")
    public WebElement cityName;


    @FindBy(xpath = "//input[@placeholder='State']")
    public WebElement stateName;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_address_zip']")
    public WebElement zip;

    @FindBy(xpath = "//input[@placeholder='Country']")
    public WebElement countryName;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-default']")
    public WebElement cancelpopButton;

    @FindBy(xpath = "(//div/input[@class='o_field_phone o_field_widget o_input'])[1]")
    public WebElement phoneTab;

    @FindBy(xpath = " //button[@class='btn btn-primary btn-sm o-kanban-button-new']")
    public WebElement createCompanyButton;

//    @FindBy(xpath = "//input[@id='o_field_input_349']")  contactNameTab sometimes works with this or below one
//    public WebElement contactNameTab;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_required_modifier'])[2]")
    public WebElement contactNameTab;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_required_modifier'])[2]")
    public WebElement contactNameMO;


    @FindBy(xpath = "//div/button[@class='btn btn-sm btn-primary'][1]")
    public WebElement saveAndClose;

    @FindBy(xpath = "//div/span[@class='fa fa-pencil fa-lg pull-left o_select_file_button']")
    public WebElement pencilIcon;


    @FindBy(xpath = "//div/span[@class='fa fa-pencil fa-lg pull-left o_select_file_button']")
    public WebElement contactNametabnew;


    @FindBy(xpath = " //div/span[@class='fa fa-trash-o fa-lg pull-right o_clear_file_button']")
    public WebElement trashIcon;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_form_button_cancel']")
    public WebElement discardButton;

    @FindBy(xpath = "(//div[@class='o_cp_buttons'][1]/div/div/button)[4]")
    public WebElement discardButtonbutton;

//button[@class='btn btn-default btn-sm o_form_button_cancel']

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']/span[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='modal-footer']/button[@class='btn btn-sm btn-primary']")
    public WebElement okButton;

    //div/button[@class='btn btn-sm btn-primary']


    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        waitForClickablility (briteErpDemoButton, 5);
        briteErpDemoButton.click ();
        email.sendKeys(ConfigurationReader.getProperties("usernameUser"));
        password.sendKeys(ConfigurationReader.getProperties("passwordUser"));
        loginButton.click();
    }









}

