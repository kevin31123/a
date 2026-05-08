import java.util.Scanner;

public class klk{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double suma;
        double x;
        double y;

        System.out.print("Ingrese el valor inicial de SUMA: ");
        suma = entrada.nextDouble();

        System.out.print("Ingrese el valor de X: ");
        x = entrada.nextDouble();

        suma = suma + x;

        System.out.print("Ingrese el valor de Y: ");
        y = entrada.nextDouble();

        x = x + Math.pow(y, 2);

        suma = suma + (x / y);

        System.out.println("EL VALOR DE LA SUMA ES: " + suma);

        entrada.close();
    }
}