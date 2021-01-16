package com.sda.gf23spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello world";
    }
}
