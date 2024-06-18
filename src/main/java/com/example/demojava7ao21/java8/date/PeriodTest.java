package com.example.demojava7ao21.java8.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    public static void main(String[] args) {
        Period period = Period.of(1, 2,10);

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println(localDate.plus(period));
    }
}
