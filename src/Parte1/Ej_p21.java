package Parte1;

import java.util.Scanner;

public class Ej_p21 {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;
        double perimetro;
        double area;
        double semiperimetro;

        System.out.println("Ingrese el lado 1 del triangulo: ");
        Scanner scan = new Scanner(System.in);
        lado1 = scan.nextInt();
        
        System.out.println("Ingrese el lado 2 del triangulo: ");
        scan = new Scanner(System.in);
        lado2 = scan.nextInt();

        System.out.println("Ingrese el lado 3 del triangulo: ");
        scan = new Scanner(System.in);
        lado3 = scan.nextInt();

        perimetro = lado1+lado2+lado3;   
        semiperimetro = perimetro / 2;
        area = Math.pow((semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)), (1.0/2.0));     // Usando la fórmula de Herón
          
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);   
    }
}
