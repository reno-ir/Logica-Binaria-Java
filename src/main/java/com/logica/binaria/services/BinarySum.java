package com.logica.binaria.services;

public class BinarySum {

    public static String add(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Entradas nulas");
        }
        a = a.trim();
        b = b.trim();
        if (a.isEmpty() || b.isEmpty()) {
            throw new IllegalArgumentException("Entradas vacías");
        }

        // Validar que ambas cadenas sean binarias
        for (int k = 0; k < a.length(); k++) {
            char c = a.charAt(k);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Entrada no binaria: " + a);
            }
        }
        for (int k = 0; k < b.length(); k++) {
            char c = b.charAt(k);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Entrada no binaria: " + b);
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Sumar de derecha a izquierda
        while (i >= 0 || j >= 0 || carry != 0) {
            int da = (i >= 0) ? a.charAt(i) - '0' : 0;
            int db = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = da + db + carry;
            sb.append((char) ('0' + (sum % 2))); // bit resultante
            carry = sum / 2; // nuevo acarreo
            i--;
            j--;
        }

        // El resultado está al revés
        return sb.reverse().toString();
    }
}
