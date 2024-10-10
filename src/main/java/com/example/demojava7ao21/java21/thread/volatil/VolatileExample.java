package com.example.demojava7ao21.java21.thread.volatil;

/**
 * The `volatile` keyword
 * indicates that a variable’s value will be modified by different threads.
 */
public class VolatileExample {

    private volatile boolean running = true;

    public void stop() {
        running = false; // Ensures visibility to other threads
    }

    public void run() {
        while (running) {
            // Perform some work
        }
    }

}
