package com.example.demojava7ao21.java8.scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        scan.useDelimiter("\\n");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
