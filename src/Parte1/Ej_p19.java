package Parte1;

import java.util.Scanner;

public class Ej_p19 {
    public static void main(String[] args) {
        double lado;
        double perimetro;
        double area;
        double altura;

        System.out.println("Ingrese el lado del triangulo: ");
        Scanner scan = new Scanner(System.in);
        
        lado = scan.nextInt();
        perimetro = lado*3;     // Al ser equilatero sus lados son iguales
        altura = Math.pow((Math.pow(lado, 2) - Math.pow((lado/2),2)), (1.0/2.0));       // Por el teorema de Pitágoras
        area = lado*altura;     // El area del triangulo rectangulo más pequeño dos veces
          
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);   
    }
}
