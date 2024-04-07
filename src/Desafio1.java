import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "Erick";
        int saldo = 500000;
        int opcion = 0;
        System.out.println("********************");
        System.out.println("La cuenta de: "+nombre);
        System.out.println("Tiene un saldo de: "+saldo);
        System.out.println("---------------------");
        System.out.println("Menu");
        System.out.println("1 Consultar saldo");
        System.out.println("2 Depositar");
        System.out.println("3 Retirar saldo");
        System.out.println("9 Salir");

        while(opcion != 9) {
            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es de: "+saldo);
                    break;
                case 2:
                    System.out.println("¿Cuanto desea depositar?");
                    int deposito = sc.nextInt();
                    saldo+=deposito;
                    if(saldo>2000000){
                        System.out.println("Usted excede el monto maximo");
                        saldo-=deposito;
                    }else{
                        System.out.println("Se depositó con exito");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea retirar");
                    int retiro = sc.nextInt();
                    saldo-=retiro;
                    if (saldo < retiro) {
                        System.out.println("Saldo insuficiente. Vuelva a intentarlo nuevamente");
                        saldo+=retiro;
                    }else{
                        System.out.println("Favor retire su dinero.¡Gracias!");
                    }
                default:
                    break;
            }
        }
        System.out.println("Muchas gracias, ¡hasta pronto!");


    }
}
