import java.util.Scanner;

public class achu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir número
        System.out.print("Ingrese un número: ");
        double numero = entrada.nextDouble();

        // Calcular cuadrado
        double cuadrado = Math.pow(numero, 2);

        // Calcular cubo
        double cubo = Math.pow(numero, 3);

        // Mostrar resultados
        System.out.println("El cuadrado del número es: " + cuadrado);
        System.out.println("El cubo del número es: " + cubo);

        entrada.close();
    }
}