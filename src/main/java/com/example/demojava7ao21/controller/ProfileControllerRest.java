package com.example.demojava7ao21.controller;

import com.example.demojava7ao21.component.ProfileConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileControllerRest {

    @Autowired
    private ProfileConfig profileConfig;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @GetMapping
    public String getNumero() {
        return profileConfig.getProfile();
    }

    @GetMapping("/name")
    public String getProfile() {
        return activeProfile;
    }

}
