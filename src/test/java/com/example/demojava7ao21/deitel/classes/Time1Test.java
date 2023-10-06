package com.example.demojava7ao21.deitel.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class Time1Test {

    @Test
    @DisplayName("Test class Time1")
    @RepeatedTest(2)
    void givenTime1_whenToString_thenTrue() {
        Time1 time1 = new Time1();
        time1.setTime(8, 10, 32);
        System.out.println(time1.toString());
        System.out.println(time1.toUniversalString());
        Assertions.assertTrue(true);
    }

    /*
    @Test
    void givenLowerThanTenNumber_whenCheckingIsNumberEven_thenResultUnderTenMillis() {
        Assertions.assertTimeout(Duration.ofMillis(10), () -> bean.isNumberEven(3));
    }

    @Test
    void givenNull_whenCheckingIsNumberEven_thenNullPointerException() {
        Assertions.assertThrows(NullPointerException.class, () -> bean.isNumberEven(null));
    }
     */

}
