package com.example.demojava7ao21.deitel.finance;

import java.util.Date;

public class EmployeeTest {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
    }

}
