package com.lynda.mesage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lynda.mesage.dao.MessageDao;
import com.lynda.mesage.placehoder.Message;

@Service(value = "messageService")
public class MessageServiceImpl implements MessageService {

    @Autowired
    @Qualifier("messageService")
    private MessageService messageService;

    @Autowired
    private MessageDao messageDao;

    @Override
    public List<Message> getAllMessages() {
        return messageDao.getAllMessages();

    }

    @Override
    public void addMessage(Message message) {
         messageDao.addMessage(message);

    }

    @Override
    public Message getMessageById(int id) {
        return messageDao.getMessageById(id);

    }

    
    
}
