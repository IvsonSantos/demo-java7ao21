package com.example.demojava7ao21.java21.instanceOf;

import java.math.BigDecimal;

public class TestInstance {

    // BEFORE JAVA 21
    static String asStringValue(Object anyValue) {
        String result = null;

        if (anyValue instanceof String str) {
            result = str;
        } else if (anyValue instanceof BigDecimal bd) {
            result = bd.toEngineeringString();
        } else if (anyValue instanceof Integer i) {
            result = Integer.toString(i);
        } else {
            result = "n/a";
        }

        return result;
    }

    // JAVA 21+
    /*
    static String asStringValue21(Object anyValue) {
        return switch (anyValue) {
            case String str    -> str;
            case BigDecimal bd -> bd.toEngineeringString();
            case Integer i     -> Integer.toString(i);
            default            -> "n/a";
        };
    }

     */

}
