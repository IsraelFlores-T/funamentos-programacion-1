
    public static void mostrarEtiqueta(String numGuia, String destino, double peso) {
        System.out.println("--- Etiqueta de envio ---");
        System.out.println("Número de guía: " + numGuia);
        System.out.println("Ciudad de destino: " + destino);
        System.out.println("Peso (kg):      " + peso + " kg");
    }

    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE MENSAJERÍA ---");
        mostrarEtiqueta("MEX-12345", "Guadalajara, Jal.", 2.5);

        mostrarEtiqueta("MEX-98765", "Monterrey, N.L.", 10.8);

        mostrarEtiqueta("MEX-55521", "Ciudad de México", 0.750);

        System.out.println("Etiquetas generadas correctamente.");
    }
