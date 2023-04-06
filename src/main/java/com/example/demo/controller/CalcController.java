package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/plus/{a}/{b}")
    public Integer sum(@PathVariable Integer a, @PathVariable Integer b) {
        return a + b;
    }

    @GetMapping("/minus/{a}/{b}")
    public Integer raz(@PathVariable Integer a, @PathVariable Integer b) {
        return a - b;
    }
}
