package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese el tiempo de espera en tráfico (en minutos): ");
        int tiempoEspera = scanner.nextInt();

        double tarifaBase = 4000; // Tarifa base del taxi
        double valorKilometro = 900; // Valor por kilómetro recorrido
        double valorMinuto = 150; // Valor por minuto de espera

        double precioDistancia = distancia * valorKilometro; // Precio por distancia
        double precioEspera = tiempoEspera * valorMinuto; // Precio por tiempo de espera
        double precioTotal = tarifaBase + precioDistancia + precioEspera; // Precio total

        System.out.println("\nResumen del viaje:");
        System.out.println("Distancia: " + distancia + " km");
        System.out.println("Tiempo de espera: " + tiempoEspera + " minutos");
        System.out.println("Precio del viaje: $" + String.format("%.2f", precioTotal));

        scanner.close();
    }
}