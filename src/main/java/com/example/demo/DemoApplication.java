package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api")
@SpringBootApplication
public class DemoApplication {

    @GetMapping("/")
    String home() {
        return "Hello World!";
    }


@PostMapping("/test")
public String test() {
    return "Test Post";
}

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}