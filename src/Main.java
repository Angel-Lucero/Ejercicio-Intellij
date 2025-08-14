//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import org.kaven.controller.EjercicioOne;
import org.kaven.controller.EjercicioTwo;

public class Main {
    public static void main(String[] args) {
        boolean a = false;
        do {
            System.out.printf("Bienvenido al listado de actividades\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("0.Cerrar el programa");
            System.out.println("1.Numeros pares");
            System.out.println("2.Numero primo");
            System.out.println("3.Numero aleatorio");
            System.out.println("4.Conversion grados");
            System.out.println("5.CRUD");
            System.out.println("6.Lo de la DB");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    EjercicioOne uno = new EjercicioOne();
                    uno.One();
                    break;
                case 2:
                    EjercicioTwo dos = new EjercicioTwo();
                    dos.Two();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
            }
        } while (!a);
    }
}