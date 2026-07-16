package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAdd() {
        assertEquals(10, App.add(4, 6));
    }
}
