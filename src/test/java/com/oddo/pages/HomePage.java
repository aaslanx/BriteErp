package com.oddo.pages;

import com.oddo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath="//a[2]")
   public WebElement BriteErpDemoDropDown;


    @FindBy(id="login")
    public WebElement username;

    @FindBy (id="password")
    public  WebElement password;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])")
    public WebElement logInButton;

   @FindBy(xpath="//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[4]/a/span")
    public WebElement contactsModule;




}



