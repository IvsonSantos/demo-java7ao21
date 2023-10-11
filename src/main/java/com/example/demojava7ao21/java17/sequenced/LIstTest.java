package com.example.demojava7ao21.java17.sequenced;

import java.util.ArrayList;

public class LIstTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // [1]
        arrayList.addFirst(0); // [0, 1]
        arrayList.addLast(2); // [0, 1, 2]
        arrayList.getFirst(); // 0
        arrayList.getLast(); // 2
        arrayList.reversed(); // [2, 1, 0]
    }
}
