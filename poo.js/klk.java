import java.util.Scanner;

public class klk{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variables
        double suma;
        double x;
        double y;

        // Pedir valor inicial de SUMA
        System.out.print("Ingrese el valor inicial de SUMA: ");
        suma = entrada.nextDouble();

        // Pedir valor de X
        System.out.print("Ingrese el valor de X: ");
        x = entrada.nextDouble();

        // SUMA = SUMA + X
        suma = suma + x;

        // Pedir valor de Y
        System.out.print("Ingrese el valor de Y: ");
        y = entrada.nextDouble();

        // X = X + Y²
        x = x + Math.pow(y, 2);

        // SUMA = SUMA + X / Y
        suma = suma + (x / y);

        // Mostrar resultado
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);

        entrada.close();
    }
}