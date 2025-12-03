package com.logica.binaria.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryToDecimalTest {

    @Test
    public void convertsBinaryToDecimal_basic() {
        assertEquals(10, BinaryToDecimal.toDecimal("1010"));
    }

    @Test
    public void convertsBinaryToDecimal_zeroAndOne() {
        assertEquals(0, BinaryToDecimal.toDecimal("0"));
        assertEquals(1, BinaryToDecimal.toDecimal("1"));
    }

    @Test
    public void invalidBinary_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> BinaryToDecimal.toDecimal("10a01"));
    }
}

