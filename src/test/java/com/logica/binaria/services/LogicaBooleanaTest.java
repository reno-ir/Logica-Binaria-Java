package com.logica.binaria.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogicaBooleanaTest {

    // bitwiseAnd tests
    @Test
    public void and_basic() {
        assertEquals("1000", LogicaBooleana.bitwiseAnd("1010", "1100"));
    }

    @Test
    public void and_differentLengths() {
        assertEquals("0010", LogicaBooleana.bitwiseAnd("10", "0010"));
    }

    // bitwiseOr tests
    @Test
    public void or_basic() {
        assertEquals("1110", LogicaBooleana.bitwiseOr("1010", "1100"));
    }

    @Test
    public void or_differentLengths() {
        assertEquals("1011", LogicaBooleana.bitwiseOr("1011", "11"));
    }

    // bitwiseXor tests
    @Test
    public void xor_basic() {
        assertEquals("0110", LogicaBooleana.bitwiseXor("1010", "1100"));
    }

    @Test
    public void xor_differentLengths() {
        assertEquals("1000", LogicaBooleana.bitwiseXor("1", "1001"));
    }

    // bitwiseNot tests
    @Test
    public void not_basic() {
        assertEquals("0101", LogicaBooleana.bitwiseNot("1010"));
    }

    @Test
    public void not_allOnes() {
        assertEquals("0000", LogicaBooleana.bitwiseNot("1111"));
    }
}

