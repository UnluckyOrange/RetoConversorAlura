
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        int opcion;

        do {
            System.out.println("*********************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda\n");
            System.out.println("1) Dólar >>> Peso Argentino");
            System.out.println("2) Peso Argentino >>> Dólar");
            System.out.println("3) Dólar >>> Real brasileño");
            System.out.println("4) Real brasileño >>> Dólar");
            System.out.println("5) Dólar >>> Peso Colombiano");
            System.out.println("6) Peso Colombiano >>> Dólar");
            System.out.println("7) Salir\n");
            System.out.println("Elija una opción válida:");
            System.out.println("*********************************************************");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia buffer

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el monto a convertir: ");
                double monto = scanner.nextDouble();
                scanner.nextLine(); // Limpia buffer

                String from = "", to = "";

                switch (opcion) {
                    case 1 -> { from = "USD"; to = "ARS"; }
                    case 2 -> { from = "ARS"; to = "USD"; }
                    case 3 -> { from = "USD"; to = "BRL"; }
                    case 4 -> { from = "BRL"; to = "USD"; }
                    case 5 -> { from = "USD"; to = "COP"; }
                    case 6 -> { from = "COP"; to = "USD"; }
                }

                double resultado = conversor.convertirMoneda(from, to, monto);
                System.out.printf("Resultado: %.2f %s = %.2f %s\n\n", monto, from, resultado, to);
            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el conversor.");
    }
}

