package Actividad3.Parte1.ep18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal{

    // Clase ventana principal
    public VentanaPrincipal() {
        JPanel panel = new JPanel();
        JFrame ventana = new JFrame();

        ventana.setSize(600,300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);

        panel.setLayout(null);


        // Labels para variables principales
        JLabel lblcodEmpleado = new JLabel("Codigo de empleado");
        JLabel lblnombres = new JLabel("Nombres");
        JLabel lblhorasMes = new JLabel("Horas trabajadas al mes");
        JLabel lblvalorHora = new JLabel("Pago por hora");
        JLabel lblperReten = new JLabel("Porcentaje de retencion");

        JLabel lblempleado = new JLabel("#   Empleado");  // Para mostrar el codigo y empleado
        JLabel lblsBruto = new JLabel("Salario bruto");  
        JLabel lblsNeto =  new JLabel("Salario neto");


        // Tamanos labels
        lblcodEmpleado.setBounds(10,20,160,25);
        lblnombres.setBounds(10,50,160,25);
        lblhorasMes.setBounds(10,80,160,25);
        lblvalorHora.setBounds(10,110,160,25);
        lblperReten.setBounds(10,140,160,25);

            // TODO: cambiar bounds
        lblempleado.setBounds(30,200,160,25);
        lblsBruto.setBounds(200,220,120,25);
        lblsNeto.setBounds(300,220,120,25);

        
        // Adicion labels al panel
        panel.add(lblcodEmpleado);
        panel.add(lblnombres);
        panel.add(lblhorasMes);
        panel.add(lblvalorHora);
        panel.add(lblperReten);

            // TODO: Agregar al panel
            panel.add(lblempleado);
            panel.add(lblsBruto);
            panel.add(lblsNeto);


        // JTextFields de las variables
        JTextField txtCodigoEmpleado = new JTextField(20);
        JTextField txtnombres = new JTextField(20);
        JTextField txthorasMes = new JTextField(20);
        JTextField txtvalorHora = new JTextField(20);
        JTextField txtperReten = new JTextField(20);

        JTextField txtsBruto = new JTextField(20);
        JTextField txtsNeto = new JTextField(20);


        // Tamanos textos
        txtCodigoEmpleado.setBounds(180,20,165,25);
        txtnombres.setBounds(180,50,165,25);
        txthorasMes.setBounds(180,80,165,25);
        txtvalorHora.setBounds(180,110,165,25);
        txtperReten.setBounds(180,140,165,25);

            //TODO: ajustar bounds al text
        txtsBruto.setBounds(200,200,85,25);
        txtsNeto.setBounds(300,200,85,25);

        // Adicion textos al panel
        panel.add(txtCodigoEmpleado);
        panel.add(txtnombres);
        panel.add(txthorasMes);
        panel.add(txtvalorHora);
        panel.add(txtperReten);

        panel.add(txtsBruto);
        panel.add(txtsNeto);


        // Botones
        // Calcula para el ejercicio
        JButton butCalculo = new JButton(new AbstractAction("Calcular") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int codEmpleado;
                String nombres;
                int horasMes;
                double valorHora;
                double perReten;

                double reten;   // Retencion fuente
                double sbruto;  // Salario bruto
                double sneto;   // Salario neto

                codEmpleado = Integer.parseInt(txtCodigoEmpleado.getText());
                nombres = txtnombres.getText();
                horasMes = Integer.parseInt(txthorasMes.getText());
                valorHora = Double.parseDouble(txtvalorHora.getText());        
                perReten = Double.parseDouble(txtperReten.getText());

                sbruto = valorHora * horasMes;
                reten = sbruto * (perReten/100);
                sneto = sbruto - reten;
                
                txtsBruto.setText("$" + String.valueOf(sbruto));
                txtsNeto.setText("$" + String.valueOf(sneto));
                lblempleado.setText(String.valueOf(codEmpleado) + "   " + nombres);
                
            }
        });

        // Limpia los valores
        JButton butClear = new JButton(new AbstractAction("Limpiar") {
            @Override
            public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
                txtCodigoEmpleado.setText("");
                txtnombres.setText("");
                txthorasMes.setText("");
                txtvalorHora.setText("");
                txtperReten.setText("");
                lblempleado.setText("#   Empleado");
                txtsBruto.setText("");
                txtsNeto.setText("");
            }
        });

        // Bounds de los botones
        butClear.setBounds(365,140,120,25);
        butCalculo.setBounds(400,200,120,25);

        panel.add(butClear);
        panel.add(butCalculo);

        ventana.setVisible(true);
    }

    // Main para iniciar la interfaz
    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}
