void main() {
    Scanner teclado=new Scanner(System.in);
    int[] calificaciones = registro();
    lista(calificaciones);
    int totalAprobados = aprobados(calificaciones);
    int totalreprobados= reprobados(calificaciones);
    System.out.println("Alumnos que pasaron: " + totalAprobados);
    System.out.println("Alumnos que reprobaron: " + totalreprobados);
}
static int[] registro() {
    Scanner teclado = new Scanner(System.in);
    int[] arr1 = new int[10];
    System.out.println("Lista de calificaciones de alumnos");
    for (int i = 0; i < arr1.length; i++) {
        do {
            System.out.printf("Captura la calificacion del alumno " + (i + 1) + ":");
            arr1[i] = teclado.nextInt();
        } while (arr1[i] < 0 || arr1[i] > 100);
    }
    return arr1;
}

static void lista(int arr1[]){
    System.out.println("lista de calificaciones");
    for (int i = 0; i < arr1.length; i++) {
        System.out.println("Alumno "+(i +1)+" calificacion:"+arr1[i]);
    }
}
static int aprobados(int arr1[]) {
    int aprobaron = 0;
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] >= 70) {
            aprobaron++;
        }
    }
    return aprobaron;
}
static int reprobados(int arr1[]) {
    int reprobado = 0;
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] < 70) {
            reprobado++;
        }
    }
    return reprobado;
}