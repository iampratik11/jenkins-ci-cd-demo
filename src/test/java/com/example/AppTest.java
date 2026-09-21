package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {

        App app = new App();

        assertEquals(5, app.add(2, 3));
    }
}
