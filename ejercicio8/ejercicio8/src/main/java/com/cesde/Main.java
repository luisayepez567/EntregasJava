package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int minutos = scanner.nextInt();


        int horas = minutos / 60; 
        int minutosRestantes = minutos % 60; 


        int dias = minutos / (24 * 60); 
        int horasRestantes = (minutos % (24 * 60)) / 60; 
        int minutosFinales = minutos % 60; 


        System.out.println(minutos + " minutos equivalen a:");
        System.out.println(horas + " horas y " + minutosRestantes + " minutos.");
        System.out.println(dias + " días, " + horasRestantes + " horas y " + minutosFinales + " minutos.");

        scanner.close();
    }
}