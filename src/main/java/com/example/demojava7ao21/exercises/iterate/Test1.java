package com.example.demojava7ao21.exercises.iterate;

public class Test1 {

    public static void main(String[] args) {

        int i = 1;
        /*
        do {
            System.out.println(i);
            i++;
        } while (i < 10) // não compila, faltou o ;

         */

        //compila normal
        do
            System.out.println(i++);
        while (i < 10);

        //erro, mais de uma linha dentro do do .. while
        /*
        do
            System.out.print("value: "); //erro
            System.out.println(i++);
        while(i<10);

         */
    }

}
