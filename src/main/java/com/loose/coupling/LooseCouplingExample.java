package com.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args) {
        /*
         creating an object of an interface. instantiating an object and assigning the object
         of a class over here
        */
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider WebServiceDataProvider = new WebServiceDataProvider();
        UserManager userManagerWithWebService = new UserManager(WebServiceDataProvider);
        System.out.println(userManagerWithWebService.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDataBaseProvider();
        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());

        UserDatabaseProvider newDatabaseProvider2 = new UserDatabaseProvider();
        UserManager userManagerWithNewDB2 = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB2.getUserInfo());
    }
}
