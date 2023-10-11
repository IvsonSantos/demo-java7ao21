package com.example.demojava7ao21.java17.string;

public class RecordTest {

    // This concise syntax results in a class with a constructor, associated storage in the course,
    // getters (e.g.: event.name()), a valid equals, and a good toString() implementation.
    record RecordEvent(String name) { }

    public static void main(String[] args) {
        var event = new RecordEvent("Java21");

        System.out.println(event.name());
        System.out.println(event);
    }
}
