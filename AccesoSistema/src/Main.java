import java.util.Locale;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        teclado.useLocale(Locale.US);
        System.out.println("ingresa tu promedio ");
        double promedio= teclado.nextDouble();
        System.out.println("Ingresa tu porcentaje de asistencia ");
        int asistencia= teclado.nextInt();
        if (promedio < 7.0){
            System.out.println("Rebrobado por calificacion");
        } else if (asistencia < 80) {
            System.out.println("Reprobado por faltas");
        } else {
            System.out.println("Apobado regular");
        }
    }
}