package org.example;

import org.springframework.beans.factory.annotation.Autowired;


public class Address {

    private String city;
    private String state;
    private String country;
    private String zip;

    public Address(String city, String state, String country, String zip) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
