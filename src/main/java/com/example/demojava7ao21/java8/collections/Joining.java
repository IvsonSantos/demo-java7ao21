package com.example.demojava7ao21.java8.collections;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    public static void main(String[] args) {

        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

        String result = givenList.stream()
                .collect(Collectors.joining(" "));
        System.out.println(result);

        String result2 = givenList.stream()
                .collect(Collectors.joining(" ", "PRE-", "-POST"));
        System.out.println(result2);

        DoubleSummaryStatistics result3 = givenList.stream()
                .collect(Collectors.summarizingDouble(String::length));
    }
}
