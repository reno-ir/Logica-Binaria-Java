package com.logica.binaria;

import com.logica.binaria.services.LogicaBooleana;

public class Main {
    public static void main(String[] args) {
        // Llamadas directas y mínimas a las funciones de LogicaBooleana (sin lógica aquí)
        System.out.println(LogicaBooleana.bitwiseAnd("1010", "1100")); // ejemplo: AND
        System.out.println(LogicaBooleana.bitwiseOr("1010", "1100"));  // ejemplo: OR
        System.out.println(LogicaBooleana.bitwiseXor("1010", "1100")); // ejemplo: XOR
        System.out.println(LogicaBooleana.bitwiseNot("1010"));          // ejemplo: NOT
    }
}