package com.jmp.jmpadvspring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.ok("Hello world");
    }
}
