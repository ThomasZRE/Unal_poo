package Parte2;

public class Circulo {
    int radio;  // propiedad del circulo

    // Constructor del circulo
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Calcula y retorna el area
    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    // Calcula y retorna el perimetro
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
