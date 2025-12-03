package com.logica.binaria.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecimalToBinaryTest {

    @Test
    public void testPositive() {
        assertEquals("1010", DecimalToBinary.decimalToBinary(10));
    }

    @Test
    public void testZero() {
        assertEquals("0", DecimalToBinary.decimalToBinary(0));
    }

    @Test
    public void testNegative() {
        assertEquals("-101", DecimalToBinary.decimalToBinary(-5));
    }

}
