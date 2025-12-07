package com.logica.binaria;

import com.logica.binaria.services.ComplementTwo;

public class Main {
    public static void main(String[] args) {
        // Llamadas mínimas a ComplementTwo (sin lógica en Main)
        System.out.println(ComplementTwo.toTwoComplement(-5, 8)); // ejemplo: -5 en 8 bits
        System.out.println(ComplementTwo.fromTwoComplement("11111011")); // ejemplo: "11111011" -> -5
    }
}