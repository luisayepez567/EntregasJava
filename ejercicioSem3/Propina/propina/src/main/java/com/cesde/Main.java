package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el valor de la cuenta (incluyendo IVA): ");
        double valorCuenta = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de propina que desea dejar (10-15): ");
        double porcentajePropina = scanner.nextDouble();

        double valorPropina = valorCuenta * (porcentajePropina / 100);

        double valorTotal = valorCuenta + valorPropina;

        System.out.println("\nResumen de la cuenta:");
        System.out.println("Valor de la cuenta: $" + String.format("%.2f", valorCuenta));
        System.out.println("Porcentaje de propina: " + porcentajePropina + "%");
        System.out.println("Valor de la propina: $" + String.format("%.2f", valorPropina));
        System.out.println("Valor total a pagar: $" + String.format("%.2f", valorTotal));

        scanner.close();
    }
}