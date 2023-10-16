package com.example.demojava7ao21.configuration.beans;

import org.springframework.stereotype.Component;

//@Primary
@Component("barFormatter")
public class BarFormatter implements Formatter {
    public String format() {
        return "bar";
    }
}
