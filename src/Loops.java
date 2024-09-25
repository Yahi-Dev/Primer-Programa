import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;

        System.out.print("\n Escribe el nombre de tu pelicula favorita: ");
        String pelicula = scanner.nextLine();

        for (int i = 1; i <= 3; i++)
        {
            System.out.print("Escribe la nota que le darias a la pelicula " + pelicula + ": ");
            nota  = scanner.nextDouble();
            mediaEvaluacion = mediaEvaluacion + nota;
        }

        System.out.println("La media de evaluaciones para "  + pelicula + " es: " +  mediaEvaluacion / 3);
    }
}
