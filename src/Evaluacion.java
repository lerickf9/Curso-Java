import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double sumaNota = 0;
        int total = 0;

        while(nota != -1) {
            System.out.println("Ingrese la nota de la pelicula");
            nota = sc.nextDouble();
            if(nota != -1){
                sumaNota += nota;
                total++;
            }
        }
        System.out.println("la nota final es: ");
        System.out.println(sumaNota/total);
    }
}

