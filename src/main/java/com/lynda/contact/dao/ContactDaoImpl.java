package com.lynda.contact.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lynda.contact.placeholder.Contact;
@Repository
@Transactional
public class ContactDaoImpl implements ContactDao {

    @PersistenceContext
    private EntityManager entityManager;

    

    @Override
    @Transactional
    public void addContact(Contact contact) {
        entityManager.persist(contact);
        entityManager.flush();
    }

    @Override
    @Transactional
    public Contact getContactById(int id) {
        String sql = "select  n from Contact n where n.id=:id";
        Contact contact = entityManager.createQuery(sql,Contact.class)
        .setParameter("id", id)
        .getSingleResult();
        return contact;
    
    }

    @Override
    @Transactional
    public List<Contact> getAllContacts() {
        String sql = "select n from Contact n ";
        List<Contact> contacts = entityManager.createQuery(sql,Contact.class)
        .getResultList();
        return contacts;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    
}
