package com.IOC.coupling;

public class NewDataBaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching Data from new database";
    }
}
