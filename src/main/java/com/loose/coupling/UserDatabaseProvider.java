package com.loose.coupling;

// it implements the interface UserDataProvider
public class UserDatabaseProvider implements UserDataProvider {

    // A - MySQL, PostgresSQL
    // B - Web Services, MongoDB
    @Override
    public String getUserDetails(){
        // directly access database here
        return "User Details From Database";
    }
}
