package com.logica.binaria.services;

public class ComplementTwo {

    public static String toTwoComplement(int value, int bits) {
        if (bits < 2 || bits > 32) {
            throw new IllegalArgumentException("bits debe estar entre 2 y 32");
        }

        long min = -(1L << (bits - 1));
        long max = (1L << (bits - 1)) - 1;
        if (value < min || value > max) {
            throw new IllegalArgumentException("El valor no cabe en " + bits + " bits: rango permitido [" + min + "," + max + "]");
        }

        long mask = (bits == 32) ? 0xFFFFFFFFL : ((1L << bits) - 1);
        long encoded = ((long) value) & mask; // conserva sólo los `bits` menos significativos

        String bin = Long.toBinaryString(encoded);
        if (bin.length() > bits) {
            // por seguridad, recortar a la derecha (no debería pasar por el chequeo previo)
            bin = bin.substring(bin.length() - bits);
        }
        // rellenar con ceros a la izquierda si hace falta
        return "0".repeat(Math.max(0, bits - bin.length())) + bin;
    }

    /**
     * Convierte una cadena en complemento a dos a su valor entero con signo.
     * La longitud del string determina el ancho (ej. "11111111" -> -1 si son 8 bits).
     */
    public static int fromTwoComplement(String binary) {
        if (binary == null) {
            throw new IllegalArgumentException("Entrada nula");
        }
        binary = binary.trim();
        if (binary.isEmpty()) {
            throw new IllegalArgumentException("Cadena vacía");
        }
        int len = binary.length();
        if (len > 32) {
            throw new IllegalArgumentException("Longitud máxima permitida: 32 bits");
        }
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Entrada no binaria: " + binary);
            }
        }

        long parsed = Long.parseLong(binary, 2);
        // si el bit más significativo es 0 => positivo
        if (binary.charAt(0) == '0') {
            return (int) parsed;
        }
        // negativo: value = parsed - 2^len
        long twoPow = 1L << len;
        long signed = parsed - twoPow;
        return (int) signed;
    }
}
