package com.example.demojava7ao21.exercises.iterate;

public class Test3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; ) {
            i = i++; // it will be loop infinite
            System.out.println("Hello World" + i);
        }
    }

}
