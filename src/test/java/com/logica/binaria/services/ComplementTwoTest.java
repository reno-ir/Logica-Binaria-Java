package com.logica.binaria.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplementTwoTest {

    @Test
    public void toTwoComplement_positive() {
        // 5 en 8 bits => 00000101
        assertEquals("00000101", ComplementTwo.toTwoComplement(5, 8));
    }

    @Test
    public void toTwoComplement_negative() {
        // -5 en 8 bits => 11111011
        assertEquals("11111011", ComplementTwo.toTwoComplement(-5, 8));
    }

    @Test
    public void roundtrip_negative() {
        // toTwoComplement seguido de fromTwoComplement devuelve el mismo valor
        String bin = ComplementTwo.toTwoComplement(-5, 8);
        assertEquals(-5, ComplementTwo.fromTwoComplement(bin));
    }
}

