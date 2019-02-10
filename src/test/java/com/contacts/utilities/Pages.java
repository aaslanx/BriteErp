package com.contacts.utilities;

import com.contacts.pages.*;

public class Pages {

    private LoginPage login;
    private SystemNavigatesToPage systemNavigatesToPage;
    private TopNavigationBar topNavigationBar;

    private SearchPage searchPage;
    private HelpPage helpPage;
    private ImportUserPage importuserPage;


    //========================================================================================================================

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


    public HelpPage helpPage(){
        if(helpPage==null){
            helpPage=new HelpPage();
        }
        return helpPage;
    }



}
