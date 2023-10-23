package com.example.demojava7ao21.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> listWithDuplicates = Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0);
        List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
            .distinct()
            .toList();


    }
}
