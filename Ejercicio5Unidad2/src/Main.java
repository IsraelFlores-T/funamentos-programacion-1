//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        a=11;
        b=10;
        c=15;
        if (a==0 || b==0 || c==0){
            System.out.println("no valido 0");
        }
        else {
            if (a > b && a > c){
                System.out.println("El mayor es:"+a);
            }
            else if (b > a && b > c){
                System.out.println("El mayor es:"+b);
            }
            else{
                System.out.println("El mayor es:"+c);
            }
            int num=1;
            while (num<=5){
                System.out.println(num);
                num+=2;
            }
            System.out.println(num);
            System.out.println("-----------------");
            while (num>=0){
                System.out.println(num);
                num--;
            }

        }

    }
}