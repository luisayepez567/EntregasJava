package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();


        boolean esTriangulo = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        if (esTriangulo) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero (tres lados iguales).");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Es un triángulo isósceles (dos lados iguales).");
            } else {
                System.out.println("Es un triángulo escaleno (ningún lado igual).");
            }
        } else {
            System.out.println("Las longitudes no pueden formar un triángulo.");
        }


        scanner.close();
    }
}