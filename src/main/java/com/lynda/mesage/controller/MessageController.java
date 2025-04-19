package com.lynda.mesage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lynda.mesage.placehoder.Message;
import com.lynda.mesage.service.MessageService;

@RestController
@RequestMapping(value = "/rest")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/messages")
    public ResponseEntity<List<Message>> getAllMessage(){
        List<Message> messages = messageService.getAllMessages();
        return ResponseEntity.ok(messages);
    }

    @GetMapping(value = "/message/{id}")
    public ResponseEntity<Message> getMessage(@PathVariable int id){
        Message message = messageService.getMessageById(id);
        return ResponseEntity.ok(message);
    }

    @PostMapping(value = "/message")
    public ResponseEntity<?> addMessage(@RequestBody Message message){
        messageService.addMessage(message);
        return ResponseEntity.ok("Message Added successfully");
    }
    
}
