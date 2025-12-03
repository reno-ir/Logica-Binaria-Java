package com.logica.binaria;

import com.logica.binaria.services.BinaryToDecimal;

public class Main {
    public static void main(String[] args) {
        // Sólo llamamos al método de la clase de servicios. Sin lógica de conversión aquí.
        System.out.println(BinaryToDecimal.toDecimal("1010"));
    }
}