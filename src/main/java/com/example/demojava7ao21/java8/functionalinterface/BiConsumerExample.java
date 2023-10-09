package com.example.demojava7ao21.java8.functionalinterface;

import java.util.Random;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<Random, Integer> randomNumberPrinter =
            (random, number) -> {
                for (int i = 0; i < number; i++) {
                    System.out.println("next random = " + random.nextInt());
                }
            };

        randomNumberPrinter.accept(new Random(314L), 5);

    }
}
