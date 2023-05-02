package de.ebcsoft.EnergyApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnergyFrame extends JFrame {

    private JTextField energyTextField;
    private JButton submitButton;

    public EnergyFrame() {
        // Configurar la ventana
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Crear los componentes
        JLabel label = new JLabel("Energieverbrauch:");
        energyTextField = new JTextField(10);
        submitButton = new JButton("Bestätigen");

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(label);
        panel.add(energyTextField);
        panel.add(submitButton);
        setContentPane(panel);

        // Agregar un ActionListener al botón "Submit"
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el valor del campo de texto y enviarlo al servidor
                String text = energyTextField.getText();
                //RestTemplate restTemplate = new RestTemplate();
                //restTemplate.postForObject("http://localhost:8080/submit", text, Void.class);

                JOptionPane.showMessageDialog(null, "Value entered: " + text);
            }
        });

        setVisible(true);

    }



}
