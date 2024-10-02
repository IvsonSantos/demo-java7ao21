package com.example.demojava7ao21.streams;

import com.example.demojava7ao21.exercises.loja.Customer;

import java.util.List;

public class Stream5 {

    public static void main(String[] args) {
        List<Customer> customers = List.of(
            new Customer("ivson"),
            new Customer("test")
        );

        String customerById = customers.stream()
                .filter(c -> c.getName().equals("test"))
                .findFirst()
                .map(Customer::getName)
                .orElse("not found!");
    }
}
