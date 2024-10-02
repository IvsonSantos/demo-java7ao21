package com.example.demojava7ao21.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream9 {

    public static void main(String[] args) {

        Collection<String> strings =
                List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "twelve");

        Map<Integer, Long> map =
                strings.stream()
                        .collect(
                                Collectors.groupingBy(
                                        String::length,
                                        Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key + " :: " + value));

    }
}
