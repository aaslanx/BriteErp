package com.contacts.utilities;

import com.contacts.pages.*;

public class Pages {

    private LoginPage login;
    private SystemNavigatesToPage systemNavigatesToPage;
    private ContactLoginPage contactLoginPage;
    private ContactsPage contactsPage;
    private ImportUserPage importuserPage;
    private HomePage homePage;
    //-------------------------------------------------------


    public ContactsPage onContactsPage() {
        return contactsPage==null?new ContactsPage():contactsPage;
    }



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
