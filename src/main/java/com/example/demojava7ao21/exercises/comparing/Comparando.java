package com.example.demojava7ao21.exercises.comparing;

public class Comparando {

    public static void main(String[] args) {
        float f = 3;
        float b = 4;

        System.out.println(f == b);
        System.out.println(Float.compare(f, b));

        double d1 = 3.0;
        double d2 = 3.0;

        System.out.println(d1 == d2);
        System.out.println(Double.compare(d1, d2));

        //Float.eq
    }

}
