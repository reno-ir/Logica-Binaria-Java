package com.logica.binaria.services;

public class BinaryToDecimal {
    /**
     * Convierte una cadena binaria (ej. "1010") a su valor decimal.
     * Método sencillo y directo para uso básico.
     *
     * @param binary cadena que contiene sólo '0' y '1'
     * @return valor decimal correspondiente
     * @throws IllegalArgumentException si la entrada es nula, vacía o contiene caracteres no binarios
     */
    public static int toDecimal(String binary) {
        if (binary == null) {
            throw new IllegalArgumentException("Entrada nula");
        }
        binary = binary.trim();
        if (binary.isEmpty()) {
            throw new IllegalArgumentException("Cadena vacía");
        }

        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Entrada no binaria: " + binary);
            }
            result = (result << 1) + (c - '0');
        }
        return result;
    }
}
