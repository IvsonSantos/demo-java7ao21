package com.example.demojava7ao21.exercises.loja;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.nio.file.Path;

@AllArgsConstructor
@Getter
@ToString
public class Product {

    private String name;
    private Path file;
    private BigDecimal price;

}
