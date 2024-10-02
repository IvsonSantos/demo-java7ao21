package com.example.demojava7ao21.streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream4 {

    public static void main(String[] args) {

        // This sum has in fact been computed in parallel
        // Going parallel consumes threads.
        int parallel = IntStream.range(0, 10)
                .parallel()
                .sum();

        System.out.println(parallel);


        Set<String> threads = IntStream.range(0, 100)
                .parallel()
                .mapToObj(index -> Thread.currentThread().getName())
                .collect(Collectors.toSet());

        System.out.println("Threqd names");
        threads.forEach(System.out::println);
    }
}
