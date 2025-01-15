package Parte2;

public class Cuadrado {
    int lado;

    // Constructor del cuadrado
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Calcula y retorna el area del cuadrado
    public double calcularArea() {
        return lado*lado;
    }

    // Calcula y retorna el perimetro del cuadrado
    public double calcularPerimetro() {
        return 4*lado;
    }
}
