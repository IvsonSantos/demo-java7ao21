package com.example.demojava7ao21.junit5;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

@Slf4j
class TestAnnottations {

    @BeforeAll
    static void setup() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        log.info("@BeforeEach - executes before each test method in this class");
    }

    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        log.info("Success");
    }

    @Test
    @Disabled("Not implemented yet")
    void testShowSomething() {
    }

}
