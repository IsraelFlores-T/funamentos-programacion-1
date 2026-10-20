import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner teclado=new Scanner(System.in);
    int puntos=100;
    int opc=0;
    do {
        System.out.println("---- Eliga una opcion ----");
        System.out.println("1: Ganar 20 puntos");
        System.out.println("2: Gastar 15 puntos");
        System.out.println("3: Consultar mis puntos");
        System.out.println("4: Salir");
        opc=teclado.nextInt();
        switch (opc){
            case 1:
                puntos=puntos+20;
                System.out.println("Has ganado 20 puntos");
                break;
            case 2:
                if (puntos>=15){
                    puntos=puntos-15;
                    System.out.println("Has gastado 15 puntos");
                }
                else {
                    System.out.println("Puntos insuficientes :"+puntos);
                }
                break;
            case 3:
                System.out.println("El total de puntos son:"+puntos);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }while (opc!=4);
    System.out.println("Tu total de puntos es de : "+puntos);

}
