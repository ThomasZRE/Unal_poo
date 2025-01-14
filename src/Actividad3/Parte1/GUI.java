/*

package Actividad3.Parte1.ep18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal implements ActionListener {

    public VentanaPrincipal() {
        JPanel panel = new JPanel();
        JFrame ventana = new JFrame();

        ventana.setSize(600, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);

        panel.setLayout(null);  // Using null layout for manual positioning

        // Labels for the variables
        JLabel lblcodEmpleado = new JLabel("Codigo de empleado");
        JLabel lblnombres = new JLabel("Nombres");
        JLabel lblhorasMes = new JLabel("Horas trabajadas al mes");
        JLabel lblvalorHora = new JLabel("Pago por hora");
        JLabel lblperReten = new JLabel("Porcentaje de retencion");

        JLabel lblempleado = new JLabel("#   Empleado");
        JLabel lblsBruto = new JLabel("Salario bruto");
        JLabel lblsNeto = new JLabel("Salario neto");

        // Set bounds for labels, ensure they are within the window size
        lblcodEmpleado.setBounds(10, 20, 160, 25);
        lblnombres.setBounds(10, 50, 160, 25);
        lblhorasMes.setBounds(10, 80, 160, 25);
        lblvalorHora.setBounds(10, 110, 160, 25);
        lblperReten.setBounds(10, 140, 160, 25);

        lblempleado.setBounds(30, 200, 160, 25);
        lblsBruto.setBounds(200, 220, 120, 25);
        lblsNeto.setBounds(300, 220, 120, 25);

        // Add labels to the panel
        panel.add(lblcodEmpleado);
        panel.add(lblnombres);
        panel.add(lblhorasMes);
        panel.add(lblvalorHora);
        panel.add(lblperReten);
        panel.add(lblempleado);
        panel.add(lblsBruto);
        panel.add(lblsNeto);

        // JTextFields for the variables
        JTextField txtCodigoEmpleado = new JTextField(20);
        JTextField txtnombres = new JTextField(20);
        JTextField txthorasMes = new JTextField(20);
        JTextField txtvalorHora = new JTextField(20);
        JTextField txtperReten = new JTextField(20);

        JTextField txtsBruto = new JTextField(20);
        JTextField txtsNeto = new JTextField(20);

        // Set bounds for text fields, ensure they are within the window size
        txtCodigoEmpleado.setBounds(180, 20, 165, 25);
        txtnombres.setBounds(180, 50, 165, 25);
        txthorasMes.setBounds(180, 80, 165, 25);
        txtvalorHora.setBounds(180, 110, 165, 25);
        txtperReten.setBounds(180, 140, 165, 25);

        txtsBruto.setBounds(200, 200, 85, 25);
        txtsNeto.setBounds(300, 200, 85, 25);

        // Add text fields to the panel
        panel.add(txtCodigoEmpleado);
        panel.add(txtnombres);
        panel.add(txthorasMes);
        panel.add(txtvalorHora);
        panel.add(txtperReten);
        panel.add(txtsBruto);
        panel.add(txtsNeto);

        // Buttons
        JButton butCalculo = new JButton("Calcular");
        JButton butClear = new JButton("Limpiar");

        // Set bounds for buttons
        butClear.setBounds(365, 140, 120, 25);
        butCalculo.setBounds(400, 200, 120, 25);

        panel.add(butClear);
        panel.add(butCalculo);

        // Action listener for button clicks
        butCalculo.addActionListener(new VentanaPrincipal());
        butClear.addActionListener(new VentanaPrincipal());

        ventana.setVisible(true);  // Show the window
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Click");
    }
}

 */