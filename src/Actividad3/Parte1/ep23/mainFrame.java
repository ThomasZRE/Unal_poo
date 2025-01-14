package Actividad3.Parte1.ep23;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class mainFrame {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(500,180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);


        // labels
        JLabel lblA = new JLabel("A");
        JLabel lblB = new JLabel("B");
        JLabel lblC = new JLabel("C");
        JLabel lbloutput = new JLabel();

        // Textfields
        JTextField txtA = new JTextField();
        JTextField txtB = new JTextField();
        JTextField txtC = new JTextField();

        // Bounds
        lblA.setBounds(25,20,80,25);
        lblB.setBounds(125,20,80,25);
        lblC.setBounds(225,20,80,25);
        lbloutput.setBounds(25,85,350,25);

        txtA.setBounds(10,40,40,25);
        txtB.setBounds(110,40,40,25);
        txtC.setBounds(210,40,40,25);

        
        JButton butcalcular = new JButton(new AbstractAction("Hallar soluciones"){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Double.parseDouble(txtC.getText());

                double discriminante = Math.pow(b, 2) - (4*a*c);

                if (discriminante > 0) {

                    double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
                    double x2 = (-b - Math.sqrt(discriminante)) / (2*a);

                    x1 = (double) Math.round(x1*1000d) / 1000d;
                    x2 = (double) Math.round(x2*1000d) / 1000d;

                    lbloutput.setText("Las solucones son x1 = " + String.valueOf(x1) + " y x2 = " + String.valueOf(x2));
                } else if (discriminante == 0) {
                    double x = -b / (2*a);
                    lbloutput.setText("La solucion unica es x = " + x);
                } else {
                    lbloutput.setText("No hay soluciones reales");
                }
            }
        });

        butcalcular.setBounds(290, 40, 160, 25);

        panel.add(lblA);
        panel.add(lblB);
        panel.add(lblC);
        panel.add(txtA);
        panel.add(txtB);
        panel.add(txtC);
        panel.add(butcalcular);
        panel.add(lbloutput);

        frame.setVisible(true);
    }
}  
