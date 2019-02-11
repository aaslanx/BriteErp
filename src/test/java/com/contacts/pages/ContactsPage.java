package com.contacts.pages;

import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy (xpath = "//div[@name='bank_id']")
    //@FindBy (xpath = "//div[@class='o_field_widget o_field_many2one']/div/input']")
    public WebElement bankNameField;

    @FindBy (xpath = "//div[@class='o_field_widget o_field_many2one']/div/span")
    public WebElement bankNameDropdownButton;

    @FindBy (css = "button.btn.btn-primary.btn-sm.o_form_button_save")
    public WebElement saveBankDetails;


}
