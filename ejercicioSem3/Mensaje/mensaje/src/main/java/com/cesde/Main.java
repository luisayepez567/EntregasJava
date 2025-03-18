package com.cesde;
public class Main {
    public static void main(String[] args) {

        String mensajeCodificado = "H0l4  MUnD0,  3st0  3s  Un  m3ns4j3  s3cr3t0";

        String mensajeDecodificado = mensajeCodificado
                .replace("0", "o") // Reemplazar "0" por "o"
                .replace("3", "e") // Reemplazar "3" por "e"
                .replace("4", "a"); // Reemplazar "4" por "a"

        mensajeDecodificado = mensajeDecodificado
                .trim() // Eliminar espacios al principio y al final
                .replaceAll("\\s+", " "); 

        mensajeDecodificado = mensajeDecodificado.toUpperCase();

        System.out.println("Mensaje decodificado: " + mensajeDecodificado);
    }
}