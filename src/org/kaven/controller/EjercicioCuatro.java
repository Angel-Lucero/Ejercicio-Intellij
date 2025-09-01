package org.kaven.controller;

import java.util.Scanner;

public class EjercicioCuatro {
    public void Four(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese grados Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Resultado: " + fahrenheit + " °F");
                break;
            case 2:
                System.out.print("Ingrese grados Fahrenheit: ");
                double fahr = sc.nextDouble();
                double cels = (fahr - 32) * 5/9;
                System.out.println("Resultado: " + cels + " °C");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
