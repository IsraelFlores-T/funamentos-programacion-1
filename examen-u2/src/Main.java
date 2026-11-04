import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion=0;
        int peso=0;
        int paquetesnovalidos=0;
        int paquetesvalidos=0;
        int validacion=0;
        int paquetesfragiles=0;
        int paquetesnofragiles=0;
        int local=0;
        int nacional=0;
        int expres=0;
        do {
            System.out.println("Bienvenido a registros de paquetes");
            System.out.println("1. Registrar paquete");
            System.out.println("2. Salir");
            opcion= teclado.nextInt();
            switch (opcion){
                case 1:
                    do {
                        System.out.println("Ingrese el peso del paquete en kg:");
                        peso=teclado.nextInt();
                    }while(peso<0);
                    int opcion2=0;
                    do {
                        System.out.println("1. Local");
                        System.out.println("2. Nacional");
                        System.out.println("3. Express");
                        System.out.println("4. Salir si no fue valido o ya lo acpeto el sistema");
                        System.out.println("Solo necesito una sola valida");
                        opcion2= teclado.nextInt();
                        switch (opcion2){
                            case 1:
                                    if (peso>12){
                                        System.out.println("paquete rechazado");
                                        peso=0;
                                        paquetesnovalidos=paquetesnovalidos+1;
                                    }
                                    if(peso<12) {
                                        System.out.println("paquete aceptado");
                                        paquetesvalidos=paquetesvalidos+1;
                                         local=30+8*peso;
                                        do {
                                            System.out.println("es fragil tu paquete? (1 si, 0 no)");
                                            validacion=teclado.nextInt();
                                            if (validacion==1){
                                                System.out.println("SE le sumara $25 pesos demas");
                                                local=local+25;
                                                paquetesfragiles=paquetesnofragiles+1;
                                                break;
                                            }

                                        }while(validacion!=0);
                                        System.out.println("Resultado del paquete");
                                        System.out.println("Tipo de envio Local");
                                        System.out.println("peso:"+peso);
                                        System.out.println("total: "+local);
                                        if(validacion==1){
                                            System.out.println("El objeto si es fragil");
                                        }
                                       else {
                                            System.out.println("EL paquete no es fragil");
                                        }
                                    }
                                break;
                            case 2:
                                if (peso>20){
                                    System.out.println("paquete rechazado");
                                    peso=0;
                                    paquetesnovalidos=paquetesnovalidos+1;
                                }
                                else {
                                    System.out.println("paquete aceptado");
                                    paquetesvalidos=paquetesvalidos+1;
                                     nacional=50+12*peso;
                                    do {
                                        System.out.println("es fragil tu paquete? (1 si, 0 no)");
                                        validacion=teclado.nextInt();
                                        if (validacion==1){
                                            System.out.println("SE le sumara $25 pesos demas");
                                            nacional=nacional+25;
                                            paquetesfragiles=paquetesnofragiles+1;
                                            break;
                                        }

                                    }while(validacion!=0);
                                    System.out.println("Resultado del paquete");
                                    System.out.println("Tipo de envio nacional");
                                    System.out.println("peso:"+peso);
                                    System.out.println("total: "+nacional);
                                    if(validacion==1){
                                        System.out.println("El objeto si es fragil");
                                    }
                                    else {
                                        System.out.println("EL paquete no es fragil");
                                    }
                                }
                                break;
                            case 3:

                                if (peso>5){
                                    System.out.println("paquete rechazado");
                                    peso=0;
                                    paquetesnovalidos=paquetesnovalidos+1;
                                }
                                else {
                                    System.out.println("paquete aceptado");
                                    paquetesvalidos=paquetesvalidos+1;
                                     expres=80+20*peso;
                                    do {
                                        System.out.println("es fragil tu paquete? (1 si, 0 no)");
                                        validacion=teclado.nextInt();
                                        if (validacion==1){
                                            System.out.println("SE le sumara $25 pesos demas");
                                            expres=expres+25;
                                            paquetesfragiles=paquetesnofragiles+1;
                                            break;
                                        }

                                    }while(validacion!=0);
                                    System.out.println("Resultado del paquete");
                                    System.out.println("Tipo de envio express");
                                    System.out.println("peso:"+peso);
                                    System.out.println("total: "+expres);
                                    if(validacion==1){
                                        System.out.println("El objeto si es fragil");
                                    }
                                    else {
                                        System.out.println("EL paquete no es fragil");
                                    }
                                }
                                break;
                            default:
                                System.out.println("opcion no valida");
                                break;
                        }
                    }while(opcion2!=4);

                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }while(opcion!=2);
        int total=nacional+local+expres;
        System.out.println("paquetes aceptados"+paquetesvalidos);
        System.out.println("paquetes no aceptados"+paquetesnovalidos);
        System.out.println("dinero recaudado de cada tipo de paquete"+total);
    }
}