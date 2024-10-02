package com.example.demojava7ao21.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {

    public static void main(String[] args) {
        // consuming
        Stream<String> strings2 = Stream.of("one", "two", "three", "four");
        strings2.filter(s -> s.length() == 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Stream<String> strings = Stream.of("one", "two", "three", "four");
        List<String> result = new ArrayList<>();

        strings.filter(s -> s.length() == 3)
                .map(String::toUpperCase)
                .forEach(result::add);

        System.out.println("result = " + result);


    }
}
