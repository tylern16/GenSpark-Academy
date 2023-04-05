package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class SpringConfig {

    @Bean
    public Student getStudent() {
        return new Student(42, "Timothy");
    }

    @Bean
    public Address getAddress() {
        return new Address("Austin", "TX", "USA", "12345");
    }

}
