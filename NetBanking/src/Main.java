import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(13151253, "40209053152");
        boolean program = false;

        while (!program)
        {
            System.out.println("*****ESCRIBA EL NUMERO DE LA OPCION DESEADA*****");
            System.out.print("""
                            Menú NetBanking
                    
                    1- Consultar Balance
                    2- Retirar
                    3- Depositar
                    4- Salir
                    
                    Opcion: """);

            int option = scanner.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println(cuenta.ConsultarSaldo());
                break;

                case 2:
                    System.out.print("Cuento desea retirar: ");
                    int retirar = scanner.nextInt();
                    System.out.println(cuenta.Retirar(retirar));
                break;

                case 3:
                    System.out.print("Cuento desea depositar: ");
                    int depositar = scanner.nextInt();
                    System.out.println(cuenta.Depositar(depositar));
                break;

                case 4:
                    System.out.println("Banco Credit. Sueña en Grande!");
                    program = true;
                break;
            }
        }
    }
}