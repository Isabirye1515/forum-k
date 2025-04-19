package com.lynda.mesage.dao;

import java.util.List;

import com.lynda.mesage.placehoder.Message;


public interface MessageDao {
    List<Message> getAllMessages();
    void addMessage(Message message);
    Message getMessageById(int id);
    
}
