package com.example.User.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

public class user {
    private  int userId;
    private String Name ;
    private String phoneNo ;
    @Embedded
    private Address address;
    public user() {
        super();
    }
    public int getId ()
    {
        return userId ;
    }
    public void setId(int userId)
    {
        this.userId = userId ;
    }
    public String getName()
    {
        return Name ;
    }
    public void setName(String Name)
    {
        this.Name = Name ;
    }
    public String getPhoneNo ()
    {
        return phoneNo ;
    }
    public void setPhone(String phoneNo)
    {
        this.phoneNo = phoneNo ;
    }
    public Address getaddress()
    {
        return address;
    }
    public void setAdress(Address address)
    {
        this.address = address;
    }
    public user(int userId ,String Name , String phoneNo , Address address)
    {    this.userId = userId ;
        this.Name = Name ;
        this.phoneNo = phoneNo;
        this.address= address;
    }
    @Embeddable
    public static class Address {
        private String street;
        private String city;
        private String state;


        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

    }
    }
