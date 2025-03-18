package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        boolean esMultiploDe2 = numero % 2 == 0;
        boolean esMultiploDe3 = numero % 3 == 0;
        boolean esMultiploDe5 = numero % 5 == 0;

        System.out.println("¿Es múltiplo de 2? " + esMultiploDe2);
        System.out.println("¿Es múltiplo de 3? " + esMultiploDe3);
        System.out.println("¿Es múltiplo de 5? " + esMultiploDe5);

        scanner.close();
    }
}