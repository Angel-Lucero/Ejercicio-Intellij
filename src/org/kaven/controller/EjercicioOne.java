package org.kaven.controller;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class EjercicioOne {
    public void One(){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero a verificar");
        int numeroA = sc.nextInt();
        int resultado = numeroA%2;
        if (resultado==0){
            System.out.println("Es numero par");
        }else {
            System.out.println("No es numero par");
        }
    }
}
