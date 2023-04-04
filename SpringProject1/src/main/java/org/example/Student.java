package org.example;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;
import java.util.List;

public class Student {

    public int id;
    public String name;
    private List<Phone> ph;
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

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
        System.out.println("Numbers: ");
        Iterator<Phone> itr = ph.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
