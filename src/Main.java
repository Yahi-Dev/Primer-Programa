public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoPlan = true;
        double notaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja,
                 la mejor pelicula del fin del milenaio
                fue lanzada en: 
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }
}