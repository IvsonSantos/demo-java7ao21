package com.example.demojava7ao21.java8.functionalinterface;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Random random = new Random(314L);
        Supplier<Integer> newRandom = () -> random.nextInt(10);

        for (int index = 0; index < 5; index++) {
            // Calling the get() method of this supplier will invoke random.nextInt()
            System.out.println(newRandom.get());
        }

        Random randomINt = new Random(314L);
        IntSupplier newRandomInt = () -> random.nextInt();

        for (int i = 0; i < 5; i++) {
            int nextRandom = newRandomInt.getAsInt();
            System.out.println("next random = " + nextRandom);
        }

    }

}
