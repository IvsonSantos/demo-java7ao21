package com.example.demojava7ao21.java8.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Copying {

    public static void main(String[] args) {

        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
        Collections.copy(dest, source);

        List<Integer> copy = dest.stream()
                .toList();
        System.out.println(copy);

        List<Integer> copy2 = dest.stream()
                .skip(1)
                .toList();
        System.out.println(copy2);

        List<Integer> copyJava10 = List.copyOf(dest);


    }
}
