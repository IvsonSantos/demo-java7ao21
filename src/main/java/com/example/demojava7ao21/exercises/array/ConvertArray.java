package com.example.demojava7ao21.exercises.array;

import java.util.ArrayList;
import java.util.List;

public class ConvertArray {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("certification");
        names.add("java");
        names.add("java");
        names.add("java");

        // tem que ser object
        Object lista[] = names.toArray();


        //String lista2[] = names.toArray();
        // para ser de String
        String lista2[] = names.toArray(new String[names.size()]);
    }

}
