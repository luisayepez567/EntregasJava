package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en porcentaje, por ejemplo, 5 para 5%): ");
        double tasaAnual = scanner.nextDouble();

        System.out.print("Ingrese el número de años: ");
        int años = scanner.nextInt();

        double tasaMensual = (tasaAnual / 100) / 12;

        int numeroPagos = años * 12;

        double pagoMensual = (montoPrestamo * tasaMensual * Math.pow(1 + tasaMensual, numeroPagos))
                / (Math.pow(1 + tasaMensual, numeroPagos) - 1);

        System.out.printf("El pago mensual es: %.2f%n", pagoMensual);

        scanner.close();
    }
}