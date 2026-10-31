import java.util.Scanner;
    public static void main(String[] args) {
        int minutosresultante=calcularMinutos();
        System.out.println("El total de minutos calculados fue: " + minutosresultante+" minutos");
    }
    public static int calcularMinutos() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int minutostotales=0;
        do {
            System.out.print("Ingrese el porcentaje de la bateria del 0-100: ");
            int bateria = teclado.nextInt();

            if (bateria < 0 || bateria > 100) {
                System.out.println("Error....");
            } else {
                int minutos = 0;


                while (bateria < 100) {
                    System.out.println("Bateria:"+bateria);
                    bateria = bateria + 8;
                    minutos++;
                    if (bateria > 100) {
                        bateria = 100;
                        System.out.println("Bateria:"+bateria);
                    }
                }
                System.out.println("Minutos necesarios para cargar: " + minutos+" minutos");
                minutostotales=minutos;
            }
            System.out.print("¿Desea hacer otra simulación? (1 = Sí, 0 = No): ");
            opcion = teclado.nextInt();

        } while (opcion == 1);
        return minutostotales;
    }