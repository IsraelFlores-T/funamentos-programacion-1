import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un el piso que estas: ");
        int piso= teclado.nextInt();
        System.out.println("Ingrese un el piso que quieres ir del 1 al 10: ");
        int pisodestino= teclado.nextInt();
        if (piso==0 || piso==pisodestino || pisodestino==0 || piso<0 || pisodestino<0){
            System.out.println("Estas en el mismo piso o ingresastes 0(cero)");
        }

       else{
            System.out.println("Vas a ir arriba o abajo ingresa 1 para ir arriba o 0 para abajo");
            int opcion= teclado.nextInt();
            if (opcion==1){
                piso=piso+1;
                while(piso<=pisodestino){
                    System.out.println(piso+"↑");
                    piso++;
                }
            }
            else{
                piso=piso-1;
                while(piso>0){
                    System.out.println(piso+"↓");
                    piso--;
                }
            }
        }

    }
}
