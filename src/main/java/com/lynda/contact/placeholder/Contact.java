package com.lynda.contact.placeholder;

import java.sql.Timestamp;

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
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "image")
    private byte[] image;
    @Column(name = "name")
    private String name;
    @Column(name = "bio")
    private String bio;
    @Column(name = "phone")
    private String phone;
    @Column(name = "last_updated")
    private Timestamp lastUpdated;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Contact(int id, String email, byte[] image, String name, String bio, String phone) {
        this.id = id;
        this.email = email;
        this.image = image;
        this.name = name;
        this.bio = bio;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    @Override
    public String toString() {
        return "contact{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", image=" + image +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    public Contact() {
    }
    
}
