package Parte2;

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

    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
            System.out.println("Es un triángulo equilátero");
            // Cuando sus lados son todos iguales 
        }
        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa())) {
            System.out.println("Es un triángulo escaleno"); 
            // Cuando sus lados son todos distintos
        }
        else {
            System.out.println("Es un triángulo isósceles"); 
            // Para el caso restante (dos lados iguales)
        }
    }

}
