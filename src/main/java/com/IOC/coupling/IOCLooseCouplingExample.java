package com.IOC.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCLooseCouplingExample {

    public static void main(String[] args) {
        /*
         creating an object of an interface. instantiating an object and assigning the object
         of a class over here
        */

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationBeanIOCLooseCoupling.xml");


        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithWebService = (UserManager) context.getBean("userManagerWithNewDataProvider");
        System.out.println(userManagerWithWebService.getUserInfo());


        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());

    }
}
