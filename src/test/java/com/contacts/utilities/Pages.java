package com.contacts.utilities;

import com.contacts.pages.*;

public class Pages {

    private LoginPage login;
    private CalendarPage calendar;
    private CalendarListViewPage calendarListViewPage;
    private TopNavigationBar topNavigationBar;

    private SearchPage searchPage;
    private HelpPage helpPage;
    private ImportUserPage importuserPage;
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

    public CalendarPage calendar(){
        if(calendar==null){
            calendar = new CalendarPage();
        }
        return calendar;
    }


    public CalendarListViewPage calendarListViewPage(){
        if(calendarListViewPage==null){
            calendarListViewPage = new CalendarListViewPage();
        }
        return calendarListViewPage;
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



}
