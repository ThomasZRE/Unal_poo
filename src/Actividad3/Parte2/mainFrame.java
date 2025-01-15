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

        frame.setSize(1200,300);
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

    }
}
