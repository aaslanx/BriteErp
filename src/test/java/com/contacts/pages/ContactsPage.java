package com.contacts.pages;


import com.contacts.utilities.ConfigurationReader;
import com.contacts.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static com.contacts.utilities.ApplicationConstants.CWD;
import static com.contacts.utilities.BrowserUtils.waitForClickablility;


public class ContactsPage {

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'][26]")
    public WebElement selectRandomNameFromContacts;

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'][14]")
    public WebElement selectRandomNameFromContacts2;

    @FindBy (xpath = "//div[@class='o_form_buttons_view']/button[1]")
    public WebElement editContactsButton;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement nameField;

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement saveButton;

    @FindBy(css="o_pager_value")
    public WebElement contactsPerPage;

    @FindBy(css="button.btn.btn-icon.fa.fa-lg.fa-list-ul.o_cp_switch_list")
    public WebElement listView;

    @FindBy(css = "span.o_stat_text.o_value.text-danger")
    public WebElement unpublishedButton;

    @FindBy(css="div.o_kanban_image")
    public WebElement contactCard;

    @FindBy(css="div.o_notebook>ul.nav.nav-tabs>li:nth-of-type(3)>a")
    public WebElement sales_purcases_tab;

    @FindBy(xpath = "//div[@name='bank_account_count']")
    public  WebElement bankAccounts;

    @FindBy (css = "button.btn.btn-primary.btn-sm.o_list_button_add")
    public  WebElement createBankAcctButton;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement accountNumberField;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input']")
    public WebElement routingNumberField;

    @FindBy (xpath = "//div[@class='o_field_widget o_field_many2one']/div/input")
    public WebElement bankNameField;

    @FindBy(xpath = "(//body/ul)/li[2]/a")
    public WebElement sevenOaksField;

    @FindBy (xpath = "//div[@class='o_field_widget o_field_many2one']/div/span")
    public WebElement bankNameDropdownButton;

    @FindBy (css = "button.btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement saveBankDetails;

    @FindBy (css = ".o_kanban_view.o_res_partner_kanban.o_kanban_ungrouped>div:last-of-type")
    public WebElement lastContactForScrolling;


    //  ---  MERGED

    public void login(String user){
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        waitForClickablility (briteErpDemoButton, 8);
        briteErpDemoButton.click ();
        email.sendKeys(ConfigurationReader.getProperties("username"+user));
        password.sendKeys(ConfigurationReader.getProperties("password"+user));
        loginButton.click();
        Driver.getDriver().get(ConfigurationReader.getProperties("contactsURL"));

    }



    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        waitForClickablility (briteErpDemoButton, 8);
        briteErpDemoButton.click ();
        email.sendKeys(ConfigurationReader.getProperties("usernameUser"));
        password.sendKeys(ConfigurationReader.getProperties("passwordUser"));
        loginButton.click();
        Driver.getDriver().get(ConfigurationReader.getProperties("contactsURL"));

    }

    // FOR LOGIN

    @FindBy(xpath = "//div/a[2]")
    public WebElement briteErpDemoButton;

    @FindBy(css = "input#login")
    public WebElement email;


    @FindBy(css = "input#password")
    public WebElement password;

    @FindBy(xpath = "//div/button[@class='btn btn-primary']")
    public WebElement loginButton;



    @FindBy(xpath = "//button[contains(text(),\"Import\")]")
    public WebElement importButton;

    @FindBy(xpath = "//input[@class='oe_import_file_show form-control']")
    public WebElement importUploadBox;

    @FindBy(xpath = "//input[@id='my-file-selector']")   //  --> 1= //label[@class='btn btn-primary'] 2= //input[@id='my-file-selector']
    public WebElement loadFileButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

//    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
//    public WebElement saveButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'][1]")
    public WebElement firstContactOnTheContactsList;

    @FindBy (xpath = "//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'][1] /div[2]/strong")
    public WebElement choosenContact_Name;  //  --  on Edit grid xpath = //span[@name='name']

    @FindBy (xpath = "//span[@name='name']")
    public WebElement edittedContact_Name;

    @FindBy (xpath = "//form/div[2]")
    public WebElement uploadedMessage;

    @FindBy (xpath = "//div[@class='oe_import_report oe_import_report_error']")
    public WebElement uploadErrorMessage;

    @FindBy (xpath = "//di[@class'o_notification undefined o_error']")
    public WebElement createErrorMessage;





    //  -- CONTACTS CREATE FIELDS
    @FindBy (xpath = "//input[@name='name']")
    public WebElement field_Name;

    @FindBy (xpath = "//input[@name='street']")
    public WebElement field_Street;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement field_City;

    @FindBy (xpath = "//div[@name='state_id']")
    public WebElement field_State;

    @FindBy (xpath = "//input[@name='zipcode']")
    public WebElement field_ZipCode;

    @FindBy (xpath = "//input[@name='country']")
    public WebElement field_Country;

    // -- CONTACTS EDIT FIELDS
    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement field_Edit_Name;





}