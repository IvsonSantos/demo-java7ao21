package com.example.demojava7ao21.inversrionofcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IocTestController {

    @Autowired
    private Company company;

    @GetMapping(value = "/name")
    public String getNome() {
        return company.getAddress().getStreet();
    }
}
