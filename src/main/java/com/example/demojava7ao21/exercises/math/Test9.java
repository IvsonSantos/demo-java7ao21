package com.example.demojava7ao21.exercises.math;

public class Test9 {

    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("A great");
            case 'B':
                System.out.println("B great");
            case 'C':
                System.out.println("C good");
                break;
            case d:
                System.out.println("D great");
            case 'F':
                System.out.print("not good");
        }
    }

}
