package Actividad3.Parte1.er10;

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

        frame.setSize(600,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);


        // labels
        JLabel lblnumInscripcion = new JLabel("Numero de inscripcion");
        JLabel lblname = new JLabel("Nombre del estudiante");
        JLabel lblpatEstudiante = new JLabel("Patrimonio del estudiante");
        JLabel lblestrato = new JLabel("Estrato social");
        JLabel lbloutput = new JLabel();

        // Text fields
        JTextField txtnumInscripcion = new JTextField(20);
        JTextField txtname = new JTextField(20);
        JTextField txtpatEstudiante = new JTextField(20);
        JTextField txtestrato = new JTextField(20);
        
    
        // Ajusta bounds
        lblnumInscripcion.setBounds(10,20,160,25);
        lblname.setBounds(10,50,160,25);
        lblpatEstudiante.setBounds(10,80,160,25);
        lblestrato.setBounds(10,110,160,25);
        lbloutput.setBounds(15,180,550,25);

        txtnumInscripcion.setBounds(180,20,165,25);
        txtname.setBounds(180,50,165,25);
        txtpatEstudiante.setBounds(180,80,165,25);
        txtestrato.setBounds(180,110,165,25);


        // Agrega al panel
        panel.add(lblnumInscripcion);
        panel.add(lblname);
        panel.add(lblpatEstudiante);
        panel.add(lblestrato);
        panel.add(lbloutput);

        panel.add(txtnumInscripcion);
        panel.add(txtname);
        panel.add(txtpatEstudiante);
        panel.add(txtestrato);

        JButton butingreso = new JButton(new AbstractAction("Ingresar estudiante") {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numInscripcion = Integer.parseInt(txtnumInscripcion.getText());
                String nombre = txtname.getText();
                double patrimonio = Double.parseDouble(txtpatEstudiante.getText());
                int estrato = Integer.parseInt(txtestrato.getText());

                double pagoMatricula = 50000;

                if ((patrimonio > 2000000) && (estrato > 3)) {
                    double aumento = 0.03 * patrimonio;
                    pagoMatricula = pagoMatricula + aumento;
                }

                lbloutput.setText("EL ESTUDIANTE CON NÚMERO DE INSCRIPCIÓN " + String.valueOf(numInscripcion) + " Y NOMBRE " + nombre + " DEBE PAGAR: $"+ String.valueOf(pagoMatricula));
            }
        });

        butingreso.setBounds(30,140,160,25);

        panel.add(butingreso);

        
        frame.setVisible(true);
    }
}
