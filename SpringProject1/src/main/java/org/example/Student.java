package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Student {

    public int id;
    public String name;
    //private List<Phone> ph;

    public Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void sayHello() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
    }
}

/*
all private

class student {
    int id;
    String name
    list<Phone> ph;
    Address add;
}

class Phone {
    String mob;
}

class Address {
    String citry;
    String state;
    String country:
    String zip;
}
 */
