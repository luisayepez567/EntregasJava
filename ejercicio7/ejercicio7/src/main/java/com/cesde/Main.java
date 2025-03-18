package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        String pesoStr = scanner.nextLine().replace(',', '.'); 
        double peso = Double.parseDouble(pesoStr);

        System.out.print("Ingrese su altura en metros: ");
        String alturaStr = scanner.nextLine().replace(',', '.');
        double altura = Double.parseDouble(alturaStr);

        double imc = peso / (altura * altura);

        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f%n", imc);


        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Clasificación: Normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }

        scanner.close();
    }
}