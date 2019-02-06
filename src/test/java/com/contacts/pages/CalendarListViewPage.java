package com.contacts.pages;

import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarListViewPage {
    public CalendarListViewPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "button.btn.btn-primary.btn-sm.o_list_button_add")
    public WebElement create_button;



    @FindBy(xpath ="//div[@class='col-sm-12']//a" )
    public WebElement helpButton;

    @FindBy(xpath ="//button[@data-original-title='List']" )
    public WebElement list;


}
