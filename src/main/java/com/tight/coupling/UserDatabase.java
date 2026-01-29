package com.tight.coupling;

public class UserDatabase {

    // A - MySQL, PostgresSQL
    // B - Web Services, MongoDB

    public String getUserDetails(){
        // directly access database here
        return "User Details From Database";
    }
}
