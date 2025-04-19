package com.lynda.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.contact.placeholder.Contact;
import com.lynda.contact.service.ContactService;

@RestController
@RequestMapping(value = "/rest")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping(value = "/contacts")
    public ResponseEntity<List<Contact>> getAllContact(){
        List<Contact> contacts = contactService.getAllContacts();
        return ResponseEntity.ok(contacts);
    }

    @GetMapping(value = "/contact/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable int id){
        Contact contact = contactService.getContactById(id);
        return ResponseEntity.ok(contact);
    }

    @PostMapping(value = "/contact")
    public ResponseEntity<?> addContact(@RequestBody Contact contact){
        contactService.addContact(contact);
        return ResponseEntity.ok("Contact added successfully");
    }
    
}
