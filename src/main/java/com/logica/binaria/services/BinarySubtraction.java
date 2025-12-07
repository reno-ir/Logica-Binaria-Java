package com.logica.binaria.services;

import java.math.BigInteger;

public class BinarySubtraction {

    public static String subtract(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Entradas nulas");
        }
        a = a.trim();
        b = b.trim();
        if (a.isEmpty() || b.isEmpty()) {
            throw new IllegalArgumentException("Entradas vacías");
        }
        // validar
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Entrada no binaria: " + a);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Entrada no binaria: " + b);
            }
        }

        BigInteger A = new BigInteger(a, 2);
        BigInteger B = new BigInteger(b, 2);
        BigInteger R = A.subtract(B);
        if (R.signum() < 0) {
            return "-" + R.abs().toString(2);
        }
        return R.toString(2);
    }
}
