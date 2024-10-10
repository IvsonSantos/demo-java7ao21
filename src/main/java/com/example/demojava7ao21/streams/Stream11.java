package com.example.demojava7ao21.streams;

import java.util.List;

public class Stream11 {

    public static void main(String[] args) {
        List<String> strings = List.of("one", "two", "three", "four");

        long count = strings.stream()
                        .map(String::length)
                        .filter(length -> length == 3)
                        .count();

        System.out.println(count);
    }
}
