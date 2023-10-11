package com.example.demojava7ao21.exercises.iterate;

public class Test4 {

    public static void main(String[] args) {

        //while (false) {
        // erro pois nunca vai entrar aqui
        //}

        int a = 4;
        int b = 2;
        while(a > b){ // ok
            System.out.println("OI"); // mesmo acima, mas o compilador aceita quando é variavel
            a = 1;
        }

    }

}
