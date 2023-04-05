package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;
import java.util.List;

public class Student {

    public int id;
    public String name;
    //private List<Phone> ph;
    @Autowired
    public Address address;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
    }
}
