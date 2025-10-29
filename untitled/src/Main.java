import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner print = new Scanner(System.in);
        boolean salir = true;
        String nombreContacto = "";
        int numCon = 0;

        while (salir) {

        System.out.println("\n===================== AGENDA DE CONTACTOS =====================\n");
        System.out.println("Escoge un número (1 - 4)\n");
        System.out.println("1: Añadir contactos");
        System.out.println("2: Mostrar contactos");
        System.out.println("3: Buscar contacto");
        System.out.println("4: Salir");

        int opcionEscogida = print.nextInt();
        print.nextLine();

            switch (opcionEscogida) {
                case 1:
                    System.out.println("Introduce el nombre y el número del contacto");
                    nombreContacto = print.nextLine();
                    numCon = print.nextInt();
                    break;
                case 2:
                    System.out.println("Mostrando todos los contactos añadidos...");
                    System.out.println(nombreContacto + " " + numCon);
                    break;
                case 3:
                    System.out.println("Quieres buscar el contacto por número o por nombre? (1 - 2)");
                    int busq = print.nextInt();

                    if (busq == 1) {
                        System.out.println("Introduce el nombre");
                        String busqNom = print.nextLine();
                    } else {
                        System.out.println("Introduce el número");
                        int busqNum = print.nextInt();
                    }

                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    salir = false;
                    print.close();
                    break;
            }
        }

    }
}
