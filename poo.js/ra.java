import java.util.Scanner;

public class ra {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double radio, area, longitud;

        // Entrada de datos
        System.out.print("Ingrese el radio del circulo: ");
        radio = teclado.nextDouble();

        // Proceso
        area = Math.PI * Math.pow(radio, 2);
        longitud = 2 * Math.PI * radio;

        // Salida de resultados
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitud);

        teclado.close();
    }
}