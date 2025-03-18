package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0); 
        

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacionValida = true;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
                operacionValida = false;
                break;
        }

        if (operacionValida) {
            System.out.println("El resultado de " + num1 + " " + operador + " " + num2 + " es: " + resultado);
        }

        scanner.close();
    }
}