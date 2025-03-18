package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        double suma = num1 + num2 + num3;

        double multiplicacion = num1 * num2 * num3;

        double promedio = suma / 3.0;

        boolean esPromedioMayorQueSuma = promedio > suma;

        System.out.println("La suma de los tres números es: " + suma);
        System.out.println("La multiplicación de los tres números es: " + multiplicacion);
        System.out.println("El promedio de los tres números es: " + promedio);
        System.out.println("¿El promedio es mayor que la suma? " + esPromedioMayorQueSuma);

        scanner.close();
    }
}