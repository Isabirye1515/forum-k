package com.lynda.mesage.placehoder;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lynda.owner.placehoder.Owner;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "message")
    private String message;
    @Column(name = "message_type")
    private String messageType;
    @Column(name = "message_code")
    private String messageCode;
    @Column(name = "message_text", length = 1000)
    private String messageText;
    @Column(name = "last_updated")
    private Timestamp lastUpdated;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Message(){}

    public Message(int id, String message, String messageType, String messageCode, String messageText) {
        this.id = id;
        this.message = message;
        this.messageType = messageType;
        this.messageCode = messageCode;
        this.messageText = messageText;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessageType() {
        return messageType;
    }
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    public String getMessageCode() {
        return messageCode;
    }
    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }
    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    @Override
    public String toString() {
        return "message [id=" + id + ", message=" + message + ", messageType=" + messageType + ", messageCode="
                + messageCode + ", messageText=" + messageText + "]";
    }
    
}
