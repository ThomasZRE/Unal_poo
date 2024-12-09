package Parte2;

public class Rectangulo {
    int base;
    int altura;

    // Constructor del rectangulo
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Calcula y retorna el area
    double calcularArea() {
        return base*altura;
    }

    // Calcula y retorna el perimetro
    double calcularPerimetro() {
        return  (2*base) + (2*altura);
    }
}
