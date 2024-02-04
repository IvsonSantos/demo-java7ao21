package com.example.demojava7ao21.deitel.strings;

public class SumRange {

    static int sumRange(int[] ints) {
        int sum = 0;
        for (int i = 1; i < ints.length; i++) {
            int n = ints[i];
            if (n >= 10 && n <= 100) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = { 1, 20, 3, 10, -2, 100 };
        int result = SumRange.sumRange(ints);
        System.out.println("result: " + result);
        System.out.println("expected result: 130");
    }

}
