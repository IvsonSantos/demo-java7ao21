package com.example.demojava7ao21.java8.test;

/**
 * Can private method or static methods be overridden in Java?
 * NO
 */
public class Bird extends Animal {

    @Override
    public void eat() {
        super.eat();
    }

}
