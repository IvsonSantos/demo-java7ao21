package com.example.demojava7ao21.java8.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    private static final List listOne = Arrays.asList("Jack", "Tom", "Sam", "John", "James", "Jack");
    private static final List listTwo = Arrays.asList("Jack", "Daniel", "Sam", "Alan", "James", "George");

    public static void main(String[] args) {

        List<String> differences = new ArrayList<>(listOne);
        differences.removeAll(listTwo);

        System.out.println(2 == differences.size());
        System.out.println(differences);

        List<String> differences2= new ArrayList<>(listOne);
        listTwo.forEach(differences2::remove);
        System.out.println(listTwo);

    }

}
