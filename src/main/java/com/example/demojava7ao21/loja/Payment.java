package com.example.demojava7ao21.loja;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Payment {

    private List<Product> products;
    private LocalDateTime date;
    private Customer customer;

}
