import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double sumaNota =0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1));
            nota = sc.nextDouble();
            sumaNota+=nota;
        }
        System.out.println("la nota final es: ");
        System.out.println(sumaNota/3);

    }
}
