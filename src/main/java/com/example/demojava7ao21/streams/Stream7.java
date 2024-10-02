package com.example.demojava7ao21.streams;

import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Stream7 {

    public static void main(String[] args) {

        Supplier<StringBuffer> supplier                 = StringBuffer::new;
        ObjIntConsumer<StringBuffer> accumulator        = StringBuffer::append;
        BiConsumer<StringBuffer, StringBuffer> combiner = StringBuffer::append;

        StringBuffer collect =
                IntStream.range(0, 10)
                        .collect(supplier, accumulator, combiner);

        System.out.println("collect = " + collect);
    }
}
