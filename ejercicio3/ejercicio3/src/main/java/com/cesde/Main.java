package com.cesde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      
       System.out.println("Ingrese la temperatura del agua");
       int temperatura = entrada.nextInt();

       if(temperatura<0){
        System.out.println("El agua esta en estado solido");
       }
       else if(temperatura>=0 && temperatura<100){
        System.out.println("El agua esta en estado liquido");
    

        }
        else if (temperatura>100) {
            
        System.out.println("El agua esta en estado gaseoso");
        }
    }}