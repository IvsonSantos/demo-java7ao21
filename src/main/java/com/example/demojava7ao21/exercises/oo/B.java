package com.example.demojava7ao21.exercises.oo;

public class B extends A {

    void m1() throws IndexOutOfBoundsException {
        System.out.println("M1 from B");
    }

    public static void main(String[] args) {
        A a = new B();
        //a.m1();
    }

}
