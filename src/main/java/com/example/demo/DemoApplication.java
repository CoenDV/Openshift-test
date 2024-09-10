package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @GetMapping("/")
    String home() {
        return "Home";
    }

    @GetMapping("/hello")
    String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello")
    String helloPost() {
        return "You just called the POST method at '/hello' endpoint";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}