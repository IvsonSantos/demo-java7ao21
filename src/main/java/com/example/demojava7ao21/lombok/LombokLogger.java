package com.example.demojava7ao21.lombok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokLogger {

    public static void main(String[] args) {
        log.info("logger coming from LOMBOK");
        log.error("error coming from Lombok");
    }

}
