package com.example.demojava7ao21.deitel.problemas;

public class Mystery2 {

    public static void main(String[] args) {

        int count = 1;

        while (count <= 10) {

            System.out.println(count % 2 == 1 ? "****" : "+++++++");
            ++ count;
        }
    }
}
