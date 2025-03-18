package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C es igual a " + fahrenheit + "°F");

        System.out.print("Ingresa la temperatura en Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + "°F es igual a " + celsius + "°C");

        scanner.close();
    }
}