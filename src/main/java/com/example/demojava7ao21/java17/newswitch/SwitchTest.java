package com.example.demojava7ao21.java17.newswitch;

import java.time.DayOfWeek;

public class SwitchTest {

    // old switch
    static int calculateTimeOffClassic(DayOfWeek dayOfWeek) {
        var timeoff = 0;
        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                timeoff = 16;
                break;
            case SATURDAY, SUNDAY:
                timeoff = 24;
                break;
        }
        return timeoff;
    }

    // new switch
    static int calculateTimeOff(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> 16;
            case SATURDAY, SUNDAY -> 24;
        };
    }

    public static void main(String[] args) {
        System.out.println(calculateTimeOffClassic(DayOfWeek.SATURDAY));
        System.out.println(calculateTimeOff (DayOfWeek.SATURDAY));
    }
}
