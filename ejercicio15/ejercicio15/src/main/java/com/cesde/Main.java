package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        System.out.print("Ingrese los años de lealtad del cliente: ");
        int añosLealtad = scanner.nextInt();

        double descuentoLealtad = 0;
        if (añosLealtad >= 1 && añosLealtad <= 2) {
            descuentoLealtad = 0.05; // 5%
        } else if (añosLealtad >= 3 && añosLealtad <= 5) {
            descuentoLealtad = 0.10; // 10%
        } else if (añosLealtad > 5) {
            descuentoLealtad = 0.15; // 15%
        }

        double descuentoAdicional = 0;
        if (montoCompra > 500) {
            descuentoAdicional = 0.05; // 5%
        }

        double descuentoTotal = descuentoLealtad + descuentoAdicional;

        double montoFinal = montoCompra * (1 - descuentoTotal);

        System.out.printf("Descuento por lealtad: %.0f%%%n", descuentoLealtad * 100);
        System.out.printf("Descuento adicional: %.0f%%%n", descuentoAdicional * 100);
        System.out.printf("Descuento total: %.0f%%%n", descuentoTotal * 100);
        System.out.printf("Monto final a pagar: $%.2f%n", montoFinal);

        scanner.close();
    }
}