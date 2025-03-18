package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        // Clasificar la edad
        String categoria;
        if (edad >= 0 && edad <= 2) {
            categoria = "Bebé";
        } else if (edad >= 3 && edad <= 12) {
            categoria = "Niño";
        } else if (edad >= 13 && edad <= 19) {
            categoria = "Adolescente";
        } else if (edad >= 20 && edad <= 64) {
            categoria = "Adulto";
        } else if (edad >= 65) {
            categoria = "Adulto mayor";
        } else {
            categoria = "Edad inválida"; // En caso de que la edad sea negativa
        }

        // Mostrar la categoría
        System.out.println("La categoría de edad es: " + categoria);

        // Cerrar el scanner
        scanner.close();
    }
}