import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingresa tu porentaje de bateria de tu dron: ");
        int bateria=teclado.nextInt();
        if (bateria==0 || bateria<0){
            System.out.println("Erorr....");
        }
        else {
            int contadorminuto=1;
            while(bateria>=7){
                bateria -= 7;
                System.out.println("minuto "+contadorminuto+" Bateria-→ "+bateria+" %");
                contadorminuto++;
            }
            System.out.println("El dron ya no puede seguir volando.");
        }
    }
}
