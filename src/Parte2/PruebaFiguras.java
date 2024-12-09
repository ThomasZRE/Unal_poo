package Parte2;

import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String args[]) {
        int r; // para el radio del circulo
        int b1, a1; // base y altura del rectangulo
        int b2, a2; // base y altura del triangulo rectangulo
        int l; // lado del cuadrado
        
        // Objeto scanner para la entrada por teclado
        Scanner scanner = new Scanner(System.in);

        // Input para el radio del circulo
        System.out.println("Ingrese el radio del circulo: ");
        r = scanner.nextInt();

        // Inputs para la base y altura del rectangulo
        System.out.println("Ingrese la base del rectangulo: ");
        b1 = scanner.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        a1 = scanner.nextInt();

        // Input para el lado del cuadrado
        System.out.println("Ingrese el lado del cuadrado: ");
        l = scanner.nextInt(); 
        
        // Inputs para la base y altura del triangulo rectangulo
        System.out.println("Ingrese la base del triangulo rectangulo: ");
        b2 = scanner.nextInt();
        System.out.println("Ingrese la altura del triangulo rectangulo: ");
        a2 = scanner.nextInt();

        // Figuras
        Circulo figura1 = new Circulo(r);
        Rectangulo figura2 = new Rectangulo(b1,a1);
        Cuadrado figura3 = new Cuadrado(l);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(b2,a2);

        // Ouput
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());

        System.out.println();

        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());

        System.out.println();

        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        
        System.out.println();
        
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
}
