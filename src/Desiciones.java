public class Desiciones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoPlan = true;
        double notaPelicula = 8.2;
        String tipoPlan = "Plus +";

        if (fechaDeLanzamiento >= 2022)
        {
            System.out.println("Peliculas más populares");
        }
        else {
            System.out.println("Peliculas Retro");
        }

        if (incluidoPlan || tipoPlan.equals("Plus +"))
        {
            System.out.println("Disfrute de su pelicula");
        }
        else {
            System.out.println("Pelicula no disponible para su plan actual.");
        }
    }
}
