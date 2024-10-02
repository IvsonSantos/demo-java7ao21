package com.example.demojava7ao21.streams;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Stream3 {

    public static void main(String[] args) {

        Collection<String> strings =
                List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        boolean noBlank  =
                strings.stream()
                        .allMatch(Predicate.not(String::isBlank));
        boolean oneGT3   =
                strings.stream()
                        .anyMatch(s -> s.length() == 7);
        boolean allLT10  =
                strings.stream()
                        .noneMatch(s -> s.length() > 10);

        System.out.println("noBlank = " + noBlank);
        System.out.println("oneGT3  = " + oneGT3);
        System.out.println("allLT10 = " + allLT10);

    }
}
