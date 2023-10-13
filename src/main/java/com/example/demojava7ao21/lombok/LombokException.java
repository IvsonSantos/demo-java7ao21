package com.example.demojava7ao21.lombok;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class LombokException {

    private static final Logger LOG = LoggerFactory.getLogger(LombokException.class);

    public static void main(String[] args) {
        LombokException lombokException = new LombokException();
        lombokException.resourceAsString2();
    }

    public String resourceAsString() {
        try (InputStream is = this.getClass().getResourceAsStream("sure_in_my_jar.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            return br.lines().collect(Collectors.joining("\n"));
        } catch (Exception ex) {
            LOG.error("erro ocorreu");
            // If this ever happens, then its a bug.
            throw new RuntimeException(ex);
        }
    }

    @SneakyThrows
    public String resourceAsString2() {
        try (InputStream is = this.getClass().getResourceAsStream("sure_in_my_jar.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            return br.lines().collect(Collectors.joining("\n"));
        }
    }
}
