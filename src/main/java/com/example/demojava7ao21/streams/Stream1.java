package com.example.demojava7ao21.streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {

        Collection<String> strings =
                List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        long count = strings.stream()
                            .filter(s -> s.length() == 3)
                            .count();

        System.out.println("count = " + count);


        List<String> items = List.of("cafe", "carro", "casa");
        long num = items.stream()
                .filter(s -> s.length() == 4)
                .count();
        System.out.println(num);



    }
}
