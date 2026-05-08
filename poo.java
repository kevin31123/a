import java.util.Scanner;

public class poo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = entrada.nextDouble();

        System.out.print("Ingrese el valor por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Ingrese el porcentaje de retención: ");
        double porcentajeRetencion = entrada.nextDouble();

        porcentajeRetencion = porcentajeRetencion / 100;

        double salarioBruto = horasTrabajadas * valorHora;

        double retencion = salarioBruto * porcentajeRetencion;

        double salarioNeto = salarioBruto - retencion;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Retención: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);

        entrada.close();
    }
}