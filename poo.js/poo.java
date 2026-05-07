import java.util.Scanner;

public class poo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedir horas trabajadas
        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = entrada.nextDouble();

        // Pedir valor por hora
        System.out.print("Ingrese el valor por hora: ");
        double valorHora = entrada.nextDouble();

        // Pedir porcentaje de retención
        System.out.print("Ingrese el porcentaje de retención: ");
        double porcentajeRetencion = entrada.nextDouble();

        // Convertir porcentaje
        porcentajeRetencion = porcentajeRetencion / 100;

        // Calcular salario bruto
        double salarioBruto = horasTrabajadas * valorHora;

        // Calcular retención
        double retencion = salarioBruto * porcentajeRetencion;

        // Calcular salario neto
        double salarioNeto = salarioBruto - retencion;

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retención: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);

        entrada.close();
    }
}