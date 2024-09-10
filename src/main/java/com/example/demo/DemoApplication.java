package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api")
@SpringBootApplication
public class DemoApplication {

    @GetMapping
    @CrossOrigin(origins = {"http://localhost:8081", "https://openshift-web-app-git-coen-de-vries-dev.apps.sandbox-m4.g2pi.p1.openshiftapps.com"}, allowedHeaders = "*")
    public String home() {
        System.out.println("hello");
        return "Hello";
    }

    @PostMapping
    @CrossOrigin(origins = {"http://localhost:8081", "https://openshift-web-app-git-coen-de-vries-dev.apps.sandbox-m4.g2pi.p1.openshiftapps.com"}, allowedHeaders = "*")
    public String test() {
        System.out.println("post");
        return "Test Post";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}