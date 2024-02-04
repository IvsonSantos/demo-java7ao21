package com.example.demojava7ao21.exercises.fibonacci;

public class Fibo1 {

    public static void main(String args[]) {
        Fibonacci(15);
    }

    static void Fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < n) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

}
