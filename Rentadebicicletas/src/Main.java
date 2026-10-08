import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int horas=0;
        System.out.println("---- Parque de renta de bicicleta ----");
        System.out.println("Escoge una de nuestras bicicletas ");
        System.out.println("1. Bicicleta urbana: $40 por hora");
        System.out.println("2. Bicicleta de montaña: $60 por hora");
        System.out.println("3. Bicicleta eléctrica: $90 por hora");
        int opcion= teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.printf("Ingresa la cantidad de horas: ");
                horas= teclado.nextInt();
                if (horas > 0){
                    double subtotal=40 * horas;
                    System.out.println("Tienes membresia escribe true/false");
                    boolean membresia=teclado.nextBoolean();
                    if (membresia){
                        System.out.println("Se aplico un descuento del 20%");
                        subtotal= subtotal * 0.80;
                    }
                    else {
                        System.out.println("Descuento no aplicado");
                    }
                    System.out.println("Tipo de bicicleta selecionada: Bicicleta urbana");
                    System.out.println("Tu subtotal es: $"+subtotal);
                }
                else
                {
                    System.out.println("No es valido el numero 0");
                }
                break;
            case 2:
                System.out.printf("Ingresa la cantidad de horas: ");
                horas = teclado.nextInt();
                if (horas > 0){
                    double subtotal=60 * horas;
                    System.out.println("Tienes membresia escribe true/false");
                    boolean membresia=teclado.nextBoolean();
                    if (membresia){
                        System.out.println("Se aplico un descuento del 20%");
                        subtotal= subtotal * 0.80;
                    }
                    else {
                        System.out.println("Descuento no aplicado");
                    }
                    System.out.println("Tipo de bicicleta selecionada: Bicicleta de montaña");
                    System.out.println("Tu subtotal es: $"+subtotal);
                }
                else
                {
                    System.out.println("No es valido el numero 0");
                }
                break;
            case 3:
                System.out.printf("Ingresa la cantidad de horas: ");
                horas = teclado.nextInt();
                if (horas > 0){
                    double subtotal=90 * horas;
                    System.out.println("Tienes membresia escribe true/false");
                    boolean membresia=teclado.nextBoolean();
                    if (membresia){
                        System.out.println("Se aplico un descuento del 20%");
                        subtotal= subtotal * 0.80;
                    }
                    else {
                        System.out.println("Descuento no aplicado");
                    }
                    System.out.println("Tipo de bicicleta selecionada: Bicicleta electrica");
                    System.out.println("Tu subtotal es: $"+subtotal);
                }
                else
                {
                    System.out.println("No es valido el numero 0");
                }
                break;
                default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}