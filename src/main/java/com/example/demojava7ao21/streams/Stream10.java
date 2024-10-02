package com.example.demojava7ao21.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Stream10 {

    public static void main(String[] args) {

        Path log = Path.of("debug.log"); // adjust to fit your installation
        try (Stream<String> lines = Files.lines(log)) {

            long warnings =
                    lines.filter(line -> line.contains("WARNING"))
                            .count();
            System.out.println("Number of warnings = " + warnings);

        } catch (IOException e) {
            // do something with the exception
            System.out.println(e.getMessage());
        }

    }
}
