package com.logica.binaria.services;

public class DecimalToBinary {

    /**
     * Convierte un número entero decimal a su representación binaria (sin prefijo).
     * Ejemplos: 10 -> "1010", -5 -> "-101", 0 -> "0"
     */
    public static String decimalToBinary(int number) {
        if (number == 0) return "0";
        boolean negative = number < 0;
        long v = number; // usar long para evitar overflow con Integer.MIN_VALUE
        if (v < 0) v = -v;
        StringBuilder sb = new StringBuilder();
        while (v > 0) {
            sb.append((v % 2) == 1 ? '1' : '0');
            v = v / 2;
        }
        if (negative) sb.append('-');
        return sb.reverse().toString();
    }

    /**
     * Conveniencia que acepta el número como String (lanza NumberFormatException si no es válido)
     */
    public static String decimalToBinary(String numberAsString) {
        int n = Integer.parseInt(numberAsString.trim());
        return decimalToBinary(n);
    }

    /** Alias simple para compatibilidad con código que use `toBinary(int)` */
    public static String toBinary(int number) {
        return decimalToBinary(number);
    }

    /**
     * Recibe el array de argumentos `args` y devuelve la conversión a binario usando
     * el primer argumento si existe, o "10" como valor por defecto.
     * De esta forma `Main` puede ser una sola llamada sin lógica.
     */
    public static String decimalToBinaryFromArgs(String[] args) {
        String s = (args != null && args.length > 0) ? args[0] : "10";
        return decimalToBinary(s);
    }

}
