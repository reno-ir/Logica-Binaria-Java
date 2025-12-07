package com.logica.binaria.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySubtractionTest {

    @Test
    public void subtract_basic() {
        // 101 (5) - 11 (3) = 10 (2)
        assertEquals("10", BinarySubtraction.subtract("101", "11"));
    }

    @Test
    public void subtract_negativeResult() {
        // 11 (3) - 101 (5) = -10 (-2)
        assertEquals("-10", BinarySubtraction.subtract("11", "101"));
    }

    @Test
    public void subtract_invalidInput_throws() {
        assertThrows(IllegalArgumentException.class, () -> BinarySubtraction.subtract("10a", "1"));
    }
}

