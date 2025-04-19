package com.lynda.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lynda.contact.dao.ContactDao;
import com.lynda.contact.placeholder.Contact;
@Service(value = "contactService")
public class ContactServiceImpl implements ContactService {

    @Autowired
    @Qualifier("contactService")
    private ContactService contactService;

    @Autowired
    private ContactDao contactDao;

    @Override
    public List<Contact> getAllContacts() {
        return contactDao.getAllContacts();

    }

    @Override
    public void addContact(Contact contact) {
        contactDao.addContact(contact);

    }

    @Override
    public Contact getContactById(int id) {
        return contactDao.getContactById(id);

    }
    
}
