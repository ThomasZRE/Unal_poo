package Actividad3.Parte1.er7;

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

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Labels principales
        JLabel lblvalorA = new JLabel("A");
        JLabel lblvalorB = new JLabel("B");
        JLabel lblrespuesta = new JLabel();

        JTextField txtvalorA = new JTextField();
        JTextField txtvalorB = new JTextField();

        // Boton para evaluar la condicion
        JButton butevaluar = new JButton(new AbstractAction("Evaluar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(lblvalorA.getText());
                double b = Double.parseDouble(lblvalorB.getText());

                //if (!(Double.isNaN(a) && Double.isNaN(b)))    
                if (a > b) {
                    lblrespuesta.setText("A es mayor que B");
                } else if (a == b) {
                    lblrespuesta.setText("A es igual que B");
                } else if (a < b) {
                    lblrespuesta.setText("A es menor que B");
                } else {
                    lblrespuesta.setText("");
                }    
            }
        });


        // Ajusta los bounds
        lblvalorA.setBounds(25, 20, 40, 25);
        lblvalorB.setBounds(85, 20, 40, 25);
        lblrespuesta.setBounds(10, 80, 120, 25);

        txtvalorA.setBounds(10,40,40,25);
        txtvalorB.setBounds(70,40,40,25);

        butevaluar.setBounds(130,40,120,25);

        panel.add(lblvalorA);
        panel.add(lblvalorB);
        panel.add(txtvalorA);
        panel.add(txtvalorB);
        panel.add(butevaluar);
    
        panel.add(lblrespuesta);

        frame.setVisible(true);
    }
}
