package com.example.demojava7ao21.math;

public class Test5 {

    public static void main(String[] args) {
        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if (b == true) System.out.println("Success");
        else System.out.println("Failure");

        if (b = true) System.out.println("Success");
        else System.out.println("Failure");
    }

}
