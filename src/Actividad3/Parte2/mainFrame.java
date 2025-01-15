package Actividad3.Parte2;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Parte2.Circulo;
import Parte2.Cuadrado;
import Parte2.Rectangulo;
import Parte2.TrianguloRectangulo;

public class mainFrame {
    public static void main(String args[]) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(1100,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);

        frame.add(panel);
        
        // Labels
        JLabel lblradioCirc = new JLabel("Radio del circulo"); //circ
        JLabel lblbaseRec = new JLabel("Base del rectangulo");   // rect
        JLabel lblaltRec = new JLabel("Altura del rectangulo");
        JLabel lblbaseTri = new JLabel("Base del triangulo rectangulo");   // trinRect
        JLabel lblaltTri = new JLabel("Altura del triangulo rectangulo");
        JLabel lblsideCuad = new JLabel("Lado del cuadrado");  // cuad

        // Textfields
        JTextField txtradioCirc = new JTextField(20);
        JTextField txtbaseRec = new JTextField(20);
        JTextField txtaltRec = new JTextField(20);
        JTextField txtbaseTri = new JTextField(20);
        JTextField txtaltTri = new JTextField(20);
        JTextField txtsideCuad = new JTextField(20);

        // bounds
        lblradioCirc.setBounds(10,20,160,25);   // circ

        lblbaseRec.setBounds(310,20,160,25); // rect
        lblaltRec.setBounds(310,80,160,25);

        lblbaseTri.setBounds(610,20,200,25);    // triRect
        lblaltTri.setBounds(610,80,200,25);

        lblsideCuad.setBounds(910,20,160,25);   // Cuad


        txtradioCirc.setBounds(10,40,80,25);

        txtbaseRec.setBounds(310,40,80,25);
        txtaltRec.setBounds(310,100,80,25);

        txtbaseTri.setBounds(610,40,80,25);
        txtaltTri.setBounds(610,100,80,25);

        txtsideCuad.setBounds(910,40,80,25);

        // labels para outputs
        JLabel lbloutCirc = new JLabel();
        JLabel lbloutRec = new JLabel();
        JLabel lbloutTriRec = new JLabel();
        JLabel lbloutCuad = new JLabel();

        // Bounds de outputs
        lbloutCirc.setBounds(10,110,250,60);
        lbloutRec.setBounds(310,180,250,25);
        lbloutTriRec.setBounds(610,180,250,25);
        lbloutCuad.setBounds(910,110,250,25);

        // Botones para calcular
        JButton butCirc = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int radio = Integer.parseInt(txtradioCirc.getText());

                Circulo circulo = new Circulo(radio);

                double area = circulo.calcularArea();
                double perimetro = circulo.calcularPerimetro();

                area = (double) Math.round(area*1000d)/1000d;
                perimetro = (double) Math.round(perimetro*1000d)/1000d;

                lbloutCirc.setText("El area es: " + area + " y el perimetro es: " + perimetro);
            }
            
        });
        JButton butRec = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int base = Integer.parseInt(txtbaseRec.getText());
                int altura = Integer.parseInt(txtaltRec.getText());

                Rectangulo rectangulo = new Rectangulo(base,altura);

                double area = rectangulo.calcularArea();
                double perimetro = rectangulo.calcularPerimetro();

                area = (double) Math.round(area*1000d)/1000d;
                perimetro = (double) Math.round(perimetro*1000d)/1000d;

                lbloutRec.setText("El area es: " + area + " y el perimetro es: " + perimetro);
            }
            
        });
        JButton butTriRec = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int base = Integer.parseInt(txtbaseTri.getText());
                int altura = Integer.parseInt(txtaltTri.getText());

                TrianguloRectangulo triRect = new TrianguloRectangulo(base,altura);

                double area = triRect.calcularArea();
                double perimetro = triRect.calcularPerimetro();
                String tipo = triRect.determinarTipoTriangulo();

                area = (double) Math.round(area*1000d)/1000d;
                perimetro = (double) Math.round(perimetro*1000d)/1000d;

                lbloutTriRec.setText("El area es: " + area + " y el perimetro es: " + perimetro);
                
            }
            
        });
        JButton butCuad = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int lado = Integer.parseInt(txtsideCuad.getText());

                Cuadrado cuad = new Cuadrado(lado);

                double area = cuad.calcularArea();
                double perimetro = cuad.calcularPerimetro();

                area = (double) Math.round(area*1000d)/1000d;
                perimetro = (double) Math.round(perimetro*1000d)/1000d;

                lbloutCuad.setText("El area es: " + area + " y el perimetro es: " + perimetro);
            }
        });
        
        // Bounds de los botones
        butCirc.setBounds(10,70,120,25);
        butRec.setBounds(310,140,120,25);
        butTriRec.setBounds(610,140,120,25);
        butCuad.setBounds(910,70,120,25);

        // Agrega al panel
        panel.add(lblradioCirc);
        panel.add(txtradioCirc);

        panel.add(lblbaseRec);
        panel.add(txtbaseRec);
        panel.add(lblaltRec);
        panel.add(txtaltRec);

        panel.add(lblbaseTri);
        panel.add(txtbaseTri);
        panel.add(lblaltTri);
        panel.add(txtaltTri);

        panel.add(lblsideCuad);
        panel.add(txtsideCuad);

        panel.add(lbloutCirc);
        panel.add(lbloutCuad);
        panel.add(lbloutRec);
        panel.add(lbloutTriRec);

        panel.add(butCirc);
        panel.add(butRec);
        panel.add(butTriRec);
        panel.add(butCuad);


        frame.setVisible(true);

        /* 
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

        */
    }
}
