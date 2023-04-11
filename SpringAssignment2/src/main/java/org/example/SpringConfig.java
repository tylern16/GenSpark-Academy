package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

@Configuration
public class SpringConfig {

    @Bean
    public Student getStudent() {
        return new Student(42, "Timothy");
    }

    @Bean
    public Address getAddress() {
        return new Address("Austin", "TX", "USA", "12345");
    }

    @Bean
    public Phone getPhone1() {
        return new Phone("(835)456-5467");
    }

    @Bean
    public Phone getPhone2() {
        return new Phone("(735)456-5467");
    }

    @Bean
    public Phone getPhone3() {
        return new Phone("(935)456-5467");
    }

}
