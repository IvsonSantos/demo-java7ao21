package com.example.demojava7ao21.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class RandomController {

    @Value("${random.int}")
    private int numero;

    @GetMapping
    public int getNumero() {
        return this.numero;
    }
}
