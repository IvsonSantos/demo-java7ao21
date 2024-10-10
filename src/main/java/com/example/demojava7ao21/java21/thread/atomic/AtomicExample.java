package com.example.demojava7ao21.java21.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Atomic operations are those that are completed in a single step relative to other threads.
 * They ensure that a variable’s read-modify-write sequence is executed as a single, uninterrupted operation, which prevents race conditions.
 */
public class AtomicExample {

    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }

}
