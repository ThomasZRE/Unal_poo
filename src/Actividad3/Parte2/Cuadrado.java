package Actividad3.Parte2;

public class Cuadrado {
    int lado;

    // Constructor del cuadrado
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Calcula y retorna el area del cuadrado
    double calcularArea() {
        return lado*lado;
    }

    // Calcula y retorna el perimetro del cuadrado
    double calcularPerimetro() {
        return 4*lado;
    }
}
