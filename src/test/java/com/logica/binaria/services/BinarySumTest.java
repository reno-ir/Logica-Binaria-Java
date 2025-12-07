package com.logica.binaria.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySumTest {

    @Test
    public void add_basic() {
        // 101 (5) + 11 (3) = 1000 (8)
        assertEquals("1000", BinarySum.add("101", "11"));
    }

    @Test
    public void add_withCarry() {
        // 111 (7) + 1 (1) = 1000 (8)
        assertEquals("1000", BinarySum.add("111", "1"));
    }

    @Test
    public void add_invalidInput_throws() {
        // entrada no binaria debe lanzar IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> BinarySum.add("10a", "1"));
    }
}

