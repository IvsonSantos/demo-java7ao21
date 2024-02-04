package com.example.demojava7ao21.java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {

    List<String> list = new ArrayList<>();

    public void add(String s) {
        list.add(s);
    }

    /**
     * Makes a defensive copy of the List and return it
     * This way cannot modify the list itself
     *
     * @return List<String>
     */
    public List<String> getList() {
        return Collections.unmodifiableList(list);
    }

    public static void main(String[] args) {

        UnmodifiableList u = new UnmodifiableList();
        u.add("um");
        u.add("dois");
        u.list.forEach(System.out::println);
        u.add("tres");

        List<String> lista2 = u.getList();
        lista2.add("quatro"); // vai dar erro pois e uma lista nao modificavel
        lista2.forEach(System.out::println);
    }
}
