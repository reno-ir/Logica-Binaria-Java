package com.logica.binaria;

import com.logica.binaria.services.DecimalToBinary;

public class Main {
    public static void main(String[] args) {
        // main mínimo: delega completamente a DecimalToBinary sin lógica local
        System.out.println(DecimalToBinary.decimalToBinaryFromArgs(args));
    }
}