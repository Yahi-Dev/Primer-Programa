import java.util.Scanner;

public class Evaluaciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota  = 0;
        double mediaEvaluacion = 0;
        int totalEvalucaiones = 0;
        String pelicula = "Scarface";

        while(nota != -1  && totalEvalucaiones == 3)
        {
            System.out.print("Escribe la nota que le darias a la pelicula " + pelicula + ": ");
            nota  = scanner.nextDouble();
            if (nota == -1)
            {
                mediaEvaluacion += nota;
                totalEvalucaiones++;
            }
        }

        System.out.println("La media de evaluaciones para "  + pelicula + " es: " +  mediaEvaluacion / totalEvalucaiones);
    }
}