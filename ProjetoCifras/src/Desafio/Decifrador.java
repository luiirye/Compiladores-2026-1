package Desafio;

import Engine.*;

public class Decifrador {

    public static String decifrarCesar(String texto, int chave) {
        CifraCesar cifra = new CifraCesar(chave);
        String decifrado = cifra.decifrar(texto);
        return decifrado;
    }

    public static String decifrarVigenere(String texto, String chave) {
        CifraVigenere cifra = new CifraVigenere(chave);
        String decifrado = cifra.decifrar(texto);
        return decifrado;
    }

    public static String decifrarRC4(String texto, String chave) {
        CifraRC4 cifra = new CifraRC4(chave);
        String[] hexValues = texto.split(" ");
        byte[] bytes = new byte[hexValues.length];

        for (int i = 0; i < hexValues.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hexValues[i], 16);
        }
        byte[] bDecifrado = cifra.processar(bytes);
        String decifrado = new String(bDecifrado);
        return decifrado;
    }
}
