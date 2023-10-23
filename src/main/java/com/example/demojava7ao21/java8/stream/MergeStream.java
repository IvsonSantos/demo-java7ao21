package com.example.demojava7ao21.java8.stream;

import java.util.stream.Stream;

public class MergeStream {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 3, 5);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);

        Stream<Integer> resultingStream = Stream.concat(stream1, stream2);


        Stream<String> stream3 = Stream.of("foo", "bar");
        Stream<String> openingBracketStream = Stream.of("[");
        Stream<String> closingBracketStream = Stream.of("]");
    }

}
