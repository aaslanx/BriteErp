package com.contacts.pages;

import com.contacts.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='o_chat_header']/span/a[2]")
    public WebElement chatClose;

    @FindBy(xpath = "//div[@class='o_calendar_buttons']/button")
    public WebElement lastWeek_button;




}
