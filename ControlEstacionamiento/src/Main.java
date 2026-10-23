import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalAutos = 0;
        double totalRecaudado = 0;
        int autosConDescuento = 0;
        double horas;
        do {
            System.out.println("ingrese las horas estacionadas (0 para terminar)");
            horas=teclado.nextDouble();
            if(horas<0){
                System.out.println("El valor es negativo no se puede ingresar numeros negativos");
                continue;
            }
            double pago=horas*15;
            if (horas>5) {
                System.out.println("Ha tenido un descuento del fijo de $10");
                pago-=10;
                autosConDescuento=autosConDescuento+1;
            }
            System.out.println("El automovil debe pagar:"+pago);
            totalAutos++;
            totalRecaudado+=pago;
        }while (horas!=0);
        totalAutos-=1;
        System.out.println("--- Resumen del dia ---");
        System.out.println("Total de autos atendidos:"+totalAutos);
        System.out.println("Total de dineto recaudado:"+totalRecaudado);
        System.out.println("Cantidad de autos con descuento:"+autosConDescuento);
        if (totalAutos>0){
            double promedio=totalRecaudado/totalAutos;
            System.out.printf("Promedio pagado por auto es de: $%.2f%n",promedio);
        }
        else {
            System.out.println("promedio pagado por auto es de: $0");
        }
    }
}