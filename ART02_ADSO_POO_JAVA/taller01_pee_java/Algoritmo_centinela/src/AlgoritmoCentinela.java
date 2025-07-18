import java.util.Scanner;

public class AlgoritmoCentinela {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver = 's'; // Inicializar variable

        // Bucle centinela
        while (volver == 's' || volver == 'S') {
            // Limpiar pantalla simulada (en consola real no se limpia, pero puedes imprimir líneas vacías)
            for (int i = 0; i < 30; i++) {
                System.out.println();
            }

            // Objetivo del algoritmo
            System.out.println("este es un menu de entrada, porfavor digita alguna letra");
            
            // Aquí puedes agregar tu lógica de entrada de datos, procesos y salidas
            System.out.println("De lo contrario puedes salir del programa");

            // Preguntar si desea repetir
            System.out.println();
            System.out.print("Para repetir digite <s>, para salir cualquier otra tecla: ");
            String input = scanner.nextLine();
            if (input.length() > 0) {
                volver = input.charAt(0);
            } else {
                volver = 'n'; // cualquier valor diferente de 's' termina el bucle
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
