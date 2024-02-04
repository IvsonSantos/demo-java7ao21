package com.example.demojava7ao21.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class ProfileConfig {

    @Bean
    public String getProfile() {
        return "perfil de DEV";
    }

}
