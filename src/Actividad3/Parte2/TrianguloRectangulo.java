package Actividad3.Parte2;

public class TrianguloRectangulo {
    int base;
    int altura;
    
    // Constructor del triangulo rectangulo
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Calcula y retorna el area
    double calcularArea() {
        return (base*altura)/2;
    }

    // Calcula y retorna el perimetro
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

    // Calcula y retorna el perimetro del triangulo
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    public String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
            return "equilátero";
            // Cuando sus lados son todos iguales 
        }
        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa())) {
            return "escaleno"; 
            // Cuando sus lados son todos distintos
        }
        else {
            return "isósceles"; 
            // Para el caso restante (dos lados iguales)
        }
    }

}
