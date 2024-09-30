package com.example.demojava7ao21.aula;

public class SwitchExample {

    public static void main(String[] args) {

        int num = 10 / 2;

        switch (num) {
            case 1:
                System.out.println("number 1");
            default:
                System.out.println("default value");
        }

        switch (num) {
            case 1:
                System.out.println("number 1");
            case 3:
                System.out.println("number 3");
            case 5:
                System.out.println("number 5");
                break;
            case 2:
                System.out.println("number 2");
            default:
                System.out.println("default value");
        }
    }

}
