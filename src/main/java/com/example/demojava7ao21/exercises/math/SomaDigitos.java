package com.example.demojava7ao21.exercises.math;

/**
 * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until
 * a single-digit number is produced. The input will be a non-negative integer.
 */
public class SomaDigitos {

    public static void main(String[] args) {

        int a = SomaDigitos.digital_root(4);
        System.out.println(a);

        int n = SomaDigitos.digital_root(16);
        System.out.println(n);

        int i = SomaDigitos.digital_root(456);
        System.out.println(i);
    }

    public static int digital_root(int num) {

        if (String.valueOf(num).length() > 1) {

            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }

            return digital_root(sum);

        } else {
            return num;
        }
    }
}
