import java.util.Scanner;

public class main {

    // 1. MÉTODO PARA CALCULAR (Recibe datos y devuelve el total)
    public static double calcularRenta(double tarifa, double horas) {
        double total = tarifa * horas;
        return total;
    }

    public static void mostrarComprobante(double total) {
        System.out.println("---------------------------------");
        System.out.println("      COMPROBANTE DE RENTA       ");
        System.out.println("---------------------------------");
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- SISTEMA DE RENTA DE CÁMARAS ---");

        System.out.print("Ingrese la tarifa de alquiler por hora ($): ");
        double tarifa = teclado.nextDouble();

        // Validar que la tarifa sea mayor que cero
        if (tarifa <= 0) {
            System.out.println("Error: La tarifa debe ser mayor que cero.");
            return; // Termina el programa
        }

        System.out.print("Ingrese la cantidad de horas de uso: ");
        double horas = teclado.nextDouble();

        // Validar que las horas sean mayores que cero
        if (horas <= 0) {
            System.out.println("Error: Las horas deben ser mayores que cero.");
            return; // Termina el programa
        }

        // LLAMAR A LOS MÉTODOS
        // 1. Calculamos el total
        double totalPagar = calcularRenta(tarifa, horas);

        // 2. Mostramos el comprobante
        mostrarComprobante(totalPagar);

        teclado.close();
    }
}
