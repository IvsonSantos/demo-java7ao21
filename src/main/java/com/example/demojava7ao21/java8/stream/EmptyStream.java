package com.example.demojava7ao21.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class EmptyStream {

    public static void main(String[] args) {
        Stream<String> vazio = Stream.empty();

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        System.out.println(streamOfCollection);
    }
}
