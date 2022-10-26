package naviera;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        System.out.println("Ingrese la opcion a realizar");
        System.out.println("1. Ver buques");
        System.out.println("2. Eliminar un buque");
        System.out.println("3. Comprar partes de un buque");
        System.out.println("4. Salir");
    }

    public static void ejecucionMenu(){
        menu();
        int opcion = opcionMenu();
        switch (opcion) {
            case 1:
                Empresa.buques();
                break;
            case 2:
                //
                break;
            case 3:
                //
                break;
            case 4:
                break;
        }
    }
    public static int opcionMenu() {
        int opcion = -1;
        do {
            try {
                opcion = teclado().nextInt();
            } catch (Exception e) {
                System.out.println("Ingresa un número entre 1 y 4.");
                teclado().next();
            }
        } while (opcion > 4 || opcion < 1);
        return opcion;
    }

    public static Scanner teclado(){
        return new Scanner(System.in);
    }
}
