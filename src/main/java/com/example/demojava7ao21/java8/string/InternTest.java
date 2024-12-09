package com.example.demojava7ao21.java8.string;

public class InternTest {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("foo");
        String s4 = s1.intern();
        String s5 = s2.intern();

        System.out.println(s3 == s4);
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
    }
}
