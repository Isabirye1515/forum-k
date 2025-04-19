package com.lynda.contact.dao;

import java.util.List;

import com.lynda.contact.placeholder.Contact;

public interface ContactDao {
    List<Contact> getAllContacts();
    void addContact(Contact contact);
    Contact getContactById(int id);
    
}
