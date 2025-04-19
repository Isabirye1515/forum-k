package com.lynda.owner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lynda.owner.placehoder.Owner;
import com.lynda.owner.service.OwnerServiceImpl;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OwnerServiceImpl ownerService = context.getBean("ownerService", OwnerServiceImpl.class);

        try {
            Owner owner = new Owner();
            owner.setName("John Doe");
            owner.setImage("https://i.postimg.cc/J0HXLBd6/g.jpg");
            owner.setBio("All seventhday");
            owner.setEmail("eden@gmail.com");
            owner.setPhone("1234567890");

            ownerService.addOwner(owner);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
