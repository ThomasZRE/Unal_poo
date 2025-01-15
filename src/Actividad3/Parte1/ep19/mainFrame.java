package Actividad3.Parte1.ep19;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mainFrame {
    public static void main(String[] args) {
        // Panel y frame para la ventana principal
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(480,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Labels para variables principales
        JLabel lblside = new JLabel("Lado del triangulo equilatero");
        JLabel lblperim = new JLabel("Perimetro");
        JLabel lblaltura = new JLabel("Altura");
        JLabel lblarea = new JLabel("Area");

        JTextField txtside = new JTextField(20);
        JTextField txtperim = new JTextField(20);
        JTextField txtaltura = new JTextField(20);
        JTextField txtarea = new JTextField(20);

        JButton butcalcular = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calcular
                double lado;
                double perimetro;
                double area;
                double altura;

                lado = Double.parseDouble(txtside.getText());
                perimetro = lado*3;     // Al ser equilatero sus lados son iguales
                altura = Math.pow((Math.pow(lado, 2) - Math.pow((lado/2),2)), (1.0/2.0));       // Por el teorema de Pitágoras
                area = lado*altura;     // El area del triangulo rectangulo más pequeño dos veces
                
                // Redondea los valores a dos decimales
                altura = (double) Math.round(altura * 100) / 100;
                area = (double) Math.round(area * 100) / 100;

                txtperim.setText(String.valueOf(perimetro));
                txtaltura.setText(String.valueOf(altura));
                txtarea.setText(String.valueOf(area));

            }
        });

        butcalcular.setBounds(330,60,120,25);

        lblside.setBounds(10,20,200,25);
        lblperim.setBounds(30,80,80,25);
        lblaltura.setBounds(130,80,80,25);
        lblarea.setBounds(220,80,80,25);
        
        txtperim.setBounds(30,60,80,25);
        txtside.setBounds(200,20,85,25);
        txtaltura.setBounds(130,60,80,25);
        txtarea.setBounds(230,60,80,25);

        // Agrega los labels
        panel.add(lblside);
        panel.add(lblperim);
        panel.add(lblaltura);
        panel.add(lblarea);

        // Agrega los textfields
        panel.add(txtside);
        panel.add(txtperim);
        panel.add(txtaltura);
        panel.add(txtarea);

        // Agrega el boton
        panel.add(butcalcular);

        frame.setVisible(true);
    }
}
