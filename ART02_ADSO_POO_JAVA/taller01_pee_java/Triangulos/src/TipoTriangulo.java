import java.util.Scanner;

public class TipoTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver = 's';

        while (volver == 's' || volver == 'S') {
            // Simulación de limpiar pantalla
            for (int i = 0; i < 20; i++) System.out.println();

            // Objetivo del algoritmo
            System.out.print("Diseñe un algoritmo que encuentre el tipo de triángulo que se tiene, ");
            System.out.print("mostrando un menú que pida si se ingresarán ángulos o lados, ");
            System.out.print("y se dé la opción para escoger uno de los dos. ");
            System.out.print("Si se selecciona por ángulos, la suma debe ser 180°. ");
            System.out.print("Si se selecciona por lados, la suma de los dos más cortos debe ser mayor al más largo. ");
            System.out.println("No se aceptan valores menores o iguales a cero.\n");

            // Inicializar variables
            int menu = 0;
            double angA = 0, angB = 0, angC = 0;
            double ladoA = 0, ladoB = 0, ladoC = 0;

            // Mostrar menú
            System.out.println("---------- MENÚ ----------");
            System.out.println("1. Ángulos");
            System.out.println("2. Lados");
            System.out.print("Seleccione una opción del menú: ");

            if (scanner.hasNextInt()) {
                menu = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida.");
                scanner.nextLine(); // limpiar buffer
                continue;
            }

            scanner.nextLine(); // limpiar buffer

            switch (menu) {
                case 1:
                    // Triángulo por ángulos
                    System.out.println("\n-------------- Triángulo por Ángulos ------------------");

                    do {
                        System.out.println("\nRecuerde que los ángulos deben ser mayores a 0");
                        System.out.print("Digite el ángulo A: ");
                        angA = scanner.nextDouble();
                        System.out.print("Digite el ángulo B: ");
                        angB = scanner.nextDouble();
                        scanner.nextLine(); // limpiar buffer
                    } while (angA <= 0 || angB <= 0);

                    angC = 180 - (angA + angB);

                    if (angC > 0) {
                        System.out.printf("El ángulo C calculado es: %.2f°\n", angC);
                        if (angA == 90 || angB == 90 || angC == 90) {
                            System.out.println("Es un triángulo: RECTÁNGULO");
                        } else if (angA > 90 || angB > 90 || angC > 90) {
                            System.out.println("Es un triángulo: OBTUSÁNGULO");
                        } else {
                            System.out.println("Es un triángulo: ACUTÁNGULO");
                        }
                    } else {
                        System.out.println("Ángulos incorrectos. La suma excede los 180°.");
                    }
                    break;

                case 2:
                    // Triángulo por lados
                    System.out.println("\n-------------- Triángulo por Lados ------------------");

                    do {
                        System.out.println("\nRecuerde que los lados deben ser mayores a 0");
                        System.out.print("Digite el lado A: ");
                        ladoA = scanner.nextDouble();
                        System.out.print("Digite el lado B: ");
                        ladoB = scanner.nextDouble();
                        System.out.print("Digite el lado C: ");
                        ladoC = scanner.nextDouble();
                        scanner.nextLine(); // limpiar buffer
                    } while (ladoA <= 0 || ladoB <= 0 || ladoC <= 0);

                    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
                        if (ladoA == ladoB && ladoB == ladoC) {
                            System.out.println("Es un triángulo: EQUILÁTERO");
                        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                            System.out.println("Es un triángulo: ISÓSCELES");
                        } else {
                            System.out.println("Es un triángulo: ESCALENO");
                        }
                    } else {
                        System.out.println("Lados incorrectos. No forman un triángulo válido.");
                    }
                    break;

                default:
                    System.out.println("La opción del menú no existe.");
                    break;
            }

            // Preguntar si desea repetir
            System.out.print("\nPara repetir digite <s>, para salir cualquier tecla: ");
            String input = scanner.nextLine();
            volver = input.length() > 0 ? input.charAt(0) : 'n';
        }

        System.out.println("\nPrograma finalizado.");
        scanner.close();
    }
}
