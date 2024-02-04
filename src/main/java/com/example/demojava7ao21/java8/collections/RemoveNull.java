package com.example.demojava7ao21.java8.collections;

import java.util.*;

public class RemoveNull {

    public static void main(String[] args) {

        final List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));

        List<Integer> list2 = Arrays.asList(null, 1, 2, null, 3, null);
    }
}
