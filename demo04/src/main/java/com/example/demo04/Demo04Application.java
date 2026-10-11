
package com.example.demo04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo04Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo04Application.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello! Your Spring Boot application is running.";
    }
}
