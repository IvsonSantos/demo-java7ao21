package com.example.demojava7ao21.exercises.recursao;

public class SomaRecursao {

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            // Since the function does not call itself when k is 0,
            // the program stops there and returns the result.
            return 0;
        }
    }

}
