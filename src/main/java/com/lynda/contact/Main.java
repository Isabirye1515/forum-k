package com.lynda.contact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lynda.contact.placeholder.Contact;
import com.lynda.contact.service.ContactServiceImpl;
import com.lynda.owner.placehoder.Owner;
import com.lynda.owner.service.OwnerServiceImpl;

public class Main {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    ContactServiceImpl constactService = context.getBean("contactService",ContactServiceImpl.class);
    OwnerServiceImpl ownerService = context.getBean("ownerService",OwnerServiceImpl.class);
    Owner owner = ownerService.getOwnerById(1);
    Contact contact = new Contact();
    contact.setBio("Medical Doctor");
    contact.setEmail("isabiryeelijah1@gmail.com");
    contact.setImage("https://i.postimg.cc/J0HXLBd6/g.jpg");
    contact.setOwner(owner);
    contact.setPhone("0348656426");
    constactService.addContact(contact);

}
    
}
