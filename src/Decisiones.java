public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 2002;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Pelicula mas populares");
        }else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }
        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("disfrute de su pelicula");
        }else {
            System.out.println("pelicula no disponible en su plan actual");
        }
    }
}
