
  import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        int opcion;
        char repetir;

        do {
            // Menú de opciones
            System.out.println("------ CALCULADORA BÁSICA ------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Verificar opción
            if (opcion >= 1 && opcion <= 4) {
                // Entrada de números
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();

                // Procesos
                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }

            // Repetir
            System.out.print("\n¿Desea realizar otra operación? (s/n): ");
            repetir = scanner.next().charAt(0);
            System.out.println();

        } while (repetir == 's' || repetir == 'S');

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}

    

