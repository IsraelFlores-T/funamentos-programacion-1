public static double calcularRenta(double tarifa, double horas) {
    double total = tarifa * horas;
    return total;
}

public static void mostrarComprobante(double total) {
    System.out.println("comprobante de total");
    System.out.println("costo del total es de:$"+total);
}

public static void main(String[] args) {
    double tarifa = 0;
    double horas = 0;
    Scanner teclado = new Scanner(System.in);
    while (tarifa <= 0) {
        System.out.print("Ingrese la tarifa por hora: ");
        tarifa = teclado.nextDouble();
        if (tarifa <= 0) {
            System.out.println("La tarifa debe ser mayor que cero");
        }
    }
    while (horas<=0){
        System.out.println("ingrese las cantidad de horas");
        horas= teclado.nextDouble();
        if (horas<=0){
            System.out.println("Error es menor que cero");
        }
    }
    double totalpagar=calcularRenta(tarifa,horas);
    mostrarComprobante(totalpagar);

}