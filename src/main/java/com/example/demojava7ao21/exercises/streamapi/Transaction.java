package com.example.demojava7ao21.exercises.streamapi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Transaction {

    private String id;
    private String type;
    private Double amount;
    private String status;
}
