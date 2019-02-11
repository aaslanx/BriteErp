package com.contacts.pages;

import com.github.javafaker.Faker;

public class NewContact  extends ContactsPage{

    Faker faker = new Faker();
    public String n_name = faker.name().fullName();

    public String n_address = faker.address().fullAddress();

    // Split address from the origin
    public String n_street = n_address.split(",")[0];
    public String n_city = n_address.split(",")[1];
    public String n_addpart = n_address.split(",")[2].trim();
    public String n_zipcode = n_addpart.split(" ")[1];
    public String n_state = n_addpart.split(" ")[0];

    //Mobile phone number with US phone format
    public   String phone ="("+faker.number().numberBetween(200, 999)+") "
            +faker.number().numberBetween(200, 999) +" "+faker.number().numberBetween(2000, 9999);
    public  String userName = (n_name.charAt(0)+n_name.substring(n_name.indexOf(" ")+1)).toLowerCase();

    //email is with the first letter of first name and last name
    public  String n_email = userName+"@"+faker.internet().domainName();
}
