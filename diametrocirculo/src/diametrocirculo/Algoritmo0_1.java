1package diametrocirculo;

import java.util.Scanner;

public class Algoritmo0_1 {

    public static void main(String[] args) {
     

        // Declarar variables
        double radio, diametro;

        // Entrada de Datos
        try ( // Crear Scanner para entrada de datos
                Scanner entrada = new Scanner(System.in)) {
            // Entrada de Datos
            System.out.print("Ingrese el radio del círculo: ");
            radio = entrada.nextDouble();
            // Proceso
            diametro = 2 * radio;
            // Salida de Datos
            System.out.println("El diámetro del círculo es: " + diametro);
            // Cerrar Scanner
        }
    }
}
