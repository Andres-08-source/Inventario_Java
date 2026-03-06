import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        // Proyecto inventario

        boolean aplicacionActiva = true;

        while (aplicacionActiva){
            System.out.println("===== INVENTARIO =====");
            System.out.println("1. Agregar productos.");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir del programa");

            System.out.println("\nElige alguna opcion");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\nHas ingresado al menu de agregar productos");
                    break;
                case 2:
                    System.out.println("\nHas ingresado al menu de ver productos");
                    break;
                case 3:
                    aplicacionActiva = false;
                    System.out.println("\nHas salido de la alpicaion");
                    break;
                default:
                    System.out.println("\nIngresaste una opcion invalida, vuelve a intentarlo");
            }
        }
    }
}