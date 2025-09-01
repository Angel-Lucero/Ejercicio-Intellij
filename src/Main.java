import java.util.Scanner;

import org.kaven.controller.EjercicioCuatro;
import org.kaven.controller.EjercicioTres;
import org.kaven.controller.EjercicioUno;
import org.kaven.controller.EjercicioDos;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bienvenido al listado de actividades");
            System.out.println("0. Cerrar el programa");
            System.out.println("1. Números pares");
            System.out.println("2. Número primo");
            System.out.println("3. Número aleatorio");
            System.out.println("4. Conversión grados");
            System.out.println("5. CRUD");
            System.out.println("6.Lo de la DB");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                case 1:
                    EjercicioUno uno = new EjercicioUno();
                    uno.One();
                    break;
                case 2:
                    EjercicioDos dos = new EjercicioDos();
                    dos.Two();
                    break;
                case 3:
                    EjercicioTres tres = new EjercicioTres();
                    tres.Three();
                    break;
                case 4:
                    EjercicioCuatro cuatro = new EjercicioCuatro();
                    cuatro.Four();
                    break;
                case 5:
                    System.out.println("Esto ya no se realiza");
                    break;
                case 6:
                    System.out.println("Esto ya no se realiza");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (!salir);
        sc.close();
    }
}