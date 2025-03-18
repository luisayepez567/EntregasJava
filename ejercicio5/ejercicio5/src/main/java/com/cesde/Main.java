package com.cesde;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner  scanner= new Scanner(System.in);

        System.out.println("Ingrese el número");
        int numero = scanner.nextInt();

        if (numero > 0) {
            
            System.out.println("El número " + numero + " es positivo\n");
        }else if(numero < 0){

            System.out.println("El número " + numero + " es negativo\n");
        }else {
            System.out.println("El número es " + numero);
        }
        

        if (numero %2 ==0 ) {

            System.out.println("El número " + numero + " es par\n");
        }else{

            System.out.println("El número " + numero + " es impar");
        }

    }
}