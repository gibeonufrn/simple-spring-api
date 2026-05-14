package com.example.api.controller;

import com.example.api.dto.MessageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public MessageResponse hello() {
        return new MessageResponse("Olá! API Spring Boot funcionando.");
    }

    @GetMapping("/health")
    public MessageResponse health() {
        return new MessageResponse("OK");
    }
}
