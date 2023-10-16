package com.example.demojava7ao21.configuration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "cars")
@RestController
public class TestController {

    @Autowired
    private Car car;

    @GetMapping
    public String get() {

        /*
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean(Car.class);

        return car.toString();
         */
        return car.getTransmission().getName();
    }
}
