package com.example.demojava7ao21.exercises.math;

import java.util.List;
import java.util.stream.IntStream;

public class Test12 {

    public static void main(String[] args) {
        int parallelSum =
                IntStream.range(0, 10)  // soma de 1 ate 9
                        .parallel()
                        .sum();
        System.out.println(parallelSum);

        List<Integer> list1 =
                IntStream.range(0, 10).boxed()
                        .toList();
        System.out.println(list1);

        List<Integer> list2 =
                IntStream.iterate(0, i -> i + 1)
                        .limit(10).boxed()
                        .toList();
        System.out.println(list2);

    }
}
