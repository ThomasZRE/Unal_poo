package Parte2;

public class Rectangulo {
    int base;
    int altura;

    // Constructor del rectangulo
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Calcula y retorna el area
    public double calcularArea() {
        return base*altura;
    }

    // Calcula y retorna el perimetro
    public double calcularPerimetro() {
        return  (2*base) + (2*altura);
    }
}
