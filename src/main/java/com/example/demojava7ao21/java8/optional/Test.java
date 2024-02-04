package com.example.demojava7ao21.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(),
                Optional.of("um"),
                Optional.empty(),
                Optional.of("dois"));

        List<String> filteredList = listOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
