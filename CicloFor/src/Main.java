import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int total=0;
        int puntos=0;
        int mayorpuntos=0;
        int menorpuntos=0;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Ingresa puntos obtenidos de la partida " + i+": ");
            puntos=teclado.nextInt();
            if (puntos >= 1000) {
                System.out.println("Partida con mas de 1000 puntos");
                 mayorpuntos=mayorpuntos+1;

            }else {
                System.out.println("Partida con menos de 1000 puntos");
                menorpuntos=menorpuntos+1;

            }
            total=total+puntos;

        }
        double promedio=total / 7;
        System.out.println("Tu acumulacion de puntos son de:"+total);
        System.out.println("Tu promedio de puntos es:"+promedio+"%");
            System.out.println("Partida con mas de 1000 puntos fueron de:"+mayorpuntos);
            System.out.println("Partida con 1000 puntos o menos fueron de:"+menorpuntos);

    }
}