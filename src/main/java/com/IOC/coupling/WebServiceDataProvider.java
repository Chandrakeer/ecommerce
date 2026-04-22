package com.IOC.coupling;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Fetching Data from Web Service";
    }
}
