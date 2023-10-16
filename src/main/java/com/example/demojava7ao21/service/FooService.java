package com.example.demojava7ao21.service;

import com.example.demojava7ao21.beans.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    @Autowired
    @Qualifier("fooFormatter")
    private Formatter formatter;

}
