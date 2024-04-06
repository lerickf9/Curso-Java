import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu pelicula favorita");
        String nombrePelicula = sc.nextLine();
        System.out.println("Ahora ingresa el año de lanzamiento");
        int anioLanzamineto = sc.nextInt();
        System.out.println("Ingrese la nota de la pelicula");
        double nota = sc.nextDouble();//Permite ingresar comas "," para nombrar el decimal

        System.out.println(nombrePelicula);
        System.out.println(anioLanzamineto);
        System.out.println(nota);

        sc.close();
    }
}
