package Actividad3.Parte1.ep22;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class mainFrame {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(600,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);


        // labels
        JLabel lblnombre = new JLabel("Nombre del empleado");
        JLabel lblsalarioHora = new JLabel("Salario basico por hora");
        JLabel lblhorasTrabajo = new JLabel("Horas trabajadas en el mes");
        JLabel lbloutput = new JLabel();

        // Textfields
        JTextField txtnombre = new JTextField();
        JTextField txtsalario = new JTextField();
        JTextField txthoras = new JTextField();

        // Bounds
        lblnombre.setBounds(10,20,160,25);
        lblsalarioHora.setBounds(10,50,160,25);
        lblhorasTrabajo.setBounds(10,80,160,25);
        lbloutput.setBounds(20,150,350,25);

        txtnombre.setBounds(180,20,165,25);
        txtsalario.setBounds(180,50,165,25);
        txthoras.setBounds(180,80,165,25);


        JButton butingreso = new JButton(new AbstractAction("Ingresar empleado"){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String nombre = txtnombre.getText();
                double salariohora = Integer.parseInt(txtsalario.getText());
                int horas = Integer.parseInt(txthoras.getText());

                double salarioMensual = salariohora * horas;

                if (salarioMensual > 450000) {
                    salarioMensual = Math.round(salarioMensual*100) / 100;
                    lbloutput.setText("Nombre: " + nombre + ", Salario mensual: $" + salarioMensual);
                } else {
                    lbloutput.setText("Nombre: " + nombre);
                }
            }
        });

        butingreso.setBounds(10, 120, 160, 25);

        panel.add(lblnombre);
        panel.add(lblsalarioHora);
        panel.add(lblhorasTrabajo);
        panel.add(txtnombre);
        panel.add(txtsalario);
        panel.add(txthoras);
        panel.add(butingreso);
        panel.add(lbloutput);

        frame.setVisible(true);
    }
}
