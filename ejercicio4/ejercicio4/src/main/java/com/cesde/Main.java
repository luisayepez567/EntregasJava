package com.cesde;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el total de la compra");
        Scanner scanner = new Scanner(System.in);
        int precio = scanner.nextInt();
        

        if(precio >100){
            System.out.println("El total de la compra es: "+precio +"$$");
            System.out.println(" El descuento de tu compra es del 10% equivalente: " +(0.10*precio)+ "$$");
            System.out.println(" El monto final es :" + (precio-(0.10*precio)+"$$"));
        }
        else if(precio > 50 && precio <= 100){
            System.out.println("El total de la compra es: "+precio +"$$");
            System.out.println("El descuento de tu compra es del 5% equivalente: " +(0.05*precio)+ "$$");
            System.out.println(" El monto final es :" + (precio-(0.05*precio)+"$$"));

        }
        else if(precio <= 50){
            System.out.println("El total de la compra es: "+precio +"$$");
            System.out.println("No hay descuento");

        }

    }
}