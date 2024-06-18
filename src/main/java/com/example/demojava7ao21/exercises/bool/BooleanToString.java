package com.example.demojava7ao21.exercises.bool;

/**
 * Implement a function which convert the given boolean value into its string representation.
 */
public class BooleanToString {

    public static void main(String[] args) {
        System.out.println("true".equals(BooleanToString.convert(true)));
    }

    public static String convert(boolean b) {
        return String.valueOf(b);
    }

}
