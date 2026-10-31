import java.util.Scanner;
    public static double calcularTiempo(double mb, double descargav) {
        double tiempo = mb / descargav;
        return tiempo;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tiempo = 0;
        System.out.println("Ingresa el tamaño del archivo en MB");
        double mb = teclado.nextDouble();
        System.out.println("Ingresa la velocidad de carga");
        double descargav = teclado.nextDouble();
        if (descargav > 0) {
            if (mb < 0) {
                System.out.println("No se puede ingresar numeros negativos");
            } else {
                tiempo = calcularTiempo(mb, descargav);
                System.out.println("Archivo de " + mb + " MB a " + descargav + " MB/s: " + tiempo + " Segundos");
            }
        } else {
            System.out.println("El valor de la velocidad es negativa o cero :(");
        }
    }