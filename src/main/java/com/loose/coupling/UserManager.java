package com.loose.coupling;

public class UserManager {

    // constructor
    // reference variable of an interface over here (object)
    private UserDataProvider userDataProvider;

    // when instantiating user manager, we are going to provide the implementation as the parameter
    // to this constructor
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }

}
