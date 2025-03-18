package com.cesde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el primer número (a): ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa el segundo número (b): ");
        double b = scanner.nextDouble();

  
        if (a > b) {
            System.out.println("El número " + a + " es mayor que " + b);
        } else if (a < b) {
            System.out.println("El número " + b + " es mayor que " + a);
        } else {
            System.out.println("Los números " + a + " y " + b + " son iguales");
        }

        if (a != b) {
            System.out.println("Los números " + a + " y " + b + " son diferentes");
        } else {
            System.out.println("Los números " + a + " y " + b + " son iguales");
        }
    scanner.close();
}
}