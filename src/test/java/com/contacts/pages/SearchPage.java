package com.contacts.pages;

import com.contacts.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement MgniffierIcone;

    @FindBy(css = "li.o_save_name>button")
    public WebElement CustomSavedSearch_SavedButton;


}
