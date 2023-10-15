package com.example.demojava7ao21.inversrionofcontrol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class IocConfig {

    @Bean
    public Address getAddress() {
        return new Address("High Street", 1000);
    }

}
