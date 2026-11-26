void main() {
    Scanner teclado=new Scanner(System.in);
    int [] arr1={55, 68, 72, 90, 61, 98, 45, 77, 83, 59};
    lista(arr1);
    listaNueva(arr1);
    int curva=curva(arr1);
    System.out.println("Aprobados después de la curva: "+curva);
}
static void lista(int arr1[]){
    System.out.println("lista de calificaciones originales");
    for (int i = 0; i < arr1.length; i++) {
            System.out.println("Alumno "+(i +1)+" calificacion:"+arr1[i]);
    }
    System.out.println("----------------------------------------");
}

static void listaNueva(int arr1[]){
    System.out.println("lista de calificaciones actualizadas");
    for (int i = 0; i < arr1.length; i++) {
        arr1[i]=arr1[i]+5;
        if (arr1[i]>=100){
            arr1[i]=100;
            System.out.println("Alumno "+(i +1)+" calificacion:"+arr1[i]);
        }
        else {
            System.out.println("Alumno "+(i +1)+" calificacion:"+arr1[i]);
        }
    }
}

static int curva(int arr1[]) {
    int curva = 0;
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] >= 70) {
            curva++;
        }
    }
    return curva;
}