package Parte1;

import java.util.Scanner;

public class Ej_p18 {
    public static void main(String[] args) {

        int codEmpleado;
        String nombres;
        int horasMes;
        double valorHora;
        double perReten;

        double reten;   // Retencion fuente
        double sbruto;  // Salario bruto
        double sneto;   // Salario neto

        System.out.println("Ingrese codigo de empleado: ");        
        Scanner scan = new Scanner(System.in);
        codEmpleado = scan.nextInt();
        
        System.out.println("Ingrese nombres: ");
        scan = new Scanner(System.in);
        nombres = scan.nextLine();
        
        System.out.println("Ingrese las horas al mes: ");
        scan = new Scanner(System.in);
        horasMes = scan.nextInt();

        System.out.println("Ingrese el valor por hora: ");
        scan = new Scanner(System.in);
        valorHora = scan.nextDouble();        
        
        System.out.println("Ingrese el porcentaje de retencion: ");
        scan = new Scanner(System.in);
        perReten = scan.nextDouble();

        sbruto = valorHora * horasMes;
        reten = sbruto * (perReten/100);
        sneto = sbruto - reten;

        System.out.println("Código: " + codEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario bruto: " + sbruto);
        System.out.println("Salario neto: " + sneto);
    }
}
