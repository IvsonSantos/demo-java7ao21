package com.example.demojava7ao21.java21;

import java.util.LinkedHashMap;

public class SequencedMapTest {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"one"); // [(1,"one")]
        //linkedHashMap.putFirst(0,"zero"); // [(0,"zero"), (1,"one")]
        //linkedHashMap.putLast(2,"two"); // [(0,"zero"), (1,"one"), (2,"two")]
        //System.out.println(linkedHashMap.reversed()); // [(2,"two"), (1,"one"), (0,"zero")]
    }
}
