import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresa la temperatura en ºC ");
        int temperatura= teclado.nextInt();
        if (temperatura < 10){
            System.out.println("Frio extremo");
        }
        if (temperatura >= 10 && temperatura <=20){
            System.out.println("Clima fresco");
        }
        if (temperatura >= 21  && temperatura <= 30){
            System.out.println("Clima agradable");
        }
        if (temperatura >= 30) {
            System.out.println("Calor extremo");
        }
    }
}