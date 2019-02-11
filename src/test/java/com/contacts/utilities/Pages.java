package com.contacts.utilities;

import com.contacts.pages.*;

public class Pages {

    private LoginPage login;
    private SystemNavigatesToPage systemNavigatesToPage;
    private TopNavigationBar topNavigationBar;
    private ContactLoginPage contactLoginPage;
    private ContactsPage contactsPage;
    private SearchPage searchPage;
    private HelpPage helpPage;
    private ImportUserPage importuserPage;
    private HomePage homePage;
    //-------------------------------------------------------

    // 3.we just created
    public ImportUserPage importuserPage(){
        if(importuserPage ==null){
            importuserPage=new ImportUserPage();
        }
        return importuserPage;
    }

    public LoginPage login(){
        if(login==null){
            login = new LoginPage();
        }
        return login;
    }

    public SystemNavigatesToPage systemNavigatesToPage(){
        if(systemNavigatesToPage == null){
            systemNavigatesToPage = new SystemNavigatesToPage();
        }
        return systemNavigatesToPage;
    }


    public TopNavigationBar topNavigationBar(){
        if(topNavigationBar==null){
            topNavigationBar = new TopNavigationBar();
        }
        return topNavigationBar;
    }



    public SearchPage searchPage(){
        if(searchPage==null){
            searchPage=new SearchPage();
        }
        return searchPage;
    }

    public HelpPage helpPage(){
        if(helpPage==null){
            helpPage=new HelpPage();
        }
        return helpPage;
    }


    public ContactLoginPage contactLoginPage() {
        if(contactLoginPage==null){
            contactLoginPage=new ContactLoginPage();
        }
        return contactLoginPage;
    }

    public ContactsPage contactsPage(){
        if(contactsPage==null){
            contactsPage = new ContactsPage();
        }
        return contactsPage;
    }

    public HomePage homePage(){
        if(homePage==null){
            homePage = new HomePage();
        }
        return homePage;
    }

}
