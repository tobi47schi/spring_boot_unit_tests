package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    AppService _service;

    @GetMapping
    ResponseEntity<String> hello() {
        return ResponseEntity.ok(_service.hi());
    }
}
