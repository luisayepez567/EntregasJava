package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota de exámenes (0-100): ");
        double examenes = scanner.nextDouble();

        System.out.print("Ingrese la nota de proyectos (0-100): ");
        double proyectos = scanner.nextDouble();

        System.out.print("Ingrese la nota de tareas (0-100): ");
        double tareas = scanner.nextDouble();

        System.out.print("Ingrese la nota de participación (0-100): ");
        double participacion = scanner.nextDouble();

        double notaFinal = (examenes * 0.4) + (proyectos * 0.3) + (tareas * 0.2) + (participacion * 0.1);

        System.out.printf("La nota final del curso es: %.2f%n", notaFinal);

        scanner.close();
    }
}