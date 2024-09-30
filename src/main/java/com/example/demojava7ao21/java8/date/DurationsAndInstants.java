package com.example.demojava7ao21.java8.date;

import java.time.Duration;
import java.time.Instant;

public class DurationsAndInstants {

    public static void main(String[] args) {
        Instant tempo = Instant.now();
        System.out.println(tempo);

        int nanoSeconds = tempo.getNano();
        System.out.println(nanoSeconds);

        Duration tresHoras = Duration.ofHours(3);

        long seconds = tresHoras.minusMinutes(15).getSeconds();
        long minutes = Duration.ofSeconds(seconds).toMinutes();

        System.out.println("3 Hours - 15 Minutes = " + seconds + " seconds"); // 3 Hours - 15 Minutes = 9900 seconds
        System.out.println("3 Hours - 15 Minutes = " + minutes + " Minutes"); // 3 Hours - 15 Minutes = 165 Minutes
    }

}

