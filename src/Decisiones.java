public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPElicula = 8.2;
        String tipoPlan = "plus";

        if(fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más populares");
        }
        else{
            System.out.println("Peliculas retro qué aún vale la pena ver");
            System.out.println();
        }

        if(incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute del plan "+tipoPlan);
        }else {
            System.out.println("No posee el plan "+tipoPlan);
        }
    }

}
