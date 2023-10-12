package com.artyomka.springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestSpringBootApplication {
    public static void main(String[] args) {
        // Application Launch
        SpringApplication.run(TestSpringBootApplication.class, args);
    }
}
