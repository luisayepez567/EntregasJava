package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota numérica (0-100): ");
        int nota = scanner.nextInt();

        String letra;
        if (nota >= 90 && nota <= 100) {
            letra = "A";
        } else if (nota >= 80 && nota <= 89) {
            letra = "B";
        } else if (nota >= 70 && nota <= 79) {
            letra = "C";
        } else if (nota >= 60 && nota <= 69) {
            letra = "D";
        } else if (nota >= 0 && nota <= 59) {
            letra = "F";
        } else {
            letra = "Nota inválida"; 
        }

        System.out.println("La nota en letra es: " + letra);

        scanner.close();
    }
}