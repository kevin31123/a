import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad de Juan: ");
        double juan = entrada.nextDouble();

        double alberto = (2.0 / 3.0) * juan;
        double ana = (4.0 / 3.0) * juan;

        double mama = juan + alberto + ana;

        System.out.println("\n--- Edades de la familia ---");
        System.out.println("Juan: " + juan + " años");
        System.out.println("Alberto: " + alberto + " años");
        System.out.println("Ana: " + ana + " años");
        System.out.println("Mamá: " + mama + " años");

        entrada.close();
    }
}