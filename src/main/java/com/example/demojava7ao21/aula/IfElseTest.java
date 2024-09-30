package com.example.demojava7ao21.aula;

public class IfElseTest {

    public static void main(String[] args) {

        boolean verify = true;

        if (verify)
            System.out.println("ok 1");

        if (verify)
            System.out.println("ok 2");
         else
            System.out.println("no");


        if (verify) {
            System.out.println("ok 3");
            System.out.println("success");
        } else
            System.out.println("no");
    }
}
