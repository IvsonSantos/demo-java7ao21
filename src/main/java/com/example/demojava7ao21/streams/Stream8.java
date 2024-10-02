package com.example.demojava7ao21.streams;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream8 {

    public static void main(String[] args) {

        Collection<String> strings =
                List.of("two", "three", "four", "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "one");

        Map<Integer, Long> histogram =
                strings.stream()
                        .collect(
                                Collectors.groupingBy(
                                        String::length,
                                        Collectors.counting()));

        Map.Entry<Integer, Long> maxValue =
                histogram.entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .orElseThrow();

        System.out.println("maxValue = " + maxValue);

    }
}
