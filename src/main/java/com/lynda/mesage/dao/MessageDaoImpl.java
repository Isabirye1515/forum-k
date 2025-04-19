package com.lynda.mesage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lynda.mesage.placehoder.Message;


@Repository
@Transactional
public class MessageDaoImpl implements MessageDao {

    @PersistenceContext
    private EntityManager entityManager;

    

    @Override
    @Transactional
    public void addMessage(Message message) {
        entityManager.persist(message);
        entityManager.flush();
    }

    @Override
    @Transactional
    public Message getMessageById(int id) {
        String sql = "select  n from Contact n where n.id=:id";
        Message message = entityManager.createQuery(sql,Message.class)
        .setParameter("id", id)
        .getSingleResult();
        return message;
    
    }

    @Override
    @Transactional
    public List<Message> getAllMessages() {
        String sql = "select n from Contact n ";
        List<Message> messages = entityManager.createQuery(sql,Message.class)
        .getResultList();
        return messages;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    
}
