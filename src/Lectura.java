import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Escribe el nombre de tu pelicula favorita: ");
        String pelicula = scanner.nextLine();
        System.out.print("\n Ahora escribe la fecha de lanzamiento: ");
        int fechaLanzamineto = scanner.nextInt();
        System.out.print("\n Por ultimo dinos que nota le das a esta pelicula: ");
        double nota =  scanner.nextDouble();


        System.out.println("Pelicula: " + pelicula);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamineto);
        System.out.println("Nota: " + nota);

        scanner.close();
    }

}
