package com.example.demojava7ao21.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.InputStream;

public class LombokCleanup {

    @SneakyThrows
    public static void main(String[] args) {
        // CLEANUP faz o try-with-resources do java
        @Cleanup InputStream input = new FileInputStream("res.txt");
    }

}
