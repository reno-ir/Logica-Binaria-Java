package com.logica.binaria.services;

public class LogicaBooleana {
    /**
     * Valida que la cadena contenga sólo '0' y '1'.
     */
    private static void validateBinary(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Entrada nula");
        }
        if (s.trim().isEmpty()) {
            throw new IllegalArgumentException("Cadena vacía");
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Entrada no binaria: " + s);
            }
        }
    }

    /**
     * Rellena con ceros a la izquierda la cadena para alcanzar la longitud dada.
     */
    private static String leftPad(String s, int length) {
        if (s.length() >= length) return s;
        int diff = length - s.length();
        return "0".repeat(diff) + s;
    }

    /**
     * AND a nivel de bits entre dos cadenas binarias. Se alinean por la derecha (se rellenan ceros a la izquierda).
     * Ejemplo: "101" AND "0111" => "00101" AND "0111" (tras padding) => resultado: "00101" ?
     * Para mantenerlo simple, el resultado tendrá la longitud de la mayor cadena.
     */
    public static String bitwiseAnd(String a, String b) {
        validateBinary(a);
        validateBinary(b);
        int max = Math.max(a.length(), b.length());
        String aa = leftPad(a, max);
        String bb = leftPad(b, max);
        StringBuilder sb = new StringBuilder(max);
        for (int i = 0; i < max; i++) {
            char ca = aa.charAt(i);
            char cb = bb.charAt(i);
            sb.append((ca == '1' && cb == '1') ? '1' : '0');
        }
        return sb.toString();
    }

    /**
     * OR a nivel de bits entre dos cadenas binarias. Se alinean por la derecha (se rellenan ceros a la izquierda).
     */
    public static String bitwiseOr(String a, String b) {
        validateBinary(a);
        validateBinary(b);
        int max = Math.max(a.length(), b.length());
        String aa = leftPad(a, max);
        String bb = leftPad(b, max);
        StringBuilder sb = new StringBuilder(max);
        for (int i = 0; i < max; i++) {
            char ca = aa.charAt(i);
            char cb = bb.charAt(i);
            sb.append((ca == '1' || cb == '1') ? '1' : '0');
        }
        return sb.toString();
    }

    /**
     * XOR a nivel de bits entre dos cadenas binarias. Se alinean por la derecha (se rellenan ceros a la izquierda).
     */
    public static String bitwiseXor(String a, String b) {
        validateBinary(a);
        validateBinary(b);
        int max = Math.max(a.length(), b.length());
        String aa = leftPad(a, max);
        String bb = leftPad(b, max);
        StringBuilder sb = new StringBuilder(max);
        for (int i = 0; i < max; i++) {
            char ca = aa.charAt(i);
            char cb = bb.charAt(i);
            sb.append((ca != cb) ? '1' : '0');
        }
        return sb.toString();
    }

    /**
     * NOT a nivel de bits de una cadena binaria. Devuelve la cadena invertida bit a bit con la misma longitud.
     */
    public static String bitwiseNot(String a) {
        validateBinary(a);
        StringBuilder sb = new StringBuilder(a.length());
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            sb.append(c == '1' ? '0' : '1');
        }
        return sb.toString();
    }
}
