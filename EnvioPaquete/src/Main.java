import java.util.Scanner;
    public static void mostrarEtiqueta(String numGuia, String destino, double peso) {
        System.out.println("--- Etiqueta de envio ---");
        System.out.println("Numero de guia: " + numGuia);
        System.out.println("Ciudad de destino: " + destino);
        System.out.println("Peso (kg): " + peso);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Guia 1: ");
        String g1 = teclado.nextLine();
        System.out.print("Destino 1: ");
        String d1 = teclado.nextLine();
        System.out.print("Peso 1: ");
        double p1 = teclado.nextDouble();
        teclado.nextLine();

        mostrarEtiqueta(g1, d1, p1);

        System.out.print("Guia 2: ");
        String g2 = teclado.nextLine();
        System.out.print("Destino 2: ");
        String d2 = teclado.nextLine();
        System.out.print("Peso 2: ");
        double p2 = teclado.nextDouble();

        mostrarEtiqueta(g2, d2, p2);
    }