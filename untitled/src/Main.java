import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner print = new Scanner(System.in);

        System.out.println("elige un número");
        System.out.println("añadir contactos");
        System.out.println("mostrar contactos");
        System.out.println("buscar contacto");
        System.out.println("salir");

        String opcionEscogida = print.nextLine();

        System.out.println("La opción escogida es: " + opcionEscogida);


    }
}
