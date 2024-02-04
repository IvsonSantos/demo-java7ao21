package com.example.demojava7ao21.junit5;

import com.example.demojava7ao21.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

class TestDatabase {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    @Sql(scripts = {"/import_senior_employees.sql"},
            config = @SqlConfig(encoding = "utf-8", transactionMode = SqlConfig.TransactionMode.ISOLATED))
    public void testLoadDataForTestCase() {
        //Assertions.assertEquals(5, employeeRepository.findAll().size());
    }
}
