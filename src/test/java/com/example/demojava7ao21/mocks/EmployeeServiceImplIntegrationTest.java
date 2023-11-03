package com.example.demojava7ao21.mocks;

import com.example.demojava7ao21.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplIntegrationTest {

    @Autowired
    private PersonService personService;

    @Test
    public void teste() {

    }
}
