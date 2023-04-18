package com.example.securityDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home() {
        return "<HTML><H1>Welcome to Home Page</H1></HTML>";
    }

    @GetMapping("/user")
    public String user() {
        return "<HTML><H1>Welcome to User Page</H1></HTML>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<HTML><H1>Welcome to Admin Page</H1></HTML>";
    }
}
