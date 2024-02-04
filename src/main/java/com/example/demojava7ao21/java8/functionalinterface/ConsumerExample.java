package com.example.demojava7ao21.java8.functionalinterface;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> printer = s -> System.out.println(s);

        Random random = new Random(314L);
        IntSupplier newRandom = () -> random.nextInt();

        for (int i = 0; i < 5; i++) {
            int nextRandom = newRandom.getAsInt();
            printer.accept("next random = " + nextRandom);
        }

    }
}
