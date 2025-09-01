package org.kaven.controller;
import java.util.Scanner;

public class EjercicioDos {
    public void Two() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número a verificar:");
        int numero = sc.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }
    }
}
